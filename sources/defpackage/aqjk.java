package defpackage;

import java.util.ArrayList;

/* renamed from: aqjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjk {
    public double a;
    public final int b;
    public final double c;
    public ArrayList d;
    public ArrayList e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final aqje h;

    public aqjk(aqjq aqjq, int i, double d2) {
        this.b = i;
        this.c = d2;
        aqje aqje = new aqje(new aqjg(aqjq), i);
        this.h = aqje;
        aqjd[] aqjdArr = aqje.b;
        for (aqjd aqjd : aqjdArr) {
            aqjd.a = new aqjc();
        }
    }

    public final void a(aqji aqji) {
        this.f.add(aqji);
    }
}
