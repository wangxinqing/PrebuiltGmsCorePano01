package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtf();
    public final CorpusId a;
    final Bundle b;

    public PhraseAffinityCorpusSpec(CorpusId corpusId, Bundle bundle) {
        this.a = corpusId;
        this.b = bundle;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        for (String str : this.b.keySet()) {
            hashMap.put(str, Integer.valueOf(this.b.getInt(str)));
        }
        return hashMap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
