package defpackage;

/* renamed from: ajdn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajdn implements Runnable {
    private final ajdp a;
    private final long b;
    private final ajdo c;

    public ajdn(ajdp ajdp, long j, ajdo ajdo) {
        this.a = ajdp;
        this.b = j;
        this.c = ajdo;
    }

    public final void run() {
        ajdp ajdp = this.a;
        long j = this.b;
        ajdo ajdo = this.c;
        String d = aema.d(j);
        ajdp.d();
        ajdp.a("x-goog-skey", d);
        try {
            ajdo.a();
        } catch (babk | eif e) {
        } catch (Throwable th) {
            ajdp.d();
            throw th;
        }
        ajdp.d();
    }
}
