package com.example.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column (modifier= Modifier
        .padding(top = 100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(id=R.string.prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            stringResource(R.string.univ),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        Card (
          modifier = Modifier
              .height(160.dp)
              .fillMaxWidth(1f)
              .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray
            )
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(R.drawable.logokb)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(150.dp)
                        .padding(all = 5.dp)
                )

            Spacer(modifier = Modifier.width( 1.dp ))
                Column() {
                    stringResource(R.string.nama)



                }

            }
        }
    }
