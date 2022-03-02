package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;

/* renamed from: emu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emu {
    public static final ResolutionData a(ggs ggs) {
        int i = 1;
        if (ggs.d.size() != 0) {
            BrowserResolutionCookie[] browserResolutionCookieArr = new BrowserResolutionCookie[ggs.d.size()];
            for (int i2 = 0; i2 < ggs.d.size(); i2++) {
                ggk ggk = (ggk) ggs.d.get(i2);
                ehx ehx = new ehx();
                String str = ggk.a;
                BrowserResolutionCookie browserResolutionCookie = ehx.a;
                iva.c(str);
                browserResolutionCookie.a = str;
                String str2 = ggk.b;
                BrowserResolutionCookie browserResolutionCookie2 = ehx.a;
                iva.c(str2);
                browserResolutionCookie2.b = str2;
                String str3 = ggk.d;
                BrowserResolutionCookie browserResolutionCookie3 = ehx.a;
                iva.c(str3);
                browserResolutionCookie3.d = str3;
                String str4 = ggk.c;
                BrowserResolutionCookie browserResolutionCookie4 = ehx.a;
                iva.c(str4);
                browserResolutionCookie4.c = str4;
                boolean z = ggk.f;
                BrowserResolutionCookie browserResolutionCookie5 = ehx.a;
                browserResolutionCookie5.f = z;
                browserResolutionCookie5.e = ggk.e;
                browserResolutionCookie5.g = ggk.g;
                browserResolutionCookieArr[i2] = browserResolutionCookie5;
            }
            String str5 = ggs.a;
            int a = ggr.a(ggs.b);
            if (a != 0) {
                i = a;
            }
            return new ResolutionData(str5, i - 1, ggs.c, browserResolutionCookieArr);
        }
        String str6 = ggs.a;
        int a2 = ggr.a(ggs.b);
        if (a2 != 0) {
            i = a2;
        }
        return new ResolutionData(str6, i - 1, ggs.c, (BrowserResolutionCookie[]) null);
    }

    public static final TokenResponse a(Account account, TokenData tokenData) {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.a(gei.SUCCESS);
        tokenResponse.a(account);
        tokenResponse.a(tokenData);
        return tokenResponse;
    }

    public static final TokenResponse a(Account account, gei gei) {
        TokenResponse tokenResponse = new TokenResponse();
        tokenResponse.a(gei);
        tokenResponse.a(account);
        return tokenResponse;
    }
}
