package com.java.model;

import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.java.entity.UserInformation;
import com.java.entity.UserManager;
import com.java.entity.UserStyle;
import com.java.utils.Gender;

public class UserInformationModel
{
	private int userInformationId;
	private String address;
	private Date birthDay;
	private String email;
	private String fullName;
	private Gender gender;
	private String identificationNumber;
	private String image;
	private String phone;
	private String userName;
	private String password;
	private String status;
	private UserManager userManager;
	private int userManagerId;
	private UserStyle userStyle;
	private int userStyleId;
	private String userStyleName;
	
	public UserStyle toUserStyle(UserStyle userStyle)
	{
		userStyle.setName(this.userStyleName);
		return userStyle;
	}
	
	public void fromUserStyle(UserStyle userStyle)
	{
		this.setUserStyleId(userStyle.getId());
		this.setUserStyleName(userStyle.getName());
	}
	
	public UserManager toUserManager(UserManager userManager)
	{
		userManager.setUserName(this.userName);
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		userManager.setPassword(bCryptPasswordEncoder.encode(this.password));
		return userManager;
	}
	
	public void fromUserManager(UserManager userManager)
	{
		this.setUserManagerId(userManager.getId());
		this.setUserName(userManager.getUserName());
		this.setUserStyleId(userManager.getUserStyle().getId());
	}
	
	public UserInformation toUserInformation(UserInformation userInformation)
	{
		userInformation.setAddress(this.address);
		userInformation.setBirthday(this.birthDay);
		userInformation.setEmail(this.email);
		userInformation.setFullName(this.fullName);
		userInformation.setGender(this.gender);
		userInformation.setIdentificationNumber(this.identificationNumber);
		userInformation.setPhone(this.phone);
		return userInformation;
	}
	
	public void fromUserInformation(UserInformation userInformation)
	{
		this.setUserInformationId(userInformation.getId());
		this.setAddress(userInformation.getAddress());
		this.setBirthDay(userInformation.getBirthday());
		this.setEmail(userInformation.getEmail());
		this.setFullName(userInformation.getFullName());
		this.setGender(userInformation.getGender());
		this.setIdentificationNumber(userInformation.getIdentificationNumber());
		this.setPhone(userInformation.getPhone());
		this.setUserManagerId(userInformation.getUserManager().getId());
	}
	
	public int getUserInformationId() {
		return userInformationId;
	}

	public void setUserInformationId(int userInformationId) {
		this.userInformationId = userInformationId;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserManager getUserManager() {
		return userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	public int getUserManagerId() {
		return userManagerId;
	}
	public void setUserManagerId(int userManagerId) {
		this.userManagerId = userManagerId;
	}
	public UserStyle getUserStyle() {
		return userStyle;
	}
	public void setUserStyle(UserStyle userStyle) {
		this.userStyle = userStyle;
	}
	public int getUserStyleId() {
		return userStyleId;
	}
	public void setUserStyleId(int userStyleId) {
		this.userStyleId = userStyleId;
	}

	public String getUserStyleName() {
		return userStyleName;
	}

	public void setUserStyleName(String userStyleName) {
		this.userStyleName = userStyleName;
	}
	
}
