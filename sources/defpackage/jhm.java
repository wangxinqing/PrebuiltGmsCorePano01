package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: jhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhm extends jhl implements jky {
    private final jkz c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jhm(Context context, Handler handler) {
        super(handler);
        jkz jkz = new jkz(context, handler);
        this.c = jkz;
    }

    public final boolean a(int i) {
        return this.c.b();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.c.a((jky) this);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c.a();
    }

    public final void d() {
        a(-1000, true);
    }

    public final void e() {
        a(-1000, false);
    }
}
