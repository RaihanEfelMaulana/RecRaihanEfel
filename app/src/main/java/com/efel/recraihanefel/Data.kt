package com.efel.recraihanefel
class Data {
    companion object{
        fun createDataFood():ArrayList<FoodData>{
            val list=ArrayList<FoodData>()
            list.add(
                FoodData(
                    "HOKA HEMAT 1",
                    "Rp. 27.500",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/f0b9d580d9386a60506086a819fd1de4-1660019294911",
                    "Fried Chicken with HokBen special spices",
                ),
            )
            list.add(
                FoodData(
                    "HOKBEN FRIED CHICKEN 1 PC ",
                    "Rp. 24.000",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/fdeb0c94d54a47329349bb1a60f046e6-1660011292345",
                    "HokBen special rice, salad, Ekkado and 3 Egg Chicken Roll *Salad for dine in only.",
                ),
            )
            list.add(
                FoodData(
                    "Premium Set Seafood",
                    "Rp. 64.000",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/5a9929ddeb4f83c610389c6643c276c3-1660033285821",
                    "HokBen special rice, salad, 2 Egg Chicken Roll and 2 Shrimp Roll"
                ),
            )
            list.add(
                FoodData(
                    "BENTO SPECIAL 1",
                    "Rp. 58.000",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/320fb59b18e2ccf581b65c19f5da6246-1660019766088",
                    "Egg Chicken Roll, Shrimp Roll, Rice, Clear Soup, Salad and Ocha/Aqua. *Salad ",
                ),
            )
            list.add(
                FoodData(
                    "KIDZU BENTO 1",
                    "Rp. 41.000",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/dcde82d813edbb9c8ff2ca4e733e7a6e-1670470519029",
                    "Rice + Chicken Yakiniku + 2 pcs Egg Chicken Roll *Salad for dine in only.",
                ),
            )
            list.add(
                FoodData(
                    "MINI BOWL KANI ROLL",
                    "Rp. 22.000",
                    "https://hokben-images.s3.ap-southeast-3.amazonaws.com/menu/f3ec3ec495dbfd7ea35589b585957447-1660020780593",
                    "Rice, Salad, Beef Teriyaki, Tori no Teba, Ebi Furai, Ebi Fried *Salad for dine in only.",
                ),
            )
        return list
        }
    }

/*    private val foodNames= arrayOf(
        "Pical lele", "Fried chicken", "Sate madura","Roti ayam", "Nasi lemper", "Pisang coklat"
    )

    private val foodPrices= arrayOf(
        "Rp. 10.000", "Rp. 12.000", "Rp. 20.000", "Rp. 25.000", "Rp. 20.000", "Rp. 17.000"
    )

    private val foodImages= intArrayOf(
        R.drawable.food1, R.drawable.food2,
        R.drawable.food3, R.drawable.food4,
        R.drawable.food5, R.drawable.food6
    )*/


}