package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* renamed from: htd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class htd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    num = ivw.h(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PlayLoggerContext(str, i, i2, str2, str3, z, str4, z2, i3, num);
    }
}
