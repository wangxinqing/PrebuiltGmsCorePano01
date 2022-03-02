package defpackage;

import android.os.RemoteException;
import com.google.android.gms.beacon.BleSettings;

/* renamed from: gtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gtm implements igp {
    private final gtr a;
    private final gth b;
    private final ige c;
    private final BleSettings d;

    public gtm(gtr gtr, gth gth, ige ige, BleSettings bleSettings) {
        this.a = gtr;
        this.b = gth;
        this.c = ige;
        this.d = bleSettings;
    }

    public final void a(Object obj, Object obj2) {
        gtr gtr = this.a;
        gth gth = this.b;
        ige ige = this.c;
        BleSettings bleSettings = this.d;
        gui gui = (gui) obj;
        try {
            gui.k().a(new gtp((acwd) obj2), gtr.a.a(ige, gth), bleSettings);
        } catch (RemoteException e) {
            gtr.a.a(gth);
            throw e;
        }
    }
}
