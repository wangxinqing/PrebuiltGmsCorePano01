package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjo {
    private final Context a;
    private final WebView b;
    private final InputMethodManager c;
    private final boolean d;
    private final wjn e;
    private String f = null;
    private int g;

    public wjo(Context context, wjn wjn, WebView webView) {
        TelephonyManager telephonyManager;
        int i = Build.VERSION.SDK_INT;
        this.a = context;
        this.e = wjn;
        this.b = webView;
        this.c = (InputMethodManager) context.getSystemService("input_method");
        boolean c2 = jhg.c(this.a);
        this.d = c2;
        if (c2 && (telephonyManager = (TelephonyManager) this.a.getSystemService("phone")) != null) {
            if (telephonyManager.getLine1Number() != null) {
                this.f = telephonyManager.getLine1Number();
            }
            this.g = telephonyManager.getSimState();
        }
    }

    @JavascriptInterface
    public void fetchIIDToken(String str) {
        wjn wjn = this.e;
        new wjd((GunsBrowserChimeraActivity) wjn, ((ActivityBase) wjn).getApplicationContext(), str).start();
    }

    @JavascriptInterface
    public void fetchVerifiedPhoneNumber(String str) {
        wjn wjn = this.e;
        jpg jpg = new jpg(((ActivityBase) wjn).getContainerActivity());
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e2) {
            anih anih = (anih) GunsBrowserChimeraActivity.a.b();
            anih.a((Throwable) e2);
            anih.a("Failed to parse phone verification params json.");
        }
        acwa a2 = jpg.a(bundle);
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = (GunsBrowserChimeraActivity) wjn;
        a2.a((acvv) new wjf(gunsBrowserChimeraActivity));
        a2.a((acvs) new wje(gunsBrowserChimeraActivity));
    }

    @JavascriptInterface
    public String getAndroidId() {
        long a2 = jhg.a(this.a);
        if (a2 != 0) {
            return Long.toHexString(a2);
        }
        return null;
    }

    @JavascriptInterface
    public int getBuildVersionSdk() {
        return Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        return this.f;
    }

    @JavascriptInterface
    public int getPlayServicesVersionCode() {
        return 201216073;
    }

    @JavascriptInterface
    public int getSimState() {
        return this.g;
    }

    @JavascriptInterface
    public boolean hasPhoneNumber() {
        return this.f != null;
    }

    @JavascriptInterface
    public boolean hasTelephony() {
        return this.d;
    }

    @JavascriptInterface
    public void hideKeyboard() {
        this.c.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
    }

    @JavascriptInterface
    public void showKeyboard() {
        this.c.showSoftInput(this.b, 1);
    }
}
