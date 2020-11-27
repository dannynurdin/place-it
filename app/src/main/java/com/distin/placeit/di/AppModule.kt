package com.distin.placeit.di

import com.distin.placeit.restaurant.RestaurantViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { RestaurantViewModel(get()) }
}