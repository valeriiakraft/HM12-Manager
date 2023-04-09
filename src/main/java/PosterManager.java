public class PosterManager {
    private String[] movies = new String[0];
    private int limit;


    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String movieTitle) {
        String[] newList = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newList[i] = movies[i];
        }
        newList[newList.length - 1] = movieTitle;
        movies = newList;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }


}

