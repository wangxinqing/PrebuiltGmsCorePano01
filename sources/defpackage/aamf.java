package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Response;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;
import com.google.android.gms.search.queries.GlobalQueryCall$Response;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;

/* renamed from: aamf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamf extends bhw implements aamg {
    private final aamn a;
    private final acwd b;

    public aamf() {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
    }

    private final void a(Bundle bundle) {
        if (bundle != null && bundle.containsKey("should_log_stats")) {
            bundle.putLong("response_timestamp_ms", System.currentTimeMillis());
            try {
                ((aamj) this.a.x()).a(bundle);
            } catch (IllegalStateException e) {
                RemoteException remoteException = new RemoteException();
                remoteException.initCause(e);
                throw remoteException;
            } catch (RemoteException e2) {
            }
        }
    }

    public aamf(aamn aamn, acwd acwd) {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks");
        this.a = aamn;
        this.b = acwd;
    }

    public final void a(AnnotateCall$Response annotateCall$Response) {
        a(annotateCall$Response.c);
        ihd.a(annotateCall$Response.a, annotateCall$Response.b, this.b);
    }

    public final void a(GetDocumentsCall$Response getDocumentsCall$Response) {
        a(getDocumentsCall$Response.c);
        ihd.a(getDocumentsCall$Response.a, getDocumentsCall$Response.b, this.b);
    }

    public final void a(GetPhraseAffinityCall$Response getPhraseAffinityCall$Response) {
        a(getPhraseAffinityCall$Response.c);
        ihd.a(getPhraseAffinityCall$Response.a, getPhraseAffinityCall$Response.b, this.b);
    }

    public final void a(GlobalQueryCall$Response globalQueryCall$Response) {
        a(globalQueryCall$Response.c);
        ihd.a(globalQueryCall$Response.a, globalQueryCall$Response.b, this.b);
    }

    public final void a(QueryCall$Response queryCall$Response) {
        a(queryCall$Response.c);
        ihd.a(queryCall$Response.a, queryCall$Response.b, this.b);
    }

    public final void a(QuerySuggestCall$Response querySuggestCall$Response) {
        a(querySuggestCall$Response.c);
        ihd.a(querySuggestCall$Response.a, querySuggestCall$Response.b, this.b);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                a((QueryCall$Response) bhx.a(parcel, QueryCall$Response.CREATOR));
                return true;
            case 3:
                a((GlobalQueryCall$Response) bhx.a(parcel, GlobalQueryCall$Response.CREATOR));
                return true;
            case 4:
                a((GetDocumentsCall$Response) bhx.a(parcel, GetDocumentsCall$Response.CREATOR));
                return true;
            case 5:
                a((GetPhraseAffinityCall$Response) bhx.a(parcel, GetPhraseAffinityCall$Response.CREATOR));
                return true;
            case 6:
                a((QuerySuggestCall$Response) bhx.a(parcel, QuerySuggestCall$Response.CREATOR));
                return true;
            case 7:
                a((AnnotateCall$Response) bhx.a(parcel, AnnotateCall$Response.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
