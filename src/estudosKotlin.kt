const val MIN_AGE = 16
const val MAX_AGE = 68

fun main() {
    /*
    println(Int.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)

    //var camelCase valor Mutável
    var currentAge = 22
    var currentAgee:Int?
    currentAgee = null


    //val camelCase valor Imutavel
    val currentAge = 22
    val currentAgee:Int?
    currentAgee = null
    println (currentAge)
    println (currentAgee)

    //erro
    var currentAge
    currentAge = 22 //ERRO!

    var currentYear = "Ano"
    currentYear  = 2021 //ERRO!


    var month:Int? = null
    //Atribui valor null corretamente a month

    var day:Int = null
    // Erro de computação
    // "Null can not be a value of a non-null type Int"


    //Operadores Aritméticos
    // a.plus(b) que atribuição é "a += b"
    // a.minus(b) que atribuição é "a -= b"
    // a.times(b) que atribuição é "a *= b"
    // "a / b" é o mesmo que a.div(b) que atribuição é "a /=b"
    // "a % b" é o mesmo que a.mod(b) que atribuição é "a%=b"

    //Operadores comparativos
    // Os comandos compareTo retornam os valores -1(menor que), 0(igual ou)
    //1(maior). Já os operadores retornam valores booleanos;
    // O compando equals retorna um booleano
    // a.compareTo(b)
    // a.equals(b)
    // !a.equals(b)

    //Operadores Lógicos
    // E (&&) que é (expressão1) and (expressão2)
    // Ou (||) que é (expressão1) or (expressão2)

    //Operadores In e range
    // contém (In)
    // Não contem (!In)
    // range/Faixa de valores (Int...Int)

    val bingo = listOf(8,6,34,2,13)
    var number = (1..34).random()
    println(number)
    println(number in bingo)

    var age = (70..100).random()
    println (age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >= MIN_AGE && age <= MAX_AGE)

    val s = "Olá, mundo!"

    println(s[0])
    println(s.first())
    //imprime O (o caracter inicial do array)

    println(s[s.length-1])
    println(s.last())
    //imprime ! (o caracter final do array)

    val name = "Ana"
    val s = "Olá"

    println(s + name)
    //imprime OláAna
    println("${s}, ${name}!")
    //Imprime Olá, Ana!
    println("Bem vinda(o), $name!")
    //imprime Bem vinda(o), Ana!
    //println("${name.capitalize()}")

    //capitalize() toUpperCase()
    //toLowerCase() decapitalize()

    //trimEnd() trimStart() trim()

    //replace(x,y)

    //formatar outros valores para um padrão de string
    //"padrão
    //${valor}".format(valor)


    //Empty X Blank
    val s=""
    println(s.isEmpty())
    //true
    println(s.isBlank())
    //true
    println(s.isNullOrBlank() || s.isNullOrEmpty())
    //true

    val c="       "
    println(c.isEmpty())
    //false
    println(c.isBlank())
    //true

    //Funções de ordem superior
    val z:Int

    z = calculate(34,90,::sum)
    println(z)

    //Funções single-line - Infere o tipo de retorn
    private fun getFullName(name:String, lastName:String) = "$name $lastName"
    //ou tambem no maximo pode se fazer uso da linha seguinte
    private fun getFullName(name:String, lastName:String) =
    "$name $lastName"

    //Funções/extensões
    //Cria uma função que só pode ser chamado por um tipo específico, cujo
    //o valor pode ser referenciado dentro da função através da palavra this;
    fun String.radomCapitalizedLetter() =
        this[(0..this.length-1).random()].toUpperCase()
    println("jean".radomCapitalizedLetter())

    //Estrutura de controle
    //if/else, when, elvis operator(?:)
    if(expressão){
        //bloco de codigo
    }else if (expressão2){
        //bloco de codigo
    }else{
        //bloco de codigo
    }

    //equivalente ao switch de outras linguagens
    //aceita tanto valores quanto condicionais
    //aceita range como case
    when (){
        case1 -> {}
        case2 -> {}
        case3 -> {}
        else -> {}
    }
    when(){
    a > b -> {}
    a != b && a > c -> {}
    b == 0 -> {}
    else -> {}
    }
    when (year){
    -4000..476 -> //antiguidade
    476..1452 -> //medieval
    1453..1789 -> //moderna
    currentYear -> //ano atual
    }
    //elvis operator checa de o valor não é nulo, se for ele atribui o valor seguinte
    val a:Int? = null
    var number = b ?: 0
    //exemplo
    var number = a?: b?: 0
    //nesse caso acima, se o valor de a não for nulo, number recebe a
    //se o valor de a for nulo e b não for nulo, number recebe b
    //se a e b forem nulos, number recebe 0

    //Atribuição
    //o valor atribuido tem que estar na ultima linha
    //a condicional pode usar chaves se so fizer a atribuição
    val maxValue = if (a > b) a else if (a < b) b else b

    val minValue = if (a > b){
        println("b($b) é o menor valor")
        b
    }else if (a < b){
        println("a($a) é o menor valor")
        a
    }else{
        println("os valores são iguais")
        b
    }

    //Estrutura de repetição (while, do while, for)
    //Aceita os comandos in, range, until, downTo e step
    while(true){
    }

    do{
    }while(true)

    for(i in 0..20 step 2){
    }

    //exemplo
    val sArray = "Olha essa string!"
    //tamando do array
    //cada posição do array
    for(l in sArray){
        //l[index]
        println(l.toUpperCase())
    }
    //sArray.forEach{ l ->
    //    print(l + " ")
    //}

     */

}
//Funções - Simplificando
private fun getFullName(name:String, lastName:String):String{
    val fullName = "$name $lastName"
    return fullName
}

private fun getFullname(name:String, lastName:String):String{
    return "$name $lastName"
}

private fun getFuLLName(name:String, lastName:String) = "$name $lastName"

//Funções de ordem superior
fun sum (a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}
