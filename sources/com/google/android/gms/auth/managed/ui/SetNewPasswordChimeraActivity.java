package com.google.android.gms.auth.managed.ui;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SetNewPasswordChimeraActivity extends bjs {
    private static final iwd a = ehv.a("AuthManaged", "SetNewPasswordChimeraActivity");
    private String b;
    private boolean c = false;
    private long d = -1;

    private final void a(int i) {
        if (!this.c) {
            this.c = true;
            aucd e = e();
            if (e.c) {
                e.c();
                e.c = false;
            }
            baqa baqa = (baqa) e.b;
            baqa baqa2 = baqa.f;
            baqa.e = i - 1;
            baqa.a |= 8;
            if (this.d >= 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.d;
                if (e.c) {
                    e.c();
                    e.c = false;
                }
                baqa baqa3 = (baqa) e.b;
                baqa3.a |= 4;
                baqa3.d = currentTimeMillis;
            }
            gji.a((Context) this).a(6, (baqa) e.i());
        }
    }

    private final aucd e() {
        aucd o = baqa.f.o();
        String str = this.b;
        int i = 1;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqa baqa = (baqa) o.b;
            str.getClass();
            baqa.a |= 1;
            baqa.b = str;
        }
        if (getIntent().hasExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY")) {
            int intExtra = getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0);
            if (intExtra == 0) {
                i = 2;
            } else if (intExtra == 65536) {
                i = 3;
            } else if (intExtra == 196608) {
                i = 4;
            } else if (intExtra == 327680) {
                i = 5;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqa baqa2 = (baqa) o.b;
            baqa2.c = i - 1;
            baqa2.a |= 2;
        }
        return o;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        if (!gjk.b().a((Context) this) || !devicePolicyManager.isActivePasswordSufficient()) {
            setResult(0);
            a(4);
        } else {
            setResult(-1);
            a(2);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        gjk b2 = gjk.b();
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
        } else {
            str = null;
        }
        this.b = str;
        gji.a((Context) this).a(5, (baqa) e().i());
        int a2 = b2.a();
        if (a2 != 1) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a2);
            iwd.d(sb.toString(), new Object[0]);
            setResult(a2);
            a(gji.b(a2));
            finish();
        } else if (!b2.a((Context) this)) {
            a.d("Device admin not active.", new Object[0]);
            setResult(5);
            a(8);
            finish();
        } else {
            ghm.a().a(this, getIntent().getIntExtra("com.google.android.gms.extra.PASSWORD_COMPLEXITY", 0));
            Intent intent = new Intent("android.app.action.SET_NEW_PASSWORD");
            this.d = System.currentTimeMillis();
            startActivityForResult(intent, 108);
        }
    }

    public final void onDestroy() {
        ghm.a().b(this);
        a(4);
        super.onDestroy();
    }
}
