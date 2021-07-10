package homework_05_07;
/*
Доступен класс Packer, но он разработан с нарушением бизнес-логики и не
имеет реализации. Исправьте код упаковщика, чтобы:
● Любой вид хлебобулочных изделий (Bakery) можно упаковать в коробку с
более базовым типом (например, из коробки с пирогом (Pie) в коробку с
едой (Food))
● Базовые вещи, такие как еда (Food), нельзя упаковать в узкие коробки
(например, с пирожными (Cake))
● Произвольные классы, такие как String или Object, не могут быть
перепакованы без ошибок или предупреждений во время компиляции
● Переупаковка на самом деле происходит
 */

import java.util.ArrayList;
import java.util.List;

public class Packer {
    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        packer.repackage(foodBox, cakeBox);
    }

    public void repackage(Box<? super Food> to, Box<? extends Food> from) {
        to.put(from.get());
    }
}
