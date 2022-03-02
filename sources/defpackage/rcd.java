package defpackage;

import android.content.Context;

/* renamed from: rcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcd {
    public static final ibq a = new ibq("ActivityRecognition.API", d, c);
    @Deprecated
    public static final rfj b = new rfj();
    private static final ibg c = new ibg();
    private static final ibn d = new rcb();

    public static iby a(Context context) {
        return new iby(context, (char[]) null);
    }

    public static rgu a(icc icc) {
        boolean z = true;
        iva.b(true, "GoogleApiClient parameter is required.");
        rgu rgu = (rgu) icc.a(c);
        if (rgu == null) {
            z = false;
        }
        iva.a(z, (Object) "GoogleApiClient is not configured to use the ActivityRecognition.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        return rgu;
    }
}
