package defpackage;

import android.os.Bundle;
import android.os.Message;

/* renamed from: ajev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajev extends ajgs {
    public final amsv a;
    public final amsv b;
    lya c;
    long d;

    public ajev(amsv amsv, amsv amsv2) {
        super("RTDrgrd");
        this.a = amsv;
        this.b = amsv2;
    }

    private final void d() {
        lya lya = this.c;
        if (lya != null) {
            lya.b();
            jjg jjg = ajfj.a;
            this.c = null;
            this.d = 0;
        }
    }

    public final void a() {
        jjg jjg = ajfj.a;
        this.h.c();
    }

    public final void b() {
        jjg jjg = ajfj.a;
        d();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.h.b.a(13, (Bundle) null, ayel.c());
    }

    public final boolean a(Message message) {
        if (message.what != 13) {
            return false;
        }
        jjg jjg = ajfj.a;
        if (this.d + ayel.c() <= ((Long) this.b.a()).longValue()) {
            d();
            return true;
        }
        c();
        return true;
    }
}
