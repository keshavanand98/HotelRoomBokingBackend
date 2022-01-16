package com.coderka.rooms.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import com.coderka.rooms.enums.RoomType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String roomNo;
    @Enumerated
    private RoomType  roomType;
   

}
