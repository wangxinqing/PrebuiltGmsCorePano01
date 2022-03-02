package defpackage;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: abyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abyr implements igp {
    private final ConnectionRequest a;
    private final abpw b;
    private final abqf c;

    public abyr(abqf abqf, ConnectionRequest connectionRequest, abpw abpw) {
        this.c = abqf;
        this.a = connectionRequest;
        this.b = abpw;
    }

    public final void a(Object obj, Object obj2) {
        abqf abqf = this.c;
        ConnectionRequest connectionRequest = this.a;
        abpw abpw = this.b;
        abzc abzc = new abzc((acwd) obj2);
        ((abxh) ((abyj) obj).x()).a(new ConnectParams(new abyc(abzc), connectionRequest, abqf.a(abpw)));
    }
}
