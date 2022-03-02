package defpackage;

import android.os.Parcel;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Response;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: aaip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaip extends bhw implements aaiq {
    private final acwd a;

    public aaip() {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
    }

    public final void a(ClearCorpusCall$Response clearCorpusCall$Response) {
        ihd.a(clearCorpusCall$Response.a, (Object) null, this.a);
    }

    public final void a(DeleteUsageReportCall$Response deleteUsageReportCall$Response) {
        ihd.a(deleteUsageReportCall$Response.a, (Object) null, this.a);
    }

    public aaip(acwd acwd) {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks");
        this.a = acwd;
    }

    public final void a(GetCorpusInfoCall$Response getCorpusInfoCall$Response) {
        ihd.a(getCorpusInfoCall$Response.a, getCorpusInfoCall$Response.b, this.a);
    }

    public final void a(GetCorpusStatusCall$Response getCorpusStatusCall$Response) {
        ihd.a(getCorpusStatusCall$Response.a, getCorpusStatusCall$Response.b, this.a);
    }

    public final void a(RegisterCorpusInfoCall$Response registerCorpusInfoCall$Response) {
        ihd.a(registerCorpusInfoCall$Response.a, (Object) null, this.a);
    }

    public final void a(RequestIndexingCall$Response requestIndexingCall$Response) {
        ihd.a(requestIndexingCall$Response.a, Boolean.valueOf(requestIndexingCall$Response.b), this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                a((RequestIndexingCall$Response) bhx.a(parcel, RequestIndexingCall$Response.CREATOR));
                return true;
            case 3:
                a((ClearCorpusCall$Response) bhx.a(parcel, ClearCorpusCall$Response.CREATOR));
                return true;
            case 4:
                a((GetCorpusStatusCall$Response) bhx.a(parcel, GetCorpusStatusCall$Response.CREATOR));
                return true;
            case 5:
                a((GetCorpusInfoCall$Response) bhx.a(parcel, GetCorpusInfoCall$Response.CREATOR));
                return true;
            case 6:
                a((DeleteUsageReportCall$Response) bhx.a(parcel, DeleteUsageReportCall$Response.CREATOR));
                return true;
            case 7:
                a((RegisterCorpusInfoCall$Response) bhx.a(parcel, RegisterCorpusInfoCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
