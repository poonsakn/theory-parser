fun main(args: Array<String>) {
    print("type 'exit' to exit\n")


    var con = false;
    var n = 0;
    while (true) {
        var stack = ""
        var input: String? = null
        do {
            input = readLine()
            if (input == "exit") return
        } while (input == null)

        var n = 0
        var additionalTextNotAllowed = false
        var spaceAfterText = false
        for (i in input) {
            stack = "" + i
        }

        for (i in input) {
            println(n)
            if (isSpace(i)) {
                if (n > 0) {
                    spaceAfterText = true
                }
                n++
                continue
            }
            if ((i in 'A'..'Z' && n >= 0 || (i in 'a'..'z' && n >= 0) || (i in '0'..'9' && n > 0))) {
                if (additionalTextNotAllowed && spaceAfterText) {
                    print("parse error0")
                    con = !con
                    break
                }
                additionalTextNotAllowed = true
                n++
                println("passa")
                continue
            } else if (i == '=') {
                n++
                break
            } else if (i == ';') {
                println("error ;")
                con = !con
                break
            } else {
                println("parse error1")
                con = !con
                break
            }
        }
        println("n"+n)
        input = input.drop(n)
        println("input = " + input)

        if (con) {
            con = !con
            continue
        }

        n = 0;


        n++;
    }
}

private fun isSpace(i: Char): Boolean {
    if (i == ' ') return true
    return false
}