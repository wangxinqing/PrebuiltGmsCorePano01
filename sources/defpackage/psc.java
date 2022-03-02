package defpackage;

import android.os.SystemClock;

/* renamed from: psc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psc {
    public final auqk a;
    public final anvb b;
    private final long c = SystemClock.elapsedRealtime();
    private boolean d;

    public psc(auqk auqk) {
        amrl.a((Object) auqk);
        this.a = auqk;
        aucd o = anvb.d.o();
        long j = this.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anvb anvb = (anvb) o.b;
        int i = anvb.a | 1;
        anvb.a = i;
        anvb.b = j;
        anvb.c = 16;
        anvb.a = i | 2;
        this.b = (anvb) o.i();
    }

    public final void a(String str, String str2) {
        iva.a(!this.d);
        this.d = true;
        if (str != null) {
            auqk auqk = this.a;
            anvb anvb = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aucd o = anvc.e.o();
            long j = this.c * 1000;
            if (o.c) {
                o.c();
                o.c = false;
            }
            anvc anvc = (anvc) o.b;
            int i = anvc.a | 2;
            anvc.a = i;
            anvc.c = j;
            int i2 = i | 4;
            anvc.a = i2;
            anvc.d = elapsedRealtime * 1000;
            str.getClass();
            anvc.a = i2 | 1;
            anvc.b = str;
            auqk.a(anvb, (anvc) o.i());
        }
        if (str2 != null) {
            auqk auqk2 = this.a;
            anvb anvb2 = this.b;
            aucd o2 = anuy.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anuy anuy = (anuy) o2.b;
            str2.getClass();
            anuy.a = 1 | anuy.a;
            anuy.b = str2;
            String valueOf = String.valueOf(this.c);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anuy anuy2 = (anuy) o2.b;
            valueOf.getClass();
            anuy2.a |= 2;
            anuy2.c = valueOf;
            auqk2.a(anvb2, (anuy) o2.i());
        }
    }

    public final void a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                this.a.a(this.b, (anuy) aucj.a((aucj) anuy.d, bArr));
            } catch (auda e) {
            }
        }
    }
}
