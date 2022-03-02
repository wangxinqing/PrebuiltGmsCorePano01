package defpackage;

/* renamed from: aijd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aijd implements Runnable {
    final /* synthetic */ aije a;

    public aijd(aije aije) {
        this.a = aije;
    }

    public final void run() {
        ajbh ajbh = this.a.a;
        if (ajbh != null) {
            ajbh.E();
            this.a.a = null;
        }
        this.a.e();
    }
}
