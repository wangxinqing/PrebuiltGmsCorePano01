package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: ayx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayx {
    public final List a;
    public final auk b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final axy h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final axw p;
    public final axx q;
    public final axo r;
    public final List s;
    public final boolean t;
    public final int u;
    public final int v;

    public ayx(List list, auk auk, String str, long j2, int i2, long j3, String str2, List list2, axy axy, int i3, int i4, int i5, float f2, float f3, int i6, int i7, axw axw, axx axx, List list3, int i8, axo axo, boolean z) {
        this.a = list;
        this.b = auk;
        this.c = str;
        this.d = j2;
        this.u = i2;
        this.e = j3;
        this.f = str2;
        this.g = list2;
        this.h = axy;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = f2;
        this.m = f3;
        this.n = i6;
        this.o = i7;
        this.p = axw;
        this.q = axx;
        this.s = list3;
        this.v = i8;
        this.r = axo;
        this.t = z;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        ayx a2 = this.b.a(this.e);
        if (a2 != null) {
            sb.append("\t\tParents: ");
            sb.append(a2.c);
            ayx a3 = this.b.a(a2.e);
            while (a3 != null) {
                sb.append("->");
                sb.append(a3.c);
                a3 = this.b.a(a3.e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (!(this.i == 0 || this.j == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)}));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object next : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(next);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
