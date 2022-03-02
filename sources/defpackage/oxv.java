package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: oxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxv {
    public static final Uri a = Uri.parse("content://com.google.android.gms.icing.indexapi");

    public static oxe a(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("type");
        if (queryParameter == null) {
            String queryParameter2 = uri.getQueryParameter("extended_type");
            if (queryParameter2 != null) {
                queryParameter = queryParameter2;
            } else {
                oso.b("Missing query parameter: %s or %s", (Object) "type", (Object) "extended_type");
                return null;
            }
        }
        String queryParameter3 = uri.getQueryParameter("client");
        if (queryParameter3 != null) {
            return oxe.b(queryParameter, queryParameter3, oyb.a(context));
        }
        oso.b("Missing query parameter: %s", (Object) "client");
        return null;
    }
}
