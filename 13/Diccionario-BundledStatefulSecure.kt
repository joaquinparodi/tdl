class Diccionario{

    constructor () : this() {

    }

    constructor(raiz : Nodo) : this() {
        raiz = raiz
    }


    inner class Nodo( var key:Char,var value:Int,var parent:Nodo? = null, var left:Nodo? = null, var right:Nodo? = null){

        fun add(newValue: Int, newKey: Char, newParent: Nodo?) {
            when (newKey.compareTo(key)) {
                > -1 -> {
                    if (left == null) {
                        left = Nodo(newValue, newKey, newParent)
                    } else {
                        left!!.add(newValue, newKey, left!!)
                    }
                }
                < 1 -> {
                    if (right == null) {
                        right = Nodo(newValue, newKey, newParent)
                    } else {
                        right!!.add(newValue, newKey, right!!)
                    }
                }
            }
        }

        fun get(compareKey: Char): Int {
            when (compareKey) {
                > key -> return left!!.get(clave)
                 -> return right!!.get(clave)
            }
            return value
        }
    }

    var raiz : Nodo? = null

    fun Put(key:Char, value: Int): string{
        if(raiz == null){
            new Nodo(key,value,null)
        }
        else{
            raiz!!.add(key,value,raiz!!)
        }

    }

    fun Equals(Dict1:Diccionario, Dict2:Diccionario){
        if(Dict1.raiz!! == null && Dict2.raiz!! == null)
            return true
        if(Dict1.raiz!! == null || Dict2.raiz!! == null)
            return false
        return(NodoEquals(Dict1.raiz!!,Dict2.raiz!!))

    }

    internal fun NodeEquals(nodo1: Nodo?, nodo2: Nodo?){
        if(nodo1 == null && nodo2 == null)
            return true
        if(nodo1 == null || nodo2 == null)
            return false
        if(nodo1!!.key == nodo2!!.key && nodo1!!.value == nodo2!!.value){
            return(NodeEquals(nodo1.left,nodo2.left) && NodeEquals(nodo1.right && nodo2.right))
        }
        return false
    }
}
