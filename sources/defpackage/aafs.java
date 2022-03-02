package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;

/* renamed from: aafs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aafs extends aafb {
    private final osf a;

    public aafs(osf osf, ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ozc ozc) {
        super(aonk.CLEAR_DEBUG_UI_CACHE, 1, 4, osf.b, clearDebugUiCacheCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        try {
            oxx.a(this.a.b).a(((ClearDebugUiCacheCall$Request) this.n).a);
            return new ClearDebugUiCacheCall$Response(Status.a);
        } catch (Exception e) {
            this.a.n().a("ClearDebugUiCacheTask", e, axrp.f());
            return new ClearDebugUiCacheCall$Response(Status.c);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return new ClearDebugUiCacheCall$Response(status);
    }
}
