package com.example.clothesecommerceapp

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String){

    object Home : BottomNavItem("Home", R.drawable.home,"home")
    object Explore: BottomNavItem("Explore",R.drawable.search,"explore")
    object Shop: BottomNavItem("Shop",R.drawable.shopping_cart,"shop")
    object Settings: BottomNavItem("Settings",R.drawable.settings,"settings")

}