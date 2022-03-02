package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class TrueWirelessHeadset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aeil();

    public static boolean a(int i) {
        return i >= 0 && i <= 100;
    }

    public static aeim i() {
        aeim aeim = new aeim();
        aeim.b(0);
        aeim.a("");
        aeim.a(0);
        return aeim;
    }

    public abstract String a();

    public abstract HeadsetPiece b();

    public abstract HeadsetPiece c();

    public abstract HeadsetPiece d();

    public final int describeContents() {
        return 0;
    }

    public abstract long e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrueWirelessHeadset) {
            TrueWirelessHeadset trueWirelessHeadset = (TrueWirelessHeadset) obj;
            return Objects.equals(a(), trueWirelessHeadset.a()) && Objects.equals(b(), trueWirelessHeadset.b()) && Objects.equals(c(), trueWirelessHeadset.c()) && Objects.equals(d(), trueWirelessHeadset.d()) && Objects.equals(h(), trueWirelessHeadset.h()) && e() == trueWirelessHeadset.e() && Objects.equals(f(), trueWirelessHeadset.f()) && g() == trueWirelessHeadset.g();
        }
    }

    public abstract String f();

    public abstract long g();

    public abstract Uri h();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), h(), Long.valueOf(e()), f(), Long.valueOf(g())});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        b().writeToParcel(parcel, i);
        c().writeToParcel(parcel, i);
        d().writeToParcel(parcel, i);
        parcel.writeParcelable(h(), i);
        parcel.writeLong(e());
        parcel.writeString(f());
        parcel.writeLong(g());
    }
}
