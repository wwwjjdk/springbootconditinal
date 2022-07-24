package org.springtes.myfirstspring24_07_22;

public class ProductionProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "ProductionProfile";
    }
}
