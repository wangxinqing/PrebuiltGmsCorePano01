package defpackage;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: xpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpk {
    public final ClientContext a;
    public final String b;

    public xpk(ClientContext clientContext, String str) {
        this.a = clientContext;
        this.b = str;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("clientContext", this.a);
        a2.a("pageId", this.b);
        return a2.toString();
    }
}
