package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FacsCacheApiChimeraService extends nio {
    public static final anij a = addh.b();
    ExecutorService b = jfm.b(10);

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit nit2 = nit;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        a.d().a("com.google.android.gms.udc.service.FacsCacheApiChimeraService", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Receiving API connection to FACS API from package '%s'...", (Object) getServiceRequest2.d);
        if (azrk.e()) {
            String str = getServiceRequest2.d;
            Account account = getServiceRequest2.h;
            int callingUid = Binder.getCallingUid();
            ClientContext clientContext = new ClientContext();
            clientContext.e = str;
            clientContext.f = "com.google.android.gms";
            clientContext.b = callingUid;
            clientContext.d = account;
            clientContext.c = account;
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                nix a2 = nix.a(this, this.e, this.f);
                nix a3 = nix.a(this, this.e, this.b);
                adev a4 = adev.a((Context) this);
                aded a5 = adee.a(this);
                addq addq = new addq(new adap(this, account));
                raw g = addx.g(this);
                Executor f = addx.f(this);
                adde d = addx.d(getApplicationContext());
                addt addt = addx.a(getApplicationContext()).b;
                aekp aekp = new aekp();
                addt addt2 = addt;
                mds mds = new mds(account);
                String str2 = "com.google.android.gms.udc.service.FacsCacheApiChimeraService";
                iva.a((Object) mds, (Object) "Must provide non-null options!");
                addi addi = new addi(account, a2, a3, clientContext, a4, a5, addq, g, f, d, addt2, aekp, new mep(this, mds));
                Binder.restoreCallingIdentity(clearCallingIdentity);
                nit2.a(addi);
                a.d().a(str2, "a", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API connection successful!");
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } else {
            nit2.a(16, (Bundle) null);
            a.c().a("com.google.android.gms.udc.service.FacsCacheApiChimeraService", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("API connection rejected!");
        }
    }

    public FacsCacheApiChimeraService() {
        super(202, "com.google.android.gms.facs.cache.service.START", (Set) anfv.a, 1, 9);
    }
}
