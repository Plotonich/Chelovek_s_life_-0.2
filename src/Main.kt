import com.sun.xml.internal.ws.server.provider.ProviderInvokerTube

fun main(args:Array<String>){

    var Sobak = Dog(100)
    var easy = Easy(Sobak)
    var medium  = Medium()
    var difficult = Difficult()
println("Starting Windows 98..............")
   readLine()
    println("Запустить игру Chelovek's life? Q-Да! E-Нет")
    var a = readLine().toString()
    if (a=="q"){
        println("Вас приветствует мастер установки драйвера DogINC.")
        readLine()
        println("Напишите кличку своего собакена.")
        Sobak.Name= readLine().toString()
        println("Хорошо.Очень хорошо.Теперь вашу собачку зовут....")
        println(Sobak.Name)
        println("Выберите сложность игры. 1-милосердная 2-средняя 3-сложная")
        var c = readLine().toString().toInt()
        if (c == 1){
            println("Хорошо.Очень хорошо....")
            easy.GameEas()
        }
        else if (c==2){
            println("Отлино.Да,отлично....")
            medium.GameMed()
        }
        else if (c==3){
            println("ВНИМАНИЕ!ВЫ ВЫБРАЛИ СЛОЖНЫЙ РЕЖИМ! ПЕНЯЙТЕ НА СЕБЯ!")
            difficult.GameDif()
        }
    }
    else if (a=="e"){
        println("Ну ладно....1")
        readLine()
        println("ВНИМАНИЕ!ВНИМАНИЕ!ВАШ КОМПЬЮТЕР УВИДЕЛ ВИРУС ПОД НАЗВАНИЕМ ТРОЯН! ЕЛИ ХОТИТЕ ЧТОБЫ ВАШ КОМПЬТЕР СНОВА ЗАРАБОТАЛ ЗАПЛАТИТЕ 100000 РУБЛЕЙ! ")
        readLine()
        println("Вы: ну нафиг я на такое не подписывался!")
        readLine()
        println("Shutdown Windows 10 and 7 and XP and 2000 and NT and ME......3")
         readLine()
        println("Вы:ОАОАОАОАООАОАОАОАОАОАОАОАО")
        readLine()
        println("Уведомление:за вами наблюдает скелет который внезапно любит спагетти.2")
        readLine()
        println("Shutdown Chelovek 98......")
        readLine()
        println("Starting Chara 98......2")
        println("Введите код:")
        var c = readLine().toString().toInt()
        if (c==1322){
           println("Hello,Azriel")
        }
    }
    else{

    }


}