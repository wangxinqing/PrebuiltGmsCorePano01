package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: tfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfm implements Runnable {
    final /* synthetic */ ConnectRequest a;
    final /* synthetic */ tfq b;

    public tfm(tfq tfq, ConnectRequest connectRequest) {
        this.b = tfq;
        this.a = connectRequest;
    }

    public final void run() {
        tdl tdl;
        byte b2;
        tdf a2 = this.b.a();
        if (a2 != null) {
            ConnectRequest connectRequest = this.a;
            Device device = connectRequest.b;
            String str = connectRequest.c;
            String str2 = connectRequest.d;
            byte b3 = connectRequest.h;
            byte b4 = connectRequest.l;
            tdv tdv = connectRequest.e;
            tdy tdy = connectRequest.f;
            long j = connectRequest.i;
            String str3 = connectRequest.j;
            byte b5 = connectRequest.k;
            teb teb = connectRequest.g;
            if (a2.b()) {
                a2.a(teb, 2982);
                return;
            }
            if (a2.c()) {
                if (a2.d.a(device)) {
                    a2.a(teb, -1);
                    return;
                }
                a2.d.m();
            }
            String str4 = device.d;
            if (str4 == null) {
                ((anih) ((anih) tdf.a.c()).a("tdf", "a", 229, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyBootstrapController: Cannot connect to a remote device that does not exist");
                a2.a(teb, 2980);
                return;
            }
            if (a2.a()) {
                a2.c.a();
            }
            ased ased = a2.g;
            arwa arwa = a2.j;
            String str5 = str3;
            tde tde = new tde(a2, j);
            if (b4 == 2) {
                arwa arwa2 = arwa;
                b2 = 2;
                tdl = new tcr(ased, arwa2, str, str2, b3, tdv, tdy, tde);
            } else {
                arwa arwa3 = arwa;
                b2 = 2;
                tdl = new tcw(ased, arwa3, str, str2, b3, tdv, tdy, tde);
            }
            a2.d = tdl;
            a2.d.a(device, str4);
            a2.e = b5;
            if (b5 == 1) {
                a2.j.a(8, (tdk) a2.d);
                tdl tdl2 = a2.d;
                tdl2.b(tdl2.s, (String) null);
            } else if (b5 != b2) {
                a2.a(teb, 13);
                return;
            } else if (str5 == null) {
                a2.j.a(7, (tdk) a2.d);
                a2.d.b(aymf.b());
            } else if (!tcv.e(str5)) {
                a2.a(teb, 2989);
                return;
            } else {
                a2.j.a(9, (tdk) a2.d);
                a2.d.b(str5);
            }
            a2.b(teb);
        }
    }
}
