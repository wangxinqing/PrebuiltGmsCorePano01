package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjy extends bhv implements rka {
    public rjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void b(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        c(2, aQ);
    }

    public final void c(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        c(3, aQ);
    }

    public final void d(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        c(5, aQ);
    }

    public final void a(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        c(1, aQ);
    }
}
