package com.siyu.liu.eventcreatorbackend.event;


import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long>{
    
}
