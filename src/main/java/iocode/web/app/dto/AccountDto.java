package iocode.web.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a data transfer object (DTO) for an account.
 * This DTO contains the account's code, label, and symbol.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
//Jo user is waqt logged in hai (authenticated), uske naam, UID, etc. bhi User user = (User) authentication.getPrincipal(); se mil jaayenge.
    /**
     * The unique identifier or code of the account.
     */
    private String code;

    /**
     * The descriptive label or name of the account.
     */
    private String label;

    /**
     * The symbol or abbreviation representing the account.
     */
    private char symbol;
}
