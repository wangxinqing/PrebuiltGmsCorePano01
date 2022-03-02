package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: pya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pya {
    public pya(pxy pxy) {
        iva.a((Object) pxy, (Object) "Callbacks must not be null.");
    }

    public static final boolean a(Context context, Intent intent) {
        iva.a((Object) context, (Object) "Context must not be null.");
        iva.a((Object) intent, (Object) "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
