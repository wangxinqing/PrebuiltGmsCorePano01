package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwj {
    private static fwj b = null;
    final fww a;

    private fwj(Context context) {
        fww a2 = fww.a(context);
        this.a = a2;
        a2.a();
        this.a.b();
    }

    public static synchronized fwj a(Context context) {
        fwj b2;
        synchronized (fwj.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized fwj b(Context context) {
        synchronized (fwj.class) {
            if (b == null) {
                fwj fwj = new fwj(context);
                b = fwj;
                return fwj;
            }
            fwj fwj2 = b;
            return fwj2;
        }
    }

    public final synchronized void a() {
        fww fww = this.a;
        fww.a.lock();
        try {
            fww.b.edit().clear().apply();
        } finally {
            fww.a.unlock();
        }
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        fww fww = this.a;
        iva.a((Object) googleSignInAccount);
        iva.a((Object) googleSignInOptions);
        fww.a("defaultGoogleSignInAccount", googleSignInAccount.i);
        iva.a((Object) googleSignInAccount);
        iva.a((Object) googleSignInOptions);
        String str = googleSignInAccount.i;
        String b2 = fww.b("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.i);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, fvp.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            fww.a(b2, jSONObject.toString());
            String b3 = fww.b("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            Collections.sort(googleSignInOptions.h, GoogleSignInOptions.r);
            Iterator it = googleSignInOptions.h.iterator();
            while (it.hasNext()) {
                jSONArray2.put(((Scope) it.next()).b);
            }
            jSONObject2.put("scopes", jSONArray2);
            Account account = googleSignInOptions.i;
            if (account != null) {
                jSONObject2.put("accountName", account.name);
            }
            jSONObject2.put("idTokenRequested", googleSignInOptions.j);
            jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.l);
            jSONObject2.put("serverAuthRequested", googleSignInOptions.k);
            if (!TextUtils.isEmpty(googleSignInOptions.m)) {
                jSONObject2.put("serverClientId", googleSignInOptions.m);
            }
            if (!TextUtils.isEmpty(googleSignInOptions.n)) {
                jSONObject2.put("hostedDomain", googleSignInOptions.n);
            }
            fww.a(b3, jSONObject2.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
