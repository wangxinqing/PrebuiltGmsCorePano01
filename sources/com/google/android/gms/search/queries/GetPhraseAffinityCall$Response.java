package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetPhraseAffinityCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aalg();
    public Status a;
    public PhraseAffinityResponse b;
    public Bundle c;

    public GetPhraseAffinityCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public GetPhraseAffinityCall$Response(Status status, PhraseAffinityResponse phraseAffinityResponse, Bundle bundle) {
        this.a = status;
        this.b = phraseAffinityResponse;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
