package lesson01

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String?
)

//fun expensiveProducts(products: List<Product>): List<Product> {
//    return products.filter {
//        it.price >= 4
//    }
//}
fun expensiveProducts(products: List<Product>): List<Product> =
    products.filter {
        it.price >= 4
    }

//fun describe(product: Product): String {
//    return "${product.name}: ${product.description ?: "No description"}"
//}
//fun describe(product: Product): String =
//    "${product.name}: ${product.description ?: "No description"}"
fun describe(product: Product) =
    "${product.name}: ${product.description ?: "No description"}"

//fun productsWithDescriptions(products: List<Product>): List<Product> {
//    return products.filter { it.description != null }
//}
//fun productsWithDescriptions(products: List<Product>): List<Product> =
//    products.filter {
//        it.description != null
//    }
fun productsWithDescriptions(products: List<Product>) =
    products.filter {
        it.description != null
    }

fun main() {
    val products = listOf(
        Product(
            id = 1,
            name = "Coffee",
            price = 4.50,
            description = "Strong and dark"
        ),
        Product(
            id = 2,
            name = "Tea",
            price = 3.00,
            description = null
        ),
        Product(
            id = 3,
            name = "Cake",
            price = 5.25,
            description = "Chocolate"
        ),
        Product(
            4,
            "Biscuits",
            2.50,
            null
        )
    )

    products.forEach {
        println(it)
    }

    val expensive = expensiveProducts(products)

    expensive.forEach {
        println(it)
    }

    products.forEach {
        println(describe(it))
    }

    val productsWithDescriptions = productsWithDescriptions(products)

    productsWithDescriptions.forEach {
        println(describe(it))
    }

}