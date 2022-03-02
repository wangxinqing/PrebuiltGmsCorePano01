package com.google.android.gms.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gtk();
    public final int a;
    public final int b;
    public final long c;
    public final List d;
    public WorkSource e;
    public int f;

    public BleSettings(int i, int i2, long j, List list, WorkSource workSource, int i3) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = list;
        this.e = workSource;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BleSettings) {
            BleSettings bleSettings = (BleSettings) obj;
            return this.a == bleSettings.a && this.b == bleSettings.b && this.c == bleSettings.c && ius.a(this.d, bleSettings.d) && ius.a(this.e, bleSettings.e) && this.f == bleSettings.f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f)});
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.a;
        if (i == 0) {
            str = "LOW_POWER";
        } else if (i == 1) {
            str = "BALANCED";
        } else if (i == 2) {
            str = "LOW_LATENCY";
        } else if (i != 3) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("UNKNOWN(");
            sb.append(i);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "ZERO_POWER";
        }
        int i2 = this.b;
        if (i2 == 1) {
            str2 = "ALL_MATCHES";
        } else if (i2 == 2) {
            str2 = "FIRST_MATCH";
        } else if (i2 == 4) {
            str2 = "LOST";
        } else if (i2 != 6) {
            StringBuilder sb2 = new StringBuilder(20);
            sb2.append("UNKNOWN: ");
            sb2.append(i2);
            str2 = sb2.toString();
        } else {
            str2 = "FIRST_MATCH | LOST";
        }
        long j = this.c;
        int size = this.d.size();
        int size2 = jlr.b(this.e).size();
        switch (this.f) {
            case 1:
                str3 = "Nearby";
                break;
            case 2:
                str3 = "Places";
                break;
            case 3:
                str3 = "ULR";
                break;
            case 4:
                str3 = "Test app";
                break;
            case 5:
                str3 = "Tests";
                break;
            case 6:
                str3 = "Other";
                break;
            case 7:
                str3 = "ProximityAuth";
                break;
            case 8:
                str3 = "GLS";
                break;
            case 9:
                str3 = "FLP";
                break;
            default:
                str3 = "Unknown";
                break;
        }
        int length = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 140 + String.valueOf(str2).length() + str3.length());
        sb3.append("BleSettings [scanMode=");
        sb3.append(str);
        sb3.append(", callbackType=");
        sb3.append(str2);
        sb3.append(", reportDelayMillis=");
        sb3.append(j);
        sb3.append(", ");
        sb3.append(size);
        sb3.append(" filters, ");
        sb3.append(size2);
        sb3.append(" clients, callingClientName=");
        sb3.append(str3);
        sb3.append("]");
        return sb3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.c(parcel, 6, this.d, false);
        ivx.a(parcel, 7, this.e, i, false);
        ivx.b(parcel, 8, this.f);
        ivx.b(parcel, a2);
    }
}
