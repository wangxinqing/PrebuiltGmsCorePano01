package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: hdf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdf extends bjs {
    public final boolean a(Intent intent) {
        Intent intent2;
        ComponentName resolveActivity;
        if (!awzr.c() || (intent2 = getIntent()) == null || !intent2.getBooleanExtra("calledFromGoogleSettings", false) || (resolveActivity = intent.resolveActivity(getPackageManager())) == null || !new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink").equals(resolveActivity)) {
            return super.a(intent);
        }
        return false;
    }
}
