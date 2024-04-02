package com.example.cabrera_markalexis_bsit22a3_scrollablelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cabrera_markalexis_bsit22a3_scrollablelist.ui.theme.Cabrera_MarkAlexis_BSIT22A3_ScrollableListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cabrera_MarkAlexis_BSIT22A3_ScrollableListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Greeting() {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cabrera_MarkAlexis_BSIT22A3_ScrollableListTheme {

    }
}