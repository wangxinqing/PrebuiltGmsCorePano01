package defpackage;

import android.content.Context;
import com.google.android.location.reporting.collectors.HomeWorkNearbyAlertsHelper$NearbyAlertReceiver;

/* renamed from: ajhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajhb {
    public final ajmn a;
    public final ajjl b;
    public final Context c;
    public String d;
    public String e;
    public HomeWorkNearbyAlertsHelper$NearbyAlertReceiver f;
    public boolean g;
    public final ajha h;
    public ajll i;

    public ajhb(Context context, ajmn ajmn, ajha ajha, ajjl ajjl) {
        this.c = context;
        this.a = ajmn;
        this.h = ajha;
        this.b = ajjl;
    }

    public static final boolean b() {
        return aztb.q() || aztb.r();
    }

    public final void a() {
        if (this.g) {
            HomeWorkNearbyAlertsHelper$NearbyAlertReceiver homeWorkNearbyAlertsHelper$NearbyAlertReceiver = this.f;
            if (homeWorkNearbyAlertsHelper$NearbyAlertReceiver != null) {
                this.c.unregisterReceiver(homeWorkNearbyAlertsHelper$NearbyAlertReceiver);
                this.f = null;
            }
            this.b.a(ajnw.b(this.c, "com.google.android.location.reporting.ALIASED_PLACE_ALERT_AVAILABLE"));
            ajmn ajmn = this.a;
            ajmn.i = false;
            ajmn.j = false;
            this.g = false;
        }
    }
}
