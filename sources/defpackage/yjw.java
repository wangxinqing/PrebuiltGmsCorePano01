package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;

/* renamed from: yjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoBackupStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    strArr = ivw.A(parcel2, readInt);
                    break;
                case 10:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    i6 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AutoBackupStatus(i, i2, str, str2, f, i3, i4, i5, strArr, str3, i6);
    }
}
