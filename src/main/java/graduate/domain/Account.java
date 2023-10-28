package graduate.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account implements Serializable{
	@Id
	@Column(length = 20)
	private String username;
	@Column(length = 20)
	private String email;
	@Column(length = 50)
	private String password;
	@Column(length = 20)
	private String password2;
	@Column(length = 20)
	private String role;
}
