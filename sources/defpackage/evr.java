package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: evr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evr implements fcu {
    private final Context a;
    private final GetSignInIntentRequest b;

    public evr(Context context, GetSignInIntentRequest getSignInIntentRequest) {
        this.a = context;
        this.b = getSignInIntentRequest;
    }

    public final aorr a(fde fde) {
        int i;
        GetSignInIntentRequest getSignInIntentRequest = this.b;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.GOOGLE_SIGN_IN").setPackage("com.google.android.gms");
        ivy.a((SafeParcelable) getSignInIntentRequest, intent, "get_sign_in_intent_request");
        Context context = this.a;
        if (!jkr.b()) {
            i = 1207959552;
        } else {
            i = 1275068416;
        }
        return aorl.a((Object) jhg.a(context, intent, i));
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_GET_SIGN_IN_INTENT;
    }
}
