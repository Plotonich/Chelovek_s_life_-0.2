class Person {
            var height = 180
            var food = 150
            var cash = 12000
            var hp = 100
            var Name = toString()
            var Dog = Dog(100)
            var WorkPlace = Work()
            var a = readLine().toString().toInt()
            fun buy_food(){
                println("Time to choose.Выберите еду. 1-еда за 50 2-еда за 100 3-еда за 200. Еда за 50 даёт 20 хп,еда за 100 даёт 40 хп,еда за 200 даёт 80 хп.")
                if (a>=1){
                    food=food+20
                }
                else if (a>=2){
                    food=food+40
                }
                else if (a>=3){
                    food=food+80
                }
            }
            fun feed_dog(){
                Dog.food=Dog.food-20
            }
            fun eat(){
                food=food-20
            }
            fun sleep(){
                hp = hp+40
            }
        }


