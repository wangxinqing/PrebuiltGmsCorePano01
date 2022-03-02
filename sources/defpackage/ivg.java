package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ivg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ivg implements Runnable {
    private final ivh a;
    private final Context b;
    private final int c;

    public ivg(ivh ivh, Context context, int i) {
        this.a = ivh;
        this.b = context;
        this.c = i;
    }

    public final void run() {
        byte[] bArr;
        ivh ivh = this.a;
        Context context = this.b;
        int i = this.c;
        aucd o = aoht.h.o();
        int i2 = ivh.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoht aoht = (aoht) o.b;
        int i3 = aoht.a | 1;
        aoht.a = i3;
        aoht.b = i2;
        String str = ivh.b;
        str.getClass();
        aoht.a = i3 | 2;
        aoht.c = str;
        aoht.g = ivh.c.a();
        aoht.a |= 64;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoht aoht2 = (aoht) o.b;
        int i4 = aoht2.a | 16;
        aoht2.a = i4;
        aoht2.e = i;
        aoht2.a = i4 | 32;
        aoht2.f = 1;
        byte[] bArr2 = ivh.d;
        if (bArr2 == null) {
            try {
                bArr = jhh.a(context, ivh.b, "SHA-256");
            } catch (PackageManager.NameNotFoundException e) {
                bArr = null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            ivh.d = bArr;
            bArr2 = ivh.d;
        }
        auay a2 = auay.a(bArr2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoht aoht3 = (aoht) o.b;
        a2.getClass();
        aoht3.a |= 4;
        aoht3.d = a2;
        aoht aoht4 = (aoht) o.i();
        aucd o2 = aohl.u.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aohl aohl = (aohl) o2.b;
        aoht4.getClass();
        if (!aohl.d.a()) {
            aohl.d = aucj.a(aohl.d);
        }
        aohl.d.add(aoht4);
        hoi a3 = iwt.a().b(context).a((audx) (aohl) o2.i());
        a3.b("service_connections");
        a3.b(6);
        a3.f = avsd.UNMETERED_OR_DAILY;
        a3.b();
    }
}
