package defpackage;

import android.content.Context;

/* renamed from: uxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxp implements vgq {
    final /* synthetic */ Context a;
    final /* synthetic */ ased b;
    final /* synthetic */ avch c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ uxu e;
    private asfz f;
    private vgo g;

    public uxp(uxu uxu, Context context, ased ased, avch avch, Runnable runnable) {
        this.e = uxu;
        this.a = context;
        this.b = ased;
        this.c = avch;
        this.d = runnable;
    }

    public final boolean a() {
        return uxu.a(this.a, this.b, this.c);
    }

    public final void b() {
        this.g = null;
        this.b.a(this.f.b);
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = vgu.a(this.c);
        vgo vgo = this.g;
        if (vgo != null) {
            str = vgo.a();
        } else {
            str = null;
        }
        objArr[1] = str;
        return String.format("%s beacon (token=%s)", objArr);
    }

    public final boolean a(vgo vgo) {
        vgo vgo2 = this.g;
        return vgo2 != null && vgo2.equals(vgo);
    }

    public final void b(vgo vgo) {
        this.g = vgo;
        this.f = this.b.a(uxu.a(this.c, vgo), (asgs) new uxo(this));
    }
}
