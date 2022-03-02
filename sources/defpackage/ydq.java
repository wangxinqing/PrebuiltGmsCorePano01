package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: ydq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Configuration[] configurationArr = null;
        byte[] bArr = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    configurationArr = (Configuration[]) ivw.b(parcel, readInt, Configuration.CREATOR);
                    break;
                case 5:
                    z = ivw.c(parcel, readInt);
                    break;
                case 6:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 7:
                    j = ivw.i(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new Configurations(str, str2, configurationArr, z, bArr, j);
    }
}
