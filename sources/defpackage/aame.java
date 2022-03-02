package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: aame  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aame extends bhv implements aamg {
    public aame(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
    }

    public final void a(AnnotateCall$Response annotateCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) annotateCall$Response);
        c(7, aQ);
    }

    public final void a(GetDocumentsCall$Response getDocumentsCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getDocumentsCall$Response);
        c(4, aQ);
    }

    public final void a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getPhraseAffinityCall$Response);
        c(5, aQ);
    }

    public final void a(GlobalQueryCall$Response globalQueryCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) globalQueryCall$Response);
        c(3, aQ);
    }

    public final void a(QueryCall$Response queryCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) queryCall$Response);
        c(2, aQ);
    }

    public final void a(QuerySuggestCall$Response querySuggestCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) querySuggestCall$Response);
        c(6, aQ);
    }
}
