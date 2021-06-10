class FizzBuzz {
    fun convert(number: Int): String {
        if (number % 3 == 0) {
            return "fizz"
        }else if (number % 5 == 0) {
            return "buzz"
        }
        return number.toString()
    }

}
