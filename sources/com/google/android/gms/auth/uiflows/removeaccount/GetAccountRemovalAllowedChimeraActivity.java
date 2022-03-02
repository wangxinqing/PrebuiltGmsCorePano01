package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAccountRemovalAllowedChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!jkr.a()) {
            finish();
        }
        Intent intent = getIntent();
        GetAccountRemovalAllowedController getAccountRemovalAllowedController = new GetAccountRemovalAllowedController((AccountAuthenticatorResponse) intent.getParcelableExtra("am_response"), (Account) intent.getParcelableExtra("account"), intent.getBooleanExtra("show_lock_screen", false), intent.getStringExtra("caller"));
        gnw a = getAccountRemovalAllowedController.a((gny) null);
        Intent intent2 = a.b;
        gnx.a(intent2, (Controller) getAccountRemovalAllowedController, a.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
