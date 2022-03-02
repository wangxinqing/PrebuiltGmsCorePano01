package defpackage;

/* renamed from: aibn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aibn extends aibe {
    private final float f;
    private final float g;
    private final String h;
    private final int i;
    private final String j;

    public aibn(int i2, int i3, int i4, float f2, float f3, String str, int i5, String str2) {
        super(i2, i3, i4);
        this.f = f2;
        this.g = f3;
        this.h = str;
        this.i = i5;
        this.j = str2;
    }

    public final boolean b() {
        return this.f != a.floatValue();
    }

    public final boolean c() {
        return this.g != -1.0f;
    }

    public final boolean d() {
        return !"".equals(this.h);
    }

    public final boolean e() {
        return this.i != Integer.MIN_VALUE;
    }

    public final boolean f() {
        return !"".equals(this.j);
    }

    public final float g() {
        return this.f;
    }

    public final float h() {
        return this.g;
    }

    public final String i() {
        return this.h;
    }

    public final int j() {
        return this.i;
    }

    public final String k() {
        return this.j;
    }
}
