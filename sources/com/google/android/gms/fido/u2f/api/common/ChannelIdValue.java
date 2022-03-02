package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChannelIdValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nbr();
    public final String a;
    public final String b;
    private final ChannelIdValueType c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);
        
        public static final Parcelable.Creator CREATOR = null;
        public final int d;

        static {
            CREATOR = new nbp();
        }

        private ChannelIdValueType(int i) {
            this.d = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
        }
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    private ChannelIdValue() {
        this.c = ChannelIdValueType.ABSENT;
        this.b = null;
        this.a = null;
    }

    public static ChannelIdValueType a(int i) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.d) {
                return channelIdValueType;
            }
        }
        throw new nbq(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelIdValue) {
            ChannelIdValue channelIdValue = (ChannelIdValue) obj;
            if (this.c.equals(channelIdValue.c)) {
                ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
                int ordinal = this.c.ordinal();
                if (ordinal == 0) {
                    return true;
                }
                if (ordinal == 1) {
                    return this.a.equals(channelIdValue.a);
                }
                if (ordinal != 2) {
                    return false;
                }
                return this.b.equals(channelIdValue.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() + 31;
        ChannelIdValueType channelIdValueType = ChannelIdValueType.ABSENT;
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            return (hashCode * 31) + this.a.hashCode();
        }
        if (ordinal != 2) {
            return hashCode;
        }
        return (hashCode * 31) + this.b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ChannelIdValueType channelIdValueType = this.c;
        ChannelIdValueType channelIdValueType2 = ChannelIdValueType.ABSENT;
        ivx.b(parcel, 2, channelIdValueType.d);
        ivx.a(parcel, 3, this.a, false);
        ivx.a(parcel, 4, this.b, false);
        ivx.b(parcel, a2);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.c = a(i);
            this.a = str;
            this.b = str2;
        } catch (nbq e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ChannelIdValue(String str) {
        iva.a((Object) str);
        this.a = str;
        this.c = ChannelIdValueType.STRING;
        this.b = null;
    }
}
