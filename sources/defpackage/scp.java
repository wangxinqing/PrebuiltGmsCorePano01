package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: scp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class scp implements aora {
    final /* synthetic */ scq a;

    public scp(scq scq) {
        this.a = scq;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            this.a.a.a(Status.a, (List) obj);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during FileGroupListForDebugUIOperation", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "FileGroupListForDebugUIOperation failed");
        try {
            this.a.a.a(Status.c, (List) null);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during FileGroupsListForDebugUIOperation", new Object[0]);
        }
    }
}
