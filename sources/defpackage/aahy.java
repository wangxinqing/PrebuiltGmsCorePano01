package defpackage;

import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* renamed from: aahy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aahy extends aafb {
    private final osf a;

    public aahy(osf osf, GetCorpusStatusCall$Request getCorpusStatusCall$Request, ozc ozc) {
        super(aonk.GET_CORPUS_STATUS, 1, 1, osf.b, getCorpusStatusCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = new GetCorpusStatusCall$Response();
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) this.n;
        String str2 = getCorpusStatusCall$Request.a;
        CorpusStatus corpusStatus = null;
        try {
            osn.a("Corpus name", getCorpusStatusCall$Request.b, 2048);
            str = null;
        } catch (IllegalArgumentException e) {
            str = e.getMessage();
        }
        if (str == null) {
            osf osf = this.a;
            ozc ozc = this.o;
            GetCorpusStatusCall$Request getCorpusStatusCall$Request2 = (GetCorpusStatusCall$Request) this.n;
            corpusStatus = osf.b(ozc, getCorpusStatusCall$Request2.b, getCorpusStatusCall$Request2.a);
        } else {
            oso.b("Bad get corpus status args: %s", (Object) str);
        }
        getCorpusStatusCall$Response.b = corpusStatus;
        getCorpusStatusCall$Response.a = Status.a;
        return getCorpusStatusCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) this.n;
        return String.format("%s, package[%s], corpus[%s]", new Object[]{super.f(), getCorpusStatusCall$Request.a, getCorpusStatusCall$Request.b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = new GetCorpusStatusCall$Response();
        getCorpusStatusCall$Response.a = status;
        return getCorpusStatusCall$Response;
    }
}
