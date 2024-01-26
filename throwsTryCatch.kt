class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalArgumentException::class)
fun vote(name: String, age: Int){
    if (age < 16) {
        val anosFaltantes = 16 - age
        throw IllegalVoterException("$name, Apenas pessoas a partir de 16 anos podem votar. Volte daqui $anosFaltantes ano(s) ")
    }
    println("Voto de $name, $age anos realizado com sucesso!")
}



fun main (){
    var quantidadeVotos = 0
   
    quantidadeVotos += try {
        vote("Gustavo", 27)
        1
    }catch (e: IllegalVoterException) {0}
    quantidadeVotos += try {
        vote("Lorena", 24)
        1
    }catch (e: IllegalVoterException) {0}
	quantidadeVotos += try {
        vote("Henrique", 15)
        1
    }catch (e: IllegalVoterException) {0}
    quantidadeVotos += try {
        vote("Nala", 17)
        1
    }catch (e: IllegalVoterException) {0}
    
    
    println("Total de votos válidos: $quantidadeVotos") 
}
