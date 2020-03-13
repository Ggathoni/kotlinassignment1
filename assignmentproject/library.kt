package assignmentproject

import override.Book

//a library needs a simple system to allow
//them to add books and lend the books
//create a kotlin file to allow  you to add,borrow and return a book
//use your own classes and methods to hack this project!




interface Library{

    fun add()
    fun borrow()
    fun returnbk()


}

class Student(var title:String,var author:String):Library {


    var total = 1000
    var newbk = 0
    var borrow = 0


    override fun add() {
        newbk+=total
        println("New book $title by $author has been added successfully")
    }

    override fun borrow() {
        if (borrow>3)
            println("You cannot borrow more than 3 books ")
    }

    override fun returnbk() {
        borrow+=total
        println("Hey! $title book has been returned")
    }

    override fun toString(): String {
        return "Student(title='$title', author='$author', total=$total, newbk=$newbk, borrow=$borrow)"
    }


}

fun main(args: Array<String>) {
    val borrower1=Student("Blosssoms","Joma Nemmy")
    println(borrower1.add())
    println(borrower1.returnbk())

    val borrower2=Student("Happiness","Nora Roberts")
    println(borrower2.add())
    println(borrower2.returnbk())

    val borrower3=Student("Human Eye","Dr.Milly")
    println(borrower3.newbk)


    val borrower4=Student("Biology","Jannet A.")

}







