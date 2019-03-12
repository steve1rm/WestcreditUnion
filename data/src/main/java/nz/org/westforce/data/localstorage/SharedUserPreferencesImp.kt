package nz.org.westforce.data.localstorage

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

fun <T : Any> T.getValue(key: String, sharedPreferences: SharedUserPreferencesImp): T {
    with(sharedPreferences.sharedPreferences) {
        val result: Any = when (this@getValue) {
            is String -> getString(key, this@getValue)
            is Boolean -> getBoolean(key, this@getValue)
            is Int -> getInt(key, this@getValue)
            is Long -> getLong(key, this@getValue)
            is Float -> getFloat(key, this@getValue)
            else -> {
                throw UnsupportedOperationException("Cannot find preference casting error")
            }
        }
        @Suppress("unchecked_cast")
        return result as T
    }
}

class SharedUserPreferencesImp(private val context: Context,
                               private val sharedPreferenceName: String): SharedUserPreferences {

    internal val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(sharedPreferenceName, Context.MODE_PRIVATE)
    }



    @SuppressLint("CommitPrefEdits")
    override fun <T : Any> T.setValue(key: String) {
        with(sharedPreferences.edit()) {
            when(this@setValue) {
                is String -> putString(key, this@setValue)
                is Boolean -> putBoolean(key, this@setValue)
                is Int -> putInt(key, this@setValue)
                is Long -> putLong(key, this@setValue)
                is Float -> putFloat(key, this@setValue)
                else -> {
                    throw UnsupportedOperationException("Cannot set value casting error")
                }
            }
        }.apply()
    }

    override fun deleteValue(key: String) {
        sharedPreferences.edit().remove(key).apply()
    }

    override fun String.getLength(): Int {
        return this.length
    }
}
