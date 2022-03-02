package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.uiflows.controller.Controller;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountIntroChimeraActivity extends Activity {
    private static final iwd a = ehv.a("AccountIntroActivity");

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, ijn ijn, boolean z3, String str2, String str3, String str4, String[] strArr, PendingIntent pendingIntent, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, ManagedAuthOptions managedAuthOptions, D2dOptions d2dOptions) {
        byte[] bArr;
        Context context2 = context;
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = accountAuthenticatorResponse;
        String str7 = str;
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        String[] strArr2 = strArr;
        PendingIntent pendingIntent2 = pendingIntent;
        String str8 = str2;
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AccountIntroActivity").putExtra("am_response", accountAuthenticatorResponse).putExtra("account_type", str).putExtra("firstRun", z).putExtra(gmz.j.a, z2).putExtra(gmz.i.a, ijn.a()).putExtra("suppress_device_to_device_setup", z3).putExtra("allowed_domains", strArr).putExtra("caller_identity", pendingIntent).putExtra("account_name", str2).putExtra("package_name", str5).putExtra("minute_maid_login_template", str6).putExtra("is_resolve_frp_only", z4).putExtra("suppress_google_services", z5).putExtra("suppress_account_provisioning", z6).putExtra("suppress_backup_opt_in", z7);
        byte[] bArr2 = null;
        if (managedAuthOptions != null) {
            bArr = ivy.a(managedAuthOptions);
        } else {
            bArr = null;
        }
        Intent putExtra2 = putExtra.putExtra("managed_auth_options", bArr);
        if (awlg.b()) {
            if (d2dOptions != null) {
                bArr2 = ivy.a(d2dOptions);
            }
            putExtra2.putExtra("d2d_options", bArr2);
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            String str9 = str3;
            String str10 = str4;
            putExtra2.putExtra("purchaser_gaia_email", str3).putExtra("purchaser_name", str4);
        }
        return putExtra2;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ManagedAuthOptions managedAuthOptions;
        D2dOptions d2dOptions;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("account_type");
        boolean booleanExtra = intent.getBooleanExtra("firstRun", false);
        if (stringExtra == null) {
            if (!booleanExtra) {
                a.f("No account type passed in!", new Object[0]);
            }
            stringExtra = "com.google";
        }
        int i = Build.VERSION.SDK_INT;
        String stringExtra2 = intent.getStringExtra("package_name");
        if (stringExtra2 == null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("caller_identity");
            if (pendingIntent != null) {
                int i2 = Build.VERSION.SDK_INT;
                stringExtra2 = pendingIntent.getCreatorPackage();
            } else {
                stringExtra2 = null;
            }
        }
        ijn a2 = ijn.a(intent.getBundleExtra(gmz.i.a));
        if (a2.a == null) {
            a2.a = "material_light";
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent.getParcelableExtra("am_response");
        boolean booleanExtra2 = intent.getBooleanExtra(gmz.j.a, false);
        boolean booleanExtra3 = intent.getBooleanExtra("suppress_device_to_device_setup", false);
        String stringExtra3 = intent.getStringExtra("account_name");
        String stringExtra4 = intent.getStringExtra("purchaser_gaia_email");
        String stringExtra5 = intent.getStringExtra("purchaser_name");
        String[] stringArrayExtra = intent.getStringArrayExtra("allowed_domains");
        String stringExtra6 = intent.getStringExtra("minute_maid_login_template");
        boolean booleanExtra4 = intent.getBooleanExtra("is_resolve_frp_only", false);
        boolean booleanExtra5 = intent.getBooleanExtra("suppress_google_services", false);
        boolean booleanExtra6 = intent.getBooleanExtra("suppress_account_provisioning", false);
        boolean booleanExtra7 = intent.getBooleanExtra("suppress_backup_opt_in", false);
        ManagedAuthOptions a3 = ManagedAuthOptions.a(intent.getByteArrayExtra("managed_auth_options"));
        if (awlg.b()) {
            managedAuthOptions = a3;
            d2dOptions = D2dOptions.a(intent.getByteArrayExtra("d2d_options"));
        } else {
            managedAuthOptions = a3;
            d2dOptions = null;
        }
        glb a4 = AddAccountController.a();
        a4.a = new fzo(ihs.b());
        a4.b = new glm(ihs.b());
        a4.c = accountAuthenticatorResponse;
        a4.d = stringExtra;
        a4.e = booleanExtra;
        a4.f = booleanExtra2;
        a4.g = a2;
        a4.h = booleanExtra3;
        a4.i = stringExtra3;
        a4.j = stringExtra4;
        a4.k = stringExtra5;
        a4.l = stringArrayExtra;
        a4.m = stringExtra2;
        a4.n = stringExtra6;
        a4.o = Process.myUserHandle().isOwner();
        a4.p = true;
        a4.q = null;
        a4.r = null;
        a4.s = false;
        a4.t = null;
        a4.u = null;
        a4.v = false;
        a4.w = false;
        a4.x = false;
        a4.y = null;
        a4.z = false;
        a4.A = booleanExtra4;
        a4.B = booleanExtra5;
        a4.C = booleanExtra6;
        a4.D = booleanExtra7;
        a4.E = managedAuthOptions;
        a4.F = d2dOptions;
        AddAccountController a5 = a4.a();
        gnw a6 = a5.a((gny) null);
        Intent intent2 = a6.b;
        alht.a(getIntent(), intent2);
        gnx.a(intent2, (Controller) a5, a6.a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
