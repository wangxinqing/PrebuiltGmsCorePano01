package defpackage;

import java.util.Arrays;

/* renamed from: ajnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnr {
    private final ajjx a;

    public ajnr(ajjx ajjx) {
        this.a = ajjx;
    }

    public static int a(double d) {
        return (int) Math.round(d * 1.0E7d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajnr) {
            ajjx ajjx = ((ajnr) obj).a;
            ajjx ajjx2 = this.a;
            if (ajjx2.d == ajjx.d) {
                ajka ajka = ajjx2.b;
                if (ajka == null) {
                    ajka = ajka.d;
                }
                ajka ajka2 = ajjx.b;
                if (ajka2 == null) {
                    ajka2 = ajka.d;
                }
                if (ajka.equals(ajka2)) {
                    ajjw a2 = ajjw.a(this.a.c);
                    if (a2 == null) {
                        a2 = ajjw.WIFI;
                    }
                    ajjw a3 = ajjw.a(ajjx.c);
                    if (a3 == null) {
                        a3 = ajjw.WIFI;
                    }
                    if (a2.equals(a3)) {
                        ajjx ajjx3 = this.a;
                        if (ajjx3.e == ajjx.e && ajjx3.f == ajjx.f && ajjx3.g == ajjx.g && ajjx3.h == ajjx.h && ajjx3.t == ajjx.t && ajjx3.i == ajjx.i) {
                            ajjp ajjp = ajjx3.o;
                            if (ajjp == null) {
                                ajjp = ajjp.f;
                            }
                            ajjp ajjp2 = ajjx.o;
                            if (ajjp2 == null) {
                                ajjp2 = ajjp.f;
                            }
                            if (ajjp.equals(ajjp2)) {
                                ajjx ajjx4 = this.a;
                                if (ajjx4.k == ajjx.k && ajjx4.l.equals(ajjx.l)) {
                                    ajjx ajjx5 = this.a;
                                    if (ajjx5.m == ajjx.m && ajjx5.r == ajjx.r && ajjx5.s == ajjx.s) {
                                        return true;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[15];
        objArr[0] = Long.valueOf(this.a.d);
        ajka ajka = this.a.b;
        if (ajka == null) {
            ajka = ajka.d;
        }
        objArr[1] = ajka;
        ajjw a2 = ajjw.a(this.a.c);
        if (a2 == null) {
            a2 = ajjw.WIFI;
        }
        objArr[2] = a2;
        objArr[3] = Float.valueOf(this.a.e);
        objArr[4] = Float.valueOf(this.a.f);
        objArr[5] = Double.valueOf(this.a.g);
        objArr[6] = Float.valueOf(this.a.h);
        objArr[7] = Float.valueOf(this.a.t);
        objArr[8] = Integer.valueOf(this.a.i);
        ajjp ajjp = this.a.o;
        if (ajjp == null) {
            ajjp = ajjp.f;
        }
        objArr[9] = ajjp;
        objArr[10] = Boolean.valueOf(this.a.k);
        ajjx ajjx = this.a;
        objArr[11] = ajjx.l;
        objArr[12] = Integer.valueOf(ajjx.m);
        objArr[13] = Long.valueOf(this.a.r);
        objArr[14] = Boolean.valueOf(this.a.s);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        ajka ajka = this.a.b;
        if (ajka == null) {
            ajka = ajka.d;
        }
        atit a2 = atiu.a(this);
        a2.a("time", Long.valueOf(this.a.d));
        a2.a("latE7", Integer.valueOf(ajka.b));
        a2.a("lngE7", Integer.valueOf(ajka.c));
        ajjw a3 = ajjw.a(this.a.c);
        if (a3 == null) {
            a3 = ajjw.WIFI;
        }
        a2.a("source", Integer.valueOf(a3.f));
        a2.a("speed", Float.valueOf(this.a.e));
        a2.a("heading", Float.valueOf(this.a.f));
        a2.a("altitude", Double.valueOf(this.a.g));
        a2.a("accuracy", Float.valueOf(this.a.h));
        a2.a("verticalAccuracy", Float.valueOf(this.a.t));
        a2.a("gmmNlpVersion", Integer.valueOf(this.a.i));
        ajjp ajjp = this.a.o;
        if (ajjp == null) {
            ajjp = ajjp.f;
        }
        StringBuilder sb = new StringBuilder("{");
        if (ajjp != null) {
            sb.append("charging: ");
            int a4 = ajjo.a(ajjp.b);
            if (a4 == 0) {
                a4 = 1;
            }
            sb.append(a4 - 1);
            sb.append(", level: ");
            sb.append(ajjp.c);
            sb.append(", scale: ");
            sb.append(ajjp.d);
            sb.append(", voltage: ");
            sb.append(ajjp.e);
        }
        sb.append("}");
        a2.a("batteryCondition", sb.toString());
        a2.a("stationary", Boolean.valueOf(this.a.k));
        a2.a("levelId", this.a.l);
        a2.a("levelNumberE3", Integer.valueOf(this.a.m));
        a2.a("batchDeliveryTime", Long.valueOf(this.a.r));
        a2.a("isOversampled", Boolean.valueOf(this.a.s));
        return a2.toString();
    }
}
