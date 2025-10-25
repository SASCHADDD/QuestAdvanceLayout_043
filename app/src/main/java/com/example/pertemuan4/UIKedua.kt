package com.example.pertemuan4

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Profile(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp, end = 16.dp),
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
        ) {
            val ikon1 = painterResource(R.drawable.twitter)
            Image(
                painter = ikon1,
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
            text = stringResource(R.string.nama),
            fontWeight = FontWeight.SemiBold,
            fontSize = 28.sp,
            color = Color.Black
        )
        Text(
            text = stringResource(R.string.username),
            fontWeight = FontWeight.Thin,
            fontSize = 20.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            MenuItem(
                painterResource(R.drawable.satu),
                stringResource(R.string.menu1)
            )
            MenuItem(
                painterResource(R.drawable.dua),
                stringResource(R.string.menu2)
            )
            MenuItem(
                painterResource(R.drawable.tiga),
                stringResource(R.string.menu3)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // --- Tombol Logout ---
            Button(
                onClick = { },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                val keluar = painterResource(id = R.drawable.logout)
                Image(
                    painter = keluar,
                    contentDescription = "Logout Icon"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Logout", fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(R.string.copy2),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 24.dp),
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

    @Composable
    fun MenuItem(icon: Painter, text: String) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            border = BorderStroke(2.dp, Color(0xFF1671B3))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = text,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1671B3)
                )
            }
        }
    }
