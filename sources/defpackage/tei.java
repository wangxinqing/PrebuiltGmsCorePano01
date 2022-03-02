package defpackage;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: tei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tei implements igp {
    private final Device a;
    private final String b;
    private final String c;
    private final byte d;
    private final String e;
    private final byte f;
    private final tdy g;
    private final tdu h;

    public tei(Device device, String str, String str2, byte b2, String str3, byte b3, tdu tdu, tdy tdy) {
        this.a = device;
        this.b = str;
        this.c = str2;
        this.d = b2;
        this.e = str3;
        this.f = b3;
        this.h = tdu;
        this.g = tdy;
    }

    public final void a(Object obj, Object obj2) {
        Device device = this.a;
        String str = this.b;
        String str2 = this.c;
        byte b2 = this.d;
        String str3 = this.e;
        byte b3 = this.f;
        tdu tdu = this.h;
        tdy tdy = this.g;
        tdo tdo = (tdo) obj;
        idg b4 = tev.b((acwd) obj2);
        tdo.w();
        ((tee) tdo.x()).a(new ConnectRequest(device, str, str2, b2, str3, b3, tdu, tdy, tea.a(b4)));
    }
}
