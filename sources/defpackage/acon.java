package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;

/* renamed from: acon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acon extends WebViewClient {
    final /* synthetic */ AccountChallengeWebView a;

    public acon(AccountChallengeWebView accountChallengeWebView) {
        this.a = accountChallengeWebView;
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2;
        String str3;
        int i;
        acdv acdv = new acdv();
        String cookie = acdv.a.getCookie(str);
        if (cookie != null) {
            String a2 = acdv.a(str);
            str3 = null;
            str2 = null;
            for (String str4 : cookie.split("\\;")) {
                int indexOf = str4.indexOf(61);
                if (indexOf > 0 && (i = indexOf + 1) < str4.length()) {
                    String trim = str4.substring(0, indexOf).trim();
                    String trim2 = str4.substring(i).trim();
                    if ("oauth_token".equalsIgnoreCase(trim)) {
                        acdv.a(a2, "oauth_token");
                        str2 = trim2;
                    }
                    if ("GASC".equalsIgnoreCase(trim)) {
                        acdv.a(a2, "GASC");
                        str3 = trim2;
                    }
                    if (!(str2 == null || str3 == null)) {
                        break;
                    }
                }
            }
        } else {
            str3 = null;
            str2 = null;
        }
        acdu acdu = new acdu(str2, str3);
        String str5 = acdu.a;
        String str6 = acdu.b;
        if (str5 == null && str6 == null) {
            AccountChallengeWebView accountChallengeWebView = this.a;
            iwd iwd = AccountChallengeWebView.a;
            ackd ackd = accountChallengeWebView.n;
            if (ackd != null) {
                ackh ackh = ackd.a;
                ackh.a(ackh.d.l.getTitle());
                AccountChallengeWebView accountChallengeWebView2 = ackd.a.d;
                int i2 = Build.VERSION.SDK_INT;
                accountChallengeWebView2.setOnApplyWindowInsetsListener(new alhr());
            }
            this.a.l.bringToFront();
            this.a.l.setVisibility(0);
        } else if (!TextUtils.isEmpty(str5)) {
            AccountChallengeWebView accountChallengeWebView3 = this.a;
            iwd iwd2 = AccountChallengeWebView.a;
            accountChallengeWebView3.f.add(accountChallengeWebView3.k);
            new acou(this.a, this.a.k.getString("name"), str5).execute(new Void[0]);
        } else if (!TextUtils.isEmpty(str6)) {
            AccountChallengeWebView accountChallengeWebView4 = this.a;
            iwd iwd3 = AccountChallengeWebView.a;
            accountChallengeWebView4.k.putString("sessionCheckpoint", str6);
            this.a.k.putString("url", (String) null);
            AccountChallengeWebView accountChallengeWebView5 = this.a;
            accountChallengeWebView5.f.add(accountChallengeWebView5.k);
            this.a.g();
            this.a.c();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(AccountChallengeWebView.b);
        if (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter) || Integer.valueOf(queryParameter).intValue() != 1) {
            return false;
        }
        this.a.d();
        return true;
    }
}
