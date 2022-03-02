package com.google.android.gms.accountsettings.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ZeroPartyEntryPointChimeraActivity extends dij {
    static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.accountsettings.ui.PrivacyHubActivityControlsActivity");

    private final boolean v() {
        return "com.android.settings.action.VIEW_ACCOUNT".equals(getIntent().getAction());
    }

    private final boolean w() {
        return csp.a(getIntent().getStringExtra("extra.screen.screenFlavor")) == 2;
    }

    private final boolean x() {
        return g.equals(getIntent().getComponent());
    }

    /* access modifiers changed from: protected */
    public final void e() {
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return true;
    }

    public final boolean i() {
        return v() || w();
    }

    public final aqsr j() {
        aqsr j = super.j();
        if (v()) {
            aucd aucd = (aucd) j.c(5);
            aucd.a((aucj) j);
            aqsp aqsp = (aqsp) aucd;
            if (aqsp.c) {
                aqsp.c();
                aqsp.c = false;
            }
            aqsr aqsr = (aqsr) aqsp.b;
            aqsr aqsr2 = aqsr.d;
            aqsr.a |= 1;
            aqsr.b = 524;
            aqsp.a("screenFlavor", Integer.toString(1));
            return (aqsr) aqsp.i();
        } else if (!x()) {
            return j;
        } else {
            aucd aucd2 = (aucd) j.c(5);
            aucd2.a((aucj) j);
            aqsp aqsp2 = (aqsp) aucd2;
            if (aqsp2.c) {
                aqsp2.c();
                aqsp2.c = false;
            }
            aqsr aqsr3 = (aqsr) aqsp2.b;
            aqsr aqsr4 = aqsr.d;
            aqsr3.a |= 1;
            aqsr3.b = 212;
            return (aqsr) aqsp2.i();
        }
    }

    /* access modifiers changed from: protected */
    public final Bundle l() {
        Bundle l = super.l();
        if (awgy.i()) {
            if (v()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", "identity-disc");
            } else if (x()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", "privacy-hub");
            } else if (w()) {
                l.putString("extra.utmSource", "android-settings");
                l.putString("extra.utmMedium", "google");
            }
        }
        return super.l();
    }

    public final String q() {
        if (!awgy.i()) {
            return jhg.a((Activity) this);
        }
        Intent intent = getIntent();
        return (intent == null || !intent.hasExtra("extra.callingPackageName")) ? "com.google.android.gms" : intent.getStringExtra("extra.callingPackageName");
    }

    /* access modifiers changed from: protected */
    public final int u() {
        return 3;
    }
}
