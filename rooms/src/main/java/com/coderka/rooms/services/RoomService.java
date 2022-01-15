package com.coderka.rooms.services;

import java.util.List;

import com.coderka.rooms.entity.Room;
import com.coderka.rooms.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

   public List<Room> getRooms(){
       List<Room> rooms = roomRepository.findAll();
       return rooms;
   }
    
   public void addRooms(Room room){
       roomRepository.save(room);
   }
}
