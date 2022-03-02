package com.google.android.location.quake.stages;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsChangeListener$1 extends nla {
    final /* synthetic */ ajgq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsChangeListener$1(ajgq ajgq, String str) {
        super(str);
        this.a = ajgq;
    }

    public final void a(Context context, Intent intent) {
        int i = ajgq.b;
        intent.getAction();
        if (intent != null && intent.getAction() != null) {
            if (!intent.getAction().equals(ajgq.g()) && !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !intent.getAction().equals("android.intent.action.AIRPLANE_MODE")) {
                if (intent.getAction().equals("com.google.android.gms.phenotype.COMMITTED")) {
                    if (!"com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                        return;
                    }
                } else if ((!ayek.w() || !intent.getAction().equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) && (!ayab.m() || !intent.getAction().equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED"))) {
                    return;
                }
            }
            this.a.g.a();
        }
    }
}
