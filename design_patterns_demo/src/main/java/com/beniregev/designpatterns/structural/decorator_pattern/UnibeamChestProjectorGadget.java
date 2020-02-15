package com.beniregev.designpatterns.structural.decorator_pattern;

public class UnibeamChestProjectorGadget extends GadgetDecorator {
    public UnibeamChestProjectorGadget(Gadget nextGadget) {
        super(nextGadget);
    }
    @Override
    public void showGadget() {
        super.showGadget();
        System.out.println(" Unibeam Chest Projector...");
    }
}
