package in.cdac.managmentportal.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@Column(name = "dept_id")
	private int dept_id;
	@Column(name = "dept_name")
	private String dept_name;
	@Column(name = "address_line")
	private String address_line;
	@Column(name = "city")
	private String city;
	@Column(name = "state_code")
	private String state_code;
	@Column(name = "pincode")
	private String pincode;
	@Column(name = "cd_name")
	private String cd_name;
	@Column(name = "cd_designation")
	private String cd_designation;
	@Column(name = "cd_email")
	private String cd_email;
	@Column(name = "cd_mobile")
	private String cd_mobile;
	@Column(name = "cd_phone")
	private String cd_phone;
	
	@Column(name = "password")
	private String password;
	@Column(name = "username")
	private String username;
	@Column(name = "email_verification_timestamp")
	private LocalDateTime email_verification_timestamp;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "update_by")
	private String update_by;
	@Column(name = "update_timestamp")
	private LocalDateTime update_timestamp;
	@Column(name = "registration_timestamp")
	private LocalDateTime registration_timestamp;
	@Column(name = "ac")
	private String ac;
	@Column(name = "schema_name")
	private String schema_name;
	@Column(name = "is_active")
	private boolean is_active;
	@Column(name = "fp_request_timestamp")
	private LocalDateTime fp_request_timestamp;
	@Column(name = "fp_token")
	private String fp_token;
	@Column(name = "is_fp_active")
	private boolean is_fp_active;
	@Column(name = "is_global_aua")
	private boolean is_global_aua;
	@Column(name = "ca_email")
	private String ca_email;

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getAddress_line() {
		return address_line;
	}

	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCd_name() {
		return cd_name;
	}

	public void setCd_name(String cd_name) {
		this.cd_name = cd_name;
	}

	public String getCd_designation() {
		return cd_designation;
	}

	public void setCd_designation(String cd_designation) {
		this.cd_designation = cd_designation;
	}

	public String getCd_email() {
		return cd_email;
	}

	public void setCd_email(String cd_email) {
		this.cd_email = cd_email;
	}

	public String getCd_mobile() {
		return cd_mobile;
	}

	public void setCd_mobile(String cd_mobile) {
		this.cd_mobile = cd_mobile;
	}

	public String getCd_phone() {
		return cd_phone;
	}

	public void setCd_phone(String cd_phone) {
		this.cd_phone = cd_phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getEmail_verification_timestamp() {
		return email_verification_timestamp;
	}

	public void setEmail_verification_timestamp(LocalDateTime email_verification_timestamp) {
		this.email_verification_timestamp = email_verification_timestamp;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	public LocalDateTime getUpdate_timestamp() {
		return update_timestamp;
	}

	public void setUpdate_timestamp(LocalDateTime update_timestamp) {
		this.update_timestamp = update_timestamp;
	}

	public LocalDateTime getRegistration_timestamp() {
		return registration_timestamp;
	}

	public void setRegistration_timestamp(LocalDateTime registration_timestamp) {
		this.registration_timestamp = registration_timestamp;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getSchema_name() {
		return schema_name;
	}

	public void setSchema_name(String schema_name) {
		this.schema_name = schema_name;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public LocalDateTime getFp_request_timestamp() {
		return fp_request_timestamp;
	}

	public void setFp_request_timestamp(LocalDateTime fp_request_timestamp) {
		this.fp_request_timestamp = fp_request_timestamp;
	}

	public String getFp_token() {
		return fp_token;
	}

	public void setFp_token(String fp_token) {
		this.fp_token = fp_token;
	}

	public boolean isIs_fp_active() {
		return is_fp_active;
	}

	public void setIs_fp_active(boolean is_fp_active) {
		this.is_fp_active = is_fp_active;
	}

	public boolean isIs_global_aua() {
		return is_global_aua;
	}

	public void setIs_global_aua(boolean is_global_aua) {
		this.is_global_aua = is_global_aua;
	}

	public String getCa_email() {
		return ca_email;
	}

	public void setCa_email(String ca_email) {
		this.ca_email = ca_email;
	}

}
