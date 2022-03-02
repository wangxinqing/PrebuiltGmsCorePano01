package defpackage;

/* renamed from: qyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyk {
    public int a;
    public int b;
    int c;
    String d;
    String e;
    String f;

    public final qyl a() {
        return new qyl(this);
    }

    public final void a(int i) {
        this.c = i;
        this.a |= 16;
    }

    public final void a(String str) {
        this.e = str;
        this.a |= 2;
    }

    public final void b(String str) {
        this.d = str;
        this.a |= 1;
    }

    public final void c(String str) {
        this.f = str;
        this.a |= 4;
    }
}
