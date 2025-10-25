package com.example.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profile (modifier: Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val fotoprofile = painterResource(R.drawable.fotoku)
        Image(
            painter = fotoprofile,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .border(
                    width = 4.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically

        )
        {
            val ikon = painterResource(R.drawable.twitter)
            Image(
                painter = ikon,
                contentDescription = null,
                modifier = Modifier.size(26.dp)
            )
            val ikon2 = painterResource(R.drawable.instagram)
            Image(
                painter = ikon2,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            val ikon3 = painterResource(R.drawable.github)
            Image(
                painter = ikon3,
                contentDescription = null,
                modifier = Modifier.size(26.dp)
            )
            val ikon4 = painterResource(R.drawable.linkedin)
            Image(
                painter = ikon4,
                contentDescription = null,
                modifier = Modifier.size(26.dp)
            )
        }
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                stringResource(R.string.nama),
                fontWeight = FontWeight.SemiBold,
                fontSize = 28.sp,
                color = Color.Black
            )
            Text(
                stringResource(R.string.username),
                fontWeight = FontWeight.Thin,
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }





