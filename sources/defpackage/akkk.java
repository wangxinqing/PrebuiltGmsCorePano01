package defpackage;

import java.util.Arrays;

/* renamed from: akkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akkk {
    public final astz a;
    public final astv b;
    public final String c;

    public akkk(astz astz, astv astv, String str) {
        this.a = astz;
        this.b = astv;
        this.c = str;
    }

    public static akkk a(astz astz) {
        return a(astz, (astv) null);
    }

    public final int b() {
        return this.a.d;
    }

    public final int c() {
        return this.a.e;
    }

    public final boolean d() {
        return a(2, 3);
    }

    public final boolean e() {
        return a(3, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akkk) {
            akkk akkk = (akkk) obj;
            return akoy.a(this.c, akkk.c) && akoy.a(this.b, akkk.b);
        }
    }

    public final boolean f() {
        return a(2, 2);
    }

    public final boolean g() {
        return a(3, 2);
    }

    public final long h() {
        asth asth = this.a.b;
        if (asth == null) {
            asth = asth.b;
        }
        return asth.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    public final asth i() {
        astz astz = this.a;
        if ((astz.a & 65536) == 0) {
            return null;
        }
        asth asth = astz.l;
        if (asth == null) {
            asth = asth.b;
        }
        if (asth.a == 0) {
            return null;
        }
        asth asth2 = this.a.l;
        return asth2 == null ? asth.b : asth2;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a.f;
        int b2 = b();
        int c2 = c();
        boolean z = this.b != null;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 106 + String.valueOf(str2).length());
        sb.append("PlaceCandidate{ id=");
        sb.append(str);
        sb.append(" prominentCategory=");
        sb.append(str2);
        sb.append(" latE7=");
        sb.append(b2);
        sb.append(" lngE7=");
        sb.append(c2);
        sb.append(" hasPersonalizedPlaceInfo=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public static akkk a(astz astz, astv astv) {
        String str;
        int i = astz.a;
        if ((i & 1) != 0) {
            if ((i & 262144) != 0) {
                astw astw = astz.n;
                if (astw == null) {
                    astw = astw.c;
                }
                str = akox.a(astw);
            } else {
                asth asth = astz.b;
                if (asth == null) {
                    asth = asth.b;
                }
                str = akox.a(asth);
            }
            return new akkk(astz, astv, str);
        }
        aklz.a().c("Invalid PlaceInfo without feature ID");
        return null;
    }

    public final String a() {
        astz astz = this.a;
        if ((astz.a & 65536) == 0) {
            return null;
        }
        asth asth = astz.l;
        if (asth == null) {
            asth = asth.b;
        }
        return akox.a(asth);
    }

    public final boolean a(int i, int i2) {
        astv astv = this.b;
        if (astv != null) {
            aucx aucx = astv.c;
            int size = aucx.size();
            for (int i3 = 0; i3 < size; i3++) {
                astu astu = (astu) aucx.get(i3);
                int a2 = astt.a(astu.a);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == i) {
                    int a3 = astr.a(astu.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (a3 == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
