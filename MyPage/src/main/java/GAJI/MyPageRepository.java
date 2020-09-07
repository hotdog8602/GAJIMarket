package GAJI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyPageRepository extends CrudRepository<MyPage, Long> {

    List<MyPage> findByMemberId(Long memberId);
    List<MyPage> findByProductId(Long productId);
    List<MyPage> findByMemberId(Long memberId);
    List<MyPage> findByProductId(Long productId);

}