package defpackage;

/* renamed from: pbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class pbm {
    public int a;
    public int b;
    private final char[] c;

    public pbm(String str) {
        this.c = str.toCharArray();
    }

    protected static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public final void b() {
        this.b = this.a;
    }

    public final pbl c() {
        int i = this.b;
        return new pbl(i, new String(this.c, i, this.a - i));
    }

    public final void d() {
        e();
        this.a++;
    }

    public final char e() {
        return this.c[this.a];
    }

    public final void f() {
        while (!a() && Character.isWhitespace(e())) {
            d();
        }
    }

    public final void a(String str) {
        a(str, this.a);
    }

    public final void a(String str, int i) {
        throw new pbk(i, new String(this.c), str);
    }

    public final boolean a() {
        return this.a == this.c.length;
    }
}
