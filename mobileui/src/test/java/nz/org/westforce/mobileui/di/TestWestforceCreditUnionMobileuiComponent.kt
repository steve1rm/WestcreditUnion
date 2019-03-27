package nz.org.westforce.mobileui.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestWebServiceModule::class])
interface TestWestforceCreditUnionMobileuiComponent {
    fun inject(exampleUnitTest: ExampleUnitTest)
}
