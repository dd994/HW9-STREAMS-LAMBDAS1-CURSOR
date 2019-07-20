package main.java.thingsbox;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box {
    private List<List> box = new ArrayList<>();
    private List<Thing> box1 = new ArrayList<>();
    private List<Thing> box2 = new ArrayList<>();

    Box() {
        box.add(box1);
        box.add(box2);

        box2.add(new Thing("headphones"));
        box2.add(new Protected("vase oneі"));
        box2.add(new Protected("plate"));
        box2.add(new Thing("socks"));
        box2.add(new Protected("cup"));
        box2.add(new Thing("spoon"));
        box2.add(new Protected("vase two"));
        box2.add(new Protected("photo frame"));

        box1.add(new Thing("shoes"));
        box1.add(new Protected("glass"));
        box1.add(new Protected("jam bottle"));
        box1.add(new Thing("scarf"));
        box1.add(new Protected("pot"));
        box1.add(new Thing("bag"));
        box1.add(new Protected("binoculars"));
        box1.add(new Protected("bottle"));

    }


    void getProtectedThings() {
        List<String> protectedThings1 = box1.stream()
                .filter(boxs -> boxs.weak())
                .map(Thing::getName)
                .collect(Collectors.toList());

        List<String> protectedThings2 = box2.stream()
                .filter(boxs -> boxs.weak())
                .map(Thing::getName)
                .collect(Collectors.toList());

        System.out.println(protectedThings1);
        System.out.println(protectedThings2);
    }

}
