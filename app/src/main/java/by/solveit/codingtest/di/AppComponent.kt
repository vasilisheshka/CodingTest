package by.solveit.codingtest.di

import android.app.Application
import by.solveit.codingtest.CodingTestApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            PlacesActivityModule::class
        ]
)
interface AppComponent : AndroidInjector<CodingTestApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<CodingTestApplication>() {
        @BindsInstance
        abstract fun application(application: Application): Builder
    }
}
