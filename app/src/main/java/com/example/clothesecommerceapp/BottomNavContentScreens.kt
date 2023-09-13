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
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
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
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFf5f5f5)),

                navigationIcon ={
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .padding(horizontal = 24.dp)
                    ){
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "Back",
                            modifier = Modifier
                                .size(30.dp)

                            )
                        Text(
                            "Explore",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.weight(1f))
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Delete")
                    } } ,

            )

        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(paddingValues)
                .background(Color(0xFFf5f5f5))
        ) {
            Row (
                modifier = Modifier
                    .padding(horizontal = 24.dp)
            ){
            Text(
                text = "CLOTHING-",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = LightGray
            )
            Text(
                text = "T-SHIRTS",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.align_vertical),
                contentDescription ="" ,
                modifier = Modifier
                    .padding(start = 85.dp)
                    .height(23.dp)
                    .size(100.dp)
            )
        }
            Divider(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .width(400.dp),
                thickness = 2.dp
                )
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(24.dp)
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

    ) {
        Column(

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
                    Image(
                        painter = painterResource(id = imageId),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize(),

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
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFf5f5f5)),
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


                )
            }
        ){ paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(paddingValues)
                    .background(Color(0xFFf5f5f5))
            ){
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    ),

                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 14.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription ="",
                            modifier=Modifier
                                .padding(10.dp)
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
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 14.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "",
                            modifier=Modifier
                                .padding(10.dp)
                        )
                        Column {
                            Text(
                                text = "Sweater",
                                modifier = Modifier
                                    .padding(vertical = 5.dp, horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 19.sp
                            )
                            Text(
                                text = "ID:10921",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )
                            Text(
                                text = "Size:L",
                                modifier = Modifier
                                    .padding(horizontal = 10.dp),
                                textAlign = TextAlign.Center,
                                fontSize = 18.sp
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
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    }
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 130.dp)
                        .padding(horizontal = 14.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "",
                            modifier=Modifier
                                .padding(10.dp)
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

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = White,
                    ),
                    modifier = Modifier
                        .size(width = 400.dp, height = 290.dp)
                        .padding(horizontal = 2.dp)
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
                       Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 30.dp, horizontal = 24.dp),
                           colors=androidx.compose.material.ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                            onClick = {},
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
            .background(colorResource(id = R.color.white))
    ) {
            Image(
                painter = painterResource(id =R.drawable.img_9 ),
                contentDescription ="" ,
                modifier=Modifier

                    .height(420.dp),
                contentScale = ContentScale.FillWidth,

            )
            Card(
            colors = CardDefaults.cardColors(
                containerColor = White,
            ),
            modifier = Modifier
                .size(width = 450.dp, height = 450.dp)
                .padding(bottom = 50.dp)
           ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 24.dp, vertical = 24.dp)
                ) {
                    Text(
                        text = "Mobile",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,


                        )
                    Text(
                        text = "0714567899",
                        fontSize = 20.sp,
                        color = Color.LightGray

                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Column {
                        Text(
                            text = "Membership",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Text(
                        text = "Gold",
                        color = Color.LightGray,
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.width(140.dp))


                    Spacer(modifier = Modifier.height(60.dp))
                    Text(
                        text = "Address",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Eldoret,Kenya",
                        fontSize = 20.sp,
                        color = Color.LightGray

                    )
                    Text(
                        text = "P.O.BOX 3456",
                        fontSize = 20.sp,
                        color = Color.LightGray

                    )
                }
            }
        }
    Example()
    }

@Composable
fun Example() {
    Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(vertical = 305.dp)
            .padding(end = 40.dp)
    ) {
        FloatingActionButton(
            onClick = {  },

        ) {
            Icon(Icons.Rounded.Edit, "Floating action button.")
        }
    }

}

