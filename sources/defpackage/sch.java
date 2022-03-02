package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: sch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sch implements aora {
    final /* synthetic */ sci a;

    public sch(sci sci) {
        this.a = sci;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.a.a.a(Status.a);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "%s: Failed AddConfigsForDownloadOperation", "Service");
        try {
            this.a.a.a(Status.c);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during AddConfigsForDownloadOperation", new Object[0]);
        }
    }
}
