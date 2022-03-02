package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.mdm.receivers.GoogleAccountsAddedChimeraReceiver;
import com.google.android.gms.security.settings.AdmSettingsChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecurityModuleInitIntentOperation extends hec {
    private static final String[] a = {"com.google.android.gms.security.provider.SecurityProvider", "com.google.android.gms.security.recaptcha.RecaptchaActivity", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity"};

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!jix.a((Context) this)) {
            int i = Build.VERSION.SDK_INT;
            jix.i(this);
            int i2 = Build.VERSION.SDK_INT;
            snb.b(this, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) != 0 || i2 != 0) {
            smg.a(this);
            smo.j.b();
            int i4 = crc.a;
            GoogleAccountsAddedChimeraReceiver.b();
            for (String a2 : a) {
                jhg.a((Context) this, a2, true);
            }
            jhg.a((Context) this, "com.google.android.gms.security.settings.AdmSettingsActivity", AdmSettingsChimeraActivity.c(this));
            a();
        } else if (i3 != 0) {
            String str = (String) smo.f.a();
            String str2 = (String) smo.g.a();
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                smu.a(this, str, str2);
            }
            long longValue = ((Long) smo.i.a()).longValue();
            if (longValue > 0) {
                smq.a((Context) this, longValue);
            }
            smg.a(this);
            a();
        }
    }
}
