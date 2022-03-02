package defpackage;

import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;

/* renamed from: aahv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aahv extends aafb {
    private final osf a;

    public aahv(osf osf, GetCorpusInfoCall$Request getCorpusInfoCall$Request, ozc ozc) {
        super(aonk.GET_CORPUS_INFO, 1, 1, osf.b, getCorpusInfoCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        RegisterCorpusInfo registerCorpusInfo;
        GetCorpusInfoCall$Response getCorpusInfoCall$Response = new GetCorpusInfoCall$Response();
        osf osf = this.a;
        ozc ozc = this.o;
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) this.n;
        osz a2 = osf.a(ozc, getCorpusInfoCall$Request.b, getCorpusInfoCall$Request.a);
        if (a2 != null) {
            registerCorpusInfo = ozq.h(a2);
        } else {
            registerCorpusInfo = null;
        }
        getCorpusInfoCall$Response.b = registerCorpusInfo;
        getCorpusInfoCall$Response.a = Status.a;
        return getCorpusInfoCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) this.n;
        return String.format("%s, package[%s], corpus[%s] ", new Object[]{super.f(), getCorpusInfoCall$Request.a, getCorpusInfoCall$Request.b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetCorpusInfoCall$Response getCorpusInfoCall$Response = new GetCorpusInfoCall$Response();
        getCorpusInfoCall$Response.a = status;
        return getCorpusInfoCall$Response;
    }
}
