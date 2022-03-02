package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = new ajut();
    private final long a;

    public DateValidatorPointForward(long j) {
        this.a = j;
    }

    public static DateValidatorPointForward a() {
        return new DateValidatorPointForward(Long.MIN_VALUE);
    }

    public final boolean a(long j) {
        return j >= this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DateValidatorPointForward) && this.a == ((DateValidatorPointForward) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }
}
