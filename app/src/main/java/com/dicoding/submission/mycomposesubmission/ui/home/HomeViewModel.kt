package com.dicoding.submission.mycomposesubmission.ui.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.dicoding.submission.mycomposesubmission.R
import com.dicoding.submission.mycomposesubmission.model.Country

class HomeViewModel {
    private val _countryList = mutableStateOf<List<Country>>(emptyList())
    val countryList: State<List<Country>> get() = _countryList

    init {
        getCountryList()
    }

    private fun getCountryList() {
        _countryList.value = listOf(
            Country(
                name = "Brunei",
                flag = R.drawable.brunei,
                desc = "Brunei Darussalam atau Brunei adalah negara berdaulat di Asia Tenggara yang terletak di pantai utara pulau Kalimantan. Negara ini memiliki wilayah seluas 5.765 km² yang menempati pulau Kalimantan dengan garis pantai seluruhnya menyentuh Laut Tiongkok Selatan.Ibukotanya terletak di Bandar Sri Begawan Selain itu, Brunei juga terkenal dengan kemakmurannya dan ketegasan dalam melaksanakan Agama Islam, baik dalam bidang pemerintahan maupun kehidupan bermasyarakat. Pada tahun 2020, tercatat bahwa Brunei memiliki penduduk sebanyak 460,345 jiwa."
            ),
            Country(
                name = "Filipina",
                flag = R.drawable.filipin,
                desc = "Filipina, dengan nama resmi disebut sebagai Republik Filipina adalah sebuah negara kepulauan dan negara kesatuan yang bersistem presidensial dengan berbentuk republik konstitusional di Asia Tenggara, sebelah utara Indonesia, dan timur laut Sabah. Ibukotanya terletak di Manila. Filipina terdiri dari 7.107 pulau dengan luas total daratan diperkirakan 343.448 km2. Filipina adalah negara paling maju di Benua Asia setelah Perang Dunia II, namun sejak saat itu telah tertinggal di belakang negara-negara lain akibat pertumbuhan ekonomi yang lemah, penyitaan kekayaan yang dilakukan pemerintah, korupsi yang luas, dan pengaruh-pengaruh neo-kolonial."
            ),
            Country(
                name = "Indonesia",
                flag = R.drawable.indo,
                desc = "Indonesia, dikenal dengan nama resmi Republik Indonesia atau lebih lengkapnya Negara Kesatuan Republik Indonesia, adalah negara kepulauan di Asia Tenggara yang dilintasi garis khatulistiwa, dengan ibukotanya yang berada di Jakarta. Indonesia merupakan negara terluas ke-14 sekaligus negara kepulauan terbesar di dunia dengan luas wilayah sebesar 1.910.931 km². Selain itu, Indonesia juga menjadi negara berpenduduk terbanyak ke-4 di dunia dengan penduduk mencapai 270.203.917 jiwa pada tahun 2020, serta negara dengan penduduk beragama Islam terbanyak di dunia, dengan penganut lebih dari 230 juta jiwa."
            ),
            Country(
                name = "Laos",
                flag = R.drawable.laos,
                desc = "Laos, secara resmi Republik Demokratis Rakyat Laos, adalah sebuah negara yang terkurung daratan di Asia Tenggara, yang berbatasan dengan Myanmar dan Republik Rakyat Tiongkok di sebelah barat laut, Vietnam di timur, Kamboja di selatan, dan Thailand di sebelah barat. Beribukota di Vientiane, Laos merupakan salah satu dari lima negara komunis yang ada di dunia. Luas wilayahnya sekitar 236.800 km2 dengan jumlah penduduk sekitar 6,6 juta jiwa. Negara ini adalah satu-satunya Negara di kawasan Asia Tenggara yang tidak memiliki pantai. Kondisi ini dianggap kurang menguntungkan dari segi pertahanan dan keamanan, khususnya dari serangan atau invasi bangsa lain."
            ),
            Country(
                name = "Malaysia",
                flag = R.drawable.malay,
                desc = "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri dan tiga wilayah federal di Asia Tenggara dengan luas 330.803 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Jumlah penduduk negara ini mencapai 32.730.000 jiwa pada tahun 2020. Negara ini dipisahkan ke dalam dua kawasan — Semenanjung Malaysia dan Malaysia Timur — oleh Kepulauan Natuna, wilayah Indonesia di Laut Natuna yang terletak di sebelah Selatan dari Laut China Selatan.[14] Malaysia berbatasan dengan Thailand, Indonesia, Singapura, Brunei, dan Filipina."
            ),
            Country(
                name = "Myanmar",
                flag = R.drawable.myan,
                desc = "Republik Persatuan Myanmar adalah sebuah negara berdaulat di Asia Tenggara. Myanmar berbatasan dengan India dan Bangladesh di sebelah barat, Thailand dan Laos di sebelah timur dan Tiongkok di sebelah utara dan timur laut. Negara seluas 676.578 km² ini telah diperintah oleh pemerintahan militer sejak kudeta tahun 1988. Negara ini adalah negara berkembang dan memiliki populasi lebih dari 51 juta jiwa (2014).Ibu kota negara ini sebelumnya terletak di Yangon sebelum dipindahkan oleh pemerintahan junta militer ke Naypyidaw pada tanggal 7 November 2005. Myanmar adalah negara yang kaya dengan giok, batu permata, minyak bumi, gas alam, dan mineral lain."
            ),
            Country(
                name = "Kamboja",
                flag = R.drawable.cambodia,
                desc = "Kerajaan Kamboja adalah sebuah negara berbentuk monarki konstitusional di Asia Tenggara. Negara ini merupakan penerus Kekaisaran Khmer yang pernah menguasai seluruh Semenanjung Indochina antara abad ke-11 dan 14. Ibukota nya berada di Phnom Penh.Kamboja berbatasan dengan Thailand di sebelah barat, Laos di utara, Vietnam di timur, dan Teluk Thailand di selatan. Sungai Mekong dan Danau Tonle Sap melintasi negara ini. Kamboja mempunyai area seluas 181.035 km2. Berbatasan dengan Thailand di barat dan utara, Laos di timurlaut dan Vietnam di timur dan tenggara. Gunung tertinggi di Kamboja adalah Gunung Phnom Aoral yang berketinggian sekitar 1.813 mdpl."
            ),
            Country(
                name = "Singapura",
                flag = R.drawable.singapur,
                desc = "Singapura adalah sebuah negara pulau di lepas ujung selatan Semenanjung Malaya, 137 kilometer (85 mi) di utara khatulistiwa di Asia Tenggara. Negara ini terpisah dari Malaysia oleh Selat Johor di utara, dan dari Kepulauan Riau, Indonesia oleh Selat Singapura di selatan. Nama  ibu kota Singapura sama dengan nama negaranya itu sendiri, yaitu Singapura. Disimpulkan, Singapura adalah negara kota dengan sekaligus sebagai ibukotanya. Negara ini adalah yang terpadat kedua di dunia setelah Monako. Singapura adalah pusat keuangan terdepan ketiga di dunia. Pelabuhan Singapura adalah satu dari lima pelabuhan tersibuk di dunia."
            ),
            Country(
                name = "Thailand",
                flag = R.drawable.thai,
                desc = "Thailand adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat. Thailand adalah anggota pendiri Asosiasi Negara-Negara Asia Tenggara (ASEAN) dan tetap menjadi sekutu utama Amerika Serikat.Ibu kotanya terletak di Bangkok. Dengan tingkat perkembangan manusia yang tinggi, ekonomi terbesar kedua di Asia Tenggara, dan terbesar ke-20 oleh PDB, Thailand digolongkan sebagai ekonomi industri baru; manufaktur, pertanian, dan pariwisata adalah sektor-sektor utama perekonomian."
            ),
            Country(
                name = "Timor Leste",
                flag = R.drawable.timor,
                desc = "Timor-Leste, atau secara resmi bernama Republik Demokratik Timor-Leste, yang sebelum merdeka bernama Timor Timur, adalah sebuah negara pulau di Asia Tenggara. Negara ini berada di sebelah utara Australia dan bagian timur pulau Timor. Ibukotanya bernama Dili. Pada awalnya Timor Leste masuk ke wilayah Indonesia dengan menjadi provinsi ke-27. Timor Timur diakui secara internasional sebagai negara dan secara resmi merdeka dari Indonesia pada tanggal 20 Mei 2002. Timor-Leste beriklim tropis yang umumnya panas dan lembab. Terdapat dua musim yaitu musim panas dan musim hujan."
            ),
            Country(
                name = "Vietnam",
                flag = R.drawable.vietnam,
                desc = "Vietnam, lengkapnya bernama Republik Sosialis Vietnam adalah negara di Asia Tenggara Daratan. Vietnam berbatasan dengan Tiongkok di utara, Laos di barat laut, Kamboja di barat daya, dan dengan Laut Tiongkok Selatan di timur. Laut Tiongkok Selatan di Vietnam disebut Laut Timur. Ibukotanya terletak di Hanoi.Luas Vietnam 332.698 km². Bagian Vietnam yang berbatasan dengan batas-batas internasionalnya seluas 4639 km dan panjang pantainya sekitar 3444 km. Vietnam memiliki iklim muson tropis, dengan kelembapan rata-rata 84% sepanjang tahun. Namun, iklim cenderung sangat bervariasi dari satu tempat terhadap tempat yang lainnya."
            )
        )
    }
}

