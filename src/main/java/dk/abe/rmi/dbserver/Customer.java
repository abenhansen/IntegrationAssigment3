package dk.abe.rmi.dbserver;;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Customer
{
    @Id
    private Long accnum;
    @NonNull
    private String name;
    @NonNull
    private Double amount;

    public Long getAccnum() {
        return accnum;
    }

    public void setAccnum(Long accnum) {
        this.accnum = accnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
