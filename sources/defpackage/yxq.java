package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: yxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yxq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Settings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Audience audience = null;
        Audience audience2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        audience = (Audience) ivw.a(parcel, readInt, Audience.CREATOR);
                        break;
                    case 2:
                        audience2 = (Audience) ivw.a(parcel, readInt, Audience.CREATOR);
                        break;
                    case 3:
                        z = ivw.c(parcel, readInt);
                        break;
                    case 4:
                        z2 = ivw.c(parcel, readInt);
                        break;
                    case 5:
                        i2 = ivw.g(parcel, readInt);
                        break;
                    case 6:
                        i3 = ivw.g(parcel, readInt);
                        break;
                    case 7:
                        i4 = ivw.g(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new Settings(i, audience, audience2, z, z2, i2, i3, i4);
    }
}
