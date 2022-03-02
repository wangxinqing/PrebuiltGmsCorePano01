package defpackage;

import android.view.View;

/* renamed from: afo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afo {
    final afn a;
    final afm b = new afm();

    public afo(afn afn) {
        this.a = afn;
    }

    /* access modifiers changed from: package-private */
    public final View a(int i, int i2, int i3, int i4) {
        int i5;
        int a2 = this.a.a();
        int b2 = this.a.b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a3 = this.a.a(i);
            this.b.a(a2, b2, this.a.a(a3), this.a.b(a3));
            this.b.a();
            this.b.a(i3);
            if (this.b.b()) {
                return a3;
            }
            this.b.a();
            this.b.a(i4);
            if (this.b.b()) {
                view = a3;
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        this.b.a(this.a.a(), this.a.b(), this.a.a(view), this.a.b(view));
        this.b.a();
        this.b.a(24579);
        return this.b.b();
    }
}
