package io.spherelabs.designsystem.meterprogress

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun LKDashProgress(
    value: Int,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(105.dp)
            .background(color = Color.Yellow, shape = CircleShape),
    ) {

        Text(
            text = "$value",
            fontSize = 42.sp,
            color = Color.Magenta,
            modifier = Modifier.align(alignment = Alignment.Center)
        )
    }
}