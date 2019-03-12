package westforce.com.westforcecreditunion.entities

import com.google.gson.annotations.SerializedName

data class ContactListRequestEntity(
        @SerializedName("client-number") val clientNumber: String?,
        @SerializedName("requesting-person-client-number") val requestingPersonClientNumber: String?,
        @SerializedName("current-details-only") val currentDetailsOnly: String?)
