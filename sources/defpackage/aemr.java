package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aemr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemr {
    public final double a = 100.0d;
    public final double b = 18.0d;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k = true;
    public boolean l = false;
    public double m = 0.0d;

    public static boolean a(double d2, double d3, double d4) {
        return d3 >= d4 ? d2 < d4 : d2 > d4;
    }

    public final void b() {
        this.l = true;
    }

    public final void a(double d2) {
        if (d2 != this.j) {
            this.j = d2;
            this.i = this.f;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((aemv) it.next()).a(this);
            }
        }
    }

    public final void b(double d2) {
        if (d2 != this.f) {
            this.f = d2;
            this.i = d2;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                aemv aemv = (aemv) it.next();
                aemv.a(this);
                aemv.a(d2);
            }
        }
    }

    public final void a(aemv aemv) {
        this.c.add(aemv);
    }

    public final boolean a() {
        return Math.abs(this.g) <= 0.005d && Math.abs(this.j - this.f) <= 0.005d;
    }
}
