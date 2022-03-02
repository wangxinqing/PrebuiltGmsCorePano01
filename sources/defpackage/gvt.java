package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: gvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvt {
    private final String a;
    private final String b;
    private boolean c = false;

    public gvt(Context context, Object obj) {
        Class<?> cls = obj.getClass();
        String packageName = context.getPackageName();
        String canonicalName = cls.getCanonicalName();
        this.a = packageName;
        this.b = canonicalName;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.checkin.EXTRA_CHECKIN_NOW", this.c);
        bundle.putString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE", this.a);
        bundle.putString("com.google.android.gms.checkin.CHECKIN_SOURCE_CLASS", this.b);
        return bundle;
    }

    public final void b() {
        this.c = true;
    }
}
