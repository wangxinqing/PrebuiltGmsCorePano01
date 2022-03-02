package defpackage;

import android.util.Log;
import java.util.List;

/* renamed from: akil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akil implements aksb {
    final /* synthetic */ aknh a;

    public akil(aknh aknh) {
        this.a = aknh;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atag atag = (atag) obj;
        aknh aknh = this.a;
        aucd o = assl.d.o();
        aucx aucx = atag.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        assl assl = (assl) o.b;
        if (!assl.a.a()) {
            assl.a = aucj.a(assl.a);
        }
        auab.a((Iterable) aucx, (List) assl.a);
        aucx aucx2 = atag.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        assl assl2 = (assl) o.b;
        if (!assl2.b.a()) {
            assl2.b = aucj.a(assl2.b);
        }
        auab.a((Iterable) aucx2, (List) assl2.b);
        aucx aucx3 = atag.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        assl assl3 = (assl) o.b;
        if (!assl3.c.a()) {
            assl3.c = aucj.a(assl3.c);
        }
        auab.a((Iterable) aucx3, (List) assl3.c);
        aknh.a((assl) o.i());
    }

    public final void a(Throwable th) {
        if (Log.isLoggable("Places", 5)) {
            alfy.b("Places", "Failed to download inference model weights SLS", th);
        }
        this.a.a();
    }
}
