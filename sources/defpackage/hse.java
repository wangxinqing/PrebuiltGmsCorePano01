package defpackage;

/* renamed from: hse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hse {
    int a;
    int b;
    String c;
    int d;
    final /* synthetic */ hsf e;

    public hse(hsf hsf) {
        this.e = hsf;
        this.a = 0;
        int i = hsf.b;
        this.b = i;
        String a2 = hsf.a(i);
        this.c = a2;
        this.d = hpp.a(this.b + 1 + a2.length());
    }

    public hse(hsf hsf, int i, int i2, int i3, String str) {
        this.e = hsf;
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
    }
}
