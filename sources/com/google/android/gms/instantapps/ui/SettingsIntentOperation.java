package com.google.android.gms.instantapps.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.instantapps.internal.OptInInfo;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsIntentOperation extends hea {
    private static final qfn a = new qfn("SettingsIntentOperation");

    public final GoogleSettingsItem b() {
        if (!qld.a(this).a()) {
            a.b("Killed with a switch", new Object[0]);
        } else {
            acwa e = qdy.b(this).e();
            try {
                acws.a(e);
                if (((OptInInfo) e.d()).c.length == 0) {
                    a.b("No accounts", new Object[0]);
                } else {
                    Intent intent = new Intent("com.google.android.instantapps.supervisor.SETTINGS_ACTIVITY");
                    if (jkr.e() || axuy.a.a().d()) {
                        String g = axuy.g();
                        String f = axuy.f();
                        if (TextUtils.isEmpty(g) || TextUtils.isEmpty(f)) {
                            a.b("Cannot find settings page in O+", new Object[0]);
                            return null;
                        }
                        intent.setClassName(g, f);
                    } else {
                        intent.setClassName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.SettingsActivity");
                        if (!qfm.a((Context) this)) {
                            if (axvn.b()) {
                                intent = qfm.a(intent);
                            } else {
                                a.b("Cannot find settings page pre-O", new Object[0]);
                                return null;
                            }
                        }
                    }
                    GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 4, (int) R.string.instantapps_module_display_name, 31);
                    googleSettingsItem.f = true;
                    googleSettingsItem.a();
                    googleSettingsItem.n = SettingsChimeraActivity.class.getName();
                    googleSettingsItem.b();
                    return googleSettingsItem;
                }
            } catch (InterruptedException | ExecutionException e2) {
                a.a(e2, "Cannot display Instant Apps settings.", new Object[0]);
            }
        }
        return null;
    }
}
