package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpx implements abqg {
    private static final iwd d = acqa.a("SourceConnectorCompat");
    public final abqg a;
    public final abqw b;
    public int c = 1;

    public abpx(abqg abqg, abqw abqw) {
        this.a = abqg;
        this.b = abqw;
    }

    public final acwa a() {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            d.d("disconnect called without a specified protocol", new Object[0]);
            return acws.a(this.a.a(), this.b.a());
        } else if (i2 == 1) {
            return this.a.a();
        } else {
            if (i2 != 2) {
                return acws.a((Exception) new ibr(new Status(13)));
            }
            return this.b.a();
        }
    }

    public final acwa a(D2DDevice d2DDevice, acau acau, String str) {
        throw null;
    }
}
