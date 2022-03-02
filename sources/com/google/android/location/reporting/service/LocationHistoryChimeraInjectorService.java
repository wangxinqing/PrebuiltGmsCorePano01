package com.google.android.location.reporting.service;

import android.accounts.Account;
import android.content.Context;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationHistoryChimeraInjectorService extends SettingInjectorService {
    public LocationHistoryChimeraInjectorService() {
        super("LocationHistoryReportingInjectorService");
    }

    public final boolean onGetEnabled() {
        return jjy.a(this) && !jgu.e(this);
    }

    public final String onGetSummary() {
        int i;
        if (jkr.h() && ayct.a.a().showSummaryForLocationHistory()) {
            List d = jgu.d(this, getPackageName());
            if (d.size() == 1) {
                if (!rma.a(ajmm.a((Context) this).a((Account) d.get(0)).b())) {
                    i = R.string.common_off;
                } else {
                    i = R.string.common_on;
                }
                return getString(i);
            }
        }
        return null;
    }
}
