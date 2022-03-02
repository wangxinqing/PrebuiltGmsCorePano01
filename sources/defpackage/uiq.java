package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

/* renamed from: uiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uiq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendConnectionRequestParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        IBinder iBinder4 = null;
        byte[] bArr2 = null;
        ConnectionOptions connectionOptions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 2:
                    iBinder2 = ivw.r(parcel, readInt);
                    break;
                case 3:
                    iBinder3 = ivw.r(parcel, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 7:
                    iBinder4 = ivw.r(parcel, readInt);
                    break;
                case 8:
                    bArr2 = ivw.t(parcel, readInt);
                    break;
                case 9:
                    connectionOptions = (ConnectionOptions) ivw.a(parcel, readInt, ConnectionOptions.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new SendConnectionRequestParams(iBinder, iBinder2, iBinder3, str, str2, bArr, iBinder4, bArr2, connectionOptions);
    }
}
