package com.adrian.aplicacion1.BoardGamesApp

data class Game (val name:String, val category: GameCategory, var isSelected:Boolean = false)
