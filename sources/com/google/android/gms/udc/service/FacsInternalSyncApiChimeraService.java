package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FacsInternalSyncApiChimeraService extends nio {
    public static final anij a = addh.b();

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        Account account = getServiceRequest.h;
        int callingUid = Binder.getCallingUid();
        ClientContext clientContext = new ClientContext();
        clientContext.e = str;
        clientContext.f = "com.google.android.gms";
        clientContext.b = callingUid;
        clientContext.d = account;
        clientContext.c = account;
        a.d().a("com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Receiving API connection to internal FACS API...");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            addj addj = new addj(nix.a(this, this.e, this.f), clientContext, adev.a((Context) this), addx.g(this), addx.f(this));
            Binder.restoreCallingIdentity(clearCallingIdentity);
            nit.a(addj);
            a.d().a("com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API connection successful!");
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public FacsInternalSyncApiChimeraService() {
        super(220, "com.google.android.gms.facs.internal.service.START", (Set) anfv.a, 0, 10);
    }
}
