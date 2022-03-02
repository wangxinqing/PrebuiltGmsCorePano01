package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* renamed from: ggi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggi {
    public final Bundle a;

    public ggi() {
        this(new Bundle());
    }

    public final String a() {
        return this.a.getString("url");
    }

    public final AppDescription b() {
        return (AppDescription) this.a.getParcelable("calling_app_description");
    }

    public final boolean c() {
        return this.a.getBoolean("suppress_progress_screen", false);
    }

    public final String d() {
        return this.a.getString("account_name");
    }

    public final String e() {
        return this.a.getString("account_type");
    }

    public final String f() {
        return this.a.getString("service");
    }

    public final PACLConfig g() {
        return (PACLConfig) this.a.getParcelable("pacl");
    }

    public final Intent h() {
        return (Intent) this.a.getParcelable("grant_credential_response_status");
    }

    public final boolean i() {
        return this.a.getInt("request_type", 0) == 3;
    }

    public final int j() {
        return this.a.getInt("request_type", 0);
    }

    public final boolean k() {
        return this.a.getBoolean("is_minute_maid", false);
    }

    public ggi(Bundle bundle) {
        this.a = bundle;
    }

    public final void a(Account account) {
        iva.a((Object) account);
        a(account.name);
        String str = account.type;
        Bundle bundle = this.a;
        iva.c(str);
        bundle.putString("account_type", str);
    }

    public final void b(String str) {
        this.a.putString("url", str);
    }

    public final void a(FACLConfig fACLConfig) {
        this.a.putParcelable("facl", fACLConfig);
    }

    public final void a(PACLConfig pACLConfig) {
        this.a.putParcelable("pacl", pACLConfig);
    }

    public final void a(String str) {
        this.a.putString("account_name", str);
    }
}
