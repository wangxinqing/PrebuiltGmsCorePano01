package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appusage.AppUsageIntervals;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: ebx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebx extends bhv implements IInterface {
    public ebx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appusage.internal.IAppUsageCallbacks");
    }

    public final void a(Status status, AppUsageIntervals appUsageIntervals) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) appUsageIntervals);
        c(3, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(2, aQ);
    }
}
