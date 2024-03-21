package prerequisites;

class Cookie {
    private String color;

    public Cookie(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

public class MainCookie {
    public static void main(String[] args) {

        Cookie cookieOne = new Cookie("Red");
        Cookie cookieTwo = new Cookie("Green");

        String color = cookieOne.getColor();
        System.out.println("cookie one is " + color);

        color = cookieTwo.getColor();
        System.out.println("cookie one is " + color);

    }
}
