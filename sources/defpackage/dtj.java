package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: dtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new QuerySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int[] iArr = null;
        byte[] bArr = null;
        STSortSpec sTSortSpec = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = true;
        int i4 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 2:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 3:
                    arrayList2 = ivw.c(parcel2, readInt, Section.CREATOR);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    iArr = ivw.w(parcel2, readInt);
                    break;
                case 11:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 12:
                    sTSortSpec = (STSortSpec) ivw.a(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new QuerySpecification(z, arrayList, arrayList2, z2, i, i2, z3, i3, z4, iArr, bArr, sTSortSpec, str, i4);
    }
}
