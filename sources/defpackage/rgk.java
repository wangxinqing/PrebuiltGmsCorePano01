package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
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

/* renamed from: rgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface rgk extends IInterface {
    ActivityRecognitionResult a(String str);

    void a(long j, boolean z, PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent);

    void a(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, ifu ifu);

    void a(PendingIntent pendingIntent, ifu ifu);

    void a(PendingIntent pendingIntent, rgh rgh, String str);

    void a(Location location);

    void a(Location location, int i);

    void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, ifu ifu);

    void a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, ifu ifu);

    void a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, rgh rgh);

    void a(LocationRequest locationRequest, PendingIntent pendingIntent);

    void a(LocationRequest locationRequest, ref ref);

    void a(LocationRequest locationRequest, ref ref, String str);

    void a(LocationSettingsRequest locationSettingsRequest, rgn rgn, String str);

    void a(RemoveGeofencingRequest removeGeofencingRequest, rgh rgh);

    void a(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    void a(LocationRequestInternal locationRequestInternal, ref ref);

    void a(LocationRequestUpdateData locationRequestUpdateData);

    void a(ifu ifu);

    void a(List list, PendingIntent pendingIntent, rgh rgh);

    void a(ref ref);

    void a(rge rge);

    void a(rgh rgh);

    void a(boolean z);

    void a(String[] strArr, rgh rgh, String str);

    boolean a(int i);

    @Deprecated
    Location b();

    Location b(String str);

    void b(PendingIntent pendingIntent);

    void b(PendingIntent pendingIntent, ifu ifu);

    int c();

    LocationAvailability c(String str);

    void c(PendingIntent pendingIntent);

    void c(PendingIntent pendingIntent, ifu ifu);

    @Deprecated
    Location d();

    @Deprecated
    void d(PendingIntent pendingIntent, ifu ifu);

    void e(PendingIntent pendingIntent, ifu ifu);
}
