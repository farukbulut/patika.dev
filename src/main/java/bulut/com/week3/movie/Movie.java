package bulut.com.week3.movie;

public class Movie {
    private String title;
    private int yearOfPublication;
    private String category;
    private double imdbPoint;

    public Movie(String title, int yearOfPublication, String category, double imdbPoint) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.category = category;
        this.imdbPoint = imdbPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getImdbPoint() {
        return imdbPoint;
    }

    public void setImdbPoint(double imdbPoint) {
        this.imdbPoint = imdbPoint;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", category='" + category + '\'' +
                ", imdbPoint=" + imdbPoint +
                '}';
    }
}
