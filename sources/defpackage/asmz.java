package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;

/* renamed from: asmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asmz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DebugPokeRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        IBinder iBinder5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 4) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 5) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a != 1000) {
                switch (a) {
                    case 7:
                        iBinder2 = ivw.r(parcel, readInt);
                        break;
                    case 8:
                        iBinder3 = ivw.r(parcel, readInt);
                        break;
                    case 9:
                        iBinder4 = ivw.r(parcel, readInt);
                        break;
                    case 10:
                        iBinder5 = ivw.r(parcel, readInt);
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
        return new DebugPokeRequest(i, bArr, iBinder, iBinder2, iBinder3, iBinder4, iBinder5);
    }
}
