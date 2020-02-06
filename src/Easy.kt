class Easy (dog: Dog){
    var doggy: Dog
    init{
        doggy = dog
    }
    fun GameEas(){

        println(" УПРАВЛЕНИЕ : Продолжить-ENTER Идти на работу-R Покормить собачку-D Отдохнуть-S Поиграть-G Покушац-E")
        println("==(Day 1)===")
        readLine()
        println("Ах!Как же хорошо я выспался!Работа через 5 часов...Надо бы.......")
        readLine()
        println("===={ZA WARUDO!}====")
        readLine()
        println("* Время выбирать.Это ваше первые выборы.")
        readLine()
        println("1-покормить " + doggy.Name + "а" + "  2-Поесть самому")
        var a = readLine().toString().toInt()
        if(a == 1){
            println(" * А вы умны.........хорошо,не буду вам мешать....")
            println("")
        }
        else if(a == 2){
            println("Кот:МЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯУУУУУУУУУУ")
            println("---(GAME OVER)---")

        }

        
    }
}