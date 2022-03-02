package defpackage;

import android.content.Context;

/* renamed from: uct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uct extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ aehx b;
    final /* synthetic */ String c;
    final /* synthetic */ udb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uct(udb udb, String str, String str2, aehx aehx, String str3) {
        super(str);
        this.d = udb;
        this.a = str2;
        this.b = aehx;
        this.c = str3;
    }

    public final void run() {
        String str;
        udb udb = this.d;
        uaj a2 = tvq.a(udb.b, udb.c, udb.d, this.a);
        if (a2 == null) {
            ((anih) tsp.a.c()).a("Can't find StoredDiscoveryItem for model:%s!", (Object) this.a);
            aehx aehx = this.b;
            String valueOf = String.valueOf(this.a);
            aehx.a(3, valueOf.length() == 0 ? new String("Can't find StoredDiscoveryItem for model:") : "Can't find StoredDiscoveryItem for model:".concat(valueOf));
            return;
        }
        Context context = this.d.e;
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        String str2 = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        uaj uaj = (uaj) aucd.b;
        str2.getClass();
        uaj.a |= 4;
        uaj.e = str2;
        ttg ttg = new ttg(context, (uaj) aucd.i());
        if ((a2.a & 8) != 0) {
            str = tvq.a(a2);
        } else {
            str = null;
        }
        this.d.a(ttg, (byte[]) null, udb.a(str), (twf) new twh(this.d.e, ttg, this.b));
    }
}
