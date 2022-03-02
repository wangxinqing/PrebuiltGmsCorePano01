package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemAppTrampolineChimeraActivity extends Activity {
    private static final Set a = new HashSet();
    private static int b;
    private okc c;
    private HelpConfig d;

    private final void a(int i) {
        okg.a(68, i, (Context) this, this.d, this.c);
        opa.a((Activity) this, Uri.parse(axmj.z()), this.d, this.c);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        okc okc = this.c;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        int length;
        int length2;
        super.onCreate(bundle);
        String a2 = jhg.a((Activity) this);
        PackageManager packageManager = getPackageManager();
        this.c = new okc(this);
        HelpConfig a3 = HelpConfig.a(GoogleHelp.a("systemAppTrampolineActivity"), (Context) this);
        this.d = a3;
        a3.b = a2;
        okg.a(66, 1, (Context) this, a3, this.c);
        if (packageManager.hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a2, 0);
                if (applicationInfo == null || (applicationInfo.flags & 1) == 0) {
                    a(35);
                    return;
                }
                String aU = axmj.a.a().aU();
                if (aU.hashCode() != b) {
                    a.clear();
                    Collections.addAll(a, ofx.a(aU));
                    b = aU.hashCode();
                }
                if (!a.contains(a2)) {
                    a(36);
                    return;
                }
                Intent intent = getIntent();
                if (intent.hasExtra("EXTRA_CONTEXT")) {
                    str = intent.getStringExtra("EXTRA_CONTEXT");
                } else {
                    str = "";
                }
                GoogleHelp a4 = GoogleHelp.a(str);
                new nyt(a4).a(this.d.e);
                ThemeSettings themeSettings = new ThemeSettings();
                int intExtra = intent.getIntExtra("EXTRA_THEME", -1);
                if (intExtra != -1) {
                    themeSettings.a = intExtra;
                }
                int intExtra2 = intent.getIntExtra("EXTRA_PRIMARY_COLOR", -1);
                if (intExtra2 != -1) {
                    themeSettings.b = intExtra2;
                }
                a4.s = themeSettings;
                String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_PSD_KEYS");
                String[] stringArrayExtra2 = intent.getStringArrayExtra("EXTRA_PSD_VALUES");
                if (!(stringArrayExtra == null || stringArrayExtra2 == null || (length2 = stringArrayExtra.length) != stringArrayExtra2.length)) {
                    nz nzVar = new nz(length2);
                    for (int i = 0; i < length2; i++) {
                        nzVar.put(stringArrayExtra[i], stringArrayExtra2[i]);
                    }
                    a4.a((Map) nzVar);
                }
                String[] stringArrayExtra3 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_KEYS");
                String[] stringArrayExtra4 = intent.getStringArrayExtra("EXTRA_FEEDBACK_PSD_VALUES");
                if (!(stringArrayExtra3 == null || stringArrayExtra4 == null || (length = stringArrayExtra3.length) != stringArrayExtra4.length)) {
                    mwc mwc = new mwc();
                    for (int i2 = 0; i2 < length; i2++) {
                        mwc.a(stringArrayExtra3[i2], stringArrayExtra4[i2]);
                    }
                    a4.a(mwc.a(), getCacheDir());
                }
                Account account = (Account) intent.getParcelableExtra("EXTRA_ACCOUNT");
                if (account != null) {
                    a4.c = account;
                }
                a4.e = jhg.a((Activity) this);
                okg.a(67, 1, (Context) this, this.d, this.c);
                Intent a5 = a4.a();
                int intExtra3 = intent.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0);
                if (intExtra3 != 0) {
                    a5.putExtra("EXTRA_OPEN_TO_CONTACT_OPTION", intExtra3);
                }
                startActivityForResult(a5, 0);
                finish();
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(a2);
                Log.e("gH_SystemAppTrampoline", valueOf.length() == 0 ? new String("Error trying to get the application info for ") : "Error trying to get the application info for ".concat(valueOf));
                a(34);
            }
        } else {
            a(33);
        }
    }
}
