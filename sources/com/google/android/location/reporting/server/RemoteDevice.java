package com.google.android.location.reporting.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajkz();
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Long e;
    public final Long f;

    public RemoteDevice(int i, String str, boolean z, boolean z2, Long l, Long l2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteDevice) {
            RemoteDevice remoteDevice = (RemoteDevice) obj;
            return this.a == remoteDevice.a && this.c == remoteDevice.c && this.d == remoteDevice.d && atiu.a(this.b, remoteDevice.b) && atiu.a(this.e, remoteDevice.e) && atiu.a(this.f, remoteDevice.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 141 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RemoteDevice{mDeviceTag=");
        sb.append(i);
        sb.append(",mPrettyName='");
        sb.append(str);
        sb.append("',mIsRestricted=");
        sb.append(z);
        sb.append(",mIsReportingEnabled=");
        sb.append(z2);
        sb.append(",mLastReportTimeMs=");
        sb.append(valueOf);
        sb.append(",mLastModificationTimeMs=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public RemoteDevice(ajky ajky) {
        this.a = ajky.a;
        this.b = ajky.b;
        this.c = ajky.c.booleanValue();
        this.d = ajky.d.booleanValue();
        this.e = ajky.e;
        this.f = ajky.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
