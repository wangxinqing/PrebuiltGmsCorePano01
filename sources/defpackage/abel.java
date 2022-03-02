package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: abel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abel extends nis {
    private final abev a;
    private final String b;
    private final RecordConsentByConsentResultRequest c;
    private final abdr d;
    private final abez e = abez.a;

    public abel(abev abev, String str, RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, abdr abdr) {
        super(44, "RecordConsentByConsentResult");
        this.a = abev;
        this.b = str;
        this.c = recordConsentByConsentResultRequest;
        this.d = abdr;
    }

    public final void a(Context context) {
        String str;
        gck a2 = pzx.a(context);
        Bundle bundle = this.c.a;
        TokenRequest tokenRequest = (TokenRequest) qbx.a(bundle, "token_request", TokenRequest.class);
        ConsentResult consentResult = (ConsentResult) qbx.a(bundle, "consent_result", ConsentResult.class);
        amrl.a((Object) consentResult);
        TokenRequest tokenRequest2 = new TokenRequest(tokenRequest.a(), tokenRequest.b);
        tokenRequest2.a(tokenRequest.b());
        tokenRequest2.a(gda.GRANTED);
        tokenRequest2.j = tokenRequest.j;
        FACLConfig fACLConfig = consentResult.e;
        if (fACLConfig != null) {
            tokenRequest2.e = fACLConfig;
        }
        PACLConfig pACLConfig = tokenRequest2.f;
        String str2 = consentResult.d;
        if (str2 != null) {
            if (pACLConfig != null) {
                str = pACLConfig.b;
            } else {
                str = null;
            }
            tokenRequest2.f = new PACLConfig(str, str2);
        }
        gda b2 = consentResult.b();
        if (b2 != null) {
            tokenRequest2.a(b2);
        }
        String str3 = consentResult.g;
        if (!TextUtils.isEmpty(str3)) {
            tokenRequest2.q = str3;
        }
        String str4 = consentResult.h;
        if (!TextUtils.isEmpty(str4)) {
            tokenRequest2.r = str4;
        }
        TokenData tokenData = a2.a(tokenRequest2).w;
        if (tokenData != null) {
            List list = tokenData.f;
            String str5 = tokenData.b;
            if (str5 != null) {
                if (list != null) {
                    list = anda.a((Iterable) list);
                    list.retainAll(amym.a((Iterable) this.a.e()).a(abek.a).b());
                    abez abez = this.e;
                    String str6 = this.b;
                    Account a3 = tokenRequest.a();
                    if (list != null) {
                        abez.b.put(new abey(str6, a3), new HashSet(list));
                    } else {
                        abez.c(str6, a3);
                    }
                }
                abdr abdr = this.d;
                if (list == null) {
                    list = new ArrayList();
                }
                abdr.a(new RecordConsentByConsentResultResponse(list, str5));
                return;
            }
        }
        this.d.a(new RecordConsentByConsentResultResponse(amzy.h(), (String) null));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.d.a(new RecordConsentByConsentResultResponse(amzy.h(), (String) null));
    }
}
