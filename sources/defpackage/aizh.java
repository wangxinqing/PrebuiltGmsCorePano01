package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyLikelihood;
import com.google.android.location.places.NearbyAlertSubscription;
import com.google.android.places.Subscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: aizh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aizh implements akpc {
    final /* synthetic */ Context a;
    final /* synthetic */ akit b;
    final /* synthetic */ NearbyAlertSubscription c;

    public aizh(NearbyAlertSubscription nearbyAlertSubscription, Context context, akit akit) {
        this.c = nearbyAlertSubscription;
        this.a = context;
        this.b = akit;
    }

    public final PlacesParams a() {
        return this.c.c;
    }

    public final void a(int i, int i2, List list, Bundle bundle) {
        ArrayList arrayList;
        Bundle bundle2 = bundle;
        try {
            Context context = this.a;
            NearbyAlertSubscription nearbyAlertSubscription = this.c;
            PendingIntent pendingIntent = nearbyAlertSubscription.d;
            PendingIntent pendingIntent2 = nearbyAlertSubscription.e;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    akri akri = (akri) it.next();
                    arrayList.add(new UserLocationNearbyLikelihood(akri.a, akri.b, akri.c, akri.e));
                }
            } else {
                arrayList = null;
            }
            advb a2 = advb.a(i2, arrayList, i);
            Intent intent = new Intent();
            intent.putExtra("com.google.android.userlocation.extra.nearby_status", a2.a);
            List list2 = a2.b;
            if (list2 != null) {
                ivy.a((Iterable) list2, intent, "com.google.android.userlocation.extra.nearby_likelihoods");
            }
            intent.putExtra("com.google.android.userlocation.extra.nearby_transition", a2.c);
            if (bundle2 != null) {
                intent.putExtra("nearby_alert_debug_data", bundle2);
            }
            intent.putExtra("com.google.android.gms.userlocation.UserLocationNearbyAlertResult.LEGACY_CALL_INTENT_EXTRA", pendingIntent2);
            akva.a(context, intent, pendingIntent);
        } catch (PendingIntent.CanceledException e) {
            ((akiy) this.b).a((Subscription) this.c);
        }
    }
}
