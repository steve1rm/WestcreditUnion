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
    }

    @Test
    fun `sharedUserPreferencesImp should not be null`() {
        assertThat(sharedUserPreferenceImp).isNotNull
    }
}
