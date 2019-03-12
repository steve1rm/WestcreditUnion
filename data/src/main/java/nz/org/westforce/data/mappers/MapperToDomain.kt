package westforce.com.westforcecreditunion.mappers

interface MapperToDomain<in E, out D> {
    fun map(entity: E): D
}
