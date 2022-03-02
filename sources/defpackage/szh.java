package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: szh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szh implements Parcelable.Creator {
    public static void a(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int a = ivx.a(parcel);
        ivx.b(parcel, 1, userAttributeParcel.a);
        ivx.a(parcel, 2, userAttributeParcel.b, false);
        ivx.a(parcel, 3, userAttributeParcel.c);
        ivx.a(parcel, 4, userAttributeParcel.d);
        ivx.a(parcel, 5, (Float) null);
        ivx.a(parcel, 6, userAttributeParcel.e, false);
        ivx.a(parcel, 7, userAttributeParcel.f, false);
        ivx.a(parcel, 8, userAttributeParcel.g);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    l = ivw.j(parcel2, readInt);
                    break;
                case 5:
                    f = ivw.m(parcel2, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    d = ivw.o(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new UserAttributeParcel(i, str, j, l, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}
