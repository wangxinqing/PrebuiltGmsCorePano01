package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: dpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpd extends bhv implements dpf {
    public dpd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void a(Map map, long j, String str, List list) {
        Parcel aQ = aQ();
        aQ.writeMap(map);
        aQ.writeLong(j);
        aQ.writeString(str);
        aQ.writeTypedList(list);
        b(1, aQ);
    }
}
