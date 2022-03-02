package defpackage;

/* renamed from: bahs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahs implements Runnable {
    final /* synthetic */ baht a;

    public bahs(baht baht) {
        this.a = baht;
    }

    public final void run() {
        baht baht = this.a;
        baht.c.j.remove(baht.a);
        if (this.a.c.n.a == azxz.SHUTDOWN && this.a.c.j.isEmpty()) {
            this.a.c.d();
        }
    }
}
