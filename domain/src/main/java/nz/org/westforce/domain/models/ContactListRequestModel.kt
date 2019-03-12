package westforce.com.westforcecreditunion.models

/**
 * The Contact list web service will provide the ability to list contact details for a client.
 * */
data class ContactListRequestModel(
        val clientNumber: String,
        val requestingPersonClientNumber: String,
        val currentDetailsOnly: String)
