package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UploadRequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rml();
    public final int a;
    public final long b;

    public UploadRequestResult(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UploadRequestResult) {
            UploadRequestResult uploadRequestResult = (UploadRequestResult) obj;
            if (this.b == uploadRequestResult.b && this.a == uploadRequestResult.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Result{, mResultCode=");
        sb.append(i);
        sb.append(", mRequestId=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
