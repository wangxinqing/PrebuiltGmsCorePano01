package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import org.chromium.net.UrlRequest;

/* renamed from: advv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FaceParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        ContourParcel[] contourParcelArr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 4:
                    f2 = ivw.l(parcel2, readInt);
                    break;
                case 5:
                    f3 = ivw.l(parcel2, readInt);
                    break;
                case 6:
                    f4 = ivw.l(parcel2, readInt);
                    break;
                case 7:
                    f5 = ivw.l(parcel2, readInt);
                    break;
                case 8:
                    f6 = ivw.l(parcel2, readInt);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) ivw.b(parcel2, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f8 = ivw.l(parcel2, readInt);
                    break;
                case 11:
                    f9 = ivw.l(parcel2, readInt);
                    break;
                case 12:
                    f10 = ivw.l(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    contourParcelArr = (ContourParcel[]) ivw.b(parcel2, readInt, ContourParcel.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    f7 = ivw.l(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    f11 = ivw.l(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, f7, landmarkParcelArr, f8, f9, f10, contourParcelArr, f11);
    }
}
