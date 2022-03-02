package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;
import java.util.concurrent.Callable;

/* renamed from: faw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class faw implements Callable {
    private final fbk a;

    public faw(fbk fbk) {
        this.a = fbk;
    }

    public final Object call() {
        int i;
        fbk fbk = this.a;
        ResolutionData resolutionData = fbk.r.z;
        String str = resolutionData.d;
        BrowserResolutionCookie[] browserResolutionCookieArr = resolutionData.e;
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
                    String a2 = ehz.a(browserResolutionCookie.c, Boolean.valueOf(browserResolutionCookie.f));
                    i = length;
                    String a3 = ehz.a(browserResolutionCookie.a, browserResolutionCookie.b, browserResolutionCookie.c, browserResolutionCookie.d, Boolean.valueOf(browserResolutionCookie.g), Boolean.valueOf(browserResolutionCookie.f), Long.valueOf(browserResolutionCookie.e));
                    iwd iwd = fbk.a;
                    String valueOf = String.valueOf(a2);
                    iwd.b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                    fbk.w.setCookie(a2, a3);
                    i2++;
                    length = i;
                } else {
                    i = length;
                }
                fbk.a.d("Invalid browser resolution cookie.", new Object[0]);
                i2++;
                length = i;
            }
        }
        ((eiw) fbk.v.a()).a(fbk.l, str);
        return amri.b(qcr.CONSENT_SHOW_REMOTE_UI);
    }
}
