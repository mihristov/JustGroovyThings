/**
 * Created by xworks.admin on 5/5/2016.
 */
class Phrase {
    def wordsMap = [:]

    Phrase(String input) {
        input.split("[\\s.,:!&@\$%^*()_+]").each { word ->
            def lowerWord = word.toLowerCase().trim()
            if (lowerWord)
                wordsMap.put(lowerWord, wordsMap.containsKey(lowerWord) ? wordsMap.get(lowerWord) + 1 : 1)
        }
    }

    void print() {
        wordsMap.each { word, count ->
            println "${word}: ${count}"
        }
    }

    def wordCount() {
        wordsMap
    }

    public static void main(String[] args) {
        def p = new Phrase("a:s,d'a masd bla bla")
        p.print()
    }
}