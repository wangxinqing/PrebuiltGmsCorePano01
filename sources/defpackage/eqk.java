package defpackage;

import android.content.Context;
import android.os.Binder;

/* renamed from: eqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqk {
    static final anax a = anax.a(13, 8, 14, 15);

    /* access modifiers changed from: package-private */
    public final elt a(Context context) {
        iva.a((Object) context);
        fyk fyk = new fyk(context);
        try {
            fyq.a(Binder.getCallingUid(), fyk);
            return new elt(fyk);
        } catch (SecurityException e) {
            eqj eqj = new eqj(10);
            eqj.a = e;
            throw eqj.a();
        }
    }
}
