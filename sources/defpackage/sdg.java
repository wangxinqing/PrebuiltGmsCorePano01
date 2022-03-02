package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: sdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sdg implements aora {
    final /* synthetic */ sdh a;
    final /* synthetic */ aucd b;

    public sdg(sdh sdh, aucd aucd) {
        this.a = sdh;
        this.b = aucd;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            if (!((Boolean) obj).booleanValue()) {
                aucd aucd = this.b;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoju aoju = (aoju) aucd.b;
                aoju aoju2 = aoju.g;
                aoju.d = aomg.a(11);
                aoju.a |= 8;
                this.a.i.a(new Status(8, "SetFileGroupActivationOperation : Failed to set activation status", (PendingIntent) null));
                return;
            }
            aucd aucd2 = this.b;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoju aoju3 = (aoju) aucd2.b;
            aoju aoju4 = aoju.g;
            aoju3.d = aomg.a(3);
            aoju3.a = 8 | aoju3.a;
            this.a.i.a(Status.a);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "SetFileGroupActivationOperation failed.");
        try {
            Status status = Status.c;
            if (th instanceof nja) {
                status = ((nja) th).a;
            }
            this.a.i.a(status);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
    }
}
