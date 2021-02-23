object Main extends App {
  val UnknownNumber = Math.floor(Math.random() * 100)
  println("\"ЗАДАЧА: Угадать число (от 0 до 100).\"")

  var Count = 0

  import scala.io.StdIn

  var UserNumber = 0

  do {
    Count = Count + 1
    println("Введите ваше число:")
    UserNumber = StdIn.readInt()

    if (UserNumber > UnknownNumber) {
      println("Моё число меньше")
    } else if (UserNumber < UnknownNumber) {
      println("Моё число больше")
    } else {
      println("Вы угадали!")
    }

  } while (UnknownNumber != UserNumber)
  println(s"Количество попыток: $Count")
}
