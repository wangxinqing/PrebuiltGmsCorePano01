package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.Channel;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChannelImpl extends AbstractSafeParcelable implements Channel, Parcelable {
    public static final Parcelable.Creator CREATOR = new adzr();
    public final String a;
    public final String b;
    public final String c;

    public ChannelImpl(String str, String str2, String str3) {
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) str2);
        this.b = str2;
        iva.a((Object) str3);
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChannelImpl) {
            ChannelImpl channelImpl = (ChannelImpl) obj;
            return this.a.equals(channelImpl.a) && ius.a(channelImpl.b, this.b) && ius.a(channelImpl.c, this.c);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c2 : this.a.toCharArray()) {
            i += c2;
        }
        String trim = this.a.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(i);
            trim = sb.toString();
        }
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 31 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb2.append("Channel{token=");
        sb2.append(trim);
        sb2.append(", nodeId=");
        sb2.append(str);
        sb2.append(", path=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
