package defpackage;

import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;

/* renamed from: aaiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaiw implements igp {
    private final String a;
    private final String b;

    public aaiw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        aaip aaip = new aaip((acwd) obj2);
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.a = str;
        getCorpusStatusCall$Request.b = str2;
        ((aait) ((aaja) obj).x()).a(getCorpusStatusCall$Request, (aaiq) aaip);
    }
}
