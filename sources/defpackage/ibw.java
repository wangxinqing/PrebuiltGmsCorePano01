package defpackage;

import android.os.Looper;

/* renamed from: ibw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ibw {
    public Looper a;
    private igu b;

    public final ibx a() {
        if (this.b == null) {
            this.b = new icz();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new ibx(this.b, this.a);
    }

    public final void a(igu igu) {
        iva.a((Object) igu, (Object) "StatusExceptionMapper must not be null.");
        this.b = igu;
    }
}
