package defpackage;

import java.util.concurrent.Executor;

/* renamed from: agio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agio implements agkv {
    public final agks a;
    public final agnf b;
    public final bapu c;
    public final agng d;

    public agio(agkt agkt, bapu bapu, boolean z, amri amri, amri amri2, agic agic) {
        int i;
        float f;
        if (z) {
            i = ((aghw) amri.a((Object) aghw.e().a())).b();
        } else {
            i = 10;
        }
        this.b = new agnf(i);
        this.a = agkt.a((Executor) bapu.a(), this.b);
        this.c = bapu;
        if (!z) {
            f = ((agia) amri2.b()).b();
        } else {
            f = 1.0f;
        }
        this.d = agng.a(f);
        if (!z) {
            ((agia) amri2.b()).d();
        }
        if (!z) {
            ((agia) amri2.b()).c();
        }
        agic.b(this);
    }

    public final void a() {
    }

    public final void c() {
        agnn.b(aghz.a);
    }
}
