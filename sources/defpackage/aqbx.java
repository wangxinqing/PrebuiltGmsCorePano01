package defpackage;

/* renamed from: aqbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aqbx {
    public final babj a;
    public final int b;

    private aqbx(int i, babj babj) {
        this.b = i;
        this.a = babj;
    }

    static aqbx a(int i) {
        amrl.b(true);
        return new aqbx(i, (babj) null);
    }

    static aqbx a(int i, babj babj) {
        if (i != 4) {
            i = 5;
        }
        amrl.b(true);
        amrl.a((Object) babj);
        return new aqbx(i, babj);
    }
}
