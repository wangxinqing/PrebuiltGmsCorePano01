package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adyj();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean f;
    public volatile String g;
    public boolean h;
    public String i;

    public ConnectionConfiguration(String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            if (!ius.a(this.a, connectionConfiguration.a) || !ius.a(this.b, connectionConfiguration.b) || !ius.a(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) || !ius.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) || !ius.a(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) || !ius.a(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.a);
        sb.append(valueOf.length() == 0 ? new String("mName=") : "mName=".concat(valueOf));
        String valueOf2 = String.valueOf(this.b);
        sb.append(valueOf2.length() == 0 ? new String(", mAddress=") : ", mAddress=".concat(valueOf2));
        int i2 = this.c;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i2);
        sb.append(sb2.toString());
        int i3 = this.d;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i3);
        sb.append(sb3.toString());
        boolean z = this.e;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.g);
        sb.append(valueOf3.length() == 0 ? new String(", mPeerNodeId=") : ", mPeerNodeId=".concat(valueOf3));
        boolean z3 = this.h;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.i);
        sb.append(valueOf4.length() == 0 ? new String(", mNodeId=") : ", mNodeId=".concat(valueOf4));
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i, false);
        ivx.b(parcel, a2);
    }
}
