package Reopositories;

import Entities.UserOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<UserOrder, Long> {
}
