public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 567891";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-123-45-67";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1996;
    }
}
