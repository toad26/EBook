package Reopositories;

import Entities.BookToCartItem;
import org.springframework.data.repository.CrudRepository;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem,Long> {
}
