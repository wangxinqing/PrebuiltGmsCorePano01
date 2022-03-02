package com.google.android.gms.people.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataLayerInternalSettingsChimeraActivity extends bjs {
    private xra a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class DataLayerSettingsOperation extends hea {
        public final GoogleSettingsItem b() {
            xip.a();
            if (((Boolean) xhx.a.a()).booleanValue()) {
                Intent intent = new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS");
                intent.putExtra("settings_mode", 2);
                GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, "APDL Debug", 5);
                googleSettingsItem.g = true;
                return googleSettingsItem;
            }
            GoogleSettingsItem googleSettingsItem2 = new GoogleSettingsItem(new Intent("com.google.android.gms.people.settings.DATA_LAYER_SETTINGS"), 2, "APDL Debug", 5);
            googleSettingsItem2.g = true;
            return googleSettingsItem2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xra xra = new xra(true);
        this.a = xra;
        xra.a(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.addView(this.a.a(getLayoutInflater(), viewGroup));
    }
}
