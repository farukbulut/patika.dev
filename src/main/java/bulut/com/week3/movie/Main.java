package bulut.com.week3.movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ArrayList ile düzenli film listesi oluşturma
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Esaretin Bedeli", 1994, "Dram", 9.3);
        Movie movie2 = new Movie("Baba", 1972, "Suç", 9.2);
        Movie movie3 = new Movie("Kara Şövalye", 2008, "Aksiyon", 9.1);
        Movie movie4 = new Movie("Schindler'in Listesi", 1993, "Dram", 9.0);
        Movie movie5 = new Movie("Forrest Gump", 1994, "Dram", 8.8);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);

        System.out.println("================IMDb puanına göre büyükten küçüğe================");
        movieList.sort(Comparator.comparing(Movie::getImdbPoint).reversed());
        for (Movie movie : movieList){
            System.out.println(movie);
        }

        System.out.println("");
        System.out.println("");

        System.out.println("================Yayın yılına göre küçükten büyüğe sıralayınız================");
        movieList.sort(Comparator.comparing(Movie::getYearOfPublication));
        for (Movie movie : movieList){
            System.out.println(movie);
        }

        System.out.println("");
        System.out.println("");

        // Film filtreleme testleri
        System.out.println("================Film Türüne Göre Filtreleme================");

        // Dram filmlerini filtrele
        System.out.println("---Dram Filmleri---");
        List<Movie> dramMovies = getMovieByCategory("Dram", movieList);
        for (Movie movie : dramMovies) {
            System.out.println(movie);
        }

        System.out.println("");

        // Aksiyon filmlerini filtrele
        System.out.println("---Aksiyon Filmleri---");
        List<Movie> actionMovies = getMovieByCategory("Aksiyon", movieList);
        for (Movie movie : actionMovies) {
            System.out.println(movie);
        }

        System.out.println("");

        // Suç filmlerini filtrele
        System.out.println("---Suç Filmleri---");
        List<Movie> crimeMovies = getMovieByCategory("Suç", movieList);
        for (Movie movie : crimeMovies) {
            System.out.println(movie);
        }

        // Kullanıcıdan kategori girişi alma
        System.out.println("");
        System.out.println("================Kullanıcı Girişi ile Filtreleme================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Filtrelemek istediğiniz film türünü girin (Dram, Aksiyon, Suç): ");
        String userCategory = scanner.nextLine();

        List<Movie> userFilteredMovies = getMovieByCategory(userCategory, movieList);
        if (userFilteredMovies.isEmpty()) {
            System.out.println("Bu kategoride film bulunamadı!");
        } else {
            System.out.println("---" + userCategory + " Filmleri---");
            for (Movie movie : userFilteredMovies) {
                System.out.println(movie);
            }
        }

        scanner.close();
    }

    // Film türüne göre filtreleme metodu
    public static List<Movie> getMovieByCategory(String categoryName, List<Movie> list) {
        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie movie : list) {
            if (movie.getCategory().equalsIgnoreCase(categoryName)) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }
}