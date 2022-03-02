package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: trh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trh implements Runnable {
    final /* synthetic */ ParcelablePayload a;
    final /* synthetic */ String[] b;
    final /* synthetic */ tlh c;
    final /* synthetic */ trm d;

    public trh(trm trm, ParcelablePayload parcelablePayload, String[] strArr, tlh tlh) {
        this.d = trm;
        this.a = parcelablePayload;
        this.b = strArr;
        this.c = tlh;
    }

    public final void run() {
        toc toc;
        trk trk;
        asas asas;
        boolean booleanValue;
        ParcelablePayload parcelablePayload = this.a;
        aoru aoru = this.d.b;
        String[] strArr = this.b;
        int i = parcelablePayload.b;
        if (i == 1) {
            toc = new tod(parcelablePayload);
        } else if (i == 2) {
            toc = new toh(parcelablePayload);
        } else if (i != 3) {
            toc = null;
        } else {
            toc = new toi(parcelablePayload, aoru);
        }
        if (toc != null) {
            trk = new trk(toc, anda.a((Object[]) strArr), false);
            this.d.d.a(toc.a(), trk);
        } else {
            trk = null;
        }
        if (trk == null) {
            this.d.b(this.c, this.b, this.a);
            ParcelablePayload parcelablePayload2 = this.a;
            ((anih) tky.a.d()).a("PayloadManager failed to create InternalPayload for outgoing payload (ID: %d, type: %d), aborting sendPayload().", parcelablePayload2.a, parcelablePayload2.b);
            return;
        }
        this.d.a(this.c, this.b, this.a);
        toc toc2 = trk.a;
        aucd o = asas.e.o();
        long a2 = toc2.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asas asas2 = (asas) o.b;
        asas2.a = 1 | asas2.a;
        asas2.b = a2;
        long b2 = toc2.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asas asas3 = (asas) o.b;
        asas3.a |= 4;
        asas3.d = b2;
        if (toc2.d() == 0) {
            asas = (asas) o.i();
        } else {
            int d2 = toc2.d();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asas asas4 = (asas) o.b;
            int i2 = d2 - 1;
            if (d2 != 0) {
                asas4.c = i2;
                asas4.a |= 2;
                asas = (asas) o.i();
            } else {
                throw null;
            }
        }
        tkz tkz = this.d.f;
        trg trg = new trg(this, trk, asas);
        try {
            jjg jjg = tky.a;
            String str = tkz.a;
            do {
                String str2 = tkz.a;
                booleanValue = trg.call().booleanValue();
                String str3 = tkz.a;
            } while (booleanValue);
        } catch (Exception e) {
            anih anih = (anih) tky.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("tkz", "a", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("LoopRunner %s got exception, exiting", (Object) tkz.a);
        }
    }
}
