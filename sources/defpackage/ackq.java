package defpackage;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: ackq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ackq implements acvp {
    private final aclm a;
    private final ConnectionRequest b;

    public ackq(aclm aclm, ConnectionRequest connectionRequest) {
        this.a = aclm;
        this.b = connectionRequest;
    }

    public final void a(acwa acwa) {
        aclm aclm = this.a;
        ConnectionRequest connectionRequest = this.b;
        if (acwa.b()) {
            aclm.a.b("Disconnect from previous connection succeeded, waiting for Bluetooth cleanup", new Object[0]);
            jfm.a(1, 9).a((Runnable) new acku(aclm, connectionRequest), azjn.a.a().m(), TimeUnit.MILLISECONDS).a(ackv.a, aoqm.a);
            return;
        }
        aclm.a.a("Disconnect failed, likely no connection in progress", new Object[0]);
        aclm.c.a(connectionRequest, aclm.h).a((acvs) new ackw(aclm));
    }
}
