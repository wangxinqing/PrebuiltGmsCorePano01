package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new ajvp();
    public final Calendar a;
    public final String b;
    public final int c;
    public final int d = this.a.get(1);
    public final int e = this.a.getMaximum(7);
    public final int f = this.a.getActualMaximum(5);
    public final long g;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = ajvz.b(calendar);
        this.a = b2;
        this.c = b2.get(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(ajvz.a());
        this.b = simpleDateFormat.format(this.a.getTime());
        this.g = this.a.getTimeInMillis();
    }

    public static Month a() {
        return new Month(ajvz.b());
    }

    public final int b() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.e : firstDayOfWeek;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.c == month.c && this.d == month.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }

    public static Month a(int i, int i2) {
        Calendar c2 = ajvz.c();
        c2.set(1, i);
        c2.set(2, i2);
        return new Month(c2);
    }

    public final int b(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return ((month.d - this.d) * 12) + (month.c - this.c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public static Month a(long j) {
        Calendar c2 = ajvz.c();
        c2.setTimeInMillis(j);
        return new Month(c2);
    }

    /* renamed from: a */
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final long a(int i) {
        Calendar b2 = ajvz.b(this.a);
        b2.set(5, i);
        return b2.getTimeInMillis();
    }

    public final Month b(int i) {
        Calendar b2 = ajvz.b(this.a);
        b2.add(2, i);
        return new Month(b2);
    }
}
