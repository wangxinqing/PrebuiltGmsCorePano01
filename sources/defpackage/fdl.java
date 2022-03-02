package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.credentialsaving.CredentialSavingChimeraService;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fdl implements aora {
    final /* synthetic */ ftv a;

    public fdl(ftv ftv) {
        this.a = ftv;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) obj;
        try {
            ftv ftv = this.a;
            Status status = Status.a;
            iva.a((Object) saveAccountLinkingTokenResult);
            ftv.a(status, saveAccountLinkingTokenResult);
        } catch (RemoteException e) {
            fdn.a.e("Unable to return the success result to the caller.", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        try {
            qbf a2 = qbf.a(th);
            if (a2.a == 8) {
                fdn.a.e("Internal error.", a2, new Object[0]);
            }
            this.a.a(CredentialSavingChimeraService.a(a2), (SaveAccountLinkingTokenResult) null);
        } catch (RemoteException e) {
            fdn.a.e("Unable to return the failure result to the caller.", e, new Object[0]);
        }
    }
}
