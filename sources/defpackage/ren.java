package defpackage;

import android.content.Context;

/* renamed from: ren  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ren {
    public static final ibq a = new ibq("LocationServices.API", e, d);
    @Deprecated
    public static final rgb b = new rgb();
    @Deprecated
    public static final rfw c = new rfw();
    private static final ibg d = new ibg();
    private static final ibn e = new rel();

    public static iby a(Context context) {
        return new iby(context, a, (ibm) null, ibx.a);
    }

    public static iby b(Context context) {
        return new iby(context, a, (ibm) null, ibx.a);
    }

    public static iby c(Context context) {
        return new iby(context, a, (ibm) null, (igu) new icz());
    }

    public static rgu a(icc icc) {
        boolean z;
        boolean z2 = true;
        if (icc != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "GoogleApiClient parameter is required.");
        rgu rgu = (rgu) icc.a(d);
        if (rgu == null) {
            z2 = false;
        }
        iva.a(z2, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return rgu;
    }
}
