package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;

/* renamed from: fdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdo implements fcu {
    private final Context a;
    private final String b;

    public fdo(Context context, String str, String str2, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        iva.a((Object) context);
        this.a = context;
        iva.c(str);
        iva.c(str2);
        this.b = str2;
        iva.a((Object) saveAccountLinkingTokenRequest);
    }

    public final aorr a(fde fde) {
        int i;
        String str = this.b;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.SAVE_ACCOUNT_LINKING_TOKEN").setPackage("com.google.android.gms");
        intent.putExtra("session_id", str);
        Context context = this.a;
        if (!jkr.b()) {
            i = 1207959552;
        } else {
            i = 1275068416;
        }
        return aorl.a((Object) new SaveAccountLinkingTokenResult(jhg.a(context, intent, i)));
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_SAVE_ACCOUNT_LINKING_TOKEN;
    }
}
