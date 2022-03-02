package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableCollaborator;

/* renamed from: lmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableCollaborator[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    z = ivw.c(parcel, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str5 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ParcelableCollaborator(z, z2, str, str2, str3, str4, str5);
    }
}
