package defpackage;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: abco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abco extends CookieManager {
    public final boolean acceptCookie() {
        return false;
    }

    public final boolean acceptThirdPartyCookies(WebView webView) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean allowFileSchemeCookiesImpl() {
        return false;
    }

    public final void flush() {
    }

    public final String getCookie(String str) {
        return null;
    }

    public final String getCookie(String str, boolean z) {
        return null;
    }

    public final boolean hasCookies() {
        return false;
    }

    public final boolean hasCookies(boolean z) {
        return false;
    }

    public final void removeAllCookie() {
    }

    public final void removeAllCookies(ValueCallback valueCallback) {
    }

    public final void removeExpiredCookie() {
    }

    public final void removeSessionCookie() {
    }

    public final void removeSessionCookies(ValueCallback valueCallback) {
    }

    public final void setAcceptCookie(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final void setAcceptFileSchemeCookiesImpl(boolean z) {
    }

    public final void setAcceptThirdPartyCookies(WebView webView, boolean z) {
    }

    public final void setCookie(String str, String str2) {
    }

    public final void setCookie(String str, String str2, ValueCallback valueCallback) {
    }
}
