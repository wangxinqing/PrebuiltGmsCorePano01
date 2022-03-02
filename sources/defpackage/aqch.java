package defpackage;

/* renamed from: aqch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqch extends azxk {
    public final azxk a;
    private final amlo b = amlo.a();

    public aqch(azxk azxk) {
        this.a = azxk;
    }

    private final void a(Runnable runnable) {
        if (amlv.b(amlw.a)) {
            runnable.run();
        } else {
            amll.a(this.b.a, runnable).run();
        }
    }

    public final void e() {
        azxk azxk = this.a;
        azxk.getClass();
        a((Runnable) new aqcg(azxk));
    }

    public final void a(baaf baaf) {
        a((Runnable) new aqcd(this, baaf));
    }

    public final void a(babj babj, baaf baaf) {
        a((Runnable) new aqcf(this, babj, baaf));
    }

    public final void a(Object obj) {
        a((Runnable) new aqce(this, obj));
    }
}
