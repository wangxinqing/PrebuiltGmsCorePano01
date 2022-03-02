package com.google.android.gms.auth.setup.d2d;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartDeviceChimeraActivity extends gjx {
    public static final iwd e = new iwd("SmartDevice", "D2D", "SmartDeviceActivity");
    public static final fzk f = fzk.a("callerIdentity");
    public static final fzk g = fzk.a("d2d_options");
    public static final ikz h = ikz.a("smartdevice:enable_d2d_v2_target", true);
    private boolean p = false;
    private boolean q = false;

    public final void a() {
        c();
    }

    public final void aL() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.q = true;
        iwd iwd = e;
        Integer valueOf = Integer.valueOf(i2);
        iwd.a("onActivityResult(requestCode=%d, resultCode=%d)", Integer.valueOf(i), valueOf);
        if (i == 1234) {
            if (i2 != -1) {
                if (i2 == 0) {
                    e.c("Smartdevice setup was canceled", new Object[0]);
                    a(0, intent);
                    return;
                } else if (i2 == 1) {
                    e.c("Smartdevice setup was skipped", new Object[0]);
                    c();
                    return;
                } else if (!(i2 == 102 || i2 == 103)) {
                    e.d("Unrecognised result code from SmartDevice. Ignoring.", new Object[0]);
                    return;
                }
            }
            e.c("SmartDevice setup was completed with result code: %d", valueOf);
            this.c.set(false);
            a(i2, intent);
            this.d.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.p = true;
            Intent intent = new Intent();
            intent.putExtra("smartdevice.use_immersive_mode", (Serializable) f().a(gjx.b, false));
            intent.putExtra("smartdevice.theme", (String) f().a(gjx.a));
            intent.putExtra(f.a, (String) f().a(f));
            intent.putExtra(g.a, (byte[]) f().a(g));
            intent.setClassName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetActivity");
            alht.a(getIntent(), intent);
            startActivityForResult(intent, 1234);
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.p && !this.q) {
            e.e("The child activity crashed. Skipping D2d.", new Object[0]);
            c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("launchedTargetActivity", true);
    }
}
