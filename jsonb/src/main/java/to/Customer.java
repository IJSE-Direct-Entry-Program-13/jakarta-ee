package to;

import jakarta.json.bind.annotation.JsonbPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@JsonbPropertyOrder({"id", "name", "address", "contacts"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    private String id;
    private String name;
    private String address;
    private String[] contacts;
}
