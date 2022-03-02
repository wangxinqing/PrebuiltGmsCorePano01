package defpackage;

/* renamed from: efu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efu implements Runnable {
    private final efz a;
    private final efl b;
    private final String c;
    private final efb d;

    public efu(efz efz, efl efl, String str, efb efb) {
        this.a = efz;
        this.b = efl;
        this.c = str;
        this.d = efb;
    }

    public final void run() {
        efz efz = this.a;
        efz.b.a(this.b, this.c, this.d);
    }
}
