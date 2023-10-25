package pl.dreilt.springcachetest.model;

import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Cacheable
@Cache(region = "customer", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class User {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private Long age;
}
