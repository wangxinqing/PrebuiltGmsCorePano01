package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.GenericDimension;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hpi();
    public PlayLoggerContext a;
    public byte[] b;
    public int[] c;
    public String[] d;
    public int[] e;
    public byte[][] f;
    public ExperimentTokens[] g;
    public boolean h;
    public GenericDimension[] i;
    public avrm j;
    public final hok k;
    public final hok l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (ius.a(this.a, logEventParcelable.a) && Arrays.equals(this.b, logEventParcelable.b) && Arrays.equals(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && ius.a(this.j, logEventParcelable.j) && ius.a(this.k, logEventParcelable.k)) {
                hok hok = logEventParcelable.l;
                return ius.a((Object) null, (Object) null) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.deepEquals(this.f, logEventParcelable.f) && Arrays.equals(this.g, logEventParcelable.g) && this.h == logEventParcelable.h && Arrays.equals(this.i, logEventParcelable.i);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.j, this.k, null, this.e, this.f, this.g, Boolean.valueOf(this.h), this.i});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        if (bArr != null) {
            str = new String(bArr);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.j);
        sb.append(", ExtensionProducer: ");
        sb.append(this.k);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append("GenericDimensions: ");
        sb.append(Arrays.toString(this.i));
        sb.append("]");
        return sb.toString();
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext) {
        this(playLoggerContext, (avrm) null, (hok) null, (int[]) null, (String[]) null, (int[]) null, (byte[][]) null, true);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, (Parcelable[]) this.g, i2);
        ivx.a(parcel, 10, (Parcelable[]) this.i, i2);
        ivx.b(parcel, a2);
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, avrm avrm, hok hok, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.a = playLoggerContext;
        this.j = avrm;
        this.k = hok;
        this.l = null;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr;
        this.g = null;
        this.h = z;
        this.i = null;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, GenericDimension[] genericDimensionArr) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.j = null;
        this.k = null;
        this.l = null;
        this.e = iArr2;
        this.f = bArr2;
        this.g = experimentTokensArr;
        this.h = z;
        this.i = genericDimensionArr;
    }
}
