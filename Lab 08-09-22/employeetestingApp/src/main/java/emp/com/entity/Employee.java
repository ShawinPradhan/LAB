package emp.com.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
private long empId;
private String empName;
private double empSal;

//entity reference
Address address;  //HAS-A relationship/association 
}
