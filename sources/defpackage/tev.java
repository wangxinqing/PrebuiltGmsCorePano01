package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tev extends iby implements tda {
    private static final ibq b = new ibq("Nearby.BOOTSTRAP_API", new tep(), new ibg());
    public final udo a = udo.a(this);

    public tev(Context context) {
        super(context, b, (ibm) null, ibx.a);
    }

    public static idg b(acwd acwd) {
        return new ten(acwd);
    }

    public final acwa a(Device device) {
        b(device);
        iha b2 = ihb.b();
        b2.a = new tem(device);
        return b(b2.a());
    }

    public final void b(Device device) {
        udo udo = this.a;
        udo.a((iby) this, udo.b(this, device, "connection"));
    }
}
