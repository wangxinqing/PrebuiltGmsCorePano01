package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: tel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tel implements igp {
    private final Device a;
    private final byte[] b;

    public tel(Device device, byte[] bArr) {
        this.a = device;
        this.b = bArr;
    }

    public final void a(Object obj, Object obj2) {
        Device device = this.a;
        byte[] bArr = this.b;
        tdo tdo = (tdo) obj;
        idg b2 = tev.b((acwd) obj2);
        tdo.w();
        ((tee) tdo.x()).a(new SendDataRequest(device, bArr, tea.a(b2)));
    }
}
