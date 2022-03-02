package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: btn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class btn {
    protected static final int f(ContextManagerClientInfo contextManagerClientInfo) {
        if (awwt.b()) {
            return btq.a("android.permission.ACCESS_FINE_LOCATION", contextManagerClientInfo, true);
        }
        return 1;
    }

    public final int a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        if (i == 0) {
            return c(contextManagerClientInfo);
        }
        if (i == 1) {
            return d(contextManagerClientInfo);
        }
        if (i == 2) {
            return b(contextManagerClientInfo);
        }
        if (i == 3) {
            return a(contextManagerClientInfo);
        }
        if (i == 4) {
            return e(contextManagerClientInfo);
        }
        ((anih) ((anih) bxk.a.b()).a("btn", "a", 154, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextSpecificAclFactory] Unknown permission: %s, clientInfo=%s", i, (Object) contextManagerClientInfo);
        return -1;
    }

    /* access modifiers changed from: protected */
    public abstract int a(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    public abstract int b(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    public abstract int c(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    public abstract int d(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    public int e(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }
}
