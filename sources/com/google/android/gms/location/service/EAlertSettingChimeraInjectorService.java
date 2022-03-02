package com.google.android.gms.location.service;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EAlertSettingChimeraInjectorService extends SettingInjectorService {
    public EAlertSettingChimeraInjectorService() {
        super("EAlertSettingInjectorService");
        new rms();
    }

    public final boolean onGetEnabled() {
        ayae.c();
        return false;
    }

    public final String onGetSummary() {
        ayae.c();
        return getString(R.string.common_off);
    }
}
