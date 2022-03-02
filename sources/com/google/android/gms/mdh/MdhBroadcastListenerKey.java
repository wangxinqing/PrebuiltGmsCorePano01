package com.google.android.gms.mdh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdhBroadcastListenerKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rye();
    public final String a;
    public final Account b;
    public final byte[] c;

    public MdhBroadcastListenerKey(String str, Account account, byte[] bArr) {
        this.a = str;
        this.b = account;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) obj;
            return ius.a(this.a, mdhBroadcastListenerKey.a) && ius.a(this.b, mdhBroadcastListenerKey.b) && ius.a(this.c, mdhBroadcastListenerKey.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String arrays = Arrays.toString(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf).length() + String.valueOf(arrays).length());
        sb.append("MdhBroadcastListenerKey{action='");
        sb.append(str);
        sb.append("', account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
