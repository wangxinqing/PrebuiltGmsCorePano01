package defpackage;

/* renamed from: tra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tra implements Runnable {
    private final tlh a;
    private final String b;
    private final asas c;

    public tra(tlh tlh, String str, asas asas) {
        this.a = tlh;
        this.b = str;
        this.c = asas;
    }

    public final void run() {
        tlh tlh = this.a;
        tlh.f.b(this.b, this.c.b, asog.LOCAL_ERROR);
    }
}
