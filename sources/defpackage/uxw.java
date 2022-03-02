package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: uxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uxw implements icm {
    private final uxy a;
    private final vci b;
    private final uyb c;

    public uxw(uxy uxy, vci vci, uyb uyb) {
        this.a = uxy;
        this.b = vci;
        this.c = uyb;
    }

    public final void a(icl icl) {
        uxy uxy = this.a;
        vci vci = this.b;
        uyb uyb = this.c;
        Status status = (Status) icl;
        int i = status.i;
        Status status2 = new Status(i, uye.g(i));
        if (vci != null) {
            try {
                vci.a(status2);
            } catch (RemoteException e) {
                jjg jjg = tgc.a;
            }
        }
        int i2 = uyb.c - 1;
        if (i2 == 1) {
            uyc uyc = uxy.d;
            aucd o = auwz.n.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz = (auwz) o.b;
            auwz.b = 6;
            auwz.a |= 1;
            int a2 = uyb.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz2 = (auwz) o.b;
            auwz2.a = 2 | auwz2.a;
            auwz2.c = a2;
            aucd o2 = auwo.c.o();
            int i3 = status.i;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auwo auwo = (auwo) o2.b;
            auwo.a = 1 | auwo.a;
            auwo.b = i3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz3 = (auwz) o.b;
            auwo auwo2 = (auwo) o2.i();
            auwo2.getClass();
            auwz3.e = auwo2;
            auwz3.a = 8 | auwz3.a;
            uyc.a(uyb, (auwz) o.i());
        } else if (i2 == 2) {
            uyc uyc2 = uxy.d;
            aucd o3 = auwz.n.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            auwz auwz4 = (auwz) o3.b;
            auwz4.b = 7;
            auwz4.a |= 1;
            int a3 = uyb.a();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            auwz auwz5 = (auwz) o3.b;
            auwz5.a = 2 | auwz5.a;
            auwz5.c = a3;
            aucd o4 = auwu.c.o();
            int i4 = status.i;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            auwu auwu = (auwu) o4.b;
            auwu.a = 1 | auwu.a;
            auwu.b = i4;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            auwz auwz6 = (auwz) o3.b;
            auwu auwu2 = (auwu) o4.i();
            auwu2.getClass();
            auwz6.g = auwu2;
            auwz6.a |= 32;
            uyc2.a(uyb, (auwz) o3.i());
        } else if (i2 == 3) {
            uyc uyc3 = uxy.d;
            aucd o5 = auwz.n.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            auwz auwz7 = (auwz) o5.b;
            auwz7.b = 8;
            auwz7.a |= 1;
            int a4 = uyb.a();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            auwz auwz8 = (auwz) o5.b;
            auwz8.a = 2 | auwz8.a;
            auwz8.c = a4;
            aucd o6 = auws.c.o();
            int i5 = status.i;
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            auws auws = (auws) o6.b;
            auws.a = 1 | auws.a;
            auws.b = i5;
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            auwz auwz9 = (auwz) o5.b;
            auws auws2 = (auws) o6.i();
            auws2.getClass();
            auwz9.i = auws2;
            auwz9.a |= 128;
            uyc3.a(uyb, (auwz) o5.i());
        } else if (i2 == 4) {
            uyc uyc4 = uxy.d;
            aucd o7 = auwz.n.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            auwz auwz10 = (auwz) o7.b;
            auwz10.b = 9;
            auwz10.a |= 1;
            int a5 = uyb.a();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            auwz auwz11 = (auwz) o7.b;
            auwz11.a = 2 | auwz11.a;
            auwz11.c = a5;
            aucd o8 = auww.c.o();
            int i6 = status.i;
            if (o8.c) {
                o8.c();
                o8.c = false;
            }
            auww auww = (auww) o8.b;
            auww.a = 1 | auww.a;
            auww.b = i6;
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            auwz auwz12 = (auwz) o7.b;
            auww auww2 = (auww) o8.i();
            auww2.getClass();
            auwz12.k = auww2;
            auwz12.a |= 512;
            uyc4.a(uyb, (auwz) o7.i());
        }
        Intent b2 = uyd.b(uxy.a);
        b2.setAction("com.google.android.gms.nearby.messages.service.STOP_SERVICE_IF_IDLE");
        uxy.a.startService(b2);
    }
}
