package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SignInInternalBrokerChimeraService extends nio {
    public SignInInternalBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.INTERNAL_START", ixm.c(), 1, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        throw new UnsupportedOperationException();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.signin.service.INTERNAL_START".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("SignInInternalBrokerSrv", valueOf.length() == 0 ? new String("request for unknown service ") : "request for unknown service ".concat(valueOf));
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.PACKAGE_NAME");
        amrl.a((Object) stringExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SIGNIN_OPTIONS");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        Set a = jkx.a((String[]) amrl.a((Object) intent.getStringArrayExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SCOPES")));
        int intExtra = intent.getIntExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.CALLING_UID", 0);
        int i = hxy.a;
        return new abev(this, stringExtra, a, intExtra, (Account) bundleExtra.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), abah.a(bundleExtra).a(), new nix(this, this.e, this.f));
    }
}
