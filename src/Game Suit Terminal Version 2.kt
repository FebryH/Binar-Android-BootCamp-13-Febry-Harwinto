object `Game Suit Terminal Version 2` {
    @JvmStatic
    fun main(args: Array<String>) {
        println("==========================")
        println("Game Suit Terminal Version")
        println("==========================")

        //Line input data untuk pemain 1
        print("1. Masukan pemain 1 : ")
        val pemain1 = readLine()?.toLowerCase()

        //pengecekan validitas input pemain 1
        when {
            pemain1 == "gunting" -> {
                println("Input telah valid")
            }
            pemain1 == "batu" -> {
                println("Input telah valid")
            }
            pemain1 == "kertas" -> {
                println("Input telah valid")
            }
            else -> {
                println ("input tidak valid")
                return
            }
        }

        //Line input data untuk pemain 2
        print("2. Masukan pemain 2 : ")
        val pemain2 = readLine()?. toLowerCase()

        //pengecekan validitas input pemain 2
        when {
            pemain2 == "gunting" -> {
                println("Input telah valid")
            }
            pemain2 == "batu" -> {
                println("Input telah valid")
            }
            pemain2 == "kertas" -> {
                println("Input telah valid")
            }
            else -> {
                println ("input tidak valid")
                return
            }
        }

        //Pilihan data untuk pemain 1 dan pemain 2
        val gunting = "Gunting"
        val batu = "Batu"
        val kertas = "Kertas"

        //Pengecekan hasil suit pemain 1 dan pemain 2
        val result = when("$pemain1-$pemain2") {
            "gunting-batu", "batu-kertas", "kertas-gunting" -> "Pemain 2 MENANG!"
            "batu-gunting", "kertas-batu", "gunting-kertas" -> "Pemain 1 MENANG!"
            else -> "DRAW!"
        }
        //Menunjukan hasil suit pemain 1 dan pemain 2
        println("Hasil : $result")
    }
}