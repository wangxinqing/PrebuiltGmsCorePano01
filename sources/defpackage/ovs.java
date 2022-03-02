package defpackage;

import android.content.Context;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;

/* renamed from: ovs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ovs extends aaif {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ovs(Context context, ppp ppp, ozs ozs, paj paj, owf owf, RequestIndexingCall$Request requestIndexingCall$Request, ozc ozc, String str) {
        super(context, ppp, ozs, paj, owf, requestIndexingCall$Request, ozc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        RequestIndexingCall$Response requestIndexingCall$Response = (RequestIndexingCall$Response) obj;
        if (!requestIndexingCall$Response.a.c()) {
            oso.b("Request indexing failed for corpus '%s':'%s'.", (Object) this.a, (Object) requestIndexingCall$Response.a);
        }
    }
}
