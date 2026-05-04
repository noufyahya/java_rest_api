package com.saas.Sales.repo;

import com.saas.Sales.Entity.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface salesRepo extends JpaRepository<products,Integer> {

    @Query(value = """
    SELECT product, SUM(CAST(sales AS DOUBLE)) AS total_sales
    FROM SALESDB
    GROUP BY product
    ORDER BY total_sales DESC
    LIMIT 5
""", nativeQuery = true)
    List<Object []> findTopProducts();

    @Query(value = """
    select segment ,
                SUM(CAST(sales AS DOUBLE)) as total_sales
                from SALESDB
                group by segment
                order by total_sales desc
""", nativeQuery = true)
    List<Object []> findTopSegments();
}
