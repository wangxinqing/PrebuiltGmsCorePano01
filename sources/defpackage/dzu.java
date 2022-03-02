package defpackage;

import android.view.ViewGroup;

/* renamed from: dzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dzu extends aci {
    final /* synthetic */ dzv a;

    public dzu(dzv dzv) {
        this.a = dzv;
    }

    public final void a() {
        this.a.a();
    }

    public final void b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            dzv dzv = this.a;
            acg acg = dzv.a;
            adl b = acg.b((ViewGroup) dzv, acg.a(i4));
            this.a.a.b(b, i4);
            this.a.c.addView(b.a, i4, new ViewGroup.LayoutParams(-1, -2));
            this.a.b.add(i4, b);
        }
    }

    public final void c(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.a.c.removeViewAt(i);
            this.a.b.remove(i);
        }
    }

    public final void d(int i, int i2) {
        this.a.a();
    }

    public final void a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            this.a.a.b((adl) this.a.b.get(i4), i4);
        }
    }
}
