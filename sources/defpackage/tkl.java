package defpackage;

import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import java.util.concurrent.Callable;

/* renamed from: tkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkl implements Callable {
    private final tku a;
    private final tlh b;
    private final StartAdvertisingParams c;

    public tkl(tku tku, tlh tlh, StartAdvertisingParams startAdvertisingParams) {
        this.a = tku;
        this.b = tlh;
        this.c = startAdvertisingParams;
    }

    public final Object call() {
        tku tku = this.a;
        tlh tlh = this.b;
        StartAdvertisingParams startAdvertisingParams = this.c;
        if (tlh.g()) {
            uif uif = new uif();
            uif.a(8001);
            return uif.a;
        }
        byte[] a2 = tku.a(startAdvertisingParams.c, startAdvertisingParams.h);
        int a3 = tku.a.a(tlh, a2, startAdvertisingParams.d, startAdvertisingParams.f, startAdvertisingParams.g);
        uif uif2 = new uif();
        uif2.a(a3);
        if (a3 == 0) {
            uif2.a.b = new String(a2, tlh.a);
        }
        return uif2.a;
    }
}
