package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.UserQuota;

/* renamed from: yjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoBackupSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        UserQuota userQuota = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
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
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    userQuota = (UserQuota) ivw.a(parcel2, readInt, UserQuota.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AutoBackupSettings(i, str, z, z2, z3, z4, z5, z6, z7, z8, userQuota);
    }
}
