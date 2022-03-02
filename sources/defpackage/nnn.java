package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.stats.PlayerStatsEntity;

/* renamed from: nnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayerStatsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 2:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    f3 = ivw.l(parcel2, readInt);
                    break;
                case 7:
                    f4 = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 9:
                    f5 = ivw.l(parcel2, readInt);
                    break;
                case 10:
                    f6 = ivw.l(parcel2, readInt);
                    break;
                case 11:
                    f7 = ivw.l(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PlayerStatsEntity(f, f2, i, i2, i3, f3, f4, bundle, f5, f6, f7);
    }
}
