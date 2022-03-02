package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: evp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class evp implements amqy {
    private final evq a;

    public evp(evq evq) {
        this.a = evq;
    }

    public final Object a(Object obj) {
        int i;
        evq evq = this.a;
        iva.b(!((amzy) obj).isEmpty());
        BeginSignInRequest beginSignInRequest = evq.b;
        String str = evq.a;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.ASSISTED_SIGNIN").setPackage("com.google.android.gms");
        ivy.a((SafeParcelable) beginSignInRequest, intent, "begin_sign_in_request");
        intent.putExtra("session_id", str);
        ihs b = ihs.b();
        if (!jkr.b()) {
            i = 1207959552;
        } else {
            i = 1275068416;
        }
        return new BeginSignInResult(jhg.a((Context) b, intent, i));
    }
}
