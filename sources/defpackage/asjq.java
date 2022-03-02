package defpackage;

import android.os.SystemClock;
import java.util.UUID;

/* renamed from: asjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjq extends arwm {
    final /* synthetic */ asjs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asjq(asjs asjs, String str) {
        super(str);
        this.a = asjs;
    }

    public final void run() {
        long j;
        this.a.b.e(this);
        asjt asjt = (asjt) this.a.c.peek();
        if (asjt == null) {
            jjg jjg = asil.a;
            asda asda = ((asct) this.a.i).a;
            UUID uuid = asda.a;
            asda.i();
        } else if (asjt.b()) {
            this.a.c.removeFirst();
            asjr asjr = this.a.i;
            jjg jjg2 = asil.a;
            asct asct = (asct) asjr;
            asda asda2 = asct.a;
            UUID uuid2 = asda.a;
            for (asiz a2 : ((amxb) asda2.p).e(asjt)) {
                a2.a();
            }
            asda asda3 = asct.a;
            if (asda3.o && ius.a(asjt, asda3.h.q)) {
                asct.a.o = false;
            }
            this.a.a();
        } else {
            asjs asjs = this.a;
            if (asjs.d < asjs.a) {
                long b = asjs.b();
                asda asda4 = this.a.j;
                UUID uuid3 = asda.a;
                auyo auyo = asda4.j.b.g;
                if (auyo == null) {
                    auyo = auyo.j;
                }
                long j2 = auyo.g;
                if (this.a.d != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    asjs asjs2 = this.a;
                    long j3 = elapsedRealtime - asjs2.e;
                    j = asjs2.g ? asjt.d() - j3 : b - j3;
                } else {
                    j = j2 - (SystemClock.elapsedRealtime() - this.a.f);
                }
                if (j <= 0) {
                    asjt a3 = asjt.a();
                    if (a3 == null) {
                        this.a.g = asjt.c();
                        asjs asjs3 = this.a;
                        asjs3.d++;
                        asjs3.e = SystemClock.elapsedRealtime();
                        asjs asjs4 = this.a;
                        if (asjs4.g) {
                            jjg jjg3 = asil.a;
                            asjs4.b.c(this);
                            return;
                        }
                        long b2 = asjs4.b();
                        jjg jjg4 = asil.a;
                        this.a.b.a(this, b2);
                        return;
                    }
                    jjg jjg5 = asil.a;
                    this.a.c.addFirst(a3);
                    this.a.a();
                    return;
                }
                jjg jjg6 = asil.a;
                this.a.b.a(this, j);
                return;
            }
            asct asct2 = (asct) asjs.i;
            asda asda5 = asct2.a;
            UUID uuid4 = asda.a;
            asda5.b(asjt);
            if (asjt instanceof asdq) {
                ((anih) ((anih) asil.a.c()).a("asct", "a", 163, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: Start BLE Advertising failed.");
                asct2.a.m.b(asjt);
            } else if (ius.a(asjt, asct2.a.h.f)) {
                jjg jjg7 = asil.a;
                asct2.a.d();
            } else if (ius.a(asjt, asct2.a.h.e)) {
                jjg jjg8 = asil.a;
                asct2.a.d();
            } else if (asct2.a.g.m() == 2) {
                jjg jjg9 = asil.a;
                asct2.a.g.m();
                asct2.a.d();
            } else {
                asda asda6 = asct2.a;
                if (asda6.n) {
                    jjg jjg10 = asil.a;
                    asda6.d();
                    return;
                }
                jjg jjg11 = asil.a;
                asda6.n = true;
                asjs asjs5 = asda6.m;
                asdu asdu = asda6.h;
                asjt[] asjtArr = {asdu.f, asdu.g};
                iva.a((Object) asjtArr);
                for (int i = 1; i >= 0; i--) {
                    asjt asjt2 = asjtArr[i];
                    iva.a((Object) asjt2);
                    asjs5.c.addFirst(asjt2);
                }
                asjs5.a();
            }
        }
    }
}
