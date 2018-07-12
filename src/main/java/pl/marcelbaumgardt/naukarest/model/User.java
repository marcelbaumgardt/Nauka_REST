package pl.marcelbaumgardt.naukarest.model;


public class User {

    //REST - komunikacja odbywa sie za wykorzystaniem GET /POST/ DELETE/ PUT(Update)
    //Bezstanowosc - pomiedzy wykoaniami nie jest zachowany stan apliakcji request -> response
    //Zasoby sa okreslone pod unikalnym URI: sciezka do zasobu ( zawiera sie w URL)
    //https-> port 443
    //http-> port 80
    //POST - nie widac co wysylasz w przegladarce
    //PATCH - jak PUT tylko robi update czesci ktora sie zmienila (nie uzywne)

    //JSON lub XML -> informacja zwrotna
    //POST jezeli jest poprwany zwraca 201
    //GETT jezeli jest poprawny zwraca status 200


    private String username;
    private String email;
    private Integer age;
    private String details;

    public User(String username, String email, Integer age, String details) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.details = details;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", details='" + details + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
