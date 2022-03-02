package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: tfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfg implements Runnable {
    final /* synthetic */ SendDataRequest a;
    final /* synthetic */ tfq b;

    public tfg(tfq tfq, SendDataRequest sendDataRequest) {
        this.b = tfq;
        this.a = sendDataRequest;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            SendDataRequest sendDataRequest = this.a;
            Device device = sendDataRequest.b;
            byte[] bArr = sendDataRequest.c;
            teb teb = sendDataRequest.d;
            tdk d = a2.d();
            if (d == null || !d.a(device)) {
                a2.a(teb, 2981);
                return;
            }
            tdk d2 = a2.d();
            if (d2 == null) {
                a2.a(teb, 2982);
            }
            int length = bArr.length;
            asfn asfn = d2.e;
            boolean z = true;
            int i = 0;
            if (asfn == null) {
                ((anih) ((anih) tdk.b.c()).a("tdk", "b", 252, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: device is not connected before send");
                z = false;
            } else {
                aucd o = asgk.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asgk asgk = (asgk) o.b;
                asfn.getClass();
                asgk.b = asfn;
                asgk.a |= 1;
                aucd o2 = asfp.c.o();
                auay a3 = auay.a(bArr);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asfp asfp = (asfp) o2.b;
                a3.getClass();
                asfp.a |= 1;
                asfp.b = a3;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asgk asgk2 = (asgk) o.b;
                asfp asfp2 = (asfp) o2.i();
                asfp2.getClass();
                asgk2.c = asfp2;
                asgk2.a |= 2;
                d2.c.a((asgk) o.i(), (asgs) new tdi());
            }
            if (!z) {
                i = 13;
            }
            a2.a(teb, i);
        }
    }
}
