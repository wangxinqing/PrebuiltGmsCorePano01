package defpackage;

import android.view.ViewGroup;

/* renamed from: aqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqu extends aro {
    boolean a = false;
    final /* synthetic */ ViewGroup b;

    public aqu(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public final void a() {
        arz.a(this.b, false);
        this.a = true;
    }

    public final void b() {
        arz.a(this.b, false);
    }

    public final void c() {
        arz.a(this.b, true);
    }

    public final void a(arn arn) {
        if (!this.a) {
            arz.a(this.b, false);
        }
        arn.b((arm) this);
    }
}
