package defpackage;

/* renamed from: trb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class trb implements Runnable {
    private final tlh a;
    private final String b;
    private final trk c;

    public trb(tlh tlh, String str, trk trk) {
        this.a = tlh;
        this.b = str;
        this.c = trk;
    }

    public final void run() {
        this.a.a(this.b, this.c.a.a);
    }
}
