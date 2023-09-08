package com.example.clothesecommerceapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),

    ) {
          MainContent()
        }
    }

@Composable
fun MainContent(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopStart

    ) {
        Image(
            painter = painterResource(id = R.drawable.img_4),
            contentDescription = "",
            modifier=Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds
            )
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 58.dp, vertical = 130.dp),
            verticalArrangement = Arrangement.Bottom


        ) {
             TextOne()

            Spacer(modifier = Modifier.height(10.dp))

            TextTwo()

            Spacer(modifier = Modifier.height(30.dp))

            Divider(color = Color.White, thickness = 1.dp, modifier = Modifier.width(330.dp))

            Spacer(modifier = Modifier.height(30.dp))

            ButtonText()
        }
    }
}

@Composable
fun TextOne(){
    Text(
        text ="Make Your",
        color=Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp

        )
}

@Composable
fun TextTwo(){
    Text(
        text ="purchases as",
        color=Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp

    )
}

@Composable
fun ButtonText(){
    Row(
        modifier = Modifier

    ) {
        OutlinedButton(
            modifier = Modifier
                .width(120.dp)

                .height(56.dp),
            onClick = {},
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.White)
        ) {
            Text(
                text = "Women", color = Color.Black)

        }
        Spacer(modifier = Modifier.width(30.dp))

        OutlinedButton(
            modifier = Modifier
                .width(120.dp)
                .background(Color.Transparent)
                .height(56.dp)
                .border(2.dp, color = Color.White, shape = RoundedCornerShape(30.dp)),

            onClick = {}
        ) {
            Text(
                text = "MEN", color = Color.White)

        }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen() {

    }

@Composable
fun ShopScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Add Post Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}


@Composable
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Notification Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}


@Composable
fun JobScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Jobs Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}