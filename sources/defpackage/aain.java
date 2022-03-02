package defpackage;

import android.content.Context;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: aain  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aain extends aais implements jbh {
    private final osf a;
    private final ozc b;

    public aain(osf osf, ozc ozc) {
        iva.a((Object) osf);
        this.a = osf;
        this.b = ozc;
    }

    public final void a(ClearCorpusCall$Request clearCorpusCall$Request, aaiq aaiq) {
        osf osf = this.a;
        osf.c.d(new aaii(osf, clearCorpusCall$Request, this.b, aaiq));
    }

    public final void a(DeleteUsageReportCall$Request deleteUsageReportCall$Request, aaiq aaiq) {
        osf osf = this.a;
        osf.c.d(new aail(osf, deleteUsageReportCall$Request, this.b, aaiq));
    }

    public final void a(GetCorpusInfoCall$Request getCorpusInfoCall$Request, aaiq aaiq) {
        osf osf = this.a;
        osf.c.d(new aaik(osf, getCorpusInfoCall$Request, this.b, aaiq));
    }

    public final void a(GetCorpusStatusCall$Request getCorpusStatusCall$Request, aaiq aaiq) {
        osf osf = this.a;
        osf.c.d(new aaij(osf, getCorpusStatusCall$Request, this.b, aaiq));
    }

    public final void a(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, aaiq aaiq) {
        osf osf = this.a;
        osf.c.d(new aaim(osf.b, osf, registerCorpusInfoCall$Request, this.b, aaiq));
    }

    public final void a(RequestIndexingCall$Request requestIndexingCall$Request, aaiq aaiq) {
        osf osf = this.a;
        ppp ppp = osf.c;
        Context context = osf.b;
        ozs a2 = osf.a();
        osf osf2 = this.a;
        ppp.d(new aaih(context, ppp, a2, osf2.o, osf2.q, requestIndexingCall$Request, this.b, aaiq));
    }
}
