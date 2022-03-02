package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: nkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nkn extends AbstractGmsTracer {
    public nkn(Context context, Class cls, int i) {
        super(cls.getClassLoader(), i, context, (String) null);
    }

    public final amky a(String str, amsv amsv) {
        njx c = nku.c();
        if (c == null || !c.c) {
            return a(str, amsv, (Intent) null, false);
        }
        c.c = false;
        if (!axda.a.a().S()) {
            return a(str, (amsv) null, (Intent) null, true);
        }
        return a(str, (amsv) null, (Intent) null, false);
    }
}
