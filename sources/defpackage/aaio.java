package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: aaio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaio extends bhv implements aaiq {
    public aaio(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
    }

    public final void a(ClearCorpusCall$Response clearCorpusCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) clearCorpusCall$Response);
        c(3, aQ);
    }

    public final void a(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) deleteUsageReportCall$Response);
        c(6, aQ);
    }

    public final void a(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getCorpusInfoCall$Response);
        c(5, aQ);
    }

    public final void a(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) getCorpusStatusCall$Response);
        c(4, aQ);
    }

    public final void a(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) registerCorpusInfoCall$Response);
        c(7, aQ);
    }

    public final void a(RequestIndexingCall$Response requestIndexingCall$Response) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) requestIndexingCall$Response);
        c(2, aQ);
    }
}
