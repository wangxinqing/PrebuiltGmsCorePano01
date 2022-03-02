package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.GenericDimension;

/* renamed from: hpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        GenericDimension[] genericDimensionArr = null;
        boolean z = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) ivw.a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 4:
                    iArr = ivw.w(parcel, readInt);
                    break;
                case 5:
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 6:
                    iArr2 = ivw.w(parcel, readInt);
                    break;
                case 7:
                    bArr2 = ivw.u(parcel, readInt);
                    break;
                case 8:
                    z = ivw.c(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) ivw.b(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                case 10:
                    genericDimensionArr = (GenericDimension[]) ivw.b(parcel, readInt, GenericDimension.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr, genericDimensionArr);
    }
}
