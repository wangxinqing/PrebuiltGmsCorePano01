package defpackage;

import java.util.Arrays;

/* renamed from: jut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jut implements jxu {
    public final atmb a;

    public jut(atmb atmb) {
        iva.a((Object) atmb);
        this.a = atmb;
    }

    private static atmb a(int i, long j, long j2) {
        aucd o = atmb.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atmb atmb = (atmb) o.b;
        atmb.b = i;
        int i2 = atmb.a | 1;
        atmb.a = i2;
        int i3 = i2 | 2;
        atmb.a = i3;
        atmb.c = j;
        atmb.a = i3 | 4;
        atmb.d = j2;
        return (atmb) o.i();
    }

    public static jut b(long j) {
        return new jut(a(2, j, Long.MAX_VALUE));
    }

    static atmb c(long j) {
        return a(1, j, j);
    }

    public final long c() {
        return this.a.c;
    }

    public final long d() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jut) {
            jut jut = (jut) obj;
            return a() == jut.a() && c() == jut.c() && d() == jut.d();
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(c()), Long.valueOf(d())});
    }

    public final String toString() {
        int a2 = a();
        if (a2 == 1) {
            String num = Integer.toString(a());
            long c = c();
            StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 22);
            sb.append(num);
            sb.append("(");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        } else if (a2 == 2) {
            String num2 = Integer.toString(a());
            long c2 = c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(num2).length() + 22);
            sb2.append(num2);
            sb2.append("(");
            sb2.append(c2);
            sb2.append(")");
            return sb2.toString();
        } else if (a2 != 3) {
            int a3 = a();
            StringBuilder sb3 = new StringBuilder(24);
            sb3.append("unknown type=");
            sb3.append(a3);
            return sb3.toString();
        } else {
            String num3 = Integer.toString(a());
            long c3 = c();
            long d = d();
            StringBuilder sb4 = new StringBuilder(String.valueOf(num3).length() + 44);
            sb4.append(num3);
            sb4.append("(");
            sb4.append(c3);
            sb4.append(", ");
            sb4.append(d);
            sb4.append(")");
            return sb4.toString();
        }
    }

    public final boolean b() {
        int a2 = atma.a(this.a.b);
        return a2 != 0 && a2 == 2;
    }

    public static jut a(long j) {
        return new jut(c(j));
    }

    public static jut a(long j, long j2) {
        return new jut(a(3, j, j2));
    }

    public final int a() {
        int a2 = atma.a(this.a.b);
        if (a2 == 0) {
            return 3;
        }
        return a2;
    }
}
