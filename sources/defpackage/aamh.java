package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;

/* renamed from: aamh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamh extends bhv implements aamj {
    public aamh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
    }

    public final void a(aamg aamg) {
        throw null;
    }

    public final void a(GetDocumentsCall$Request getDocumentsCall$Request, aamg aamg) {
        throw null;
    }

    public final void a(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, aamg aamg) {
        throw null;
    }

    public final void a(GlobalQueryCall$Request globalQueryCall$Request, aamg aamg) {
        throw null;
    }

    public final void a(QuerySuggestCall$Request querySuggestCall$Request, aamg aamg) {
        throw null;
    }

    public final void a(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        c(8, aQ);
    }

    public final void a(QueryCall$Request queryCall$Request, aamg aamg) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) queryCall$Request);
        bhx.a(aQ, (IInterface) aamg);
        b(2, aQ);
    }
}
