package defpackage;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: swd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class swd implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ suf c;

    public swd(suf suf, EventParcel eventParcel, AppMetadata appMetadata) {
        this.c = suf;
        this.a = eventParcel;
        this.b = appMetadata;
    }

    public final void run() {
        EventParams eventParams;
        suf suf = this.c;
        EventParcel eventParcel = this.a;
        AppMetadata appMetadata = this.b;
        if (!(!"_cmp".equals(eventParcel.a) || (eventParams = eventParcel.b) == null || eventParams.a.size() == 0)) {
            String c2 = eventParcel.b.c("_cis");
            if (!TextUtils.isEmpty(c2) && (("referrer broadcast".equals(c2) || "referrer API".equals(c2)) && suf.a.d().b(appMetadata.a, sud.K))) {
                suf.a.E().i.a("Event has been filtered ", eventParcel.toString());
                eventParcel = new EventParcel("_cmpx", eventParcel.b, eventParcel.c, eventParcel.d);
            }
        }
        this.c.a.y();
        this.c.a.a(eventParcel, this.b);
    }
}
