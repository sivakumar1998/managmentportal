package in.cdac.managmentportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cdac.managmentportal.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
