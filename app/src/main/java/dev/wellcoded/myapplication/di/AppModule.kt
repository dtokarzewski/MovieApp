package dev.wellcoded.myapplication.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.wellcoded.myapplication.util.TimberLogger

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideTimberLogger() = TimberLogger()

}