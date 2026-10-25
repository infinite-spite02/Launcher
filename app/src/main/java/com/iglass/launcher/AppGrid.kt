package com.iglass.launcher

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppGrid() {

    Column {

        Row(modifier = Modifier.padding(12.dp)) {
            Text("📷")
            Spacer(Modifier.width(20.dp))
            Text("🗺️")
            Spacer(Modifier.width(20.dp))
            Text("📝")
            Spacer(Modifier.width(20.dp))
            Text("⚙️")
        }

        Row(modifier = Modifier.padding(12.dp)) {
            Text("🎵")
            Spacer(Modifier.width(20.dp))
            Text("☁️")
            Spacer(Modifier.width(20.dp))
            Text("📅")
            Spacer(Modifier.width(20.dp))
            Text("⏰")
        }
    }
}
