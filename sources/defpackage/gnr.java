package defpackage;

import android.accounts.Account;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.login.CustomWebView;

/* renamed from: gnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnr extends gmx implements LoaderManager.LoaderCallbacks, gns {
    public static final fzk d = fzk.a("account");
    public static final fzk e = fzk.a("url");
    public static final fzk f = fzk.a("cookies");
    private static final iwd h = ehv.a("BrowserConsentFragment");
    public gnq g;
    private fzq i;
    private gnt j;
    private boolean k;
    private Account l;
    private String m;
    private BrowserResolutionCookie[] n = new BrowserResolutionCookie[0];

    private final void b(CustomWebView customWebView, String str) {
        if (!this.i.b(str)) {
            if (this.k) {
                customWebView.removeJavascriptInterface("OAuthConsent");
                this.k = false;
            }
        } else if (!this.k) {
            customWebView.addJavascriptInterface(this.j, "OAuthConsent");
            this.k = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(CustomWebView customWebView) {
        WebSettings settings = customWebView.getSettings();
        String userAgentString = settings.getUserAgentString();
        String a = jli.a("gms.auth.useragent", "");
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(a);
        settings.setUserAgentString(sb.toString());
        gom.a().b();
        CookieManager instance = CookieManager.getInstance();
        for (BrowserResolutionCookie browserResolutionCookie : this.n) {
            if (TextUtils.isEmpty(browserResolutionCookie.c) || TextUtils.isEmpty(browserResolutionCookie.a) || TextUtils.isEmpty(browserResolutionCookie.b)) {
                h.d("Invalid browser resolution cookie.", new Object[0]);
            } else {
                String a2 = ehz.a(browserResolutionCookie.c, Boolean.valueOf(browserResolutionCookie.f));
                String a3 = ehz.a(browserResolutionCookie.a, browserResolutionCookie.b, browserResolutionCookie.c, browserResolutionCookie.d, Boolean.valueOf(browserResolutionCookie.g), Boolean.valueOf(browserResolutionCookie.f), Long.valueOf(browserResolutionCookie.e));
                iwd iwd = h;
                String valueOf = String.valueOf(a2);
                iwd.b(valueOf.length() == 0 ? new String("Setting browser resolution cookie for url: ") : "Setting browser resolution cookie for url: ".concat(valueOf), new Object[0]);
                instance.setCookie(a2, a3);
            }
        }
        getActivity().getLoaderManager().restartLoader(0, (Bundle) null, this);
    }

    /* access modifiers changed from: protected */
    public final void a(gol gol) {
    }

    /* access modifiers changed from: protected */
    public final boolean d(String str) {
        if (this.i.b(str)) {
            return false;
        }
        this.g.b(str);
        return true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.g = (gnq) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        this.j = new gnt(this);
        this.i = fzq.a((String) ent.i.c());
        this.l = (Account) b().a(d);
        this.m = (String) b().a(e);
        Parcelable[] parcelableArr = (Parcelable[]) b().a(f);
        if (parcelableArr != null) {
            this.n = new BrowserResolutionCookie[parcelableArr.length];
            for (int i3 = 0; i3 < parcelableArr.length; i3++) {
                this.n[i3] = (BrowserResolutionCookie) parcelableArr[i3];
            }
        }
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        return new gnl(getActivity(), this.l, new String[]{this.m});
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        CustomWebView customWebView;
        if (((Boolean) obj).booleanValue()) {
            iwd iwd = h;
            String valueOf = String.valueOf(this.l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Updated credentials for account: ");
            sb.append(valueOf);
            iwd.c(sb.toString(), new Object[0]);
            if (ent.V() && (customWebView = this.c) != null) {
                b(customWebView, this.m);
            }
            a(this.m);
            return;
        }
        iwd iwd2 = h;
        String valueOf2 = String.valueOf(this.l);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb2.append("Failed to get login token for account: ");
        sb2.append(valueOf2);
        iwd2.d(sb2.toString(), new Object[0]);
        this.g.c();
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* access modifiers changed from: protected */
    public final void a(CustomWebView customWebView, String str) {
        if (!ent.V()) {
            b(customWebView, str);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(WebResourceRequest webResourceRequest) {
        if (this.i.b(webResourceRequest.getUrl().toString())) {
            return false;
        }
        this.g.b(webResourceRequest.getUrl().toString());
        return true;
    }
}
