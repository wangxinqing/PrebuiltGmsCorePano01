package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rcl();
    public long a;
    public boolean b;
    public WorkSource c;
    public String d;
    public int[] e;
    public boolean f;
    public String g;
    public final long h;

    public ActivityRecognitionRequest(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.g = str2;
        this.h = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }
}
