package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: btp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btp extends btn {
    protected btp() {
    }

    public final int a(ContextManagerClientInfo contextManagerClientInfo) {
        int c = c(contextManagerClientInfo);
        return c == 1 ? btq.a(contextManagerClientInfo.a()) : c;
    }

    public final int b(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.a(contextManagerClientInfo.a());
    }

    public final int d(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int e(ContextManagerClientInfo contextManagerClientInfo) {
        return btn.f(contextManagerClientInfo);
    }

    public final int c(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.a("android.permission.ACCESS_FINE_LOCATION", contextManagerClientInfo, false);
    }
}
