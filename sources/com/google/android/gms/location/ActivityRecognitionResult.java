package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rcn();
    public List a;
    public long b;
    public long c;
    public int d;
    Bundle e;

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, i, bundle);
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List d2 = d(intent);
        if (d2 == null || d2.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean c(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
        }
        return false;
    }

    public static List d(Intent intent) {
        if (c(intent)) {
            return ivy.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.b == activityRecognitionResult.b && this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && ius.a(this.a, activityRecognitionResult.a) && a(this.e, activityRecognitionResult.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult b(android.content.Intent r3) {
        /*
            boolean r0 = a((android.content.Intent) r3)
            r1 = 0
            if (r0 == 0) goto L_0x0027
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0020
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = defpackage.ivy.a((byte[]) r0, (android.os.Parcelable.Creator) r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x0028
        L_0x0020:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            if (r0 != 0) goto L_0x0044
            java.util.List r3 = d(r3)
            if (r3 == 0) goto L_0x0043
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0043
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0043:
            return r1
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.b(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public final Bundle c() {
        Bundle bundle = this.e;
        if (bundle != null) {
            return (Bundle) bundle.clone();
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }

    public ActivityRecognitionResult(List list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "Must have at least 1 detected activity");
        iva.b((j <= 0 || j2 <= 0) ? false : z2, "Must set times");
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = bundle;
    }

    private static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (bundle2.containsKey(str)) {
                if (bundle.get(str) == null) {
                    if (bundle2.get(str) != null) {
                        return false;
                    }
                } else if (bundle.get(str) instanceof Bundle) {
                    if (!a(bundle.getBundle(str), bundle2.getBundle(str))) {
                        return false;
                    }
                } else if (!bundle.get(str).equals(bundle2.get(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public ActivityRecognitionResult(List list, long j, long j2, Bundle bundle) {
        this(list, j, j2, 0, bundle);
    }

    public final int a(int i) {
        for (DetectedActivity detectedActivity : this.a) {
            if (detectedActivity.a() == i) {
                return detectedActivity.e;
            }
        }
        return 0;
    }

    public final DetectedActivity b() {
        for (int i = 0; i < this.a.size(); i++) {
            DetectedActivity detectedActivity = (DetectedActivity) this.a.get(i);
            if ((detectedActivity.d != 2 || (a(7) <= 0 && a(8) <= 0)) && (detectedActivity.d != 0 || (a(16) <= 0 && a(17) <= 0))) {
                return detectedActivity;
            }
        }
        return (DetectedActivity) this.a.get(0);
    }

    public final DetectedActivity a() {
        return (DetectedActivity) this.a.get(0);
    }
}
