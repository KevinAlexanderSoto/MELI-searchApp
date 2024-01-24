package com.kalex.searchmeliapp.data.responses

data class Installments(
    val amount: Int,
    val currency_id: String,
    val quantity: Int,
    val rate: Double
)