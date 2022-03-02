package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;

/* renamed from: advh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advh extends bhv implements advj {
    public advh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient");
    }

    public final void a(UserLocationParameters userLocationParameters, advf advf, CheckInReport checkInReport) {
        throw null;
    }

    public final void a(UserLocationParameters userLocationParameters, advg advg) {
        throw null;
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, advg advg, SemanticLocationUpdateRequest semanticLocationUpdateRequest) {
        throw null;
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, CheckInReport checkInReport) {
        throw null;
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        throw null;
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        throw null;
    }

    public final void b(UserLocationParameters userLocationParameters, advg advg) {
        throw null;
    }

    public final void b(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        throw null;
    }

    public final void c(UserLocationParameters userLocationParameters, ifu ifu, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        b(11, aQ);
    }

    public final void b(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(13, aQ);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(9, aQ);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) placefencingRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(10, aQ);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) semanticLocationEventRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (Parcelable) pendingIntent2);
        b(8, aQ);
    }

    public final void a(UserLocationParameters userLocationParameters, ifu ifu, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userLocationParameters);
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) userLocationNearbyAlertRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (Parcelable) pendingIntent2);
        b(12, aQ);
    }
}
