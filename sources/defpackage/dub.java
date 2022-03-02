package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.appdatasearch.SearchResults;
import org.chromium.net.UrlRequest;

/* renamed from: dub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dub implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        int[] iArr = null;
        byte[] bArr = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArr2 = null;
        String[] strArr = null;
        byte[] bArr2 = null;
        double[] dArr = null;
        Bundle bundle = null;
        long[] jArr = null;
        long[] jArr2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArr3 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    iArr = ivw.w(parcel2, readInt);
                    break;
                case 3:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 4:
                    bundleArr = (Bundle[]) ivw.b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) ivw.b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) ivw.b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 7:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    iArr2 = ivw.w(parcel2, readInt);
                    break;
                case 9:
                    strArr = ivw.A(parcel2, readInt);
                    break;
                case 10:
                    bArr2 = ivw.t(parcel2, readInt);
                    break;
                case 11:
                    dArr = ivw.z(parcel2, readInt);
                    break;
                case 12:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    jArr = ivw.x(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    jArr2 = ivw.x(parcel2, readInt);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) ivw.b(parcel2, readInt, Bundle.CREATOR);
                    break;
                case 17:
                    iArr3 = ivw.w(parcel2, readInt);
                    break;
                case 18:
                    bArr3 = ivw.t(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SearchResults(str, iArr, bArr, bundleArr, bundleArr2, bundleArr3, i, iArr2, strArr, bArr2, dArr, bundle, i2, jArr, jArr2, bundleArr4, iArr3, bArr3);
    }
}
