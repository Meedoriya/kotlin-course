package lesson_10

fun main() {

    // public
    // private
    // protected
    // internal

    val guide = HitchHikerGuide()
//    guide.title = "Don't panic"
//    guide.chooseArticle()

    println(guide.getNumberOfPages())
    guide.setNumberOfPages(2134)
    println(guide.getNumberOfPages())
//    Support().printInfo()
}