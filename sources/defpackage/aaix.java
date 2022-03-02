package defpackage;

import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;

/* renamed from: aaix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aaix implements igp {
    private final String a;
    private final String b;

    public aaix(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        aaip aaip = new aaip((acwd) obj2);
        GetCorpusInfoCall$Request getCorpusInfoCall$Request = new GetCorpusInfoCall$Request();
        getCorpusInfoCall$Request.a = str;
        getCorpusInfoCall$Request.b = str2;
        ((aait) ((aaja) obj).x()).a(getCorpusInfoCall$Request, (aaiq) aaip);
    }
}
