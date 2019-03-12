package westforce.com.westforcecreditunion.entities

data class MemberInfoEntity(
        val Id: String,
        val firstName: String,
        val lastName: String,
        val memberNumber: String,
        val dob: String,
        val email: String,
        val mobile: String,
        val homeNumber: String,
        val workNumber: String,
        val clientImage: String,
        val phoneContactType: String,
        val addressNumber: String,
        val addressStreetName: String,
        val addressSuburb: String,
        val addressCity: String,
        val addressPostCode: String,
        val addressType: String,
        val addressEffectiveDate: String,
        val emailEffectiveDate: String,
        val homePhoneEffectiveDate: String,
        val workPhoneEffectDate: String,
        val cellPhoneEffectiveDate: String,
        val addressContactId: String,
        val emailContactId: String,
        val phoneMobileContactId: String,
        val phoneHomeContactId: String,
        val phoneWorkContactId: String,
        val photoAddress: String,
        val photoTime: String,
        val signatureAddress: String,
        val signatureTime: String,
        val closed: String,
        val closedBy: String,
        val bankrupt: String,
        val warnAlert: String,
        val frozenAlert: String,
        val branch: String)