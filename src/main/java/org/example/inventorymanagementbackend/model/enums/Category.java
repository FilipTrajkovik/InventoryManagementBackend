package org.example.inventorymanagementbackend.model.enums;

import lombok.Data;

public enum Category {
    FOOD("Food"),
    HOUSEHOLD("Household"),
    PERSONAL_CARE("Personal Care"),
    SPORTS("Sports"),
    PET_SUPPLIES("Pet supplies");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
