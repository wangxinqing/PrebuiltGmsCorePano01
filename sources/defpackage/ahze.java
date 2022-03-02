package defpackage;

import android.util.Log;

/* renamed from: ahze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahze implements arne {
    final /* synthetic */ ahzh a;

    public ahze(ahzh ahzh) {
        this.a = ahzh;
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        if (arnh.a() == this.a.a && arnt.a == 48) {
            armt armt = (armt) arnt.a((auef) armt.c.c(7));
            int i = 1;
            if (armt == null) {
                int i2 = arnt.a;
                int i3 = arnt.b;
                StringBuilder sb = new StringBuilder(68);
                sb.append("Unable to deserialize message from nanoapp: ");
                sb.append(i2);
                sb.append(", ");
                sb.append(i3);
                Log.e("SettingsHelperNyc", sb.toString());
                aucd o = armt.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                armt armt2 = (armt) o.b;
                armt2.b = 0;
                armt2.a |= 1;
                armt = (armt) o.i();
            }
            int a2 = arms.a(armt.b);
            if (a2 != 0) {
                i = a2;
            }
            if (i - 1 != 0) {
                this.a.e();
                ahzh ahzh = this.a;
                ahzh.a(ahzh.b);
                ahzh ahzh2 = this.a;
                ahzh2.a(3, ahzh2.b);
                return;
            }
            this.a.f();
        }
    }
}
