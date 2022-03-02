package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: rcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    workSource = (WorkSource) ivw.a(parcel2, readInt, WorkSource.CREATOR);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    iArr = ivw.w(parcel2, readInt);
                    break;
                case 6:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ActivityRecognitionRequest(j, z, workSource, str, iArr, z2, str2, j2);
    }
}
