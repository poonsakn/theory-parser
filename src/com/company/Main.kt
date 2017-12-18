package com.company

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        print("type 'exit' to exit\n")


        var con = false;
        while (true) {
            var input: String? = null
            do {
                input = readLine()
                if (input == "exit") return
            } while (input == null)

            var n = 0;

            for (i in input) {
                if (isBackspace(i)) continue
                if (('A' <= i && i <= 'Z') || ('a' <= i && i <= 'z')) {
                    input.drop(++n)
                    break
                } else {
                    print("parse error")
                    con = !con
                    break
                }
            }
            if (con) {
                con = !con
                continue
            }


            //check '='
            for (i in input) {
                if (isBackspace(i)) continue
                if (i == '=') {
                    input.drop(++n)
                    break
                } else {
                    print("parse error")
                    con = !con
                    break
                }
            }
            if (con) {
                con = !con
                continue
            }



        }
    }

    private fun isBackspace(i: Char): Boolean {
        if (i == ' ') return true
        return false
    }
}