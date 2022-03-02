package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResolutionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new eiq();
    final int a;
    public final String b;
    public final int c;
    public final String d;
    public final BrowserResolutionCookie[] e;

    public ResolutionData(int i, String str, int i2, String str2, BrowserResolutionCookie[] browserResolutionCookieArr) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = browserResolutionCookieArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResolutionData) {
            ResolutionData resolutionData = (ResolutionData) obj;
            if (!TextUtils.equals(this.b, resolutionData.b) || this.c != resolutionData.c || !TextUtils.equals(this.d, resolutionData.d) || !Arrays.equals(this.e, resolutionData.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public ResolutionData(String str, int i, String str2, BrowserResolutionCookie[] browserResolutionCookieArr) {
        this(2, str, i, str2, browserResolutionCookieArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, (Parcelable[]) this.e, i);
        ivx.b(parcel, a2);
    }
}
