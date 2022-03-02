package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

/* renamed from: abbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abbc implements Callable {
    private final ConsentChimeraActivity a;

    public abbc(ConsentChimeraActivity consentChimeraActivity) {
        this.a = consentChimeraActivity;
    }

    public final Object call() {
        int i;
        ConsentChimeraActivity consentChimeraActivity = this.a;
        consentChimeraActivity.f();
        TokenResponse tokenResponse = consentChimeraActivity.j;
        amrl.a((Object) tokenResponse);
        BrowserResolutionCookie[] browserResolutionCookieArr = tokenResponse.z.e;
        if (browserResolutionCookieArr != null) {
            int length = browserResolutionCookieArr.length;
            int i2 = 0;
            while (i2 < length) {
                BrowserResolutionCookie browserResolutionCookie = browserResolutionCookieArr[i2];
                if (TextUtils.isEmpty(browserResolutionCookie.c)) {
                    i = length;
                } else if (TextUtils.isEmpty(browserResolutionCookie.a)) {
                    i = length;
                } else if (!TextUtils.isEmpty(browserResolutionCookie.b)) {
                    String str = browserResolutionCookie.c;
                    amrl.a((Object) str);
                    String a2 = ehz.a(str, Boolean.valueOf(browserResolutionCookie.f));
                    i = length;
                    String a3 = ehz.a(browserResolutionCookie.a, browserResolutionCookie.b, browserResolutionCookie.c, browserResolutionCookie.d, Boolean.valueOf(browserResolutionCookie.g), Boolean.valueOf(browserResolutionCookie.f), Long.valueOf(browserResolutionCookie.e));
                    iwd iwd = ConsentChimeraActivity.a;
                    String valueOf = String.valueOf(a2);
                    iwd.b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                    consentChimeraActivity.d.setCookie(a2, a3);
                    i2++;
                    length = i;
                } else {
                    i = length;
                }
                ConsentChimeraActivity.a.d("Invalid browser resolution cookie.", new Object[0]);
                i2++;
                length = i;
            }
        }
        return eiw.a((Context) consentChimeraActivity).a(consentChimeraActivity.h.a(), tokenResponse.z.d);
    }
}
