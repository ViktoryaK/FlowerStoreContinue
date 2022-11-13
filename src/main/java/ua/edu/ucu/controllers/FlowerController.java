package ua.edu.ucu.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.Items.CactusFlower;
import ua.edu.ucu.Items.Flower;
import ua.edu.ucu.Items.FlowerColor;
import ua.edu.ucu.Items.RomashkaFlower;

import java.util.List;

@RestController
@RequestMapping(path = "/flowercontrol")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        Flower flowerOne = new RomashkaFlower();
        flowerOne.setColor(FlowerColor.RED);
        flowerOne.setSepalLength(12.3);
        flowerOne.setPrice(50);
        flowerOne.setDescription("Romashka");

        Flower flowerTwo = new CactusFlower();
        flowerTwo.setColor(FlowerColor.BLUE);
        flowerTwo.setSepalLength(9);
        flowerTwo.setPrice(5000);
        flowerTwo.setDescription("Cactus");

        return List.of(flowerOne, flowerTwo);
    }
}
