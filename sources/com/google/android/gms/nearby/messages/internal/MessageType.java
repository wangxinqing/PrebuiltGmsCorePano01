package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessageType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vcs();
    final int a;
    public final String b;
    public final String c;

    public MessageType(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MessageType) && hashCode() == obj.hashCode()) {
            MessageType messageType = (MessageType) obj;
            return ius.a(this.b, messageType.b) && ius.a(this.c, messageType.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append("namespace=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        return sb.toString();
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
