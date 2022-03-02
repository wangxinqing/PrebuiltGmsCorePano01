package defpackage;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: bwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bwe extends jtv {
    private final String CH;
    public final but a;

    public bwe(but but, String str) {
        iva.a((Object) but);
        this.a = but;
        this.CH = str;
    }

    public final void a(ContextData contextData) {
        this.a.a(new bwd(this, contextData), bvq.a(String.valueOf(this.CH).concat("_receive")));
    }

    public abstract void b(ContextData contextData);
}
