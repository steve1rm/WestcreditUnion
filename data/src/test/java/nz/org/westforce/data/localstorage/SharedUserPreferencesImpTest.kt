package nz.org.westforce.data.localstorage

import android.content.Context
import com.nhaarman.mockito_kotlin.mock
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class SharedUserPreferencesImpTest {
    private lateinit var sharedUserPreferenceImp: SharedUserPreferencesImp
    private val context: Context = mock()

    @Before
    fun setUp() {
        sharedUserPreferenceImp = SharedUserPreferencesImp(context, "sharedPreferenceName")
        assertThat(sharedUserPreferenceImp).isNotNull
    }

    /* TODO need to complete unit testing */
    @Test
    fun `should getValue`() {
        val name = "name"
//        name.getValue("key", sharedUserPreferenceImp)
    }
}
