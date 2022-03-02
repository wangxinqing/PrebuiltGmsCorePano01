package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: ahre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahre {
    public static final Pattern a = Pattern.compile("com.google.android.apps.maps.*");
    public static final Map b;

    static {
        ahrd ahrd = new ahrd("com.google.android.apps.modis", false, true, ahup.C, false);
        ahrd ahrd2 = new ahrd("com.google.android.apps.activitydatacollection", false, true, ahup.C, false);
        ahrd ahrd3 = new ahrd("com.google.android.apps.maps", false, true, ahup.C, false);
        ahrd ahrd4 = new ahrd("com.google.android.gms", false, true, ahup.C, false);
        ahrd ahrd5 = new ahrd("com.google.nlpdemoapp", false, true, ahup.C, false);
        ahrd ahrd6 = new ahrd("com.google.android.apps.location.khamsin", false, true, ahup.C, false);
        ahrd ahrd7 = new ahrd("com.google.android.apps.highfive", false, false, ahup.C, false);
        ahrd ahrd8 = new ahrd("com.google.location.lbs.collectionlib", true, false, ahup.a(ahup.WIFI, ahup.CELL, ahup.ACCELEROMETER, ahup.GPS, ahup.GPS_SATELLITE, ahup.GNSS_MEASUREMENTS, ahup.GNSS_NAVIGATION_MESSAGE, ahup.ACCELEROMETER, ahup.GYROSCOPE, ahup.MAGNETIC_FIELD, ahup.BAROMETER), true);
        ahrd ahrd9 = new ahrd("com.google.location.lbs.activityclassifierapp", false, false, ahup.C, false);
        ahrd ahrd10 = new ahrd("com.google.android.apps.activityhistory", true, false, ahup.C, false);
        ahrd ahrd11 = new ahrd("com.google.android.apps.activityhistory.dogfood", true, false, ahup.C, false);
        ahrd ahrd12 = new ahrd("com.google.android.context.activity.dnd", true, false, ahup.C, false);
        ahrd ahrd13 = new ahrd("com.google.android.apps.location.context.activity.zen", true, false, ahup.C, false);
        ahrd ahrd14 = new ahrd("com.google.android.apps.location.context.activity.sleep", true, false, ahup.C, false);
        HashMap hashMap = new HashMap();
        hashMap.put(ahrd.a, ahrd);
        hashMap.put(ahrd2.a, ahrd2);
        hashMap.put(ahrd3.a, ahrd3);
        hashMap.put(ahrd4.a, ahrd4);
        hashMap.put(ahrd7.a, ahrd7);
        hashMap.put(ahrd8.a, ahrd8);
        hashMap.put(ahrd5.a, ahrd5);
        hashMap.put(ahrd6.a, ahrd6);
        hashMap.put(ahrd9.a, ahrd9);
        hashMap.put(ahrd10.a, ahrd10);
        hashMap.put(ahrd11.a, ahrd10);
        hashMap.put(ahrd12.a, ahrd12);
        hashMap.put(ahrd13.a, ahrd13);
        hashMap.put(ahrd14.a, ahrd14);
        b = Collections.unmodifiableMap(hashMap);
    }
}
