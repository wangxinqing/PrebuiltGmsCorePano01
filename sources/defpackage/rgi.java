package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

/* renamed from: rgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgi extends bhv implements rgk {
    public rgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final ActivityRecognitionResult a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(64, aQ);
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) bhx.a(a, ActivityRecognitionResult.CREATOR);
        a.recycle();
        return activityRecognitionResult;
    }

    public final void a(long j, boolean z, PendingIntent pendingIntent) {
        throw null;
    }

    public final void a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, ifu ifu) {
        throw null;
    }

    public final void a(Location location) {
        throw null;
    }

    public final void a(Location location, int i) {
        throw null;
    }

    public final void a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        throw null;
    }

    public final void a(LocationRequest locationRequest, ref ref) {
        throw null;
    }

    public final void a(LocationRequest locationRequest, ref ref, String str) {
        throw null;
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        throw null;
    }

    public final void a(LocationRequestInternal locationRequestInternal, ref ref) {
        throw null;
    }

    public final void a(ifu ifu) {
        throw null;
    }

    public final void a(List list, PendingIntent pendingIntent, rgh rgh) {
        throw null;
    }

    public final void a(ref ref) {
        throw null;
    }

    public final void a(rgh rgh) {
        throw null;
    }

    public final void a(boolean z) {
        throw null;
    }

    public final Location b() {
        Parcel a = a(7, aQ());
        Location location = (Location) bhx.a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    public final void b(PendingIntent pendingIntent) {
        throw null;
    }

    public final void b(PendingIntent pendingIntent, ifu ifu) {
        throw null;
    }

    public final int c() {
        throw null;
    }

    public final void c(PendingIntent pendingIntent) {
        throw null;
    }

    public final void c(PendingIntent pendingIntent, ifu ifu) {
        throw null;
    }

    public final Location d() {
        throw null;
    }

    public final void d(PendingIntent pendingIntent, ifu ifu) {
        throw null;
    }

    public final void e(PendingIntent pendingIntent, ifu ifu) {
        throw null;
    }

    public final Location b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(80, aQ);
        Location location = (Location) bhx.a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    public final LocationAvailability c(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(34, aQ);
        LocationAvailability locationAvailability = (LocationAvailability) bhx.a(a, LocationAvailability.CREATOR);
        a.recycle();
        return locationAvailability;
    }

    public final void a(PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) pendingIntent);
        b(6, aQ);
    }

    public final void a(PendingIntent pendingIntent, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) ifu);
        b(73, aQ);
    }

    public final void a(PendingIntent pendingIntent, rgh rgh, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rgh);
        aQ.writeString(str);
        b(2, aQ);
    }

    public final void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) activityRecognitionRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) ifu);
        b(70, aQ);
    }

    public final void a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) activityTransitionRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) ifu);
        b(72, aQ);
    }

    public final void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, rgh rgh) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) geofencingRequest);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rgh);
        b(57, aQ);
    }

    public final void a(LocationSettingsRequest locationSettingsRequest, rgn rgn, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) locationSettingsRequest);
        bhx.a(aQ, (IInterface) rgn);
        aQ.writeString(str);
        b(63, aQ);
    }

    public final void a(RemoveGeofencingRequest removeGeofencingRequest, rgh rgh) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) removeGeofencingRequest);
        bhx.a(aQ, (IInterface) rgh);
        b(74, aQ);
    }

    public final void a(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) deviceOrientationRequestUpdateData);
        b(75, aQ);
    }

    public final void a(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) locationRequestUpdateData);
        b(59, aQ);
    }

    public final void a(rge rge) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rge);
        b(67, aQ);
    }

    public final void a(String[] strArr, rgh rgh, String str) {
        Parcel aQ = aQ();
        aQ.writeStringArray(strArr);
        bhx.a(aQ, (IInterface) rgh);
        aQ.writeString(str);
        b(3, aQ);
    }

    public final boolean a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        Parcel a = a(77, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
