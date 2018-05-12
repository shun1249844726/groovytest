//  参考： https://blog.csdn.net/u014099894/article/details/51118703

import groovy.lang.Closure
def defaultIt() {
    3.times {
        println(it)
    }
}

defaultIt()


println '---------创建闭包变量--------'

def listener = {
    e ->
        println '使用 def 声明一个闭包'
}
listener()

groovy.lang.Closure callback = {
    println '使用指定类型 Closure 声明一个闭包'
}

callback()

groovy.lang.Closure<Boolean> isTextFile = {
    File it ->
        it.name.endsWith('.groovy')

}

File file = new File("./src/Closure.groovy")
println isTextFile(file)


println '---------调用闭包0-------'
println '1、无参闭包'

def code = {123}  //省去了参数和箭头
println code()  //调用该闭包
println code.call() //调用该闭包 方式二


println '1、带参闭包'
def isOddNumber ={ // 判断是否为奇数
    int i ->
    i%2 == 1;   //可以省略reture
}
println(isOddNumber(3))


println('-------参数类型---------')

//如果闭包没定义参数的话,则隐含有一个参数,这个参数名字叫 it。
//it 代表闭包的参数。

def greeting = {"hello ,$it!"} //隐含参数 it
//相当于下面

def greetingT = {
    it ->
        return "hello,"+it +"!"
}

println(greeting("DDD"))
println(greetingT("TTT"))

//所以上面那个判断奇数的闭包就可以这样写

def isOddNumber1 = {
    it %2 ==1
}
println isOddNumber1(5)

println '--可变参数--'
def aMethod = {
    int... args ->
        int sum = 0
        args.eachWithIndex{
            int entry, int i ->
                sum = sum+args[i]
        }
    sum
}
println aMethod(1,2,3)

println('--------闭包的Delegation代理---------')
