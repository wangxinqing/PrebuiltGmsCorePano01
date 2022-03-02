package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChannelEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adzq();
    final ChannelImpl a;
    final int b;
    final int c;
    final int d;

    public ChannelEventParcelable(ChannelImpl channelImpl, int i, int i2, int i3) {
        this.a = channelImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(adyh adyh) {
        int i = this.b;
        if (i == 1) {
            adyh.a(this.a);
        } else if (i == 2) {
            adyh.b(this.a);
        } else if (i == 3) {
            adyh.c(this.a);
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unknown type: ");
            sb.append(i);
            Log.w("ChannelEventParcelable", sb.toString());
        } else {
            adyh.d(this.a);
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED";
        } else {
            str = "CHANNEL_OPENED";
        }
        int i2 = this.c;
        if (i2 != 0) {
            str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED";
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(str);
        sb.append(", closeReason=");
        sb.append(str2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
