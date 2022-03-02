package defpackage;

/* renamed from: lko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lko implements alrf {
    public final void a(alrg alrg, Runnable runnable) {
        if (alrg == alrg.SUCCESS) {
            runnable.run();
            return;
        }
        lkr.a.a("Not retrying request with status: %s", alrg);
    }
}
