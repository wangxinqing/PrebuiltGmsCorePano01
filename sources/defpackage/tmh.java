package defpackage;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.concurrent.Callable;

/* renamed from: tmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tmh implements Callable {
    private final tmz a;
    private final tlh b;
    private final byte[] c;
    private final String d;
    private final AdvertisingOptions e;
    private final ugh f;

    public tmh(tmz tmz, tlh tlh, byte[] bArr, String str, AdvertisingOptions advertisingOptions, ugh ugh) {
        this.a = tmz;
        this.b = tlh;
        this.c = bArr;
        this.d = str;
        this.e = advertisingOptions;
        this.f = ugh;
    }

    public final Object call() {
        byte[] bArr;
        tmz tmz = this.a;
        tlh tlh = this.b;
        byte[] bArr2 = this.c;
        String str = this.d;
        AdvertisingOptions advertisingOptions = this.e;
        ugh ugh = this.f;
        int a2 = tlh.a(tmz.b());
        if (a2 != 0) {
            ((anih) tky.a.b()).a("Missing required permissions, aborting call to startAdvertising() for endpointInfo %s and serviceId %s", (Object) tky.a(bArr2), (Object) str);
            return Integer.valueOf(a2);
        }
        String c2 = tlh.c();
        if (aymi.w()) {
            bArr = tlh.n();
        } else {
            bArr = null;
        }
        tmw a3 = tmz.a(tlh, str, c2, bArr2, bArr, advertisingOptions);
        int i = a3.a;
        if (i != 0) {
            return Integer.valueOf(i);
        }
        tlh.a(str, tmz.g(), ugh, a3.b, advertisingOptions);
        return 0;
    }
}
