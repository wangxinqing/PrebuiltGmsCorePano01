package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: cij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cij {
    private static int d = 0;
    public final ContextData a;
    public final boolean b;
    public final int c;

    public cij(ContextData contextData, boolean z) {
        this.a = contextData;
        this.b = z;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
