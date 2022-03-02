package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: aaif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aaif extends aafb {
    private final ppp a;
    public final paj b;
    private final ozs c;
    private final owf d;

    public aaif(Context context, ppp ppp, ozs ozs, paj paj, owf owf, RequestIndexingCall$Request requestIndexingCall$Request, ozc ozc) {
        super(aonk.REQUEST_INDEXING, 2, 1, context, requestIndexingCall$Request, ozc);
        this.a = ppp;
        this.c = ozs;
        this.b = paj;
        this.d = owf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        owf owf;
        RequestIndexingCall$Response requestIndexingCall$Response = new RequestIndexingCall$Response();
        RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) this.n;
        String str2 = requestIndexingCall$Request.a;
        String str3 = requestIndexingCall$Request.b;
        long j = requestIndexingCall$Request.c;
        try {
            osn.a("Corpus name", str3, 2048);
            if (j < 0) {
                str = "Negative sequence number";
            } else {
                str = null;
            }
        } catch (IllegalArgumentException e) {
            str = e.getMessage();
        }
        boolean z = true;
        boolean z2 = false;
        if (str == null) {
            ozs ozs = this.c;
            ozc ozc = this.o;
            RequestIndexingCall$Request requestIndexingCall$Request2 = (RequestIndexingCall$Request) this.n;
            for (pao pao : ozs.a(ozc, new String[]{requestIndexingCall$Request2.b}, false, requestIndexingCall$Request2.a)) {
                ota b2 = this.c.b(pao);
                if (b2 != null) {
                    osz osz = b2.b;
                    if (osz == null) {
                        osz = osz.s;
                    }
                    if (ozq.a(osz)) {
                        this.a.a(new aaie(this, aonk.SCHEDULE_INDEXING, this.j, pao), ((Long) ozx.K.c()).longValue());
                        z2 = true;
                    }
                }
            }
            if (!z2 || (owf = this.d) == null) {
                z = z2;
            } else {
                owf.b();
            }
        } else {
            oso.b("Bad request indexing args: %s", (Object) str);
            z = false;
        }
        requestIndexingCall$Response.b = z;
        requestIndexingCall$Response.a = Status.a;
        return requestIndexingCall$Response;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) this.n;
        return String.format("%s, package[%s], corpus[%s]", new Object[]{super.f(), requestIndexingCall$Request.a, requestIndexingCall$Request.b});
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        RequestIndexingCall$Response requestIndexingCall$Response = new RequestIndexingCall$Response();
        requestIndexingCall$Response.a = status;
        return requestIndexingCall$Response;
    }
}
