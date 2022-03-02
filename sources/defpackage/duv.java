package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: duv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class duv extends bhv implements dux {
    public duv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public final void a(GetRecentContextCall$Response getRecentContextCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getRecentContextCall$Response);
        c(4, aQ);
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(1, aQ);
    }

    public final void a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        c(2, aQ);
    }
}
