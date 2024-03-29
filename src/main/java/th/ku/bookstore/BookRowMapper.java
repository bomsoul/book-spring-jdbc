package th.ku.bookstore;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {
    public Book mapRow(ResultSet rs, int i) throws SQLException {
            Book book = new Book(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"));
            return book;
    }
}
