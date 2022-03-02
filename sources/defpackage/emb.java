package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: emb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class emb {
    protected static final anax a;
    protected static final anax b;
    protected final Context c;
    protected final Map d = new HashMap();
    private final boolean e;

    static {
        anav j = anax.j();
        j.b("Token");
        j.b("EncryptedPasswd");
        j.b("droidguard_results");
        j.b("logintoken");
        j.b("logincaptcha");
        a = j.a();
        anav j2 = anax.j();
        j2.b("Email");
        j2.b("parentAndroidId");
        j2.b("delegatee_user_id");
        j2.b("client_sig");
        j2.b("callerSig");
        j2.b("androidId");
        j2.b("consent_result");
        b = j2.a();
    }

    public emb(Context context) {
        boolean f = hxz.f(context);
        iva.a((Object) context);
        this.c = context;
        this.e = f;
    }

    public final List a() {
        ComponentName profileOwner;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("androidId", iqi.a(this.c)));
        if (awkx.b()) {
            Locale locale = Locale.getDefault();
            int i = Build.VERSION.SDK_INT;
            arrayList.add(new BasicNameValuePair("lang", locale.toLanguageTag()));
        } else {
            arrayList.add(new BasicNameValuePair("lang", Locale.getDefault().toString()));
        }
        arrayList.add(new BasicNameValuePair("google_play_services_version", "201216073"));
        arrayList.add(new BasicNameValuePair("sdk_version", String.valueOf(Build.VERSION.SDK_INT)));
        String a2 = iqi.a(this.c, "device_country", (String) null);
        if (a2 != null) {
            arrayList.add(new BasicNameValuePair("device_country", a2));
        }
        if (this.e) {
            arrayList.add(new BasicNameValuePair("is_dev_key_gmscore", "1"));
        }
        if (ent.av()) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.c.getSystemService("device_policy");
            if (jkr.a() && devicePolicyManager != null && (profileOwner = devicePolicyManager.getProfileOwner()) != null && hya.a(this.c).b(profileOwner.getPackageName())) {
                arrayList.add(new BasicNameValuePair("profile_owner", profileOwner.flattenToString()));
            }
        }
        for (Map.Entry entry : this.d.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void b(AccountCredentials accountCredentials) {
        String str = accountCredentials.c;
        String str2 = accountCredentials.f;
        String str3 = accountCredentials.e;
        if (!TextUtils.isEmpty(str)) {
            a("Email", accountCredentials.c);
        }
        if (!TextUtils.isEmpty(str3)) {
            a("ACCESS_TOKEN", true);
            a("Token", str3);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Context context = this.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("\u0000");
            sb.append(str2);
            a("EncryptedPasswd", fym.a(sb.toString(), context));
        }
    }

    public final void d(String str) {
        this.d.remove(str);
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        a("Email", str);
    }

    /* access modifiers changed from: protected */
    public final void f(String str) {
        a("oauth2_redirect_uri", str);
    }

    /* access modifiers changed from: protected */
    public final void g(String str) {
        a("oauth2_authcode_verifier", str);
    }

    /* access modifiers changed from: protected */
    public final void b(CaptchaSolution captchaSolution) {
        if (captchaSolution != null) {
            a("logintoken", captchaSolution.b);
            a("logincaptcha", captchaSolution.c);
            return;
        }
        d("logintoken");
        d("logincaptcha");
    }

    public final void b(String str, String str2) {
        a("callerPkg", str);
        a("callerSig", str2);
    }

    public final void a(iwd iwd) {
        List a2 = a();
        ArrayList arrayList = new ArrayList();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            NameValuePair nameValuePair = (NameValuePair) a2.get(i);
            String name = nameValuePair.getName();
            if (a.contains(name)) {
                arrayList.add(new BasicNameValuePair(name, "(SECRET)"));
            } else if (b.contains(name)) {
                arrayList.add(new BasicNameValuePair(name, iwd.a((Object) nameValuePair.getValue())));
            } else {
                arrayList.add(nameValuePair);
            }
        }
        iwd.a(URLEncodedUtils.format(arrayList, amqn.c.name()), new Object[0]);
    }

    public final void a(String str, String str2) {
        this.d.put(str, str2);
    }

    public final void a(String str, boolean z) {
        if (z) {
            a(str, "1");
        } else {
            d(str);
        }
    }
}
