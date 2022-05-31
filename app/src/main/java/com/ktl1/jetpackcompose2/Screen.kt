package com.ktl1.jetpackcompose2

sealed class Screen(val route : String){
    object MainScreen: Screen("main_screen")
    object DetailScreen: Screen("detail_screen")

    fun withArgs(vararg args: String) : String { //click ivent ekedi with args daanna meeka oone
        return  buildString {
            append(route)
            args.forEach { arg->
                append("/$arg")
            }
        }
    }


}
