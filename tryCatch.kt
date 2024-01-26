fun main (){
    val a = 10 
    val b = 2 
    
    try{
        val divisao = a/b
        println(divisao)
    } catch(e: Throwable){
        println("Ocorreu uma exceção Aritimética")
    }catch(e: ArithmeticException){
        println(e.message)
	}finally {
        println("Finally executado")
    }
}