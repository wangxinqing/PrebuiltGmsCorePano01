package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rmk();
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public UploadRequest(Account account, String str, long j, long j2, long j3, String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadRequest) {
            UploadRequest uploadRequest = (UploadRequest) obj;
            return this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && ius.a(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && ius.a(this.f, uploadRequest.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        String a2 = rmp.a(this.a);
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        String str2 = this.f;
        int length = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 186 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a2);
        sb.append(", mReason='");
        sb.append(str);
        sb.append("', mDurationMillis=");
        sb.append(j);
        sb.append(", mMovingLatencyMillis=");
        sb.append(j2);
        sb.append(", mStationaryLatencyMillis=");
        sb.append(j3);
        sb.append(", mAppSpecificKey='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    public UploadRequest(rmj rmj) {
        this.a = rmj.a;
        this.b = rmj.b;
        this.c = rmj.c;
        this.d = rmj.d;
        this.e = rmj.e;
        this.f = rmj.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.b(parcel, a2);
    }
}
