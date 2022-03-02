package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.gms.userlocation.internal.UserLocationParameters;

/* renamed from: advj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface advj extends IInterface {
    void a(UserLocationParameters userLocationParameters, advf advf, CheckInReport checkInReport);

    void a(UserLocationParameters userLocationParameters, advg advg);

    void a(UserLocationParameters userLocationParameters, ifu ifu, advg advg, SemanticLocationUpdateRequest semanticLocationUpdateRequest);

    void a(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent);

    void a(UserLocationParameters userLocationParameters, ifu ifu, PlacefencingRequest placefencingRequest, PendingIntent pendingIntent);

    void a(UserLocationParameters userLocationParameters, ifu ifu, CheckInReport checkInReport);

    void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent);

    void a(UserLocationParameters userLocationParameters, ifu ifu, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    void a(UserLocationParameters userLocationParameters, ifu ifu, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2);

    void a(UserLocationParameters userLocationParameters, ifu ifu, String str);

    void b(UserLocationParameters userLocationParameters, advg advg);

    void b(UserLocationParameters userLocationParameters, ifu ifu, PendingIntent pendingIntent);

    void b(UserLocationParameters userLocationParameters, ifu ifu, String str);

    void c(UserLocationParameters userLocationParameters, ifu ifu, String str);
}
