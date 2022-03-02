package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigChimeraService extends qwf {
    private static volatile hel a = null;

    public static hel b() {
        hel hel = a;
        if (hel == null) {
            synchronized (ConfigChimeraService.class) {
                hel = a;
                if (hel == null) {
                    hel = new hel();
                    a = hel;
                }
            }
        }
        return hel;
    }

    public final int a(qxz qxz) {
        int i;
        int i2;
        synchronized (this) {
            hef a2 = hef.a((Context) this);
            Bundle bundle = qxz.b;
            i = 0;
            if (bundle != null) {
                i2 = bundle.getInt("reason", 0);
            } else {
                i2 = 0;
            }
            int i3 = new int[]{1, 2, 3, 4, 5, 6}[i2];
            if (bundle != null && bundle.getBoolean("allowRetry", false)) {
                b();
                a2.a(0);
            }
            if (!"ChimeraConfigService_OneOffRetry".equals(qxz.a)) {
                qwq.a((Context) this).a("ChimeraConfigService_OneOffRetry", "com.google.android.gms.chimera.container.ConfigService");
            }
            try {
                if (!hek.a((Context) this).a(i3, a2, (List) amzy.h())) {
                    i = 2;
                }
            } finally {
                b();
                hel.a((Context) this, a2);
            }
        }
        return i;
    }

    public final void aH() {
        Intent startIntent = IntentOperation.getStartIntent((Context) this, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN");
        amtf.a((Object) startIntent);
        startService(startIntent);
    }
}
