package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInBrokerChimeraService extends nio {
    public SignInBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        int i;
        String str = getServiceRequest.d;
        iva.a((Object) getServiceRequest.f);
        HashSet hashSet = new HashSet(Arrays.asList(getServiceRequest.f));
        int callingUid = Binder.getCallingUid();
        Bundle bundle = getServiceRequest.g;
        ClassLoader classLoader = BinderWrapper.class.getClassLoader();
        iva.a((Object) classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (TextUtils.isEmpty(string)) {
            string = str;
            i = callingUid;
        } else if (hya.a((Context) this).a(callingUid)) {
            try {
                i = jni.b(this).b(string, 0).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(string);
                throw new SecurityException(valueOf.length() == 0 ? new String("Bad package name: ") : "Bad package name: ".concat(valueOf));
            }
        } else {
            throw new SecurityException("Caller is not a Google app!");
        }
        abev abev = new abev(this, string, hashSet, i, (Account) bundle.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), abah.a(bundle).a(), new nix(this, this.e, this.f));
        if (getServiceRequest.a() != null) {
            abev.a(getServiceRequest.a(), (Set) hashSet);
        }
        nit.a(abev);
    }
}
