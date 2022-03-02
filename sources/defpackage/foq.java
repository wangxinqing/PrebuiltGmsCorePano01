package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.CredentialsChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: foq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class foq implements aora {
    final /* synthetic */ fgc a;

    public foq(fgc fgc) {
        this.a = fgc;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.a(Status.a, (Credential) obj);
        } catch (RemoteException e) {
        }
    }

    public final void a(Throwable th) {
        try {
            qbf a2 = qbf.a(th);
            if (a2.a == 8) {
                CredentialsChimeraService.a.e("Internal error.", a2, new Object[0]);
            }
            this.a.a(fot.a(a2), (Credential) null);
        } catch (RemoteException e) {
        }
    }
}
