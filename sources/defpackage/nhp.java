package defpackage;

/* renamed from: nhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhp implements Runnable {
    public final void run() {
        try {
            synchronized (nia.a) {
                if (nia.b != null) {
                    nia.b.b();
                }
            }
        } catch (Exception e) {
            ngz.a("FontsDownloadResultPump", (Throwable) e, "failed async advanceUpdate", new Object[0]);
        }
    }
}
