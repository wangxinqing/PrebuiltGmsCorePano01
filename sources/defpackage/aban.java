package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.signin.activity.BrowserConsentFragment$HiddenApiActivityIntentBlockingContext;

/* renamed from: aban  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aban extends Fragment implements abao {
    public static final iwd a = abeb.a("BrowserConsentFragment");
    public final aosh b = aosh.f();
    public WebView c;
    private View d;

    public final void a() {
        WebView webView = this.c;
        if (webView != null) {
            webView.setVisibility(0);
            this.d.setVisibility(8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        amrl.a((Object) arguments);
        String string = arguments.getString("url");
        amrl.a((Object) string);
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.browser_consent_view, (ViewGroup) null);
        this.d = relativeLayout.findViewById(R.id.progress_bar_container);
        Activity activity = getActivity();
        amrl.a((Object) activity);
        WebView webView = new WebView(new BrowserConsentFragment$HiddenApiActivityIntentBlockingContext(activity.getApplicationContext()));
        webView.setWebViewClient(new abam(this));
        webView.setWebChromeClient(new abal());
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setMapTrackballToArrowKeys(false);
        WebSettings settings = webView.getSettings();
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
        Context context = getContext();
        amrl.a((Object) context);
        webView.addJavascriptInterface(new abap(context.getApplicationContext(), this), "OAuthConsent");
        webView.loadUrl(string);
        webView.setVisibility(4);
        webView.setScrollbarFadingEnabled(false);
        relativeLayout.addView(webView);
        this.c = webView;
        return relativeLayout;
    }

    public final void onDestroyView() {
        WebView webView = this.c;
        if (webView != null) {
            webView.destroy();
            this.c = null;
        }
        super.onDestroyView();
    }
}
