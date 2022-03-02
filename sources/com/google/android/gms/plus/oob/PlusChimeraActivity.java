package com.google.android.gms.plus.oob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusChimeraActivity extends FragmentActivity {
    private PlusCommonExtras a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String a2 = jhg.a((Activity) this);
            if (a2 == null) {
                Log.e("OutOfBox", "Out of box flow must be initiated by a startActivityForResult call.");
            } else {
                try {
                    hya.a((Context) this).a(a2);
                    PlusCommonExtras b = PlusCommonExtras.b(getIntent());
                    this.a = b;
                    ykr.a(this, b, "");
                    String stringExtra = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME");
                    String str = this.a.b;
                    if (TextUtils.isEmpty(str)) {
                        str = getIntent().getStringExtra("com.google.android.gms.plus.GPSRC");
                    }
                    this.a.b = str;
                    int intExtra = getIntent().getIntExtra("com.google.android.gms.plus.OVERRIDE_THEME", 0);
                    String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME");
                    String stringExtra3 = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT");
                    String stringExtra4 = getIntent().getStringExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE");
                    String stringExtra5 = getIntent().getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
                    if (!TextUtils.isEmpty(stringExtra5)) {
                        a2 = stringExtra5;
                    }
                    PlusCommonExtras plusCommonExtras = this.a;
                    Intent flags = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.plus.oob.UpgradeAccountActivity").putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", stringExtra).putExtra("com.google.android.gms.common.oob.EXTRAS_CLIENT_CALLING_APP_PACKAGE", a2).putExtra("com.google.android.gms.plus.OVERRIDE_THEME", intExtra).setFlags(33554432);
                    plusCommonExtras.a(flags);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        flags.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", stringExtra2);
                    }
                    if (!TextUtils.isEmpty(stringExtra3)) {
                        flags.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_TEXT", stringExtra3);
                    }
                    if (!TextUtils.isEmpty(stringExtra4)) {
                        flags.putExtra("com.google.android.gms.common.oob.EXTRAS_PROMO_APP_PACKAGE", stringExtra4);
                    }
                    startActivity(flags);
                    finish();
                    return;
                } catch (SecurityException e) {
                    StringBuilder sb = new StringBuilder(a2.length() + 22);
                    sb.append("Package for ");
                    sb.append(a2);
                    sb.append(" not found");
                    Log.e("OutOfBox", sb.toString());
                }
            }
            setResult(0);
            finish();
        }
    }
}
