package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.List;

/* renamed from: sdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sdc implements aora {
    final /* synthetic */ List a;
    final /* synthetic */ sdd b;
    final /* synthetic */ aucd c;

    public sdc(sdd sdd, aucd aucd, List list) {
        this.b = sdd;
        this.c = aucd;
        this.a = list;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        try {
            if (!amri.a()) {
                aucd aucd = this.c;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aoju aoju = (aoju) aucd.b;
                aoju aoju2 = aoju.g;
                aoju.d = aomg.a(5);
                aoju.a |= 8;
                rwy rwy = this.b.i;
                Status status = Status.a;
                FileGroupRequest fileGroupRequest = this.b.c;
                rwy.a(status, new FileGroupResponse(fileGroupRequest.a, fileGroupRequest.b, 0, amzy.h()));
                return;
            }
            aucd aucd2 = this.c;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoju aoju3 = (aoju) aucd2.b;
            aoju aoju4 = aoju.g;
            aoju3.d = aomg.a(3);
            aoju3.a |= 8;
            rwy rwy2 = this.b.i;
            Status status2 = Status.a;
            FileGroupRequest fileGroupRequest2 = this.b.c;
            rwy2.a(status2, new FileGroupResponse(fileGroupRequest2.a, fileGroupRequest2.b, ((afkr) amri.b()).e, this.a));
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during GetFileGroupOperation.", new Object[0]);
        }
    }

    public final void a(Throwable th) {
        afsh.a(th, "GetFileGroupOperation failed.");
        try {
            Status status = Status.c;
            if (th instanceof nja) {
                status = ((nja) th).a;
            }
            this.b.a(status);
        } catch (RemoteException e) {
            afsh.b((Throwable) e, "Client died during GetFileGroupOperation.", new Object[0]);
        }
    }
}
