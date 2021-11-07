package com.beniregev.designpatterns.creational_patterns.factory.implementation;

import static com.beniregev.designpatterns.creational_patterns.factory.implementation.QualifiedStateCode.COUNTRY_CODE_LENGTH;
import static com.beniregev.designpatterns.creational_patterns.factory.implementation.QualifiedStateCode.NON_US_STATE_CODE_LENGTH;
import static com.beniregev.designpatterns.creational_patterns.factory.implementation.QualifiedStateCode.STATE_CODE_LENGTH;

public class QualifiedStateCodeFactory {
    /**
     * Create {@link QualifiedStateCode} Constructor from component parts.
     *
     * @param countryCode two letter country code
     * @param stateCode two letter state code for US states or 3 letter state code for other countries, e.g. For Israel country code "IL" and state code "ISR".
     */
    public QualifiedStateCode createQualifiedStateCode(final String countryCode, final String stateCode) {
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

        QualifiedStateCode qualifiedStateCode = new QualifiedStateCode(countryCode, stateCode);
        return qualifiedStateCode;
    }

    public QualifiedStateCode createQualifiedStateCode(final String qualifiedStateCodeString) {
        String countryCode = null;
        String stateCode = null;

        if (qualifiedStateCodeString == null) {
            throw new IllegalArgumentException();
        }

        String[] tokens = qualifiedStateCodeString.split("_");
        if (tokens.length == 2) {
            countryCode = tokens[0];
            if (countryCode.length() != COUNTRY_CODE_LENGTH) {
                throw new IllegalArgumentException("Country code length was not correct");
            }
            stateCode = tokens[1];
            if (countryCode.equals("US")) {
                if (stateCode.length() != STATE_CODE_LENGTH) {
                    throw new IllegalArgumentException("State code length was not correct");
                }
            } else {
                if (stateCode.length() != STATE_CODE_LENGTH || stateCode.length() != NON_US_STATE_CODE_LENGTH) {
                    throw new IllegalArgumentException("State code length was not correct");
                }
            }
        }
        else if (tokens.length == 1) {
            stateCode = tokens[0];
            if (stateCode.length() != STATE_CODE_LENGTH) {
                throw new IllegalArgumentException("State code length was not correct");
            }
        }
        else {
            throw new IllegalArgumentException(
                    String.format("qualifiedCountryCode argument {0} was not in correct form", qualifiedStateCodeString));
        }

        QualifiedStateCode qualifiedStateCode = new QualifiedStateCode(countryCode, stateCode);
        return qualifiedStateCode;
    }
}
