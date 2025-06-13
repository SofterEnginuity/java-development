package com.pluralsight;

import com.pluralsight.model.Film;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Film> getAllFilms() {
        List<Film> films = new ArrayList<>();
        String filmsQuery = "SELECT FilmID, title, description  FROM Films";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(filmsQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                do {
                    int filmId = resultSet.getInt(1);
                    String title = resultSet.getString(2);
                    double description = resultSet.getDouble(3);

                    films.add(new Film(filmId, title, description));
                } while (resultSet.next());
            } else {
                System.out.println("No Matches");
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred!");
            ex.printStackTrace();
        }
        return films;
    }

    public Film getFilmById(int filmId) {
        Film film = null;
        String filmByIdQuery = "SELECT FilmID, title, description FROM Films WHERE FilmID = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(filmByIdQuery)) {
            preparedStatement.setInt(1, filmId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int filmIdFromDb = resultSet.getInt(1);
                    String title = resultSet.getString(2);
                    double description = resultSet.getDouble(3);

                    film = new Film(filmIdFromDb, title, description);

                } else {
                    System.out.println("Film not found!");
                }
            }

        } catch (Exception ex) {
            System.err.println("An error has occurred!");
            ex.printStackTrace();
        }
        return film
;
    }


}