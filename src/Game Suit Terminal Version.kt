object `Game Suit Terminal Version` {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Game Suit Terminal Version")

        //Line input data untuk pemain 1
        print("Masukan pemain 1 :")
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

        //Line input data untuk pemain 1
        print("Masukan pemain 2 :")
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

        //Menunjukan hasil suit pemain 1 dan pemain 2
        println("Hasil :")
        if (pemain1 == gunting && pemain2 == batu)
            println("Pemain 2 MENANG!")
         else if (pemain1 == batu && pemain2 == kertas)
            println("Pemain 2 MENANG!")
         else if (pemain1 == kertas && pemain2 == gunting)
            println("Pemain 2 MENANG!")
         else if (pemain1 == batu && pemain2 == gunting)
            println("Pemain 1 MENANG!")
         else if (pemain1 == kertas && pemain2 == batu)
            println("Pemain 1 MENANG!")
         else if (pemain1 == gunting && pemain2 == kertas)
            println("Pemain 1 MENANG!")
         else if (pemain1 == gunting && pemain2 == gunting)
            println("DRAW!")
         else if (pemain1 == gunting && pemain2 == gunting)
            println("DRAW!")
         else if (pemain1 == kertas && pemain2 == kertas)
            println("DRAW!")
    }
}

// Disini aku stuck dan belum ketemu cara supaya bisa keluarin output sesuai IF condition, tapi di Game Suit Terminal Version 2 sudah bisa jalan.