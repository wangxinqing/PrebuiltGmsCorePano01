package com.google.android.location.settings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.R;
import com.google.android.gms.location.ActivityTransitionResult;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingConditionChimeraProvider extends ajpe implements ahnq {
    private ahnr b;

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.location.settings.DrivingConditionProvider";
    }

    public final String b() {
        return "driving";
    }

    public final /* bridge */ /* synthetic */ ajpd c() {
        return new ajpd(false, (int) aycw.c());
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        if (!axzs.c()) {
            return null;
        }
        return onBind;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        ahnr ahnr = this.b;
        if (!(ahnr == null || intent == null || intent.getAction() == null || !ActivityTransitionResult.a(intent))) {
            int i3 = -1;
            if (axxd.e()) {
                i3 = intent.getIntExtra("AR_AUDIO_FUSION_RESULT", -1);
            }
            int a = ahnr.c.a(ActivityTransitionResult.b(intent), i3);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 1) {
                ahnr.b.a(true);
            } else if (i4 == 2) {
                ahnr.b.a(false);
            }
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        if (this.b == null) {
            this.b = new ahnr(this, this);
        }
        if (aycw.b()) {
            ahol.a((Context) this).a(true, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i) {
        ahnr ahnr = this.b;
        if (ahnr != null) {
            Context context = ahnr.a;
            acwa b2 = rcd.a(context).b(PendingIntent.getService(context, 0, ahnp.a(context), 0));
            b2.a((acvv) new ahnn());
            b2.a((acvs) new ahno());
            this.b = null;
        }
        if (aycw.b()) {
            ahol.a((Context) this).a(false, i);
        }
    }

    public final void a(boolean z) {
        a(z, getString(R.string.dnd_state_driving));
        if (!axzs.c()) {
            d();
        }
    }
}
