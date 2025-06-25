package com.biprogy.Repository;

import com.biprogy.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDate;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query(
            value = "SELECT YEAR(o.oderdate) as year, WEEK(o.oderdate, 1) as week, SUM(o.orderprice) as totalRevenue, MIN(o.oderdate) as anyOrderDate " +
                    "FROM orders o WHERE o.oderstatus = 'SUCCESS' AND o.oderdate BETWEEN :startDate AND :endDate " +
                    "GROUP BY YEAR(o.oderdate), WEEK(o.oderdate, 1) ORDER BY year, week",
            nativeQuery = true
    )
    List<Object[]> getWeeklyRevenue(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
