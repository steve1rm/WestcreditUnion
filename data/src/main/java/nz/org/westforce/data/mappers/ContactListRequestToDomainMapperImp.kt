package westforce.com.westforcecreditunion.mappers

import westforce.com.westforcecreditunion.entities.ContactListRequestEntity
import westforce.com.westforcecreditunion.models.ContactListRequestModel

class ContactListRequestToDomainMapperImp
    : MapperToDomain<ContactListRequestEntity, ContactListRequestModel> {
    override fun map(entity: ContactListRequestEntity): ContactListRequestModel {
        return ContactListRequestModel(
                entity.clientNumber ?: "",
                entity.requestingPersonClientNumber ?: "",
                entity.currentDetailsOnly ?: "")
    }
}
