package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: scm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scm implements aora {
    final /* synthetic */ scn a;

    public scm(scn scn) {
        this.a = scn;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.a.a.a(Status.a);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "%s: Failed DownloadPendingGroupsOperation", "Service");
        try {
            this.a.a.a(Status.c);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
    }
}
