// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()){
        println("请输入文件名:")
        return
    }
    val data = fetchData(args[0])
    if (data.isEmpty()){
        println("无数据")
        return
    }
    val lowest = data.minBy{it.second}
    val highest = data.maxBy{it.second}
    println("最低温：${lowest.first},${lowest.second}")
    println("最高温:${highest.first},${highest.second}")
    println("平均温度：${data.map{it.second}.average()}")
    // Add your code here
}
