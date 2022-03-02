package defpackage;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* renamed from: acku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acku implements Runnable {
    private final aclm a;
    private final ConnectionRequest b;

    public acku(aclm aclm, ConnectionRequest connectionRequest) {
        this.a = aclm;
        this.b = connectionRequest;
    }

    public final void run() {
        aclm aclm = this.a;
        ConnectionRequest connectionRequest = this.b;
        aclm.a.a("Finished waiting, connecting", new Object[0]);
        aclm.c.a(connectionRequest, aclm.h).a((acvs) new ackx(aclm));
    }
}
