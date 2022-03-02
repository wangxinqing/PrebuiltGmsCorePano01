package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;

/* renamed from: advw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FaceSettingsParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    z = ivw.c(parcel, readInt);
                    break;
                case 6:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 7:
                    f = ivw.l(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FaceSettingsParcel(i, i2, i3, z, z2, f);
    }
}
