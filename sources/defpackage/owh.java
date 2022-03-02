package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;

/* renamed from: owh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owh extends oxu {
    final /* synthetic */ GetIndexableRequest a;
    final /* synthetic */ ovw b;
    final /* synthetic */ apmq c;
    final /* synthetic */ apms d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public owh(apms apms, oyt oyt, oxc oxc, oyq oyq, oxx oxx, GetIndexableRequest getIndexableRequest, ovw ovw, apmq apmq) {
        super(oyt, oxc, oyq, oxx);
        this.d = apms;
        this.a = getIndexableRequest;
        this.b = ovw;
        this.c = apmq;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        List a2 = this.d.a(this.a.b);
        apms apms = this.d;
        ovw ovw = this.b;
        GetIndexableRequest getIndexableRequest = this.a;
        Thing a3 = apms.a(ovw, a2, getIndexableRequest.b, getIndexableRequest.a);
        if (a3 != null) {
            return a3;
        }
        List a4 = this.d.a(a2, new String[]{this.a.a});
        if (a4.isEmpty()) {
            return null;
        }
        return (Thing) a4.get(0);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Status status, Object obj) {
        this.c.a(new GetIndexableResponse(status, (Thing) obj));
    }
}
