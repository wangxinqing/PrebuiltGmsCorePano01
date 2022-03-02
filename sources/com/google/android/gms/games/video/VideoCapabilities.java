package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VideoCapabilities extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nnp();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean[] d;
    public final boolean[] e;

    public VideoCapabilities(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zArr;
        this.e = zArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return ius.a(videoCapabilities.d, this.d) && ius.a(videoCapabilities.e, this.e) && ius.a(Boolean.valueOf(videoCapabilities.a), Boolean.valueOf(this.a)) && ius.a(Boolean.valueOf(videoCapabilities.b), Boolean.valueOf(this.b)) && ius.a(Boolean.valueOf(videoCapabilities.c), Boolean.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("SupportedCaptureModes", this.d);
        a2.a("SupportedQualityLevels", this.e);
        a2.a("CameraSupported", Boolean.valueOf(this.a));
        a2.a("MicSupported", Boolean.valueOf(this.b));
        a2.a("StorageWriteSupported", Boolean.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
