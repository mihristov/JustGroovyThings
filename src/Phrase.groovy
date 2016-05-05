class Phrase {
    def wordsMap = [:]

    Phrase(String input) {
        input.split(/[\s.,:!&@\u0024%^*()_+]/).each { word ->
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
        def p = new Phrase("a:s,d'a masgjhd bla bla")
        p.print()
    }
}