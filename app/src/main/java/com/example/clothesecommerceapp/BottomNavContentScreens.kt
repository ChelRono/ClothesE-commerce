package com.example.clothesecommerceapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
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
                .padding(horizontal = 58.dp, vertical = 100.dp),
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
        fontSize = 30.sp

        )
}

@Composable
fun TextTwo(){
    Text(
        text ="purchases as",
        color=Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp

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
                text = "WOMEN",
                color = Color.Black,
                fontSize = 18.sp
                )

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
                text = "MEN",
                color = Color.White,
                fontSize = 18.sp
                )

        }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen() {

    val clothes = listOf(
        R.drawable.img_2,
        R.drawable.img_3,
        R.drawable.img_1,
        R.drawable.img_5,
        R.drawable.img_6,
        R.drawable.img_7,
        R.drawable.img_8,
        R.drawable.img_4,


    )
    val list: List<String> = listOf(
        "Sweater",
        "Jacket",
        "Dress",
        "Jeans",
        "Kimono",
        "Skirt",
        "Scarf",
        "Sunhat",
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text="Search",
                        textAlign = TextAlign.Center
                        )},
                navigationIcon ={
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                            .padding(horizontal = 24.dp)
                    ){
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
                        Text(
                            "Explore",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.weight(1f))
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Delete")




                    } } ,
                modifier=Modifier

                    .background (color=Color.White)
            )

        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(paddingValues)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(10.dp)
            ) {
                items(clothes.size) {
                    ClothItem(imageId = clothes[it], title = "Who Ate My Cheese")

                    BottomText(title =list[it])

                }
            }
        }
    }
}

@Composable
fun ClothItem(imageId: Int, title: String) {
    Card(
        modifier = Modifier
            .padding(horizontal = 6.dp, vertical = 16.dp)
            .size(250.dp)
            .border(2.dp, color = Color.White, shape = RoundedCornerShape(16.dp))
            .clickable {

            },
        elevation = CardDefaults.cardElevation()
    ) {
        Column(
            Modifier.padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
                    Image(
                        painter = painterResource(id = imageId),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(5.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
        }
    }

@Composable
fun BottomText( title: String){
    Column(
        modifier=Modifier
            .padding(horizontal = 24.dp)
    ) {
        Spacer(modifier = Modifier.height(270.dp))
        Text(
            text=title,
            fontSize = 18.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold

            )
        Text(
            text="$10",
            fontSize = 18.sp,
            color = Color.Black,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShopScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text="Search",
                            textAlign = TextAlign.Center
                        )},
                    navigationIcon ={
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                                .padding(horizontal = 24.dp)
                        ){
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                            Text(
                                "My Cart",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.weight(1f))
                            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Delete")
                        } } ,
                    modifier=Modifier
                        .background (color=Color.White)
                )
            }
        ){ paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(paddingValues)
            ){
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = LightGray,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 24.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription =""
                        )
                        Column {
                            Text(
                                text = "Hoodie Women",
                                modifier = Modifier
                                .padding(vertical = 5.dp, horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Text(
                                text = "ID:10921",
                                modifier = Modifier
                                    .padding( horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Size:L",
                                modifier = Modifier
                                    .padding( horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Quantity:1",
                                modifier = Modifier
                                    .padding( horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "$200",
                                modifier = Modifier
                                    .padding( horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }


                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = LightGray,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 24.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = ""
                        )
                        Column {
                            Text(
                                text = "Sweater",
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Text(
                                text = "ID:10921",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Size:L",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Quantity:1",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "$200",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    }
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = LightGray,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 24.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = ""
                        )
                        Column {
                            Text(
                                text = "Jacket",
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Text(
                                text = "ID:10921",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Size:L",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Quantity:1",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "$200",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    }
                Spacer(modifier = Modifier.height(20.dp))

                OutlinedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = LightGray,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 290.dp)
                        .padding(horizontal = 24.dp)
                ) {
                    Row {
                        Text(
                            text = "SubTotal",
                            modifier = Modifier
                                .padding(vertical=2.dp, horizontal = 24.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "$300.00",
                            modifier = Modifier
                                .padding(vertical=2.dp, horizontal = 24.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp
                        )
                    }
                    Row {
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "Shipping",
                            modifier = Modifier
                                .padding(vertical=4.dp, horizontal = 24.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp

                        )
                        Text(
                            text = "$400.00",
                            modifier = Modifier
                                .padding(vertical=4.dp, horizontal = 24.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp
                        )
                    }
                    Divider(
                        modifier = Modifier
                            .padding(vertical=4.dp, horizontal = 24.dp),
                        thickness = 1.dp,
                        color = Color.Black
                    )
                    Row {

                        Text(
                            text = "Total",
                            modifier = Modifier
                                .padding(vertical=2.dp, horizontal = 24.dp),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Text(
                            text = "$400.00",
                            modifier = Modifier
                                .padding(vertical=2.dp, horizontal = 50.dp),
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    }
                    Row {
                        OutlinedButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 30.dp, horizontal = 24.dp),
                            onClick = {},
                            colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.Black)
                        ) {
                            Text(
                                text = "Checkout",
                                color = Color.White,
                                fontSize = 18.sp
                            )

                        }
                    }
                }
            }

        }
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