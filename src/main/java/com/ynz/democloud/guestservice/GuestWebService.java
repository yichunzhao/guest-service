package com.ynz.democloud.guestservice;

import com.ynz.democloud.guestservice.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
@RequiredArgsConstructor
public class GuestWebService {
    private final GuestRepository guestRepository;

    @GetMapping
    public Iterable<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable("id") long id) {
        return this.guestRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Id :" + id + " is not found!"));
    }


}
