package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;

/* renamed from: tfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EnableTargetRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 2:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 3:
                        iBinder = ivw.r(parcel, readInt);
                        break;
                    case 4:
                        iBinder2 = ivw.r(parcel, readInt);
                        break;
                    case 5:
                        iBinder3 = ivw.r(parcel, readInt);
                        break;
                    case 6:
                        b2 = ivw.e(parcel, readInt);
                        break;
                    case 7:
                        b3 = ivw.e(parcel, readInt);
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
        return new EnableTargetRequest(i, str, str2, b2, b3, iBinder, iBinder2, iBinder3);
    }
}
