package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* renamed from: jat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jat implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse$Field[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        ConverterWrapper converterWrapper = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel, readInt);
                    break;
                case 7:
                    i4 = ivw.g(parcel, readInt);
                    break;
                case 8:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) ivw.a(parcel, readInt, ConverterWrapper.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FastJsonResponse$Field(i, i2, z, i3, z2, str, i4, str2, converterWrapper);
    }
}
