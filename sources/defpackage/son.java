package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* renamed from: son  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class son implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InitializationParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new InitializationParams(j, j2, z, str, str2, str3, bundle);
    }
}
