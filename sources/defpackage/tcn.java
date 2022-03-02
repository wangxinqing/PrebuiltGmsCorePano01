package defpackage;

import android.content.Context;

/* renamed from: tcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcn {
    public static final /* synthetic */ int a = 0;

    static {
        new ibq("Nearby.CONNECTIONS_API", ufw.b, ufw.a);
        new ibq("Nearby.MESSAGES_API", vdm.b, vdm.a);
        new ibq("Nearby.BOOTSTRAP_API", tdq.b, tdq.a);
    }

    public static tda a(Context context) {
        iva.a((Object) context, (Object) "Context must not be null");
        return new tev(context);
    }

    public static final uxi b(Context context) {
        iva.a((Object) context, (Object) "Context must not be null");
        return new vdk(context, (uxk) null);
    }

    public static final vts c(Context context) {
        iva.a((Object) context, (Object) "Context must not be null");
        return new vts(context);
    }

    public static boolean d(Context context) {
        if (jni.b(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return aeeg.a(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }

    public static final tiq a(Context context, tis tis) {
        iva.a((Object) context, (Object) "Context must not be null");
        iva.a((Object) tis, (Object) "Options must not be null");
        return new ufu(context, tis);
    }

    public static final uxi a(Context context, uxk uxk) {
        iva.a((Object) context, (Object) "Context must not be null");
        iva.a((Object) uxk, (Object) "Options must not be null");
        return new vdk(context, uxk);
    }
}
