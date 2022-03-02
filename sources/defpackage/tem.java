package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;

/* renamed from: tem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tem implements igp {
    private final Device a;

    public tem(Device device) {
        this.a = device;
    }

    public final void a(Object obj, Object obj2) {
        Device device = this.a;
        tdo tdo = (tdo) obj;
        idg b = tev.b((acwd) obj2);
        tdo.w();
        ((tee) tdo.x()).a(new DisconnectRequest(device, tea.a(b)));
    }
}
