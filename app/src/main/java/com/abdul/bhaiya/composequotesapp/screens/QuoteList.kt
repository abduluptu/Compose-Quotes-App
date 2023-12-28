package com.abdul.bhaiya.composequotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.abdul.bhaiya.composequotesapp.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote)-> Unit) { //pass onclick lambda

    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it, onClick)  // add onclick
        }
    })
}