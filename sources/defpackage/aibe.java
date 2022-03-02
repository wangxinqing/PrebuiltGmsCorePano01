package defpackage;

import java.util.Locale;

/* renamed from: aibe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aibe {
    static final Float a = Float.valueOf(Float.NEGATIVE_INFINITY);
    public static final arhp e = new aibc();
    public final int b;
    public final int c;
    public final int d;

    public aibe(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static void a(StringBuilder sb, aibe aibe) {
        if (aibe == null) {
            sb.append("null");
        } else {
            sb.append(aibe);
        }
    }

    public final boolean a() {
        return this.d >= 0;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public float g() {
        return a.floatValue();
    }

    public float h() {
        return -1.0f;
    }

    public String i() {
        return "";
    }

    public int j() {
        return Integer.MIN_VALUE;
    }

    public String k() {
        return "";
    }

    public final aibd l() {
        aibd aibd = new aibd(this.b, this.c, this.d);
        aibd.a(g(), h());
        aibd.a(i());
        aibd.a = j();
        aibd.b = k();
        return aibd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position [latE7=");
        sb.append(this.b);
        sb.append(", lngE7=");
        sb.append(this.c);
        sb.append(", acc=");
        sb.append(this.d);
        sb.append("mm");
        if (b()) {
            sb.append(", elevationWgs84M=");
            sb.append(g());
        }
        if (c()) {
            sb.append(", verticalAccuracyMeters=");
            sb.append(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(h())}));
        }
        if (d()) {
            sb.append(", levelId=");
            sb.append(i());
        }
        if (e()) {
            sb.append(", levelNumberE3=");
            sb.append(j());
        }
        if (f()) {
            sb.append(", floorLabel=");
            sb.append(k());
        }
        sb.append("]");
        return sb.toString();
    }
}
