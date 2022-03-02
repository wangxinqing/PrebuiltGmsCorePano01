package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.WifiScan;

/* renamed from: rfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WifiScan[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long[] jArr = WifiScan.a;
        int[] iArr = WifiScan.b;
        int[] iArr2 = WifiScan.b;
        int[] iArr3 = WifiScan.b;
        long[] jArr2 = jArr;
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = iArr3;
        int[] iArr7 = WifiScan.b;
        int[] iArr8 = WifiScan.b;
        int[] iArr9 = WifiScan.b;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    jArr2 = ivw.x(parcel2, readInt);
                    break;
                case 3:
                    iArr4 = ivw.w(parcel2, readInt);
                    break;
                case 4:
                    iArr5 = ivw.w(parcel2, readInt);
                    break;
                case 5:
                    iArr6 = ivw.w(parcel2, readInt);
                    break;
                case 6:
                    iArr7 = ivw.w(parcel2, readInt);
                    break;
                case 7:
                    iArr8 = ivw.w(parcel2, readInt);
                    break;
                case 8:
                    iArr9 = ivw.w(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new WifiScan(j, jArr2, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9);
    }
}
