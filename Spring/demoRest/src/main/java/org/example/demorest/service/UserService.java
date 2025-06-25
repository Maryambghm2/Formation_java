package org.example.demorest.service;

import org.example.demorest.dto.UserReceiveDto;
import org.example.demorest.dto.UserResponseDto;
import org.example.demorest.entity.User;
import org.example.demorest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDto create(UserReceiveDto userReceiveDto){
        return userRepository.save(userReceiveDto.dtoToEntity()).entityToDto();
    }


    public UserResponseDto getById(long id){
        return userRepository.findById(id).orElseThrow(null).entityToDto();
    }

    public List<UserResponseDto> getAll(){
        return userRepository.findAll().stream().map(User::entityToDto).toList();
    }


    public UserResponseDto update(Long id, UserReceiveDto userReceiveDto ){
        User userFound = userRepository.findById(id).orElseThrow(null);
        User userGet = userReceiveDto.dtoToEntity();
        userFound.setName(userGet.getName());
        userFound.setBirthDate(userGet.getBirthDate());
        userFound.setPassword(userGet.getPassword());
        return userRepository.save(userFound).entityToDto();
    }

    public void delete (long id){
        userRepository.deleteById(id);
    }
}
