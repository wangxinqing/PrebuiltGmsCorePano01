package com.google.android.gms.usagereporting.ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingDebugChimeraActivity extends Activity {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class UsageReportingDebugOperation extends hea {
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.usagereporting.UR_SETTINGS"), 2, getResources().getString(R.string.usage_reporting_debug_title), 59);
            googleSettingsItem.g = true;
            return googleSettingsItem;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.usage_reporting_debug_settings);
        Button button = (Button) findViewById(R.id.crash_button);
        button.getBackground().setColorFilter(-65536, PorterDuff.Mode.MULTIPLY);
        button.setOnClickListener(new adtq());
        ((Button) findViewById(R.id.reset_button)).setOnClickListener(new adtr());
        setTitle((int) R.string.usage_reporting_debug_title);
    }
}
