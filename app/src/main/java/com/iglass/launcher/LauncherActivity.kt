package com.iglass.launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LauncherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Spacer(modifier = Modifier.height(60.dp))

            GlassWidget()

            Spacer(modifier = Modifier.height(25.dp))

            AppGrid()
        }

        GlassDock(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun GlassWidget() {
    Card(
        shape = RoundedCornerShape(28.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(140.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Liquid Glass Widget",
                fontSize = 22.sp
            )
        }
    }
}

@Composable
fun AppGrid() {
    Text(
        text = "iGlass Apps",
        modifier = Modifier.padding(20.dp),
        color = Color.White
    )
}

@Composable
fun GlassDock(
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(32.dp),
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text("Phone  Safari  Messages  Camera")
        }
    }
}
