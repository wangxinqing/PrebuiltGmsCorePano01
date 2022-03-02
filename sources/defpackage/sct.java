package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: sct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sct implements aora {
    final /* synthetic */ scu a;

    public sct(scu scu) {
        this.a = scu;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.a.c.a(Status.a);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during HandleFlagChangeOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a("%s: Failed VerifyPendingGroupsOperation.", (Object) "Service");
        try {
            this.a.c.a(Status.c);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during HandleFlagChangeOperation", new Object[0]);
        }
    }
}
