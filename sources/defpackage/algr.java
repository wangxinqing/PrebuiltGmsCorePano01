package defpackage;

/* renamed from: algr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class algr {
    final int a;
    final algb b;

    public algr(int i) {
        this(i, (algb) null);
    }

    public algr(int i, algb algb) {
        this.a = i;
        this.b = algb;
        if (i == 4) {
            algm.a((Object) algb, "CompatService cannot be null when state is connected");
        }
    }
}
