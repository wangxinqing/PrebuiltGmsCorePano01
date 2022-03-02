package defpackage;

import android.content.Context;

/* renamed from: eci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eci {
    @Deprecated
    public static final ibg a = new ibg();
    private static final ibn b = new ech();

    static {
        new ibq("AudioModem.API", b, a);
    }

    public static final ecu a(Context context) {
        iva.a((Object) context, (Object) "Context must not be null");
        return new ecu(context);
    }
}
