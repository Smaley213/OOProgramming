package by.htp.less.oop5;

public class Director {

	private Builder presentBuilder;

    public void setBuilder(Builder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent() {
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildWrap();
        presentBuilder.buildProducts();
        return presentBuilder.getPresent();
    }

    public Builder getBuilder() {
        return presentBuilder;
    }

}
