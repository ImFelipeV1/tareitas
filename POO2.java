public class POO2 {

public static void main(String[] args) {
    POO2 Song = new POO2("I Wonder", "Kanye West", "Graduation");

    Song.ShowName();
    Song.ShowAutor();
    Song.ShowAlbum();
}

    public POO2(String name, String autor, String album) {
        this.Name = name;
        this.Autor = autor;
        this.Album = album;
    }

    private String Name;
    private String Autor;
    private String Album;

    public void ShowName() {
        System.out.println("La canción se llama " + Name);
    }

    public void ShowAutor() {
        System.out.println("Su autor es " + Autor);
    }

    public void ShowAlbum() {
        System.out.println("Está en el album " + Album);
    }
}
