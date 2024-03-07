class Car private constructor(builder: Builder) {
    private val color: String
    private val make: String
    private val model: String

    init {
        color = builder.color
        make = builder.make
        model = builder.model
    }

    class Builder {
        var color: String = ""
            private set
        var make: String = ""
            private set
        var model: String = ""
            private set

        fun color(color: String) = apply { this.color = color }
        fun make(make: String) = apply { this.make = make }
        fun model(model: String) = apply { this.model = model }

        fun build() = Car(this)
    }

    override fun toString(): String {
        return "Car(color='$color', make='$make', model='$model')"
    }
}

fun main() {
    val car = Car.Builder()
        .color("Red")
        .make("Toyota")
        .model("Corolla")
        .build()

    println(car)
}
