package defpackage;

/* renamed from: agq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agq {
    static final agq a;
    static final agq b;
    final boolean c;
    final Throwable d;

    static {
        if (!agy.a) {
            b = new agq(false, (Throwable) null);
            a = new agq(true, (Throwable) null);
            return;
        }
        b = null;
        a = null;
    }

    public agq(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
