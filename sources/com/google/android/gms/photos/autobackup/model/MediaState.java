package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediaState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yjz();
    public final int a;
    public String[] b;
    public int[] c;
    public long[] d;
    private Map e;

    public MediaState() {
        this.a = 1;
    }

    public MediaState(int i, String[] strArr, int[] iArr, long[] jArr) {
        this.a = i;
        this.b = strArr;
        this.c = iArr;
        this.d = jArr;
        this.e = new HashMap();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Map map = this.e;
            String str = strArr[i2];
            int i3 = iArr[i2];
            long j = jArr[i2];
            map.put(str, new yjy());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
