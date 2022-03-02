package com.google.firebase.auth.api.gms.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserSignInStarterChimeraActivity extends Activity implements aptl {
    private final aoru b = new jfz(1, 9);

    public final Uri.Builder a(Intent intent, String str, String str2) {
        String str3;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str4, string);
                    }
                }
            } catch (JSONException e) {
                a.e("Unexpected JSON exception when serializing developer specified custom params", new Object[0]);
            }
            str3 = jSONObject.toString();
        } else {
            str3 = null;
        }
        String uuid = UUID.randomUUID().toString();
        String a = aptk.a(UUID.randomUUID().toString());
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        apvr.a(getApplicationContext(), str, uuid, a, stringExtra4, stringExtra2, stringExtra3);
        if (a == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("eid", axic.a.a().a()).appendQueryParameter("v", stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", a).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2);
        if (!TextUtils.isEmpty(join)) {
            appendQueryParameter.appendQueryParameter("scopes", join);
        }
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("customParameters", str3);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            appendQueryParameter.appendQueryParameter("tid", stringExtra3);
        }
        return appendQueryParameter;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (axic.b()) {
            a.a("Activity enabled. Continuing", new Object[0]);
            String a = jhg.a((Activity) this);
            if (TextUtils.isEmpty(a)) {
                a.f("Could not identify calling package", new Object[0]);
                aptk.a(this, a);
                return;
            }
            try {
                new aptj(a, jhg.e(this, a).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(this.b, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                iwd iwd = a;
                String valueOf = String.valueOf(a);
                iwd.f(valueOf.length() == 0 ? new String("Could not get package signature: ") : "Could not get package signature: ".concat(valueOf), new Object[0]);
                aptk.a(this, a);
            }
        } else {
            a.a("Activity disabled. Finishing", new Object[0]);
            finish();
        }
    }

    public final String a() {
        return axic.c();
    }

    public final HttpURLConnection a(URL url) {
        try {
            return (HttpURLConnection) jlk.a(url, 20480);
        } catch (IOException e) {
            a.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void a(Uri uri, String str) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || !axic.a.a().k()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            ResolveInfo resolveActivity = getPackageManager().resolveActivity(intent2, 0);
            intent2.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
            intent2.addFlags(268435456);
            if (resolveActivity != null) {
                startActivity(intent2);
                finish();
                return;
            }
            a.e("SignInStartActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            aptk.a(this, str);
            return;
        }
        agj a = new agi().a();
        Intent intent3 = a.a;
        intent3.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        intent3.addFlags(268435456);
        a.a(this, uri);
        finish();
    }

    public final void a(String str, Status status) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(this, FederatedSignInActivity.class);
            intent.setPackage(str);
            intent.setClassName(str, FederatedSignInActivity.class.getName());
            intent.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
            intent.addFlags(603979776);
            if (status != null) {
                apvy.a(intent, status);
            }
            startActivity(intent);
        }
        finish();
    }
}
