package defpackage;

import android.view.View;

/* renamed from: abg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abg {
    abz a;
    int b;
    int c;
    boolean d;
    boolean e;

    public abg() {
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i;
        if (this.d) {
            i = this.a.a();
        } else {
            i = this.a.c();
        }
        this.c = i;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }

    public final void a(View view, int i) {
        int h = this.a.h();
        if (h < 0) {
            this.b = i;
            if (this.d) {
                int a2 = (this.a.a() - h) - this.a.c(view);
                this.c = this.a.a() - a2;
                if (a2 > 0) {
                    int a3 = this.a.a(view);
                    int i2 = this.c;
                    int c2 = this.a.c();
                    int min = (i2 - a3) - (c2 + Math.min(this.a.d(view) - c2, 0));
                    if (min < 0) {
                        this.c += Math.min(a2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int d2 = this.a.d(view);
            int c3 = d2 - this.a.c();
            this.c = d2;
            if (c3 > 0) {
                int a4 = this.a.a(view);
                int a5 = (this.a.a() - Math.min(0, (this.a.a() - h) - this.a.c(view))) - (d2 + a4);
                if (a5 < 0) {
                    this.c -= Math.min(c3, -a5);
                    return;
                }
                return;
            }
            return;
        }
        b(view, i);
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.c = this.a.c(view) + this.a.h();
        } else {
            this.c = this.a.d(view);
        }
        this.b = i;
    }
}
