package defpackage;

/* renamed from: hri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hri implements hrv {
    private final aucd a;

    public hri(aucd aucd) {
        this.a = aucd;
    }

    public final void a(int i) {
        aucd aucd = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        avqy avqy = (avqy) aucd.b;
        avqy avqy2 = avqy.ab;
        avqy.b |= 128;
        avqy.O = i;
    }
}
