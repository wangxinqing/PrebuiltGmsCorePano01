package com.google.android.gms.auth.uiflows.settings;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.AdapterView;
import com.google.android.gms.R;
import com.google.android.gms.auth.login.CustomWebView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountSettingsChimeraActivity extends gmy implements AdapterView.OnItemSelectedListener, gnc {
    public static final iwd a = ehv.a("AccountSettingsActivity");
    static final fzk b = fzk.a("account_type");
    static final fzk c = fzk.a("account");
    public String d;
    public gnd e;
    private jmf f;
    private Map g;

    private final void a(Account account) {
        f().b(c, account);
        new gql(this, account).execute(new Void[0]);
    }

    private static String b(Account account) {
        String str = account.name;
        int lastIndexOf = str.lastIndexOf(64);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return "AccountSettingsActivity";
    }

    public final void onBackPressed() {
        CustomWebView customWebView = this.e.c;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f.a(aE());
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Uri.Builder buildUpon = Uri.parse((String) ent.u.c()).buildUpon();
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (!language.isEmpty() && !locale.getCountry().isEmpty()) {
            String valueOf = String.valueOf(language);
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(country).length());
            sb.append(valueOf);
            sb.append('-');
            sb.append(country);
            language = sb.toString();
        }
        if (!language.isEmpty()) {
            buildUpon.appendQueryParameter("hl", language);
        }
        this.d = buildUpon.build().toString();
        String str2 = (String) f().a(b);
        Account[] a2 = qub.a((Context) this).a(str2);
        int length = a2.length;
        if (length == 0) {
            iwd iwd = a;
            String valueOf2 = String.valueOf(str2);
            iwd.d(valueOf2.length() == 0 ? new String("No accounts found for account type: ") : "No accounts found for account type: ".concat(valueOf2), new Object[0]);
            finish();
            return;
        }
        gnd gnd = (gnd) getSupportFragmentManager().findFragmentByTag("browser");
        this.e = gnd;
        if (gnd == null) {
            this.e = gnd.a();
            getSupportFragmentManager().beginTransaction().add(16908290, this.e, "browser").commit();
        }
        this.g = new HashMap();
        String[] strArr = new String[length];
        for (int i = 0; i < a2.length; i++) {
            Account account = a2[i];
            String b2 = b(account);
            this.g.put(b2, account);
            strArr[i] = b2;
        }
        Account account2 = (Account) f().a(c);
        if (account2 != null) {
            str = b(account2);
        } else {
            str = null;
        }
        sg aE = aE();
        jme jme = new jme(aE);
        jme.c = strArr;
        jme.a(R.string.auth_account_settings_title);
        jme.a = this;
        jme.b = str;
        this.f = jme.a();
        aE.a(4, 4);
        aE.b(true);
        a(account2);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Account account = (Account) this.g.get(this.f.getItem(i));
        iwd iwd = a;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append("Selected ");
        sb.append(valueOf);
        iwd.c(sb.toString(), new Object[0]);
        if (!account.equals(f().a(c))) {
            a(account);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        a.c("Nothing selected", new Object[0]);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void a(gnd gnd) {
        WebSettings settings = gnd.c.getSettings();
        String userAgentString = settings.getUserAgentString();
        String a2 = jli.a("gms.auth.useragent", "");
        StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a2).length());
        sb.append(userAgentString);
        sb.append(" ");
        sb.append(a2);
        settings.setUserAgentString(sb.toString());
    }

    public final void a(gol gol) {
        iwd iwd = a;
        String str = gol.b;
        String str2 = gol.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(str2).length());
        sb.append("Success! ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        iwd.c(sb.toString(), new Object[0]);
    }
}
