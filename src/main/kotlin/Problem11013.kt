fun main() {
    while (true){

        val s= readLine()!!.toInt()
        if (s == 2002){
            println("Acesso Permitido")
            break
        }
        else{
            println("Senha Invalida")
        }
    }
}