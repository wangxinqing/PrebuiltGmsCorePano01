package defpackage;

/* renamed from: banb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class banb implements balv {
    public final batd a;
    private int b;
    private int c;

    public banb(batd batd, int i) {
        this.a = batd;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final void a(byte b2) {
        this.a.h((int) b2);
        this.b--;
        this.c++;
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
