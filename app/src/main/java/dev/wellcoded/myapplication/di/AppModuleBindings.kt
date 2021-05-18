package dev.wellcoded.myapplication.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dev.wellcoded.base.initializer.Initializer
import dev.wellcoded.myapplication.initializer.TimberInitializer

@InstallIn(SingletonComponent::class)
@Module
abstract class AppModuleBindings {

    @Binds
    @IntoSet
    abstract fun provideTimberInitializer(bind: TimberInitializer): Initializer
}