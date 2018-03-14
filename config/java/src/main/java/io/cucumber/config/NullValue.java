package io.cucumber.config;

public class NullValue implements Value {
    @Override
    public void print(int depth, String rootKey, Appendable out) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String asString() {
        return null;
    }

    @Override
    public Boolean asBoolean() {
        return false;
    }

    @Override
    public Integer asInt() {
        // TODO: Return null?
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public Value getValue(String property) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public Value getChild(String property) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void setValue(String property, Value value) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public void setNull(String property) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean isProperty() {
        return true;
    }
}