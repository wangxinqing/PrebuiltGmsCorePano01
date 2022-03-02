package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddAccountChimeraActivity extends gnf implements gle {
    public static final fzk a = fzk.a("account");
    public static final fzk b = fzk.a("offers_intent");
    public static final fzk c = fzk.a("dm_status");
    public static final fzk d = fzk.a("is_unicorn_account");
    private static final iwd e = ehv.a("AddAccount", "AddAccountActivity");
    private static final fzk f = fzk.a("account_type");
    private static final fzk g = fzk.a("is_setup_wizard");
    private static final fzk p = fzk.a("auth_code");
    private static final fzk q = fzk.a("obfuscated_gaia_id");
    private static final fzk r = fzk.a("account_name");
    private static final fzk s = fzk.a("terms_of_service_accepted");
    private static final fzk t = fzk.a("check_offers");
    private static final fzk u = fzk.a("token_handle");
    private static final fzk v = fzk.a("resolve_frp_only");
    private static final fzk w = fzk.a("is_wifi_d2d");

    public static Intent a(Context context, String str, boolean z, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, ijn ijn, boolean z6) {
        int i;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AddAccountActivity");
        if (!awjm.a.a().l()) {
            i = R.string.auth_gls_name_checking_info_title;
        } else {
            i = R.string.auth_signing_in_title;
        }
        fzl a2 = gnf.a(ijn, z4, i);
        fzk fzk = f;
        iva.a((Object) str);
        a2.b(fzk, str);
        a2.b(g, Boolean.valueOf(z));
        fzk fzk2 = p;
        iva.a((Object) str2);
        a2.b(fzk2, str2);
        a2.b(q, str3);
        a2.b(r, str4);
        a2.b(s, Boolean.valueOf(z2));
        a2.b(t, Boolean.valueOf(z3));
        a2.b(v, Boolean.valueOf(z5));
        a2.b(w, Boolean.valueOf(z6));
        return className.putExtras(a2.a);
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        if (ekh.a.b(this)) {
            ekh.a.a(this, (Intent) null);
        } else {
            super.aI();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "AddAccountActivity";
    }

    public final void c() {
        e.c("FRP unlocked.", new Object[0]);
        anok anok = ((anon) j().b).q;
        if (anok == null) {
            anok = anok.d;
        }
        aucd aucd = (aucd) anok.c(5);
        aucd.a((aucj) anok);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anok anok2 = (anok) aucd.b;
        anok2.b = 2;
        anok2.a |= 1;
        anok anok3 = (anok) aucd.i();
        aucd j = j();
        if (j.c) {
            j.c();
            j.c = false;
        }
        anon anon = (anon) j.b;
        anon anon2 = anon.v;
        anok3.getClass();
        anon.q = anok3;
        anon.a |= 2097152;
        a(4, (Intent) null);
    }

    public final void e() {
        e.d("Failed to add account.", new Object[0]);
        anok anok = ((anon) j().b).q;
        if (anok == null) {
            anok = anok.d;
        }
        aucd aucd = (aucd) anok.c(5);
        aucd.a((aucj) anok);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anok anok2 = (anok) aucd.b;
        anok2.b = 5;
        anok2.a |= 1;
        anok anok3 = (anok) aucd.i();
        aucd j = j();
        if (j.c) {
            j.c();
            j.c = false;
        }
        anon anon = (anon) j.b;
        anon anon2 = anon.v;
        anok3.getClass();
        anon.q = anok3;
        anon.a |= 2097152;
        a(2, (Intent) null);
    }

    public final void onBackPressed() {
        e.c("onBackPressed. Ignore.", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ekh.a.b(this)) {
            ekh.a.a((gmz) this);
        }
        glf.a(this, true, ((Boolean) f().a(v)).booleanValue(), (String) f().a(f), (String) f().a(p), (String) f().a(q), (String) f().a(r), ((Boolean) f().a(s)).booleanValue(), ((Boolean) f().a(t)).booleanValue(), g().c);
        if ((((anon) j().b).a & 2097152) == 0) {
            aucd j = j();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anon.c = 19;
            anon.a |= 1;
            anok anok = anok.d;
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon3 = (anon) j.b;
            anok.getClass();
            anon3.q = anok;
            anon3.a = 2097152 | anon3.a;
        }
    }

    public final void a(int i) {
        int i2;
        anok anok = ((anon) j().b).q;
        if (anok == null) {
            anok = anok.d;
        }
        aucd aucd = (aucd) anok.c(5);
        aucd.a((aucj) anok);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anok anok2 = (anok) aucd.b;
        anok2.b = 1;
        anok2.a |= 1;
        anok anok3 = (anok) aucd.i();
        aucd j = j();
        if (j.c) {
            j.c();
            j.c = false;
        }
        anon anon = (anon) j.b;
        anon anon2 = anon.v;
        anok3.getClass();
        anon.q = anok3;
        anon.a |= 2097152;
        if (i == 4) {
            e.c("FRP locked.", new Object[0]);
            i2 = R.string.auth_factory_reset_protection_recent_password_change_toast;
        } else if (i != 100) {
            e.c("Unknown error happened on server side.", new Object[0]);
            i2 = R.string.auth_factory_reset_protection_unknown_error_toast;
        } else {
            e.c("Wrong account used.", new Object[0]);
            i2 = R.string.auth_factory_reset_protection_wrong_account_toast;
        }
        Toast.makeText(this, i2, 1).show();
        a(3, (Intent) null);
    }

    public final void a(Account account, String str, boolean z, Intent intent, boolean z2, String str2) {
        int i;
        int i2 = 5;
        if (!z2) {
            i = 5;
        } else {
            i = 4;
        }
        boolean booleanValue = ((Boolean) f().a(g, false)).booleanValue();
        anok anok = ((anon) j().b).q;
        if (anok == null) {
            anok = anok.d;
        }
        aucd aucd = (aucd) anok.c(5);
        aucd.a((aucj) anok);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anok anok2 = (anok) aucd.b;
        anok2.b = i - 1;
        int i3 = anok2.a | 1;
        anok2.a = i3;
        if (booleanValue) {
            anok2.c = 1;
            anok2.a = i3 | 2;
        }
        aucd j = j();
        anok anok3 = (anok) aucd.i();
        if (j.c) {
            j.c();
            j.c = false;
        }
        anon anon = (anon) j.b;
        anon anon2 = anon.v;
        anok3.getClass();
        anon.q = anok3;
        anon.a |= 2097152;
        boolean booleanValue2 = ((Boolean) f().a(w, false)).booleanValue();
        if (!z2) {
            i2 = -1;
        } else if (!booleanValue2) {
            i2 = -1;
        }
        fzl fzl = new fzl();
        fzl.b(a, account);
        fzl.b(c, str);
        fzl.b(d, Boolean.valueOf(z));
        fzl.b(b, intent);
        fzl.b(u, str2);
        a(i2, new Intent().putExtras(fzl.a));
    }
}
