package com.beniregev.designpatterns.structural_patterns.decorator;

public abstract class GadgetDecorator implements Gadget {
    Gadget nextGadget;
    public GadgetDecorator(Gadget nextGadget) {
        this.nextGadget = nextGadget;
    }
    @Override public
    Gadget addGadget() {
        return this;
    }
    @Override
    public void showGadget() {
        nextGadget.showGadget();
    }
}
