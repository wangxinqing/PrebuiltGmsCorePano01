package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.login.BrowserChimeraActivity;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FactoryResetProtectionChimeraActivity extends Activity {
    private static final iwd a = new iwd("GLSActivity", "FactoryResetProtectionActivity");
    private static String b = "url";
    private String c;

    private final void a() {
        Intent a2 = BrowserChimeraActivity.a((String) null, this.c, (String) null, false, (ArrayList) null, (String) null, (String) null);
        a2.putExtra("firstRun", true);
        a2.putExtra("useImmersiveMode", true);
        startActivityForResult(a2, 1001);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            setResult(0);
            finish();
        } else if (i2 != -1) {
            a();
        } else if (i != 1001) {
            if (i == 1002) {
                setResult(-1);
                finish();
            }
        } else if (intent != null) {
            ggd a2 = ggd.a(intent);
            String string = a2.a.getString("obfuscated_gaia_id");
            String b2 = a2.b();
            if (string == null || b2 == null) {
                Object[] objArr = new Object[2];
                objArr[0] = string;
                if (b2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                objArr[1] = Boolean.valueOf(z);
                a.d(String.format("gaiaid (%s) or authCode (%s) is null.", objArr), new Object[0]);
                a();
                return;
            }
            startActivityForResult(new Intent().setClassName(this, "com.google.android.gms.auth.frp.FrpInterstitialActivity").putExtra("account_id", string), 1002);
        } else {
            a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.c = getIntent().getStringExtra(b);
        } else {
            this.c = bundle.getString(b);
        }
        a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(b, this.c);
    }
}
