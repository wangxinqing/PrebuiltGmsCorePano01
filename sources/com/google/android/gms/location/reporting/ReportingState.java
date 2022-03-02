package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rmg();
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3) {
        this.e = i;
        this.f = i2;
        this.a = z;
        this.b = z2;
        this.g = i3;
        this.h = i4;
        this.c = num;
        this.d = z3;
    }

    public final int a() {
        return rma.b(this.e);
    }

    public final int b() {
        return rma.b(this.f);
    }

    public final boolean c() {
        return rma.a(this.e) && rma.a(this.f);
    }

    public final int d() {
        return rlz.a(this.g);
    }

    public final boolean e() {
        return !c() && d() == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReportingState) {
            ReportingState reportingState = (ReportingState) obj;
            if (this.e == reportingState.e && this.f == reportingState.f && this.a == reportingState.a && this.b == reportingState.b && this.g == reportingState.g && this.h == reportingState.h && ius.a(this.c, reportingState.c) && this.d == reportingState.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.g), Integer.valueOf(this.h), this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        Integer num = this.c;
        if (num != null) {
            str = rmp.a(num);
        } else {
            str = "(hidden-from-unauthorized-caller)";
        }
        int i = this.e;
        int i2 = this.f;
        boolean z = this.a;
        boolean z2 = this.b;
        int i3 = this.g;
        int i4 = this.h;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 235);
        sb.append("ReportingState{mReportingEnabled=");
        sb.append(i);
        sb.append(", mHistoryEnabled=");
        sb.append(i2);
        sb.append(", mAllowed=");
        sb.append(z);
        sb.append(", mActive=");
        sb.append(z2);
        sb.append(", mExpectedOptInResult=");
        sb.append(i3);
        sb.append(", mExpectedOptInResultAssumingLocationEnabled=");
        sb.append(i4);
        sb.append(", mDeviceTag=");
        sb.append(str);
        sb.append(", mCanAccessSettings=");
        sb.append(z3);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, a());
        ivx.b(parcel, 3, b());
        ivx.a(parcel, 4, this.a);
        ivx.a(parcel, 5, this.b);
        ivx.b(parcel, 7, d());
        ivx.a(parcel, 8, this.c);
        ivx.b(parcel, 9, rlz.a(this.h));
        ivx.a(parcel, 10, this.d);
        ivx.b(parcel, a2);
    }
}
