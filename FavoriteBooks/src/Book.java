public class Book
{
    private int id;
    private String title;
    private String category;
    private String authorName;
    private String awardWinner;
    private int rating;
    private int year;
    private int pages;
    private String description;
    private String authorSurname;

    public Book(int id,String title,String category,String authorName,String authorSurname,String awardWinner,int rating,int year,int pages,String description)
    {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setAuthorName(authorName);
        this.setAuthorSurname(authorSurname);
        this.setAwardWinner(awardWinner);
        this.setRating(rating);
        this.setYear(year);
        this.setPages(pages);
        this.setDescription(description);
    }

    public Book(int id)
    {
        this.setId(id);
    }

    public String returnBookInformationToWriteIntoTxt()
    {
        return "#"+getId()+","+getTitle()+","+getCategory()+","+ getAuthorName()+","+getAuthorSurname()+","+getAwardWinner()+","+getRating()+","+getYear()+","+getPages()+","+getDescription();
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", awardWinner='" + awardWinner + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                ", pages=" + pages +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAwardWinner() {
        return awardWinner;
    }

    public void setAwardWinner(String awardWinner) {
        this.awardWinner = awardWinner;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }
}