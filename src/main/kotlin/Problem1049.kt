fun main() {
    val s1= readLine()!!
    var firstWord:String=s1.trim()

    val s2= readLine()!!
    var secWord:String=s2.trim()

    val s3= readLine()!!
    var thirdWord:String=s3.trim()

    if (firstWord.equals("vertebrado")){
        if (secWord.equals("ave")){
            if(thirdWord.equals("carnivoro")){
                println("aguia")
            }
            else if (thirdWord.equals("onivoro")){
                println("pomba")
            }
        }
        else if (secWord.equals("mamifero")){

            if(thirdWord.equals("onivoro")){
                println("homem")
            }
            else if (thirdWord.equals("herbivoro")){
                println("vaca")
            }
        }

    }


    else if (firstWord.equals("invertebrado")){

        if (secWord.equals("inseto")){
            if(thirdWord.equals("hematofago")){
                println("pulga")
            }
            else if (thirdWord.equals("herbivoro")){
                println("lagarta")
            }
        }
        else if (secWord.equals("anelideo")){

            if(thirdWord.equals("hematofago")){
                println("sanguessuga")
            }
            else if (thirdWord.equals("onivoro")){
                println("minhoca")
            }
        }

    }
}