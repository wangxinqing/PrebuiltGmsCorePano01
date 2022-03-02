package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: fae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fae extends qcg implements faf {
    public static final iwd a = ehv.b("AuthorizationConsentFragment");
    private static final int f = R.style.CredentialsDialogTheme;
    public WebView b;
    public fbn c;
    public boolean d;
    public boolean e;
    private LinearLayout g;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        fbn fbn = (fbn) qck.a(getActivity()).a(fbn.class);
        this.c = fbn;
        if (!this.e) {
            fbn.f.a(this, new faa(this));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new vt((Context) getActivity(), f));
        setRetainInstance(true);
        this.g = (LinearLayout) cloneInContext.inflate(R.layout.credentials_authorization_consent_fragment, viewGroup, false);
        if (this.b == null) {
            Activity activity = getActivity();
            amrl.a((Object) activity);
            WebView webView = new WebView(new fad(activity.getApplicationContext()));
            this.b = webView;
            webView.setWebViewClient(new fac(this));
            this.b.setWebChromeClient(new fab());
            this.b.setFocusable(true);
            this.b.setFocusableInTouchMode(true);
            this.b.setMapTrackballToArrowKeys(false);
            WebSettings settings = this.b.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setSavePassword(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setNeedInitialFocus(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(false);
            if (jkr.c()) {
                settings.setDisabledActionModeMenuItems(7);
            }
            this.b.addJavascriptInterface(new fag(getContext().getApplicationContext(), this), "OAuthConsent");
        }
        this.g.addView(this.b);
        return this.g;
    }

    public final void onDestroyView() {
        LinearLayout linearLayout;
        WebView webView = this.b;
        if (!(webView == null || (linearLayout = this.g) == null)) {
            linearLayout.removeView(webView);
        }
        super.onDestroyView();
    }
}
