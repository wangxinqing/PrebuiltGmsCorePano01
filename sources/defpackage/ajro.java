package defpackage;

import android.content.Context;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.location.wearable.WearableLocationChimeraService;
import java.util.Collection;

/* renamed from: ajro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajro implements adyo {
    final /* synthetic */ WearableLocationChimeraService a;

    public ajro() {
    }

    public ajro(WearableLocationChimeraService wearableLocationChimeraService) {
        this.a = wearableLocationChimeraService;
    }

    public final void a(MessageEventParcelable messageEventParcelable) {
        if ("com/google/android/location/fused/wearable/LOCATION_REQUESTS".equals(messageEventParcelable.b)) {
            adyn a2 = adyn.a(messageEventParcelable.c);
            Collection a3 = ajrj.a(a2, (Context) this.a);
            boolean c = a2.c("TRIGGER_UPDATE");
            this.a.a(messageEventParcelable.d, a3, c);
        }
    }
}
