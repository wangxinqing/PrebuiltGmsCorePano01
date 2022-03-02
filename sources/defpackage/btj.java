package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: btj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btj extends btn {
    protected btj() {
    }

    public final int a(ContextManagerClientInfo contextManagerClientInfo) {
        int c = c(contextManagerClientInfo);
        return c == 1 ? btq.b(contextManagerClientInfo.a()) : c;
    }

    public final int b(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.b(contextManagerClientInfo.a());
    }

    public final int d(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }

    public final int c(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.a("com.google.android.gms.permission.ACTIVITY_RECOGNITION", contextManagerClientInfo, false);
    }
}
