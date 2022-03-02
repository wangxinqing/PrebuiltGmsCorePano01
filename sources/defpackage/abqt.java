package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: abqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abqt extends tiz {
    final /* synthetic */ abqw a;
    private final byte[] b;

    public abqt(abqw abqw, byte[] bArr) {
        this.a = abqw;
        this.b = bArr;
    }

    public final void a(String str) {
        abqw.b.d("Lost connection to target endpoint: %s", str);
    }

    public final void a(String str, tiv tiv) {
        abqw.b.b("Found endpoint: %s", str);
        acbs a2 = acbr.a(tiv.a);
        acbp b2 = a2.b();
        byte[] c = b2.c();
        abqw.b.a("Device name: %s", a2.a());
        if (!Arrays.equals(this.b, c)) {
            abqw.b.b("Ignoring device with fast pair code %s.", Arrays.toString(c));
            return;
        }
        this.a.b();
        abqw.b.a("Requesting connection to device: %s (%s)", tiv.a, str);
        abqw abqw = this.a;
        abqw.g = str;
        abqw.i = b2.a();
        Status a3 = acqd.a(this.a.a(str, azky.c(), this.a.m));
        if (!a3.equals(Status.a)) {
            iwd iwd = abqw.b;
            String valueOf = String.valueOf(a3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Request Connection failed: ");
            sb.append(valueOf);
            iwd.d(sb.toString(), new Object[0]);
            abqw abqw2 = this.a;
            abqw2.g = null;
            acau acau = abqw2.e;
            if (acau != null) {
                acau.a(10584);
            }
        }
    }
}
