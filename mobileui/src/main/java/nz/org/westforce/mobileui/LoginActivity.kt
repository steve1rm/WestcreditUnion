package nz.org.westforce.mobileui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import nz.org.westforce.data.network.WebServicesImp
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var webServicesImp: WebServicesImp

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        webServicesImp.requestFromWebService()
    }
}
