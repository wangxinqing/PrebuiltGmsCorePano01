package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: drg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class drg extends hea {
    public final GoogleSettingsItem b() {
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        synchronized (drh.b) {
            if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) && !hea.a(intent, "GoogleSettingsIndexGetter")) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (drh.a == dpz.a(extras)) {
                        drh.b.notify();
                    }
                } else {
                    throw new IllegalArgumentException("Bundle must not be null.");
                }
            }
        }
    }
}
