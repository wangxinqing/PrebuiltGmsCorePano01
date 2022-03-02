package com.google.android.gms.appinvite.service;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInviteChimeraService extends jaz {
    private dwj a;
    private dwd i;

    public AppInviteChimeraService() {
        super(new int[]{77, 106}, new String[]{"com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL"}, (Set) new HashSet(), 3, 9);
    }

    static void a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        if (this.a == null) {
            this.a = dwj.a((Context) this);
        }
        if (this.i == null) {
            this.i = new dwd(getApplicationContext());
        }
        int i2 = getServiceRequest.b;
        if (i2 == 77) {
            String str = getServiceRequest.d;
            String string = getServiceRequest.g.getString("authPackage");
            if (getPackageName().equals(string)) {
                a();
            } else if (!str.equals(string)) {
                throw new SecurityException("invalid authPackage");
            }
            ClientContext clientContext = new ClientContext();
            clientContext.b = Binder.getCallingUid();
            clientContext.e = str;
            clientContext.f = getPackageName();
            jbb.a(new dww(this, jbf.a(), clientContext, this.a, this.i));
        } else if (i2 != 106) {
            jbb.a(16, (Bundle) null);
        } else {
            a();
            ClientContext clientContext2 = new ClientContext();
            clientContext2.f = getPackageName();
            clientContext2.b = Binder.getCallingUid();
            clientContext2.d = getServiceRequest.h;
            clientContext2.c = getServiceRequest.a();
            String string2 = getServiceRequest.g.getString("realClientPackage");
            if (TextUtils.isEmpty(string2)) {
                string2 = getServiceRequest.d;
            }
            clientContext2.e = string2;
            Scope[] scopeArr = getServiceRequest.f;
            if (scopeArr != null) {
                clientContext2.a(jkx.a(scopeArr));
            }
            jbb.a(new dwv(this, jbf.a(), clientContext2, this.a));
        }
    }
}
