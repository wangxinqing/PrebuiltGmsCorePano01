package defpackage;

import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.google.android.gms.security.recaptcha.RecaptchaChimeraActivity;

/* renamed from: aaoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaoo {
    final /* synthetic */ RecaptchaChimeraActivity a;

    public aaoo(RecaptchaChimeraActivity recaptchaChimeraActivity) {
        this.a = recaptchaChimeraActivity;
    }

    @JavascriptInterface
    public void challengeReady() {
        String str = RecaptchaChimeraActivity.j;
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        recaptchaChimeraActivity.i = true;
        recaptchaChimeraActivity.a();
        RecaptchaChimeraActivity recaptchaChimeraActivity2 = this.a;
        recaptchaChimeraActivity2.runOnUiThread(new aaog(recaptchaChimeraActivity2));
    }

    @JavascriptInterface
    public int getClientAPIVersion() {
        return 1;
    }

    @JavascriptInterface
    public void onChallengeExpired() {
        String str = RecaptchaChimeraActivity.j;
        this.a.b();
    }

    @JavascriptInterface
    public void onError(int i, boolean z) {
        String str;
        String str2 = RecaptchaChimeraActivity.j;
        int i2 = 13;
        if (i == 1) {
            str = "Invalid Input Argument";
        } else if (i == 2) {
            i2 = 15;
            str = "Session Timeout";
        } else if (i == 7) {
            i2 = 12007;
            str = "Invalid Site Key";
        } else if (i == 8) {
            i2 = 12008;
            str = "Invalid Type of Site Key";
        } else if (i != 9) {
            str = "error";
        } else {
            i2 = 12013;
            str = "Invalid Package Name for App";
        }
        this.a.a(str, i2);
        if (z) {
            this.a.finish();
        }
    }

    @JavascriptInterface
    public void onResize(int i, int i2) {
        String str = RecaptchaChimeraActivity.j;
        this.a.a();
        if (this.a.f.getVisibility() == 0) {
            this.a.a(i, i2, true);
        } else {
            this.a.b(i, i2, true);
        }
    }

    @JavascriptInterface
    public void onShow(boolean z, int i, int i2) {
        String str = RecaptchaChimeraActivity.j;
        this.a.a();
        if (i <= 0 && i2 <= 0) {
            this.a.b(i, i2, z);
            return;
        }
        this.a.a(i, i2, z);
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        recaptchaChimeraActivity.runOnUiThread(new aaoi(recaptchaChimeraActivity, z));
    }

    @JavascriptInterface
    public void requestToken(String str, boolean z) {
        this.a.runOnUiThread(new aaon(this, str, z));
    }

    @JavascriptInterface
    public void verifyCallback(String str) {
        String str2 = RecaptchaChimeraActivity.j;
        this.a.a();
        RecaptchaChimeraActivity recaptchaChimeraActivity = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("token", str);
        recaptchaChimeraActivity.g.send(0, bundle);
        recaptchaChimeraActivity.finish();
    }
}
