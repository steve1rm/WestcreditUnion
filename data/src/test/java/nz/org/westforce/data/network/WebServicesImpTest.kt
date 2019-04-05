package nz.org.westforce.data.network

import nz.org.westforce.data.di.DaggerTestWestforceCeditUnionComponent
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import javax.inject.Inject

class WebServicesImpTest {

    @Inject
    lateinit var webServicesImp: WebServicesImp

    @Before
    fun setUp() {
        /* the DaggerTestWestforceCreditUnionComponent is not generated */

        DaggerTestWestforceCeditUnionComponent.builder()
            .build()
            .inject(this)
    }

    @Test
    fun shouldNotBeNull() {
        assertThat(webServicesImp).isNotNull
    }

    @Test
    fun callWebservice() {
        webServicesImp.requestFromWebService()
    }
}
