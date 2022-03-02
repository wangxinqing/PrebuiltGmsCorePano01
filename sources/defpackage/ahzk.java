package defpackage;

/* renamed from: ahzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahzk implements Runnable {
    private final ahzm a;
    private final boolean b;
    private final String c;

    public ahzk(ahzm ahzm, boolean z, String str) {
        this.a = ahzm;
        this.b = z;
        this.c = str;
    }

    public final void run() {
        ahzm ahzm = this.a;
        boolean z = this.b;
        String str = this.c;
        if (axyu.d()) {
            ahzm.b = z;
            ahzm.c = str != null ? arvy.a(str) : 0;
            ahzm.a(3);
            return;
        }
        ahzm.b();
    }
}
