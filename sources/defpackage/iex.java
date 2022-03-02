package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: iex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iex extends ifp {
    private final WeakReference a;

    public iex(iey iey) {
        this.a = new WeakReference(iey);
    }

    public final void a() {
        iey iey = (iey) this.a.get();
        if (iey != null) {
            iey.l();
        }
    }
}
