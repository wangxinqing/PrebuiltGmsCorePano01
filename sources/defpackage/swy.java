package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: swy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swy implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ sxd b;

    public swy(sxd sxd, Bundle bundle) {
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
        if (!sxd.x.q()) {
            sxd.E().k.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        UserAttributeParcel userAttributeParcel = new UserAttributeParcel(bundle.getString("name"), 0, (Object) null, (String) null);
        try {
            EventParcel a2 = sxd.x().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"));
            String string = bundle.getString("app_id");
            String string2 = bundle.getString("origin");
            long j = bundle.getLong("creation_timestamp");
            boolean z = bundle.getBoolean("active");
            String string3 = bundle.getString("trigger_event_name");
            String str = string3;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = r5;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(string, string2, userAttributeParcel, j, z, str, (EventParcel) null, bundle.getLong("trigger_timeout"), (EventParcel) null, bundle.getLong("time_to_live"), a2);
            sxd.d().a(conditionalUserPropertyParcel);
        } catch (IllegalArgumentException e) {
        }
    }
}
