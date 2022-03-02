package defpackage;

/* renamed from: hrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hrb implements hrv {
    private final aucd a;

    public hrb(aucd aucd) {
        this.a = aucd;
    }

    public final void a(int i) {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avqx avqx = (avqx) aucd.b;
        avqx avqx2 = avqx.e;
        avqx.a |= 1;
        avqx.b = i;
    }
}
