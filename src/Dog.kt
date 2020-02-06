class Dog (DogHP: Int){
   var HP = 100
 init {
  if(HP>=100){
   HP = DogHP
  }
  else HP = 100

 }
 var Name = "DAD"
    set(b: String){
        if (b== ""){
            field= "Жорик"
        }
        else field = b
    }
    var height = 100
    var weight = 20
    //var nickname = readLine().toString()
 //   var owner = Person()
 var food =100

}