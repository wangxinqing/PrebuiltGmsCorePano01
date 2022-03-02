package defpackage;

/* renamed from: ulp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ulp implements Runnable {
    private final uls a;
    private final String b;
    private final usa c;

    public ulp(uls uls, String str, usa usa) {
        this.a = uls;
        this.b = str;
        this.c = usa;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
