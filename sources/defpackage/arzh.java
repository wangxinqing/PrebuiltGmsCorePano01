package defpackage;

/* renamed from: arzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arzh implements Runnable {
    private final long a;

    public arzh(long j) {
        this.a = j;
    }

    public final void run() {
        try {
            Thread.sleep(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
