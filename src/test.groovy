
println '------变量和函数-------'

def varAndMethod(){
    def a = 1  //不显式生命变量类型
    a = 'abc' //运行时改变类型

    println a

    a = 4   //最后一行作为返回值
}

def ret = varAndMethod()

println ret


println 'Groovy 支持单引号，双引号，三单引号声明一个字符串；'
def quoted(){
    def singleQ = 'hello , single quot' // 声明为java.lang.String
    def doubleQ = "hello,double quot ${singleQ}" // 如果有${},则为groovy.lang.GString，支持变量替换;否则为java.lang.String
    def tripleQ = '''hello,
                    triple quot'''  // 允许多行，而不需要+号

    println singleQ
    println doubleQ
    println tripleQ

}

quoted()