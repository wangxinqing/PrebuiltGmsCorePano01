package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyw();
    public final List a;
    public final int[] b;
    public final boolean c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new acyi();
        public final boolean a;

        public SettingAvailability(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return obj != null && (obj instanceof SettingAvailability) && this.a == ((SettingAvailability) obj).a;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        public final String toString() {
            iur a2 = ius.a(this);
            a2.a("CanShowValue", Boolean.valueOf(this.a));
            return a2.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a);
            ivx.b(parcel, a2);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new acza();
        public final int a;
        public final int b;
        public final SettingAvailability c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.a = i;
            this.b = i2;
            this.c = settingAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof UdcSetting)) {
                UdcSetting udcSetting = (UdcSetting) obj;
                return this.a == udcSetting.a && this.b == udcSetting.b && ius.a(this.c, udcSetting.c);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
        }

        public final String toString() {
            iur a2 = ius.a(this);
            a2.a("SettingId", Integer.valueOf(this.a));
            a2.a("SettingValue", Integer.valueOf(this.b));
            a2.a("SettingAvailability", this.c);
            return a2.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.b(parcel, 3, this.b);
            ivx.a(parcel, 4, this.c, i, false);
            ivx.b(parcel, a2);
        }
    }

    public UdcCacheResponse(List list, int[] iArr, boolean z) {
        this.a = list;
        this.b = iArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof UdcCacheResponse)) {
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
            return this.a.equals(udcCacheResponse.a) && Arrays.equals(this.b, udcCacheResponse.b) && this.c == udcCacheResponse.c;
        }
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Settings", this.a);
        a2.a("ConsentableSettings", Arrays.toString(this.b));
        a2.a("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
