def playList(){
    def list = ["a",2,true] //支持不同类型元素

    println list
}

playList()



def playArray(){
    println '要使用 Array，需要显式声明'
    def intArr = [1, 2, 3] as int[] //显示声明
    String[] strArr = ["a", "b"]

    println intArr
    println strArr

}

playArray()

def playMap(){
    def map = [a:"a" , b:"b"]

    println map

    def key = "name"
    def map2 = [key: 'a']   //未使用
    def map3 = [(key): 'a']  //使用

    println(map2)
    println(map3)
}

playMap()
