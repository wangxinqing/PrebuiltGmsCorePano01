package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UncertifiedNotificationChimeraActivity extends bjs {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!awit.a.a().a()) {
            if (awku.c()) {
                ijm.a(this, "glif_light");
                ijm.a((Activity) this, false, (Context) this);
            } else {
                ijm.a((Activity) this, "glif_light", false);
            }
            setContentView((int) R.layout.auth_uncertified_activity);
            GlifMinuteMaidLayout glifMinuteMaidLayout = (GlifMinuteMaidLayout) findViewById(R.id.setup_wizard_layout);
            glifMinuteMaidLayout.a(true);
            glifMinuteMaidLayout.a(getResources().getString(R.string.common_ok), 5, new gmq(this));
            return;
        }
        if (awku.c()) {
            ijm.a(this, "glif_v3_light");
            ijm.a((Activity) this, false, (Context) this);
        } else {
            ijm.a((Activity) this, "glif_v3_light", false);
        }
        setContentView((int) R.layout.auth_uncertified_activity_v2);
        ((Button) findViewById(R.id.finishButton)).setOnClickListener(new gmp(this));
    }
}
