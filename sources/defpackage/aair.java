package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: aair  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aair extends bhv implements aait {
    public aair(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaService");
    }

    public final void a(ClearCorpusCall$Request clearCorpusCall$Request, aaiq aaiq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) clearCorpusCall$Request);
        bhx.a(aQ, (IInterface) aaiq);
        b(3, aQ);
    }

    public final void a(DeleteUsageReportCall$Request deleteUsageReportCall$Request, aaiq aaiq) {
        throw null;
    }

    public final void a(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, aaiq aaiq) {
        throw null;
    }

    public final void a(GetCorpusInfoCall$Request getCorpusInfoCall$Request, aaiq aaiq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getCorpusInfoCall$Request);
        bhx.a(aQ, (IInterface) aaiq);
        b(5, aQ);
    }

    public final void a(GetCorpusStatusCall$Request getCorpusStatusCall$Request, aaiq aaiq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getCorpusStatusCall$Request);
        bhx.a(aQ, (IInterface) aaiq);
        b(4, aQ);
    }

    public final void a(RequestIndexingCall$Request requestIndexingCall$Request, aaiq aaiq) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) requestIndexingCall$Request);
        bhx.a(aQ, (IInterface) aaiq);
        b(2, aQ);
    }
}
