// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    val database=createDatabase()
    database.load(CSV_FILENAME)
    while (true){
        print("请输入姓名（enter退出）:")
        val name=readln()
        if(name.isBlank())break
        if(database.containsKey(name)){
            println("电话号码:${database[name]}")
        }else{
            print("没有这个联系人，请输入电话号码：")
            val number=readln()
            database[name]=number
            database.save(CSV_FILENAME)
            println("已保存")
        }
    }

    // Implement the main program here
    // (You can add other functions to this file if you wish)
}
