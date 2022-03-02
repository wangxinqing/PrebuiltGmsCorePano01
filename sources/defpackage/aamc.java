package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.AnnotateCall$Response;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import java.util.List;

/* renamed from: aamc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamc extends aami implements jbh {
    private final osf a;
    private final ozc b;

    public aamc(osf osf, ozc ozc) {
        iva.a((Object) osf);
        this.a = osf;
        this.b = ozc;
    }

    public final void a(aamg aamg) {
        try {
            aamg.a(new AnnotateCall$Response(new Status(13, "Annotation API is not enabled."), (List) null, (Bundle) null));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(Bundle bundle) {
        osf osf = this.a;
        osf.c.d(new aalm(osf, bundle, this.b));
    }

    public final void a(GetDocumentsCall$Request getDocumentsCall$Request, aamg aamg) {
        osf osf = this.a;
        osf.c.d(new aama(osf, getDocumentsCall$Request, this.b, aamg));
    }

    public final void a(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, aamg aamg) {
        osf osf = this.a;
        osf.c.d(new aamb(osf, getPhraseAffinityCall$Request, this.b, aamg));
    }

    public final void a(GlobalQueryCall$Request globalQueryCall$Request, aamg aamg) {
        osf osf = this.a;
        osf.c.d(new aalz(osf, globalQueryCall$Request, this.b, aamg));
    }

    public final void a(QueryCall$Request queryCall$Request, aamg aamg) {
        osf osf = this.a;
        osf.c.d(new aalx(osf, queryCall$Request, this.b, aamg));
    }

    public final void a(QuerySuggestCall$Request querySuggestCall$Request, aamg aamg) {
        osf osf = this.a;
        osf.c.d(new aaly(osf, querySuggestCall$Request, this.b, aamg));
    }
}
