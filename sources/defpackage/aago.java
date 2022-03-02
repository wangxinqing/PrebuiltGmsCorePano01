package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Response;

/* renamed from: aago  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aago extends aafb {
    private final osf a;

    public aago(osf osf, RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ozc ozc) {
        super(aonk.REQUEST_APP_INDEXING_UPDATE_INDEX, 1, 4, osf.b, requestAppIndexingUpdateIndexCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str = ((RequestAppIndexingUpdateIndexCall$Request) this.n).a;
        osf osf = this.a;
        Context context = osf.b;
        if (new owa(context, osf.g, osf.r, new oyt(context)).a(str, System.currentTimeMillis(), aomb.DEBUG_UI_REASON_REBUILD, true)) {
            return new RequestAppIndexingUpdateIndexCall$Response(Status.a, this.a.g.p(str));
        }
        oso.a("Failed to send index request to package %s.", (Object) str);
        return new RequestAppIndexingUpdateIndexCall$Response(Status.c, -1);
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return new RequestAppIndexingUpdateIndexCall$Response(status, -1);
    }
}
