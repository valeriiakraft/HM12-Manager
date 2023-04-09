import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class PosterManagerTest {
    @Test
    public void addMovies() {
        PosterManager manager = new PosterManager();

        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getMoviesWithoutAdd() {
        PosterManager manager = new PosterManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getAllMovies() {
        PosterManager manager = new PosterManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6", "Movie7", "Movie8", "Movie9", "Movie10"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastMoviesWithLimitInConstructor() {
        PosterManager manager = new PosterManager(5);
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastMoviesWhenQuantityAboveTheLimitWithoutLimitInConstructor() {
        PosterManager manager = new PosterManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");
        manager.add("Movie8");
        manager.add("Movie9");
        manager.add("Movie10");
        manager.add("Movie11");
        manager.add("Movie12");
        manager.add("Movie13");
        manager.add("Movie14");
        manager.add("Movie15");
        String[] expected = {"Movie15", "Movie14", "Movie13", "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastMoviesWhenQuantityBelowTheLimitWithoutLimitInConstructor() {
        PosterManager manager = new PosterManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");
        manager.add("Movie7");

        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}