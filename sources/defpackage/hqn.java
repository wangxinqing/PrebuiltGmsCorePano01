package defpackage;

/* renamed from: hqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hqn implements hrv {
    private final aucd a;

    public hqn(aucd aucd) {
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
        avqy.b |= 16384;
        avqy.Z = i;
    }
}
