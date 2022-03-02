package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Deletion extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rlw();
    public final Account a;
    public final long b;
    public final long c;
    public final long d;

    public Deletion(Account account, long j, long j2, long j3) {
        this.a = account;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Deletion) {
            Deletion deletion = (Deletion) obj;
            return this.b == deletion.b && this.c == deletion.c && this.d == deletion.d && ius.a(this.a, deletion.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 122);
        sb.append("Deletion{mAccount=");
        sb.append(valueOf);
        sb.append(", mStartTimeMs=");
        sb.append(j);
        sb.append(", mEndTimeMs=");
        sb.append(j2);
        sb.append(", mTimestampMs=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
