package defpackage;

/* renamed from: nkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkh implements amky {
    private final nkk a;
    private final long b;
    private final amkr c;

    public nkh(nkk nkk, long j, amkr amkr) {
        this.a = nkk;
        this.b = j;
        this.c = amkr;
    }

    public final void close() {
        nkk nkk = this.a;
        long j = this.b;
        amkr amkr = this.c;
        try {
            nkk.a(j);
        } finally {
            amkr.close();
        }
    }
}
