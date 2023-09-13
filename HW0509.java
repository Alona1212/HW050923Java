//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//        Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//        Отобразите строку «Я могу купить еду, это ……» и значение.
public class HW0509 {
    public static void main(String[] args) {
 boolean isShop10pen = true;
 boolean isShop20pen = false;
        System.out.println("I can eat: "+ isOpen(isShop10pen, isShop20pen));
}
public static boolean isOpen(boolean a, boolean b){
    if (a|| b) return true;
    else return false;
    }
}