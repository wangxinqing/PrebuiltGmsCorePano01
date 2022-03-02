package defpackage;

import android.content.Context;

/* renamed from: twt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twt extends twf {
    private final tvo a;
    private final arxt b;

    public twt(Context context, ttg ttg, arxt arxt, tvo tvo) {
        super(context, ttg);
        this.a = tvo;
        this.b = arxt;
    }

    /* access modifiers changed from: protected */
    public final aspb a() {
        return aspb.RETROACTIVE_PAIR_START;
    }

    /* access modifiers changed from: protected */
    public final aspb b() {
        return aspb.RETROACTIVE_PAIR_END;
    }

    public final String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        return tvk.a(this.c, aeha, this.d, str);
    }

    public final void b(String str) {
        super.b(str);
        this.a.a(true, true, this.d.m(), str);
    }

    public final void a(aehy aehy) {
        super.a(aehy);
        aehy.n(true);
        aehy.i(aymw.u());
    }

    public final void a(Throwable th) {
        super.a(th);
        this.a.a(false, true, this.d.m(), (String) null);
    }

    public final byte[] a(byte[] bArr, aeha aeha, aegz aegz) {
        byte[] a2 = super.a(bArr, aeha, aegz);
        if (!(a2 != null || (a2 = aegz.a()) == null || this.b.d() == null)) {
            this.a.a(this.b.d().name, aeha.b(a2));
        }
        return a2;
    }
}
