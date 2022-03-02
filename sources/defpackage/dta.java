package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import org.chromium.net.UrlRequest;

/* renamed from: dta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dta implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchQuerySpecification[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        CorpusId[] corpusIdArr = null;
        CorpusScoringInfo[] corpusScoringInfoArr = null;
        String str = null;
        byte[] bArr = null;
        int[] iArr = null;
        byte[] bArr2 = null;
        STSortSpec sTSortSpec = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        int i5 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    corpusIdArr = (CorpusId[]) ivw.b(parcel2, readInt, CorpusId.CREATOR);
                    break;
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    corpusScoringInfoArr = (CorpusScoringInfo[]) ivw.b(parcel2, readInt, CorpusScoringInfo.CREATOR);
                    break;
                case 4:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 10:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    iArr = ivw.w(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    bArr2 = ivw.t(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    sTSortSpec = (STSortSpec) ivw.a(parcel2, readInt, STSortSpec.CREATOR);
                    break;
                case 16:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GlobalSearchQuerySpecification(corpusIdArr, i, corpusScoringInfoArr, i2, i3, i4, str, z, bArr, z2, z3, z4, iArr, bArr2, sTSortSpec, str2, i5);
    }
}
