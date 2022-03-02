package defpackage;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;

/* renamed from: akgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akgx {
    public final Scroller a;
    public final Scroller b;
    public int c = 0;
    public int d = 0;
    public final akfv e = new akfv();
    public final akgw f = new akgw(this.e);
    public final akgw g;
    public akgw h;
    public akgw i;
    public int j;
    public int k;
    public final int l;
    public boolean m;
    public boolean n;
    public boolean o;
    private final Context p;

    public akgx(Context context) {
        akgw akgw = new akgw(this.e);
        this.g = akgw;
        this.h = akgw;
        this.i = this.f;
        this.j = 3;
        this.k = 3;
        this.l = 1;
        this.n = true;
        this.o = true;
        this.p = context;
        this.a = new Scroller(this.p, new DecelerateInterpolator(2.0f));
        this.b = new Scroller(this.p, new LinearInterpolator());
    }

    public final int a() {
        return this.h.i;
    }

    public final boolean b() {
        Scroller scroller;
        int i2 = this.c;
        if (i2 == 1) {
            scroller = this.b;
        } else if (i2 != 2) {
            return i2 != 3;
        } else {
            scroller = this.a;
        }
        return scroller.isFinished() && this.g.a() == scroller.getCurrX() && this.f.a() == scroller.getCurrY();
    }

    public final boolean c() {
        return this.d != 0 ? this.o : this.n;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("horizontal=");
        stringBuffer.append(this.g.toString());
        stringBuffer.append("vertical=");
        stringBuffer.append(this.f.toString());
        return stringBuffer.toString();
    }

    public final int a(int i2) {
        if (i2 == 3) {
            return this.p.getResources().getConfiguration().touchscreen != 1 ? 2 : 1;
        }
        return i2;
    }

    public final boolean b(float f2, float f3) {
        int i2 = this.k;
        if (i2 == 0) {
            return false;
        }
        int a2 = a(i2);
        akgw akgw = this.g;
        akgw.a = a2;
        this.f.a = a2;
        akgw.a(f2);
        this.f.a(f3);
        this.c = 3;
        return true;
    }

    public final void a(float f2, float f3) {
        this.m = Math.abs(f2) >= Math.abs(f3);
        if (f2 > 0.0f) {
            this.n = true;
        } else if (f2 < 0.0f) {
            this.n = false;
        }
        if (f3 > 0.0f) {
            this.o = true;
        } else if (f3 < 0.0f) {
            this.o = false;
        }
    }

    public final void a(int i2, int i3) {
        this.g.a((float) i2, false);
        this.f.a((float) i3, false);
        int a2 = this.g.a();
        int a3 = this.f.a();
        this.b.setFinalX(a2);
        this.b.setFinalY(a3);
        this.b.abortAnimation();
        this.a.setFinalX(a2);
        this.a.setFinalY(a3);
        this.a.abortAnimation();
    }
}
