package com.google.android.gms.nearby.sharing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WifiCredentialsAttachment extends Attachment {
    public static final Parcelable.Creator CREATOR = new vtz();
    public final String a;
    public final int b;
    public final Bundle c;
    public final String d;
    public final boolean e;

    public WifiCredentialsAttachment(String str, int i, Bundle bundle, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = bundle;
        this.d = str2;
        this.e = z;
    }

    public final long a() {
        return 0;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WifiCredentialsAttachment) {
            WifiCredentialsAttachment wifiCredentialsAttachment = (WifiCredentialsAttachment) obj;
            return ius.a(this.a, wifiCredentialsAttachment.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(wifiCredentialsAttachment.b));
        }
    }

    public final int f() {
        return 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "WifiCredentialsAttachment<ssid: %s, security type: %s>", new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
