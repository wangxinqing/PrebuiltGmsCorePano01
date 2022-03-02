package com.google.android.gms.smartdevice.common;

import android.content.Context;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupDeviceSettingsIntentOperation extends hea {
    public final List a() {
        return Collections.singletonList(new GoogleSettingsItem(TargetChimeraActivity.a(getApplicationContext()).putExtra("smartdevice.theme", "glif_v2_light"), 2, "SmartDevice Target flow", 55));
    }

    public final GoogleSettingsItem b() {
        if (jix.a((Context) this) || jix.e(this)) {
            return null;
        }
        jix.g(this);
        jix.i(this);
        jix.h(this);
        return null;
    }
}
