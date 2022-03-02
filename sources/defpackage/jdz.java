package defpackage;

/* renamed from: jdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdz extends jef {
    private final String f;

    public jdz(String str, int i, int i2, int i3) {
        super(i, i2, i3);
        this.f = str;
        for (int i4 : jef.a) {
            this.b.put(Integer.valueOf(i4), new jdy(this.f, i, i2, i4, i3));
        }
    }

    /* renamed from: a */
    public final jdy b(int i) {
        return (jdy) super.b(i);
    }

    public final String toString() {
        jdy a = b(-1);
        return a + super.toString();
    }

    public final void a(jee jee) {
        if (b(jee)) {
            jdy jdy = (jdy) jee;
            b(-1).a((jee) jdy);
            b(jdy.n).a((jee) jdy);
        }
    }

    public final boolean b(jee jee) {
        if (!(jee instanceof jdy)) {
            return false;
        }
        jdy jdy = (jdy) jee;
        int i = jdy.n;
        if (!this.f.equals(jdy.b) || this.c != jdy.l || this.d != jdy.m || this.e != jdy.o || i < 0) {
            return false;
        }
        if (i <= 3 || i == 7) {
            return true;
        }
        return false;
    }
}
