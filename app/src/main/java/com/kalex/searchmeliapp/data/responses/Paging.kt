package com.kalex.searchmeliapp.data.responses

data class Paging(
    val limit: Int,
    val offset: Int,
    val primary_results: Int,
    val total: Int
)