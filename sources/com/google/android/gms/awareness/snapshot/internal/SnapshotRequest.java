package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grr();
    public final int a;
    public final ArrayList b;
    public final int c;
    public long d;

    public SnapshotRequest() {
        this.a = 10005;
        this.b = null;
        this.c = 0;
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SnapshotRequest) {
            SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
            if (this.c == snapshotRequest.c && this.a == snapshotRequest.a) {
                ArrayList arrayList = this.b;
                if (arrayList == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (snapshotRequest.b == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(z ^ z2)) {
                    if (arrayList != null) {
                        if (arrayList.size() == snapshotRequest.b.size()) {
                            ArrayList arrayList2 = this.b;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                i++;
                                if (!snapshotRequest.b.contains((BeaconStateImpl.TypeFilterImpl) arrayList2.get(i))) {
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((BeaconStateImpl.TypeFilterImpl) arrayList.get(i2)).hashCode() * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(i), Integer.valueOf(this.c)});
    }

    public SnapshotRequest(int i, ArrayList arrayList, int i2) {
        this.a = i;
        this.b = arrayList;
        this.c = i2;
        this.d = 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
