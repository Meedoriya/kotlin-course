package lesson_10

private val supportInfo = "Support info"

class HitchHikerGuide {

    var title = ""
    private var numberOfPages = 9999

    private fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages(): Int {
        return numberOfPages;
    }

    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }

}

class Support {
    fun printInfo() {
        println(HitchHikerGuide::class.simpleName)
        println(HitchHikerGuide().title)
        println(supportInfo)
    }
}