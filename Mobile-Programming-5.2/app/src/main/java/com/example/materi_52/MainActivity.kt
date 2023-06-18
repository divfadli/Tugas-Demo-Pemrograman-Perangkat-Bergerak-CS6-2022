package com.example.materi_52

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var addButton: Button // Tombol "Tambah Kartu"
    private lateinit var cardContainer: LinearLayout // Container untuk kartu-kartu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol "tambah kartu"
        addButton = findViewById(R.id.addButton)

        // Inisialisasi container kartu
        cardContainer = findViewById(R.id.cardContainer)

        // Tambahkan kartu baru ketika tombol "Tambah Kartu" ditekan
        addButton.setOnClickListener {
            tambahKartu()
        }
    }

    private fun tambahKartu() {
        // Membuat tampilan kartu baru dari file layout card_layout.xml
        val cardView = LayoutInflater.from(this).inflate(R.layout.card_layout, null) as CardView

        // TextView untuk judul kartu
        val titleTextView = cardView.findViewById<TextView>(R.id.titleTextView)

        // TextView untuk deskripsi kartu
        val descriptionTextView = cardView.findViewById<TextView>(R.id.descriptionTextView)

        // Mengatur judul kartu
        titleTextView.text = "Kota manakah Anda Berasal?"

        val city = arrayOf(
            "London is hanging in just fine,” says Resonance, “relying on a dipping currency to attract investment and, of course, previously priced-out tourists.",
            "Mexico City was founded by Spanish conquistadors in 1521 (atop the Aztec capital of Tenochtitlán), in the Valley of Mexico, in the South-Central part of the country. Sitting at an elevation of 2,240 meters (7,350 feet), this colorful, rambunctious (yet surprisingly peaceful in parts), artistic, and historical place will literally and figuratively take your breath away. ",
            "Tokyo has a life of its own. The nation's capital city is located on the East-Central coast of the island of Honshu, within the Kantō region. ",
            "Shanghai (上海) is the most populous city in the world's most populous country. This vital seaport is located in East-Central China, on the coast of the East China Sea, on the South shore of the Yangtze River.",
            "Bangladesh is situated in the country's central region alongside the Buriganga River. Dhaka is part of the Dhaka Division and the Dhaka District. Like Mumbai, the population density of this city has it nearly bursting at the seams, and yet, the rapidly growing metropolitan shows no signs of slowing.",
            "São Paulo, Brazil takes the crown as the largest city on the continent. This juggernaut is located in the Southeast, in the state of São Paulo, just inland from the port of Santos on the South Atlantic Ocean. São Paulo is also about 450 kilometers (280 miles) Southwest of the iconic city of Rio de Janeiro."
        )

        // Mengatur deskripsi kartu
        descriptionTextView.text = city[Random.nextInt(city.size)]

        // Mengatur warna latar belakang kartu secara acak
        cardView.setCardBackgroundColor(getRandomColor())

        // Menambahkan kartu ke dalam container
        cardContainer.addView(cardView)
    }

    private fun getRandomColor(): Int {
        // Array warna yang tersedia
        val colors = arrayOf(
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA
        )
        // Memilih indeks warna secara acak
        val randomIndex = (0 until colors.size).random()

        // Mengembalikan warna yang dipilih secara acak
        return colors[randomIndex]
    }
}
