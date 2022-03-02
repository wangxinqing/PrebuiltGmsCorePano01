package com.google.android.gms.family.v2.manage;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DeleteMemberChimeraActivity extends bjs implements mpf, mpb {
    public mfr a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f = false;
    public ProgressDialog g = null;
    public mfp h;
    public mhi i;
    private String j;

    private final void a(int i2) {
        ith ith = mfv.a;
        setResult(4, new Intent().putExtra("accountName", this.b).putExtra("errorCode", i2));
        finish();
    }

    private final void n() {
        ProgressDialog progressDialog = new ProgressDialog(this, mfx.b(getIntent()));
        this.g = progressDialog;
        progressDialog.setIndeterminate(true);
        this.g.setCancelable(false);
        if (this.e) {
            this.g.setMessage(getResources().getString(R.string.fm_leave_family_progress));
        } else {
            this.g.setMessage(getResources().getString(R.string.fm_remove_member_progress));
        }
        this.g.show();
    }

    public final int aR() {
        return 1;
    }

    public final int aS() {
        return 2;
    }

    public final void aT() {
        mfv.c("DeleteMemberActivity", "Starting delete member loader", new Object[0]);
        this.f = true;
        n();
        getSupportLoaderManager().initLoader(0, (Bundle) null, new mno(this));
    }

    public final void b(Intent intent) {
        if (this.a.a() != null && !this.a.a().isEmpty()) {
            intent.putExtra("consistencyToken", this.a.a()).putExtra("tokenExpirationTimeSecs", this.a.b());
        }
    }

    public final mfr e() {
        return this.a;
    }

    public final void f() {
        this.i.a(8);
        setResult(7);
        finish();
    }

    public final void h() {
        this.i.a(17);
        setResult(10);
        finish();
    }

    public final void i() {
        String str;
        String str2;
        if (this.e) {
            str = getString(R.string.fm_reauth_password_title_leave_family, new Object[]{this.j});
        } else {
            str = getString(R.string.fm_reauth_password_title_remove_member, new Object[]{this.d});
        }
        if (this.e) {
            str2 = getString(R.string.fm_reauth_pin_title_leave_family, new Object[]{this.j});
        } else {
            str2 = getString(R.string.fm_reauth_pin_title_remove_member, new Object[]{this.d});
        }
        mpc.a(this.b, str, str2).show(getSupportFragmentManager(), (String) null);
    }

    public final mfp m() {
        return this.h;
    }

    public final void onCreate(Bundle bundle) {
        mpj mpj;
        super.onCreate(bundle);
        this.i = new mhi(this);
        String a2 = jhg.a((Activity) this);
        if (!hya.a((Context) this).b(a2)) {
            this.i.a(2, 8, "deletemember");
            a(-3);
            return;
        }
        if (getIntent().getStringExtra("clientCallingPackage") != null) {
            a2 = getIntent().getStringExtra("clientCallingPackage");
        }
        mfx.a(this, getIntent(), a2);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.b = stringExtra;
        if (stringExtra == null) {
            this.i.a(2, 13, "deletemember");
            a(-2);
            return;
        }
        Account account = null;
        for (Account account2 : qub.a((Context) this).a("com.google")) {
            if (account2.name.equals(this.b)) {
                account = account2;
            }
        }
        if (account == null) {
            this.i.a(2, 14, "deletemember");
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
            sb.append("Selected account: ");
            sb.append(str);
            sb.append(" doesn't exist on device");
            sb.toString();
            a(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("memberId");
        this.c = stringExtra2;
        if (stringExtra2 == null) {
            this.i.a(2, 10, "deletemember");
            a(-2);
            return;
        }
        String stringExtra3 = getIntent().getStringExtra("memberGivenName");
        this.d = stringExtra3;
        if (TextUtils.isEmpty(stringExtra3)) {
            this.i.a(2, 11, "deletemember");
            a(-2);
            return;
        }
        this.e = getIntent().getBooleanExtra("leaveFamily", false);
        String stringExtra4 = getIntent().getStringExtra("hohGivenName");
        this.j = stringExtra4;
        if (!this.e || !TextUtils.isEmpty(stringExtra4)) {
            mfp mfp = new mfp(getIntent().getStringExtra("appId"), Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
            this.h = mfp;
            this.i.a(this.b, mfp.b, mfp.a);
            this.a = new mfr();
            if (getIntent().getStringExtra("consistencyToken") != null) {
                this.a.a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
            }
            setContentView((int) R.layout.fm_activity_delete_member);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (!this.e) {
                String str2 = this.b;
                String str3 = this.c;
                mpj = new mpj();
                Bundle bundle2 = new Bundle(2);
                bundle2.putString("accountName", str2);
                bundle2.putString("memberId", str3);
                mpj.setArguments(bundle2);
            } else {
                String str4 = this.b;
                mpj = new mpj();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("accountName", str4);
                mpj.setArguments(bundle3);
            }
            if (supportFragmentManager.findFragmentById(R.id.fm_delete_member_fragment_container) == null) {
                supportFragmentManager.beginTransaction().add((int) R.id.fm_delete_member_fragment_container, (Fragment) mpj).commit();
            }
            if (bundle != null && bundle.getBoolean("DeleteMemberInProgress", false)) {
                n();
                getSupportLoaderManager().initLoader(0, (Bundle) null, new mno(this));
            }
            int i2 = Build.VERSION.SDK_INT;
            setRequestedOrientation(14);
            return;
        }
        this.i.a(2, 12, "deletemember");
        a(-2);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("DeleteMemberInProgress", this.f);
        ProgressDialog progressDialog = this.g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
