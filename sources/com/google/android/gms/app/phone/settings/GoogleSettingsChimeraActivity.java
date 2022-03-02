package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleSettingsChimeraActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        startActivity(new Intent().setClassName(this, "com.google.android.gms.app.settings.BasicGoogleSettingsActivity"));
        finish();
    }
}
