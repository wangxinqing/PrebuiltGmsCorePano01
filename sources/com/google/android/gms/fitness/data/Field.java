package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Field extends AbstractSafeParcelable {
    public static final Field A = b("meal_type");
    public static final Field B = new Field("food_item", 3, true);
    public static final Field C = e("nutrients");
    public static final Parcelable.Creator CREATOR = new ndf();
    public static final Field D = new Field("exercise", 3);
    public static final Field E = b("repetitions");
    public static final Field F = d("resistance");
    public static final Field G = b("resistance_type");
    public static final Field H = a("num_segments");
    public static final Field I = c("average");
    public static final Field J = c("max");
    public static final Field K = c("min");
    public static final Field L = c("low_latitude");
    public static final Field M = c("low_longitude");
    public static final Field N = c("high_latitude");
    public static final Field O = c("high_longitude");
    public static final Field P = a("sensor_type");
    public static final Field Q = new Field("timestamps", 5);
    public static final Field R = new Field("sensor_values", 6);
    public static final Field S = c("intensity");
    public static final Field T = e("activity_confidence");
    public static final Field U = c("probability");
    public static final Field V = f("google.android.fitness.SportsModel");
    public static final Field W = f("google.android.fitness.SleepAttributes");
    public static final Field d = a("activity");
    public static final Field e = c("confidence");
    public static final Field f = a("steps");
    public static final Field g = a("duration");
    public static final Field h = b("duration");
    public static final Field i = c("bpm");
    public static final Field j = c("latitude");
    public static final Field k = c("longitude");
    public static final Field l = c("accuracy");
    public static final Field m = d("altitude");
    public static final Field n = c("distance");
    public static final Field o = c("height");
    public static final Field p = c("weight");
    public static final Field q = c("percentage");
    public static final Field r = c("speed");
    public static final Field s = c("rpm");
    public static final Field t = f("google.android.fitness.GoalV2");
    public static final Field u = f("google.android.fitness.StrideModel");
    public static final Field v = f("google.android.fitness.Device");
    public static final Field w = a("revolutions");
    public static final Field x = c("calories");
    public static final Field y = c("watts");
    public static final Field z = c("volume");
    public final String a;
    public final int b;
    public final Boolean c;

    static {
        c("step_length");
        e("activity_duration.ascending");
        e("activity_duration.descending");
        a("occurrences");
    }

    public Field(String str, int i2) {
        this(str, i2, (Boolean) null);
    }

    public static Field a(String str) {
        return new Field(str, 1);
    }

    public static Field b(String str) {
        return new Field(str, 1, true);
    }

    public static Field c(String str) {
        return new Field(str, 2);
    }

    public static Field d(String str) {
        return new Field(str, 2, true);
    }

    public static Field e(String str) {
        return new Field(str, 4);
    }

    public static Field f(String str) {
        return new Field(str, 7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Field) {
            Field field = (Field) obj;
            return this.a.equals(field.a) && this.b == field.b;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        objArr[1] = this.b != 1 ? "f" : "i";
        return String.format("%s(%s)", objArr);
    }

    public Field(String str, int i2, Boolean bool) {
        iva.a((Object) str);
        this.a = str;
        this.b = i2;
        this.c = bool;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
