package com.agma.justificationpoo.modelo;


public enum ValidationStatus {
    PENDING("Pending Validation"),
    VALIDATED("Validated"),
    REJECTED("Rejected");

    private final String displayName;

    ValidationStatus(String displayName) {
        this.displayName = displayName;
    }

    
    @Override
    public String toString() {
        return this.displayName;
    }

   
    public static ValidationStatus fromString(String value) {
        for (ValidationStatus status : ValidationStatus.values()) {
            if (status.displayName.equalsIgnoreCase(value) || status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        return null; 
    }
}
