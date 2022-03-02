package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqu extends tiz {
    final /* synthetic */ abqw a;
    private final String b;
    private final String c;

    public abqu(abqw abqw, String str, String str2) {
        this.a = abqw;
        this.b = str;
        this.c = str2;
    }

    public final void a(String str) {
        abqw.b.d("Lost connection to target endpoint: %s", str);
    }

    public final void a(String str, tiv tiv) {
        acwa acwa;
        abqw.b.b("Found endpoint: %s", str);
        acbs a2 = acbr.a(tiv.a);
        acbp b2 = a2.b();
        String b3 = b2.b();
        abqw.b.a("Device name: %s", a2.a());
        if (this.b.equals(b3)) {
            abqw.b.a("Requesting connection to device: %s (%s)", tiv.a, str);
            abqw abqw = this.a;
            abqw.g = str;
            abqw.b();
            String str2 = this.c;
            if (str2 != null) {
                acwa = this.a.a(str, azky.c(), (tim) new abqv(this.a, str2));
            } else {
                this.a.i = b2.a();
                acwa = this.a.a(str, azky.c(), this.a.m);
            }
            Status a3 = acqd.a(acwa);
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
                    return;
                }
                return;
            }
            return;
        }
        abqw.b.b("Ignoring device with pairing code %s.", b3);
    }
}
