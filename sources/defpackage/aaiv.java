package defpackage;

import com.google.android.gms.search.corpora.ClearCorpusCall$Request;

/* renamed from: aaiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaiv implements igp {
    private final String a;
    private final String b;

    public aaiv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        aaip aaip = new aaip((acwd) obj2);
        ClearCorpusCall$Request clearCorpusCall$Request = new ClearCorpusCall$Request();
        clearCorpusCall$Request.a = str;
        clearCorpusCall$Request.b = str2;
        ((aait) ((aaja) obj).x()).a(clearCorpusCall$Request, (aaiq) aaip);
    }
}
