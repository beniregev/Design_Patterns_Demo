package com.beniregev.designpatterns.structural.decorator_pattern;

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
