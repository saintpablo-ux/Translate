package com.example.translate.classes

//data class the object Constants
data class Question(
    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionTree: String,
    val optionFour: String,
    val correctAnswer: Int
) {

}