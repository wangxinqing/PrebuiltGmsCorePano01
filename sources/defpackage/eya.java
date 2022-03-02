package defpackage;

import android.os.SystemClock;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: eya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eya implements aora {
    final /* synthetic */ long a;
    final /* synthetic */ eyf b;

    public eya(eyf eyf, long j) {
        this.b = eyf;
        this.a = j;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        eyf eyf = this.b;
        eyf.a(eyf.p, SystemClock.elapsedRealtime() - this.a, true);
        if (amri.a()) {
            this.b.p = (qcp) amri.b();
            this.b.c();
            return;
        }
        eyf eyf2 = this.b;
        hol hol = eyf2.h;
        aucd o = anty.n.o();
        String str = eyf2.g;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty = (anty) o.b;
        str.getClass();
        int i = anty.a | 2;
        anty.a = i;
        anty.c = str;
        anty.b = 13;
        anty.a = i | 1;
        aucd o2 = antm.c.o();
        antr a2 = fgn.a(eyf2.n);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        antm antm = (antm) o2.b;
        a2.getClass();
        antm.b = a2;
        antm.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anty anty2 = (anty) o.b;
        antm antm2 = (antm) o2.i();
        antm2.getClass();
        anty2.m = antm2;
        anty2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        hol.a((audx) o.i()).b();
        eyf eyf3 = this.b;
        fsj fsj = eyf3.f;
        String str2 = eyf3.d;
        String str3 = eyf3.g;
        iva.c(str2);
        iva.c(str3);
        iha b2 = ihb.b();
        b2.a = new fug(str3, str2);
        ((iby) fsj).a(b2.a());
        eyf eyf4 = this.b;
        eyf4.a(ezf.a(eyf4.r));
    }

    public final void a(Throwable th) {
        eyf.c.e("Failure during the flow", th, new Object[0]);
        eyf eyf = this.b;
        eyf.a(eyf.p, SystemClock.elapsedRealtime() - this.a, false);
        this.b.a(ezf.a());
    }
}
