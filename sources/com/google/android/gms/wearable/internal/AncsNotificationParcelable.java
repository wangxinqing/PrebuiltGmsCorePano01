package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AncsNotificationParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adzi();
    public int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final String k;
    private final String l;

    public AncsNotificationParcelable(int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b2, byte b3, byte b4, byte b5, String str7) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b2;
        this.h = b3;
        this.i = b4;
        this.j = b5;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
            if (this.a == ancsNotificationParcelable.a && this.g == ancsNotificationParcelable.g && this.h == ancsNotificationParcelable.h && this.i == ancsNotificationParcelable.i && this.j == ancsNotificationParcelable.j && this.b.equals(ancsNotificationParcelable.b) && ((str = this.c) == null ? ancsNotificationParcelable.c == null : str.equals(ancsNotificationParcelable.c)) && this.d.equals(ancsNotificationParcelable.d) && this.e.equals(ancsNotificationParcelable.e) && this.f.equals(ancsNotificationParcelable.f)) {
                String str2 = this.l;
                if (str2 == null ? ancsNotificationParcelable.l != null : !str2.equals(ancsNotificationParcelable.l)) {
                    return false;
                }
                String str3 = this.k;
                if (str3 != null) {
                    return str3.equals(ancsNotificationParcelable.k);
                }
                return ancsNotificationParcelable.k == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int hashCode = (((this.a + 31) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((((((hashCode + i2) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.l;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i5 = (((((((((hashCode2 + i3) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str3 = this.k;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        int i2 = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.l;
        byte b2 = this.g;
        byte b3 = this.h;
        byte b4 = this.i;
        byte b5 = this.j;
        String str7 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i2);
        sb.append(", appId='");
        sb.append(str);
        sb.append("', dateTime='");
        sb.append(str2);
        sb.append("', notificationText='");
        sb.append(str3);
        sb.append("', title='");
        sb.append(str4);
        sb.append("', subtitle='");
        sb.append(str5);
        sb.append("', displayName='");
        sb.append(str6);
        sb.append("', eventId=");
        sb.append(b2);
        sb.append(", eventFlags=");
        sb.append(b3);
        sb.append(", categoryId=");
        sb.append(b4);
        sb.append(", categoryCount=");
        sb.append(b5);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        String str = this.l;
        if (str == null) {
            str = this.b;
        }
        ivx.a(parcel, 8, str, false);
        ivx.a(parcel, 9, this.g);
        ivx.a(parcel, 10, this.h);
        ivx.a(parcel, 11, this.i);
        ivx.a(parcel, 12, this.j);
        ivx.a(parcel, 13, this.k, false);
        ivx.b(parcel, a2);
    }
}
