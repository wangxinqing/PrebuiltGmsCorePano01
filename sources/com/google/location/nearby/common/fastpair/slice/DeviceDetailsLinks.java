package com.google.location.nearby.common.fastpair.slice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class DeviceDetailsLinks implements Parcelable {
    public static final Parcelable.Creator CREATOR = new arzb();

    public static arzc h() {
        return new arzc();
    }

    public abstract byte[] a();

    public abstract boolean b();

    public abstract String c();

    public abstract String d();

    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceDetailsLinks) {
            DeviceDetailsLinks deviceDetailsLinks = (DeviceDetailsLinks) obj;
            return Arrays.equals(a(), deviceDetailsLinks.a()) && b() == deviceDetailsLinks.b() && Objects.equals(c(), deviceDetailsLinks.c()) && Objects.equals(d(), deviceDetailsLinks.d()) && e() == deviceDetailsLinks.e() && f().equals(deviceDetailsLinks.f()) && g().equals(deviceDetailsLinks.g());
        }
    }

    public abstract String f();

    public abstract String g();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), Boolean.valueOf(b()), c(), d(), Boolean.valueOf(e()), f(), g()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] a = a();
        parcel.writeInt(a.length);
        parcel.writeByteArray(a);
        parcel.writeByte(b() ? (byte) 1 : 0);
        parcel.writeString(c());
        parcel.writeString(d());
        parcel.writeByte(e() ? (byte) 1 : 0);
        parcel.writeString(f());
        parcel.writeString(g());
    }
}
