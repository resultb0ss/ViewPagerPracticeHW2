package com.example.viewpager2

import java.io.Serializable

class Picture (
    val title: String,
    val author: String,
    val imageView: Int
): Serializable{

    companion object {
        val viewPagerList = mutableListOf(
            Picture("Богатыри (Три богатыря)","Автор: Васнецов Виктор", R.drawable.one),
            Picture("Девочка с персиками","Автор: Серов Валентин", R.drawable.two),
            Picture("Цветы и плоды","Автор: Хруцкий Иван", R.drawable.three),
            Picture("Над вечным покоем","Автор: Левитан Исаак", R.drawable.four),
            Picture("Аленушка","Автор: Васнецов Виктор", R.drawable.five),
            Picture("Адам и Ева. Потерянный Рай","Автор: Попов Павел", R.drawable.six),
            Picture("Золотая осень","Автор: Поленов Василий", R.drawable.seven),
            Picture("Утро в сосновом лесу","Автор: Шишкин Иван", R.drawable.eight),
            Picture("Бурлаки на Волге","Автор: Репин Илья", R.drawable.nine),
            Picture("Дети, бегущие от грозы","Автор: Маковский Константин", R.drawable.ten),

        )
    }
}