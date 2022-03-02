package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: swx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swx implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ sxd b;

    public swx(sxd sxd, Bundle bundle) {
        this.b = sxd;
        this.a = bundle;
    }

    public final void run() {
        sxd sxd = this.b;
        Bundle bundle = this.a;
        sxd.h();
        sxd.l();
        iva.a((Object) bundle);
        iva.c(bundle.getString("name"));
        iva.c(bundle.getString("origin"));
        iva.a(bundle.get("value"));
        if (!sxd.x.q()) {
            sxd.E().k.a("Conditional property not set since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            EventParcel a2 = sxd.x().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0);
            EventParcel a3 = sxd.x().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0);
            EventParcel a4 = sxd.x().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0);
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = r3;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(bundle.getString("app_id"), bundle.getString("origin"), userAttributeParcel, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), a3, bundle.getLong("trigger_timeout"), a2, bundle.getLong("time_to_live"), a4);
            sxd.d().a(conditionalUserPropertyParcel);
        } catch (IllegalArgumentException e) {
        }
    }
}
