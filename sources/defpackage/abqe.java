package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.SourceDeviceChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: abqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqe extends irg {
    public absd a;
    final /* synthetic */ SourceDeviceChimeraService b;
    private acgt h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abqe(SourceDeviceChimeraService sourceDeviceChimeraService) {
        super(sourceDeviceChimeraService, 75, new int[0]);
        this.b = sourceDeviceChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        SourceDeviceChimeraService sourceDeviceChimeraService = this.b;
        String str = getServiceRequest.d;
        acpo acpo = new acpo(sourceDeviceChimeraService);
        boolean a2 = acpo.a(str);
        new isq(str).b();
        Feature[] featureArr = getServiceRequest.i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.a == null) {
                SourceDeviceChimeraService sourceDeviceChimeraService2 = this.b;
                abpn abpn = SourceDeviceChimeraService.a;
                this.a = new absd(sourceDeviceChimeraService2.d, SourceDeviceChimeraService.a, SourceDeviceChimeraService.b, sourceDeviceChimeraService, this.b.c, str, a2);
            }
            absd absd = this.a;
            absd.asBinder();
            isv.a(0, (IBinder) absd, (Bundle) null);
        } else if (featureArr[0].equals(abmo.a)) {
            if (this.h == null) {
                SourceDeviceChimeraService sourceDeviceChimeraService3 = this.b;
                abpn abpn2 = SourceDeviceChimeraService.a;
                this.h = new acgt(sourceDeviceChimeraService3.d, sourceDeviceChimeraService, str, acpo.b(str));
            }
            acgt acgt = this.h;
            acgt.asBinder();
            isv.a(0, (IBinder) acgt, (Bundle) null);
        }
    }
}
