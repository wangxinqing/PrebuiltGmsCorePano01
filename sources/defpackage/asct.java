package defpackage;

import java.util.UUID;

/* renamed from: asct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asct extends asjr {
    public final /* synthetic */ asda a;

    public asct(asda asda) {
        this.a = asda;
    }

    public final void a(asjt asjt) {
        asda asda = this.a;
        UUID uuid = asda.a;
        asda.b(asjt);
        if (asjt instanceof asdq) {
            ((anih) ((anih) asil.a.c()).a("asct", "a", 163, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: Start BLE Advertising failed.");
            this.a.m.b(asjt);
        } else if (ius.a(asjt, this.a.h.f)) {
            jjg jjg = asil.a;
            this.a.d();
        } else if (ius.a(asjt, this.a.h.e)) {
            jjg jjg2 = asil.a;
            this.a.d();
        } else if (this.a.g.m() == 2) {
            jjg jjg3 = asil.a;
            this.a.g.m();
            this.a.d();
        } else {
            asda asda2 = this.a;
            if (asda2.n) {
                jjg jjg4 = asil.a;
                asda2.d();
                return;
            }
            jjg jjg5 = asil.a;
            asda2.n = true;
            asjs asjs = asda2.m;
            asdu asdu = asda2.h;
            asjt[] asjtArr = {asdu.f, asdu.g};
            iva.a((Object) asjtArr);
            for (int i = 1; i >= 0; i--) {
                asjt asjt2 = asjtArr[i];
                iva.a((Object) asjt2);
                asjs.c.addFirst(asjt2);
            }
            asjs.a();
        }
    }
}
