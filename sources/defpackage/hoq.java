package defpackage;

/* renamed from: hoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hoq implements Runnable {
    private final hph a;

    public hoq(hph hph) {
        this.a = hph;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        hph hph = this.a;
        hph.e.writeLock().lock();
        try {
            hph.h = null;
            hph.e.writeLock().unlock();
            hph.d();
        } catch (Throwable th) {
            hph.e.writeLock().unlock();
            throw th;
        }
    }
}
