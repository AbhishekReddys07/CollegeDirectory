package com.Directory.Service;

import com.Directory.DTO.LoginDTO;
import com.Directory.model.User;

public interface LoginService {

User findByEmail(String username);

User validateUser(String username, String password);


}
