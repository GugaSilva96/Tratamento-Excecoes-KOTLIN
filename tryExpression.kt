fun main (){
    val a = 10 
    val b = 2 
    
    val divisao = try { 
        println("O Resultado da Divisão é: ")
        a/b
        
    } catch(e: ArithmeticException) {
        println(" - Erro: Tentativa de divisão por 0")  
        null 
        } 
    	

     println(divisao)
}         
