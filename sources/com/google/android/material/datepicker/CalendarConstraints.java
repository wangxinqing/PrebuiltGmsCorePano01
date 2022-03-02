package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajup();
    public final Month a;
    public final Month b;
    public final Month c;
    public final DateValidator d;
    public final int e;
    public final int f;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface DateValidator extends Parcelable {
        boolean a(long j);
    }

    public CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator) {
        this.a = month;
        this.b = month2;
        this.c = month3;
        this.d = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.f = month.b(month2) + 1;
            this.e = (month2.d - month.d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && this.c.equals(calendarConstraints.c) && this.d.equals(calendarConstraints.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
