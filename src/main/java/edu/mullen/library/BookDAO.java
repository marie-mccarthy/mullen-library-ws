package edu.mullen.library;



import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(BookMapper.class)
public interface BookDAO {
//  @SqlUpdate("insert into something (id, name) values (:id, :name)")
 // void insert(@Bind("id") int id, @Bind("name") String name);

  @SqlQuery("select book_id, title, author, image_link from mullen_library.books")
  List<Book> getAllBooks();

  @SqlQuery("select book_id, title, author, image_link from mullen_library.books WHERE title = :title")
  List<Book> getBookByTitle(@Bind("title") String title);

  @SqlQuery("select book_id, title, author, image_link from mullen_library.books WHERE book_id = :id")
  List<Book> getBookByID(@Bind("id") int id);

}

