package com.beniregev.designpatterns.factory.implementation;

/**
 * Immutable class for managing string notation for
 * describing a state within a country.
 *
 * @author Brian.Reynolds
 */
public class QualifiedStateCode {

    /**
     * delimiter between state & country.
     */
    public static final String DELIMITER = "_";

    /**
     * max length of the country code portion of the qualified state code.
     */
    public static final int COUNTRY_CODE_LENGTH = 2;

    /**
     * max length of the state code portion of the qualified state code.
     */
    public static final int STATE_CODE_LENGTH = 2;

    /**
     * max length of a non-US state code portion of the qualified state code.
     */
    public static final int NON_US_STATE_CODE_LENGTH = 3;

    // privates
    private String countryCode;
    private String stateCode;

    /**
     * constructor from fully qualified state code.
     *
     * @param qualifiedStateCodeString in form n form [countryCode]_[stateCode]
     */
    public QualifiedStateCode(final String qualifiedStateCodeString) {
        if (qualifiedStateCodeString == null) {
            throw new IllegalArgumentException();
        }

        String[] tokens = qualifiedStateCodeString.split("_");
        if (tokens.length == 2) {
            this.countryCode = tokens[0];
            if (this.countryCode.length() != COUNTRY_CODE_LENGTH) {
                throw new IllegalArgumentException("Country code length was not correct");
            }
            this.stateCode = tokens[1];
            if (this.countryCode.equals("US")) {
                if (this.stateCode.length() != STATE_CODE_LENGTH) {
                    throw new IllegalArgumentException("State code length was not correct");
                }
            } else {
                if (this.stateCode.length() != STATE_CODE_LENGTH || this.stateCode.length() != NON_US_STATE_CODE_LENGTH) {
                    throw new IllegalArgumentException("State code length was not correct");
                }
            }
        }
        else if (tokens.length == 1) {
            stateCode = tokens[0];
            if (this.stateCode.length() != STATE_CODE_LENGTH) {
                throw new IllegalArgumentException("State code length was not correct");
            }
        }
        else {
            throw new IllegalArgumentException(
                    String.format("qualifiedCountryCode argument {0} was not in correct form", qualifiedStateCodeString));
        }
    }

    /**
     * Constructor from component parts.
     *
     * @param countryCode two letter country code
     * @param stateCode two letter state code for US states or 3 letter state code for other countries, e.g. For Israel country code "IL" and state code "ISR".
     */
    public QualifiedStateCode(final String countryCode, final String stateCode) {
        if (countryCode == null || countryCode.length() != COUNTRY_CODE_LENGTH) {
            throw new IllegalArgumentException("country code must be two characters");
        }
        int stateCodeLength = stateCode.length();
        if (countryCode.equals("US")) {
            if (stateCode == null || stateCodeLength != STATE_CODE_LENGTH) {
                throw new IllegalArgumentException("state code must be two characters");
            }
        } else {
            if (stateCode == null || stateCodeLength != STATE_CODE_LENGTH || stateCodeLength != NON_US_STATE_CODE_LENGTH) {
                throw new IllegalArgumentException("state code must be two or three characters for non-US states");
            }
        }
        this.countryCode = countryCode;
        this.stateCode = stateCode;
    }

    /**
     * getter.
     *
     * @return the country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * getter.
     *
     * @return the state code
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * standard method.
     *
     * @return the string form [countryCode]_[stateCode]
     */
    @Override
    public String toString() {
        if (countryCode != null) {
            if (stateCode != null) {
                return countryCode.toUpperCase() + "_" + stateCode.toUpperCase();
            }
            else {
                throw new IllegalArgumentException("missing state portion of string");
            }
        }
        else {
            if (stateCode != null) {
                return stateCode.toUpperCase();
            }
            else {
                throw new IllegalArgumentException("requires at least a state code");
            }
        }
    }
}
