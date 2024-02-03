package com.kalex.searchmeliapp

import com.kalex.searchmeliapp.data.ItemSearchRepository
import com.kalex.searchmeliapp.data.ItemSearchRepositoryImpl
import com.kalex.searchmeliapp.data.network.ItemsAndSearchApi
import com.kalex.searchmeliapp.domain.GetSearchItemUseCase
import com.kalex.searchmeliapp.presentation.SearchViewModel
import com.kalex.searchmeliapp.utils.NetworkConstant
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val mainModule = module {
    single<ItemsAndSearchApi> {
        val retrofit = Retrofit.Builder()
            .baseUrl(NetworkConstant.mainURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ItemsAndSearchApi::class.java)
    }

    factory<GetSearchItemUseCase> {
        GetSearchItemUseCase(get())
    }
    single<ItemSearchRepository> {
        ItemSearchRepositoryImpl(get())
    }
    viewModel { SearchViewModel(get()) }
}