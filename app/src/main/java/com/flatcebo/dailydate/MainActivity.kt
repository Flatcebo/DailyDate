package com.flatcebo.dailydate

import android.annotation.SuppressLint
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width

import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.flatcebo.dailydate.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBar {
                contentColorFor(backgroundColor = Purple80)
            }
        }
    }
}

//@Preview(showBackground = true, hed)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(content : @Composable () -> Unit) {
    MaterialTheme {
        Scaffold(

            topBar = {
                TopAppBar(
                    title = { Text(text = "AppName", fontWeight = FontWeight.Bold) },
                    modifier = Modifier
//                        .padding(horizontal = 10.dp)

                        .fillMaxWidth(),


                    actions = {
                        IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Search, contentDescription = "Search")
    }
                        IconButton(onClick = { /*TODO*/ }) {
                         Icon(Icons.Filled.Notifications, contentDescription = "Notification")
                        }
                    }
                    )
            }
            
        
        )  {
contentPadding ->
            Row(
                modifier = Modifier
                    .width(500.dp)
                    .padding(contentPadding)
                    .border(width = 1.dp, color = Color.Cyan, shape = RectangleShape)


            ) {
                Text(text = "hie")
            }
        }

        
    }
    }

//@Composable
//fun ThemeList() {
//}



