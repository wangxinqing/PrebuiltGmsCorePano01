package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: abvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvm {
    private final abxq a;
    private final acfg b;

    public abvm(abxq abxq) {
        this.a = abxq;
        this.b = null;
    }

    public final void a(Status status) {
        try {
            abxq abxq = this.a;
            if (abxq == null) {
                acfg acfg = this.b;
                if (acfg != null) {
                    acfg.a(status);
                    return;
                }
                return;
            }
            abxq.d(status);
        } catch (RemoteException e) {
            abvn.a.e("Error calling onStartDirectTransferResult.", e, new Object[0]);
        }
    }

    public final void b(Status status) {
        try {
            abxq abxq = this.a;
            if (abxq == null) {
                acfg acfg = this.b;
                if (acfg != null) {
                    acfg.a(status);
                    return;
                }
                return;
            }
            abxq.e(status);
        } catch (RemoteException e) {
            abvn.a.e("Error calling onAbortDirectTransferResult.", e, new Object[0]);
        }
    }

    public abvm(acfg acfg) {
        this.b = acfg;
        this.a = null;
    }
}
