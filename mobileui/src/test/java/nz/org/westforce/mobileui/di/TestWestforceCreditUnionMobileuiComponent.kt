package nz.org.westforce.mobileui.di

import dagger.Component
import nz.org.westforce.mobileui.network.TestNetworkRequest
import javax.inject.Singleton

@Singleton
@Component(modules = [TestNetworkModule::class])
interface TestWestforceCreditUnionMobileuiComponent {
    fun inject(testNetworkModule: TestNetworkRequest)
}
