package defpackage;

/* renamed from: balh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class balh implements Runnable {
    final /* synthetic */ bali a;
    final /* synthetic */ balj b;
    final /* synthetic */ Object c;
    final /* synthetic */ balk d;

    public balh(balk balk, bali bali, balj balj, Object obj) {
        this.d = balk;
        this.a = bali;
        this.b = balj;
        this.c = obj;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        synchronized (this.d) {
            if (this.a.b == 0) {
                try {
                    this.b.a(this.c);
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                } catch (Throwable th) {
                    this.d.a.remove(this.b);
                    if (this.d.a.isEmpty()) {
                        this.d.b.shutdown();
                        this.d.b = null;
                    }
                    throw th;
                }
            }
        }
    }
}
