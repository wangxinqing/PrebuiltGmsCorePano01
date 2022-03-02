package com.google.android.location.util;

import android.content.Context;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationAccuracyChimeraInjectorService extends SettingInjectorService {
    public LocationAccuracyChimeraInjectorService() {
        super("LocationAccuracySettingsInjectorService");
    }

    public final boolean onGetEnabled() {
        return jkr.g();
    }

    public final String onGetSummary() {
        int i;
        if (!jkr.h() || !ayct.a.a().showSummaryForLocationAccuracy()) {
            return null;
        }
        boolean a = rns.a((Context) this);
        if (!ayct.a.a().showOnOffStatusForLocationAccuracy()) {
            i = a ? R.string.location_accuracy_summary_text_on : R.string.location_accuracy_summary_text_off;
        } else {
            i = a ? R.string.common_on : R.string.common_off;
        }
        return getString(i);
    }
}
