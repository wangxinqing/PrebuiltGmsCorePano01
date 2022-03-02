package defpackage;

/* renamed from: ksu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ksu implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ ksw b;

    public ksu(ksw ksw, long j) {
        this.b = ksw;
        this.a = j;
    }

    public final void run() {
        kov h = this.b.g.h(this.a);
        if (h == null) {
            ksw.a.c("EventDistributor", "New persisted event is missing in the database.");
            return;
        }
        this.b.a(h);
        this.b.a();
    }
}
