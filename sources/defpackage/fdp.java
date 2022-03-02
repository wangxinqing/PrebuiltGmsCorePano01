package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: fdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fdp implements aoqb {
    private final fdq a;

    public fdp(fdq fdq) {
        this.a = fdq;
    }

    public final aorr a(Object obj) {
        int i;
        fdq fdq = this.a;
        if (!((amzy) obj).isEmpty()) {
            ihs b = ihs.b();
            SavePasswordRequest savePasswordRequest = fdq.a;
            String str = fdq.b;
            Intent intent = new Intent("com.google.android.gms.auth.api.credentials.SAVE_PASSWORD").setPackage("com.google.android.gms");
            ivy.a((SafeParcelable) savePasswordRequest, intent, "save_password_request");
            intent.putExtra("session_id", str);
            if (!jkr.b()) {
                i = 1207959552;
            } else {
                i = 1275068416;
            }
            return aorl.a((Object) new SavePasswordResult(jhg.a((Context) b, intent, i)));
        }
        throw qbf.a(28434);
    }
}
