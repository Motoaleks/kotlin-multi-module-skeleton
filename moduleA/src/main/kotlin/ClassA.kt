import io.reactivex.Completable

object ClassA {
    fun hello() {
        Completable.complete()
                .subscribe {
                    println("Hello from A!")
                }
    }
}