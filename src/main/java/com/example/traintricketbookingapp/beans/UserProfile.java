package com.example.traintricketbookingapp.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * UserProfile class represents the profile information of a user.
 *
 * This class contains information such as first name, last name, address, phone
 * number, and profile image.
 *
 */
@Entity
@Table(name = "user_profiles")
@Getter
@Setter
public class UserProfile {

	/**
	 * The unique identifier for the user profile.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "profile_id")
	private Integer profileId;

	/**
	 * The first name of the user.
	 */
	@Column(name = "first_name")
	private String firstName;

	/**
	 * The last name of the user.
	 */
	@Column(name = "last_name")
	private String lastName;

	/**
	 * The address of the user.
	 */
	@Column(name = "address")
	private String address;

	/**
	 * The phone number of the user.
	 */
	@Column(name = "phone_number")
	private String phoneNumber;

	/**
	 * The profile image of the user .this will be displayed when user access his
	 * profile
	 */
	@Lob
	private byte[] image;

	@Override
	public String toString() {
		return "UserProfile [profileId=" + profileId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
