package defpackage;

import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: fnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class fnt implements aora {
    private final fgb a;
    private final Object b;

    public fnt(fgb fgb, Object obj) {
        this.a = fgb;
        this.b = obj;
    }

    /* access modifiers changed from: protected */
    public abstract evi a(Status status, Object obj);

    public final void a(Object obj) {
        try {
            this.a.a(a(Status.a, obj).b());
        } catch (RemoteException e) {
            CredentialsInternalChimeraService.a.e("Error when triggering the callbacks.", e, new Object[0]);
        }
    }

    public final void a(Throwable th) {
        try {
            qbf a2 = qbf.a(th);
            if (a2.a == 8) {
                CredentialsInternalChimeraService.a.e("Internal error.", a2, new Object[0]);
            }
            this.a.a(a(a2.b(), this.b).b());
        } catch (RemoteException e) {
            CredentialsInternalChimeraService.a.e("Error when triggering the callbacks.", e, new Object[0]);
        }
    }
}
