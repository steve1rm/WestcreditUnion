package nz.org.westforce.mobileui.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import nz.org.westforce.data.network.WebServices
import retrofit2.Retrofit

@Module
class WebServiceModule {

    @Reusable
    @Provides
    fun provideWebServices(retrofit: Retrofit): WebServices {
        return retrofit.create(WebServices::class.java)
    }
}
