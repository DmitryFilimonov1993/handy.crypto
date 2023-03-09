package com.example.handycrypto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            messageCard()
        }
    }


    @Composable
    fun messageCard() {
        Text(text = "hello")
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        messageCard()
    }
}