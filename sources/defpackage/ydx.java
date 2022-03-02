package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: ydx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 4:
                    bArr2 = ivw.u(parcel, readInt);
                    break;
                case 5:
                    bArr3 = ivw.u(parcel, readInt);
                    break;
                case 6:
                    bArr4 = ivw.u(parcel, readInt);
                    break;
                case 7:
                    bArr5 = ivw.u(parcel, readInt);
                    break;
                case 8:
                    iArr = ivw.w(parcel, readInt);
                    break;
                case 9:
                    bArr6 = ivw.u(parcel, readInt);
                    break;
                case 10:
                    iArr2 = ivw.w(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }
}
