//Задача 1:
//Создайте класс "Кот" (Cat) со следующими свойствами:
//Приватное поле "имя" (name) типа String для хранения имени кота.
//Приватное поле "возраст" (age) типа int для хранения возраста кота.
//Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//Дополнительное задание:
//Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".


public class Main {
    public static void main(String[] args) {
        Cat person = new Cat("Мяу!", "Тамара", 27); 
        Owner people = new Owner("Людмила");
        System.out.println(person.getGreet() + "Меня зовут " + person.getName() + ". Мне " + person.getAge() + "года (лет)." + " Мой владелец " + people.getName()); // Получение имени с помощью публичного метода getName()
        }
}
class Cat {
    private String name; // Приватное поле name
    private int age; // Приватное поле age
    private String greet;

    public Cat(String greet, String name, int age) {
        this.name = name;
        this.greet = greet;
        this.age = age;
    }
    public String getGreet() { // Публичный метод getName() для доступа к приватному полю name
        return greet;
    }
    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return name;
    }
    public int getAge() { // Публичный метод getName() для доступа к приватному полю name
        return age;
    }
     
}
class Owner {
    private String nam;

  public Owner(String nam) {
        this.nam = nam;
  }
  public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return nam;
    }
}
