package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: jdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 8:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 10:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 16:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 17:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 18:
                    z = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }
}
