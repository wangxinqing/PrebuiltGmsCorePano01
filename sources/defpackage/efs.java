package defpackage;

/* renamed from: efs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efs implements Runnable {
    private final efz a;
    private final efo b;
    private final String c;
    private final efb d;

    public efs(efz efz, efo efo, String str, efb efb) {
        this.a = efz;
        this.b = efo;
        this.c = str;
        this.d = efb;
    }

    public final void run() {
        efz efz = this.a;
        efz.b.a(this.b, this.c, this.d);
    }
}
