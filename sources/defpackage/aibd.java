package defpackage;

/* renamed from: aibd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibd {
    public int a = Integer.MIN_VALUE;
    public String b = "";
    private final int c;
    private final int d;
    private final int e;
    private float f = aibe.a.floatValue();
    private float g = -1.0f;
    private String h = "";

    public aibd(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final aibe a() {
        if (this.f == aibe.a.floatValue() && this.g == -1.0f && "".equals(this.h) && this.a == Integer.MIN_VALUE && "".equals(this.b)) {
            return new aibe(this.c, this.d, this.e);
        }
        return new aibn(this.c, this.d, this.e, this.f, this.g, this.h, this.a, this.b);
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.h = str;
    }

    public final void a(float f2, float f3) {
        if (f2 == aibe.a.floatValue() || f3 == -1.0f) {
            f2 = aibe.a.floatValue();
            f3 = -1.0f;
        }
        this.f = f2;
        this.g = f3;
    }
}
