package defpackage;

import android.content.Context;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

@Deprecated
/* renamed from: ajrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrk implements adyo {
    private final ajrm a;
    private final Context b;

    public ajrk(ajrm ajrm, Context context) {
        this.a = ajrm;
        this.b = context;
    }

    public final void a(MessageEventParcelable messageEventParcelable) {
        if ("com/google/android/location/fused/wearable/LOCATION_REQUESTS".equals(messageEventParcelable.b)) {
            adyn a2 = adyn.a(messageEventParcelable.c);
            this.a.a(messageEventParcelable.d, ajrj.a(a2, this.b), a2.c("TRIGGER_UPDATE"));
        }
    }
}
