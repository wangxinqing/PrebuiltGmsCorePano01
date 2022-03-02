package defpackage;

/* renamed from: abr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abr implements Runnable {
    final /* synthetic */ abs a;

    public abr(abs abs) {
        this.a = abs;
    }

    public final void run() {
        aan aan = this.a.e;
        if (aan != null && qb.D(aan) && this.a.e.getCount() > this.a.e.getChildCount()) {
            int childCount = this.a.e.getChildCount();
            abs abs = this.a;
            if (childCount <= abs.k) {
                abs.q.setInputMethodMode(2);
                this.a.ar();
            }
        }
    }
}
