package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: absr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absr {
    public abxe a;
    public acfg b;

    public absr(abxe abxe) {
        this.a = abxe;
    }

    public final void a(Status status) {
        try {
            abxe abxe = this.a;
            if (abxe == null) {
                acfg acfg = this.b;
                if (acfg != null) {
                    acfg.a(status);
                    return;
                }
                return;
            }
            abxe.i(status);
        } catch (RemoteException e) {
            abss.a.e("Error calling onStartDirectTransferResult.", e, new Object[0]);
        }
    }

    public final void b(Status status) {
        try {
            abxe abxe = this.a;
            if (abxe == null) {
                acfg acfg = this.b;
                if (acfg != null) {
                    acfg.a(status);
                    return;
                }
                return;
            }
            abxe.j(status);
        } catch (RemoteException e) {
            abss.a.e("Error calling onAbortDirectTransferResult.", e, new Object[0]);
        }
    }

    public absr(acfg acfg) {
        this.b = acfg;
    }
}
