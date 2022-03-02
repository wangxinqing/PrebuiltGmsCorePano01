package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsi();
    public final String a;
    public final String b;
    final Bundle c;

    public CorpusId(String str, String str2) {
        this(str, str2, (Bundle) null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            return ius.a(this.a, corpusId.a) && ius.a(this.b, corpusId.b) && ius.a(this.c, corpusId.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        Bundle bundle = this.c;
        String bundle2 = bundle != null ? bundle.toString() : "null";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(bundle2).length());
        sb.append("CorpusId[package=");
        sb.append(str);
        sb.append(", corpus=");
        sb.append(str2);
        sb.append("userHandle=");
        sb.append(bundle2);
        sb.append("]");
        return sb.toString();
    }

    public CorpusId(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
