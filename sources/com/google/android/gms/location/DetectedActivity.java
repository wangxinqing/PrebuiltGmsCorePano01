package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rcv();
    public static final Comparator a = new rcu();
    public static final int[] b = {9, 10};
    public static final int[] c = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22};
    int d;
    public int e;

    public DetectedActivity(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public static String a(int i) {
        if (i == 0) {
            return "IN_VEHICLE";
        }
        if (i == 1) {
            return "ON_BICYCLE";
        }
        if (i == 2) {
            return "ON_FOOT";
        }
        if (i == 3) {
            return "STILL";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        if (i == 5) {
            return "TILTING";
        }
        if (i == 7) {
            return "WALKING";
        }
        if (i == 8) {
            return "RUNNING";
        }
        if (i != 16) {
            return i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE";
        }
        return "IN_ROAD_VEHICLE";
    }

    public static boolean a(int i, boolean z) {
        return (!z && i == 0) || i == 16 || i == 17;
    }

    public static boolean b(int i) {
        return a(i, true);
    }

    public final int a() {
        int i = this.d;
        if (i <= 22 && i >= 0) {
            return i;
        }
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.d == detectedActivity.d && this.e == detectedActivity.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        String a2 = a(a());
        int i = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(a2);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.d);
        ivx.b(parcel, 2, this.e);
        ivx.b(parcel, a2);
    }
}
