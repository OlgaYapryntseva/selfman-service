package telran.selfman.accounting.service;

import telran.selfman.accounting.dto.RolesDto;
import telran.selfman.accounting.dto.UserDto;
import telran.selfman.accounting.dto.UserRegisterDto;
import telran.selfman.accounting.dto.UserUpdateDto;

public interface UserAccountService {
	
	UserDto registerUser(UserRegisterDto userRegisterDto);
	
	UserDto getUser(String login);

	UserDto removeUser(String login);

	UserDto updateUser(String login, UserUpdateDto userUpdateDto);
	
	RolesDto changeRolesList(String login, String role, boolean isAddRole);

	void changePassword(String login, String newPassword);

}
