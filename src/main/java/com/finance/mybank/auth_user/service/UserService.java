package com.finance.mybank.auth_user.service;

import com.finance.mybank.auth_user.dto.UpdatePasswordRequest;
import com.finance.mybank.auth_user.dto.UserDTO;
import com.finance.mybank.auth_user.entity.User;
import com.finance.mybank.res.Response;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    User getCurrentLoggedInUser();
    Response<UserDTO> getMyProfile();
    Response<Page<UserDTO>> getAllUsers(int page, int size);
    Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);
    Response<?> uploadProfilePicture(MultipartFile file);
}
