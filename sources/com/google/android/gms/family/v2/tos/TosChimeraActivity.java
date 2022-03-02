package com.google.android.gms.family.v2.tos;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TosChimeraActivity extends bjs implements mqk {
    private String a;
    private byte[] b;
    private boolean c;
    private mhi d;

    private final void a(int i) {
        ith ith = mfv.a;
        setResult(4, new Intent().putExtra("accountName", this.a).putExtra("errorCode", i));
        finish();
    }

    private final Intent e() {
        return new Intent().putExtra("accountName", getIntent().getStringExtra("accountName")).putExtra("tosAccepted", this.c);
    }

    public final void n() {
        this.c = true;
        setResult(1, e());
        finish();
    }

    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
            super.onBackPressed();
            return;
        }
        setResult(3, e());
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = new mhi(this);
        boolean z = true;
        setRequestedOrientation(1);
        String a2 = jhg.a((Activity) this);
        if (!hya.a((Context) this).b(a2)) {
            this.d.a(3, 8, "tos");
            a(-3);
            return;
        }
        mfx.a(this, getIntent(), a2);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.a = stringExtra;
        if (stringExtra == null) {
            this.d.a(3, 13, "tos");
            a(-2);
            return;
        }
        if (bundle != null && bundle.getByteArray("auditToken") != null) {
            this.b = bundle.getByteArray("auditToken");
        } else if (getIntent().getByteArrayExtra("auditToken") != null) {
            this.b = getIntent().getByteArrayExtra("auditToken");
        } else {
            aucd o = aqnm.c.o();
            auay a3 = auay.a(egl.a());
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqnm aqnm = (aqnm) o.b;
            a3.getClass();
            aqnm.a |= 1;
            aqnm.b = a3;
            this.b = ((aqnm) o.i()).k();
        }
        this.d.a(this.a, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion), getIntent().getStringExtra("appId"));
        Account account = null;
        for (Account account2 : qub.a((Context) this).a("com.google")) {
            if (account2.name.equals(this.a)) {
                account = account2;
            }
        }
        if (account == null) {
            this.d.a(3, 14, "tos");
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            a(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("tosContent");
        String stringExtra3 = getIntent().getStringExtra("tosContinueButton");
        String stringExtra4 = getIntent().getStringExtra("tosMoreButton");
        if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra3)) {
            this.d.a(3, 15, "tos");
            a(-2);
            return;
        }
        if (bundle == null || !bundle.getBoolean("tosAccepted", false)) {
            z = false;
        }
        this.c = z;
        setContentView((int) R.layout.fm_activity_play_tos);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentById(R.id.fm_family_play_tos_fragment_container) == null) {
            supportFragmentManager.beginTransaction().add((int) R.id.fm_family_play_tos_fragment_container, (Fragment) mql.a(this.b, this.a, stringExtra2, stringExtra3, stringExtra4)).commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("tosAccepted", this.c);
        bundle.putByteArray("auditToken", this.b);
    }
}
