package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import java.util.Set;

/* renamed from: aczw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczw extends aczm {
    private final adao a = new adao(this.c, this.g);
    private final amsv b;

    public aczw(Context context, adbx adbx, ClientContext clientContext, String str, amsv amsv) {
        super(context, adbx, clientContext, str, "GetDeviceDataUploadOptInStatusOperation");
        this.i = true;
        this.b = amsv;
    }

    public static DeviceDataUploadOptInFlags a(Context context, Account account, adan adan, adhv adhv) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (atyt atyt : adan.b) {
            int i = atyt.b;
            if (i == 9) {
                int a2 = atzq.a(atyt.d);
                z6 = a2 != 0 && a2 == 3;
            } else if (i == 10) {
                int a3 = atzq.a(atyt.d);
                z5 = a3 != 0 && a3 == 3;
            }
        }
        acyb a4 = new addp(adee.a(context).a(account, jfm.a(10)), adhv).a();
        if (a4 == null || (a4.a & 1) == 0) {
            z = false;
            z2 = false;
        } else {
            atwh atwh = a4.b;
            if (atwh == null) {
                atwh = atwh.d;
            }
            aucx aucx = atwh.b;
            int size = aucx.size();
            z = false;
            z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                atwg atwg = (atwg) aucx.get(i2);
                int a5 = adht.a(atwg.b);
                if (a5 == 7) {
                    z2 = atwg.c;
                } else if (a5 == 8) {
                    z = atwg.c;
                }
            }
        }
        if (!z5) {
            z3 = false;
        } else {
            z3 = z;
        }
        if (z6 && z2) {
            z4 = true;
        }
        return new DeviceDataUploadOptInFlags(z3, z4);
    }

    public final void a(Context context) {
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags;
        super.a(context);
        b();
        if (azrk.f()) {
            deviceDataUploadOptInFlags = adhm.a((agqt) this.b.a());
        } else {
            adan a2 = this.a.a(true, (Set) anax.a((Object) 9, (Object) 10));
            if (a2.a.c()) {
                deviceDataUploadOptInFlags = a(this.c, this.g, a2, this.j);
            } else {
                Status status = a2.a;
                throw new nja(status.i, status.j);
            }
        }
        a(0);
        this.d.a(Status.a, deviceDataUploadOptInFlags);
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (DeviceDataUploadOptInFlags) null);
    }
}
