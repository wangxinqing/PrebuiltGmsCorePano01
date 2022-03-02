package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* renamed from: egs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        byte[][] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    bArr = ivw.u(parcel, readInt);
                    break;
                case 5:
                    bArr2 = ivw.t(parcel, readInt);
                    break;
                case 6:
                    bArr3 = ivw.t(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new LogAuditRecordsRequest(i, i2, str, bArr, bArr2, bArr3);
    }
}
