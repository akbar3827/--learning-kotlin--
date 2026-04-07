package com.example.learn_kotlin.OOP
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id : String,
    @NotBlank val name: String
)

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank

fun ValidationRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties
    // iterate one by one then we ceck it if it there're annotation @NotBlank
    for (property in properties) {
        if(property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if (value == "") {
                        throw ValidationException("${property.name} is Blank")
                    }
                }
            }
        }
    }
}

//fun validationRequest(request: CreateProductRequest) {
//    if(request.id.isBlank()) {
//        throw ValidationException("id is Blank")
//    } else if(request.name.isBlank()) {
//        throw ValidationException("name is Blank")
//    }
//}
//fun validationRequest(request: CreateCategoryRequest) {
//    if(request.id.isBlank()) {
//        throw ValidationException("id is Blank")
//    } else if(request.name.isBlank()) {
//        throw ValidationException("name is Blank")
//    }
//}


fun main() {
    val request = CreateProductRequest("1", "indomie", 2500)
    ValidationRequest(request)
}