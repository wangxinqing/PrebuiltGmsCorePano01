package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: sde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sde implements aora {
    final /* synthetic */ sdf a;

    public sde(sdf sdf) {
        this.a = sdf;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.a.a.a(Status.a);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during MaintenanceOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "MaintenanceOperation failed");
        try {
            this.a.a.a(Status.c);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during MaintenanceOperation", new Object[0]);
        }
    }
}
