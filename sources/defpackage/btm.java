package defpackage;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: btm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btm extends btn {
    protected btm() {
    }

    public final int b(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.a("android.permission.WRITE_CALENDAR", contextManagerClientInfo, false);
    }

    public final int c(ContextManagerClientInfo contextManagerClientInfo) {
        return a(contextManagerClientInfo);
    }

    public final int d(ContextManagerClientInfo contextManagerClientInfo) {
        return b(contextManagerClientInfo);
    }

    public final int a(ContextManagerClientInfo contextManagerClientInfo) {
        return btq.a("android.permission.READ_CALENDAR", contextManagerClientInfo, false);
    }
}
