package defpackage;

import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

/* renamed from: uev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uev implements igp {
    private final byte[] a;
    private final String b;
    private final ige c;
    private final ConnectionOptions d;

    public uev(byte[] bArr, String str, ige ige, ConnectionOptions connectionOptions) {
        this.a = bArr;
        this.b = str;
        this.c = ige;
        this.d = connectionOptions;
    }

    public final void a(Object obj, Object obj2) {
        byte[] bArr = this.a;
        String str = this.b;
        ige ige = this.c;
        ConnectionOptions connectionOptions = this.d;
        ueq ueq = (ueq) obj;
        ufs ufs = new ufs((acwd) obj2);
        ueb ueb = new ueb(ige);
        ueq.v.add(ueb);
        uip uip = new uip();
        uip.a((uha) new uen(ufs));
        uip.a.h = bArr;
        uip.b(str);
        uip.a((ugh) ueb);
        SendConnectionRequestParams sendConnectionRequestParams = uip.a;
        sendConnectionRequestParams.i = connectionOptions;
        ((ugu) ueq.x()).a(sendConnectionRequestParams);
    }
}
