package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.places.ui.autocomplete.SessionLogger;
import org.chromium.net.UrlRequest;

/* renamed from: alcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alcu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionLogger[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
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
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    i6 = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    i7 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i8 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    i9 = ivw.g(parcel2, readInt);
                    break;
                case 16:
                    j = ivw.i(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SessionLogger(i, i2, z, z2, z3, z4, i3, i4, i5, i6, str, i7, i8, z5, i9, j);
    }
}
