package lk.ijse.gdse68;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Person implements Serializable {
    private String name;
    private int age;
    private String address;
}
