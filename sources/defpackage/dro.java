package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: dro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dro extends hea {
    public final GoogleSettingsItem b() {
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            drp drp = drp.e;
            if (!hea.a(intent, "GoogleSettingsActivity") && drp != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (drp.c == dpz.a(extras)) {
                        drp.runOnUiThread(new drn(drp));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
            }
        }
    }
}
