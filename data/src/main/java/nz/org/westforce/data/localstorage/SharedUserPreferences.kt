package nz.org.westforce.data.localstorage

interface SharedUserPreferences {
 //   fun <T : Any> T.getValue(key: String): T
    fun <T : Any> T.setValue(key: String)
    fun deleteValue(key: String)
    fun String.getLength(): Int
}
