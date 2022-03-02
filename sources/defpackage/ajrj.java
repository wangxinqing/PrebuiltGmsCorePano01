package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ajrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrj {
    public static Collection a(adyn adyn, Context context) {
        ArrayList arrayList;
        String str;
        String[] strArr;
        ClientIdentity clientIdentity;
        float f;
        adyn adyn2 = adyn;
        if (!adyn2.a("REQUEST_LIST")) {
            if (Log.isLoggable("FlpConverters", 6)) {
                Log.e("FlpConverters", "malformed DataMap: missing key REQUEST_LIST");
            }
            return Collections.emptyList();
        }
        Object obj = adyn2.a.get("REQUEST_LIST");
        if (obj != null) {
            try {
                arrayList = (ArrayList) obj;
            } catch (ClassCastException e) {
                adyn.a("REQUEST_LIST", obj, "ArrayList<DataMap>", e);
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            adyn adyn3 = (adyn) arrayList.get(i);
            LocationRequest a = LocationRequest.a();
            if (adyn3.a("PRIORITY")) {
                a.c(adyn3.d("PRIORITY"));
            }
            if (adyn3.a("INTERVAL_MS")) {
                a.c(adyn3.e("INTERVAL_MS"));
            }
            if (adyn3.a("FASTEST_INTERVAL_MS")) {
                a.b(adyn3.e("FASTEST_INTERVAL_MS"));
            }
            if (adyn3.a("MAX_WAIT_TIME_MS")) {
                a.d(adyn3.e("MAX_WAIT_TIME_MS"));
            }
            if (adyn3.a("SMALLEST_DISPLACEMENT_METERS")) {
                Object obj2 = adyn3.a.get("SMALLEST_DISPLACEMENT_METERS");
                if (obj2 != null) {
                    try {
                        f = ((Float) obj2).floatValue();
                    } catch (ClassCastException e2) {
                        adyn.a("SMALLEST_DISPLACEMENT_METERS", obj2, "Float", Float.valueOf(0.0f), e2);
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                if (f >= 0.0f) {
                    a.g = f;
                } else {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("invalid displacement: ");
                    sb.append(f);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (adyn3.a("NUM_UPDATES")) {
                a.b(adyn3.d("NUM_UPDATES"));
            }
            if (adyn3.a("EXPIRATION_DURATION_MS")) {
                long e3 = adyn3.e("EXPIRATION_DURATION_MS");
                if (e3 < Long.MAX_VALUE) {
                    e3 += SystemClock.elapsedRealtime();
                }
                a.a(e3);
            }
            LocationRequestInternal a2 = LocationRequestInternal.a((String) null, a);
            if (adyn3.a("CLIENTS_PACKAGE_ARRAY") && context != null) {
                Object obj3 = adyn3.a.get("CLIENTS_PACKAGE_ARRAY");
                if (obj3 != null) {
                    try {
                        strArr = (String[]) obj3;
                    } catch (ClassCastException e4) {
                        adyn.a("CLIENTS_PACKAGE_ARRAY", obj3, "String[]", e4);
                        strArr = null;
                    }
                } else {
                    strArr = null;
                }
                ArrayList arrayList3 = new ArrayList(r12);
                for (String str2 : strArr) {
                    try {
                        clientIdentity = new ClientIdentity(jni.b(context).a(str2, 0).uid, str2);
                    } catch (PackageManager.NameNotFoundException e5) {
                        if (Log.isLoggable("FlpConverters", 5)) {
                            String valueOf = String.valueOf(str2);
                            Log.w("FlpConverters", valueOf.length() == 0 ? new String("received client identity unknown on device: ") : "received client identity unknown on device: ".concat(valueOf));
                        }
                        clientIdentity = new ClientIdentity(context.getApplicationInfo().uid, context.getPackageName());
                    }
                    arrayList3.add(clientIdentity);
                }
                a2.a((List) arrayList3);
            }
            if (adyn3.a("TAG")) {
                Object obj4 = adyn3.a.get("TAG");
                if (obj4 != null) {
                    try {
                        str = (String) obj4;
                    } catch (ClassCastException e6) {
                        adyn.a("TAG", obj4, "String", e6);
                        str = null;
                    }
                } else {
                    str = null;
                }
                a2.d = str;
            }
            arrayList2.add(a2);
        }
        return arrayList2;
    }

    public static void a(adyn adyn, Location location) {
        adyn.a("PROVIDER", location.getProvider());
        adyn.a("LATITUDE", location.getLatitude());
        adyn.a("LONGITUDE", location.getLongitude());
        adyn.a("TIME_NS", location.getTime());
        int i = Build.VERSION.SDK_INT;
        adyn.a("ELAPSED_REALTIME_NS", location.getElapsedRealtimeNanos());
        if (location.hasAccuracy()) {
            adyn.a("ACCURACY", location.getAccuracy());
        }
        if (location.hasBearing()) {
            adyn.a("BEARING", location.getBearing());
        }
        if (location.hasSpeed()) {
            adyn.a("SPEED", location.getSpeed());
        }
        if (location.hasAltitude()) {
            adyn.a("ALTITUDE", location.getAltitude());
        }
        if (rev.j(location)) {
            adyn.a("MOCK", true);
        }
        int i2 = rev.i(location);
        if (i2 != 0) {
            adyn.a("TYPE", i2);
        }
        Location a = rev.a(location, "noGPSLocation");
        if (a != null) {
            adyn adyn2 = new adyn();
            a(adyn2, a);
            adyn.a("NO_GPS_LOCATION", adyn2);
        }
    }
}
