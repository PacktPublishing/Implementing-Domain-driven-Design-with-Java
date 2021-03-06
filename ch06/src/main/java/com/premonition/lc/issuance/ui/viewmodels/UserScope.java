package com.premonition.lc.issuance.ui.viewmodels;

import de.saxsys.mvvmfx.Scope;
import lombok.Data;

@Data
public class UserScope implements Scope {
    private final String loggedInUserId;

    public String getLoggedInUserId() {
        return loggedInUserId;
    }
}
