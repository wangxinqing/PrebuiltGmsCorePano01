package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: fax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fax implements Callable {
    private final fbk a;

    public fax(fbk fbk) {
        this.a = fbk;
    }

    public final Object call() {
        TokenData tokenData;
        Set set;
        String str;
        fbk fbk = this.a;
        TokenRequest tokenRequest = new TokenRequest(fbk.q.a(), fbk.q.b);
        tokenRequest.a(fbk.q.b());
        tokenRequest.a(gda.GRANTED);
        tokenRequest.j = fbk.q.j;
        ConsentResult consentResult = fbk.s;
        if (consentResult != null) {
            FACLConfig fACLConfig = consentResult.e;
            if (fACLConfig != null) {
                tokenRequest.e = fACLConfig;
            }
            PACLConfig pACLConfig = tokenRequest.f;
            String str2 = consentResult.d;
            if (str2 != null) {
                if (pACLConfig != null) {
                    str = pACLConfig.b;
                } else {
                    str = null;
                }
                tokenRequest.f = new PACLConfig(str, str2);
            }
            gda b = consentResult.b();
            if (b != null) {
                tokenRequest.a(b);
            }
            String str3 = consentResult.g;
            if (!TextUtils.isEmpty(str3)) {
                tokenRequest.q = str3;
            }
            String str4 = consentResult.h;
            if (!TextUtils.isEmpty(str4)) {
                tokenRequest.r = str4;
            }
        }
        TokenResponse a2 = fbk.p.a(tokenRequest);
        if (a2 == null || (tokenData = a2.w) == null) {
            throw qbf.a(8);
        }
        fbk.a(fbk.t, tokenData.b);
        List list = tokenData.f;
        if (list != null) {
            set = jkx.a((Collection) list);
        } else {
            set = anfv.a;
        }
        fbk.o = set;
        return amri.b(qcr.AUTH_ACCOUNT);
    }
}
