package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: abba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abba implements Callable {
    private final ConsentChimeraActivity a;

    public abba(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object call() {
        ConsentChimeraActivity consentChimeraActivity = this.a;
        TokenRequest tokenRequest = new TokenRequest(consentChimeraActivity.h.a(), consentChimeraActivity.h.b);
        tokenRequest.a(consentChimeraActivity.h.b());
        tokenRequest.a(gda.GRANTED);
        tokenRequest.j = consentChimeraActivity.h.j;
        ConsentResult consentResult = consentChimeraActivity.k;
        if (consentResult != null) {
            amrl.a((Object) consentResult);
            FACLConfig fACLConfig = consentResult.e;
            if (fACLConfig != null) {
                tokenRequest.e = fACLConfig;
            }
            PACLConfig pACLConfig = tokenRequest.f;
            String str = consentResult.d;
            if (str != null) {
                tokenRequest.f = new PACLConfig(pACLConfig != null ? pACLConfig.b : null, str);
            }
            gda b = consentResult.b();
            if (b != null) {
                tokenRequest.a(b);
            }
            String str2 = consentResult.g;
            if (!TextUtils.isEmpty(str2)) {
                tokenRequest.q = str2;
            }
            String str3 = consentResult.h;
            if (!TextUtils.isEmpty(str3)) {
                tokenRequest.r = str3;
            }
        }
        return consentChimeraActivity.g.a(tokenRequest);
    }
}
