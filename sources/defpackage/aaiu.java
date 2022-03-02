package defpackage;

import com.google.android.gms.search.corpora.RequestIndexingCall$Request;

/* renamed from: aaiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaiu implements igp {
    private final String a;
    private final String b;
    private final long c;

    public aaiu(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        aaip aaip = new aaip((acwd) obj2);
        RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
        requestIndexingCall$Request.a = str;
        requestIndexingCall$Request.b = str2;
        requestIndexingCall$Request.c = j;
        ((aait) ((aaja) obj).x()).a(requestIndexingCall$Request, (aaiq) aaip);
    }
}
