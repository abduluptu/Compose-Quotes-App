package com.abdul.bhaiya.composequotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.abdul.bhaiya.composequotesapp.R
import com.abdul.bhaiya.composequotesapp.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, onClick: (quote: Quote) -> Unit) { //pass onclick lambda

    Column() {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 16.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = FontFamily(Font(R.font.montserrat_medium))
        )
        
        QuoteList(data = data, onClick)  //Add onclick
    }
}