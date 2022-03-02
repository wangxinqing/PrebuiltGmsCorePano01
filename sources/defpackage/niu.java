package defpackage;

import android.os.Binder;

/* renamed from: niu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class niu implements amsv {
    static final amsv a = new niu();

    private niu() {
    }

    public final Object a() {
        nig a2 = njd.a(Binder.getCallingUid());
        if (a2 != null || jhg.b()) {
            return a2;
        }
        return null;
    }
}
