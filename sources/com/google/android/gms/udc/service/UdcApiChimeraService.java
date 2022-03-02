package com.google.android.gms.udc.service;

import android.accounts.Account;
import android.os.Binder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcApiChimeraService extends nio {
    public UdcApiChimeraService() {
        super(35, "com.google.android.gms.udc.service.START", Collections.emptySet(), 1, 9);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        Account account = getServiceRequest.h;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            addm addm = new addm(this, nix.a(), account, str, callingUid);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            nit.a(addm);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
