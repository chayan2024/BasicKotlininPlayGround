sealed class Result
data class Success(val message: String) : Result()
data class Error(val errorMessage: String) : Result()
object Loading : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.message}")
        is Error -> println("Error: ${result.errorMessage}")
        Loading -> println("Loading...")
    }
}

fun main() {
    val successResult = Success("Data loaded successfully")
    val errorResult = Error("Failed to load data")
    val loadingResult = Loading

    handleResult(successResult)
    handleResult(errorResult)
    handleResult(loadingResult)
}
