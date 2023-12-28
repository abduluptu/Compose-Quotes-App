package com.abdul.bhaiya.composequotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.abdul.bhaiya.composequotesapp.models.Quote
import com.google.gson.Gson

object DataManager {

    var data = emptyArray<Quote>()

    var currentQuote: Quote? = null

    //declare state for current page
    var currentPage = mutableStateOf(Pages.LISTING)

    //declare state for data loading
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        //data loaded
        isDataLoaded.value = true
    }

    //switch pages
    fun switchPages(quote: Quote?) {
        if (currentPage.value == Pages.LISTING) {
            currentQuote = quote
            currentPage.value = Pages.DETAIL
        } else {
            currentPage.value = Pages.LISTING
        }
    }
}