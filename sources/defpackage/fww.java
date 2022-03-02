package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fww {
    private static final Lock c = new ReentrantLock();
    private static fww d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public fww(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static fww a(Context context) {
        iva.a((Object) context);
        c.lock();
        try {
            if (d == null) {
                d = new fww(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    public final GoogleSignInOptions b() {
        String a2;
        String a3 = a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(a3) || (a2 = a(b("googleSignInOptions", a3))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.a(a2);
        } catch (JSONException e) {
            return null;
        }
    }

    public final GoogleSignInAccount a() {
        String a2;
        Uri uri;
        String a3 = a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(a3) || (a2 = a(b("googleSignInAccount", a3))) == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            String optString = jSONObject.optString("photoUrl", (String) null);
            if (!TextUtils.isEmpty(optString)) {
                uri = Uri.parse(optString);
            } else {
                uri = null;
            }
            long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(new Scope(jSONArray.getString(i)));
            }
            GoogleSignInAccount a4 = GoogleSignInAccount.a(jSONObject.optString("id"), jSONObject.optString("tokenId", (String) null), jSONObject.optString("email", (String) null), jSONObject.optString("displayName", (String) null), jSONObject.optString("givenName", (String) null), jSONObject.optString("familyName", (String) null), uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
            a4.g = jSONObject.optString("serverAuthCode", (String) null);
            return a4;
        } catch (JSONException e) {
            return null;
        }
    }

    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final String a(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
