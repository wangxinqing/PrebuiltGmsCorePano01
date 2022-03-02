package defpackage;

/* renamed from: ahkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahkt {
    public int a = 0;
    public int b = 0;
    public long c = -1;
    public long d = -1;
    public long e = -1;

    public final void a(long j) {
        if (this.a > 0 && j - this.d > 250000) {
            this.c = -1;
            this.d = -1;
            this.a = 0;
            this.b = 0;
        }
        if (this.b > 0 && j - this.e > 1000000) {
            this.b = 0;
        }
    }
}
