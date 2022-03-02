package defpackage;

/* renamed from: arpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpi {
    private long a = -1;
    private int b = 0;

    public final void a(aizy aizy) {
        this.b++;
        this.a = aizy.c();
    }

    public final void b(aizy aizy) {
        if (this.a != -1) {
            long c = aizy.c() - this.a;
            this.a = -1;
            if (c < 0 || c <= 30000) {
            }
        }
    }
}
