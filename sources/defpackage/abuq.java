package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: abuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abuq implements acvp {
    private final abur a;

    public abuq(abur abur) {
        this.a = abur;
    }

    public final void a(acwa acwa) {
        abur abur = this.a;
        if (!acwa.b()) {
            abva.a.a((Throwable) acwa.e());
            try {
                abur.a.a(Status.c, (List) null);
            } catch (RemoteException e) {
                abva.a.a((Throwable) e);
            }
        } else {
            try {
                abur.a.a(Status.a, (List) acwa.d());
            } catch (RemoteException e2) {
                abva.a.a((Throwable) e2);
            }
        }
    }
}
