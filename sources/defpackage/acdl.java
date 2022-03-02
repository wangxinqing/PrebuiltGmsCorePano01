package defpackage;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: acdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acdl implements acvv {
    private final acdr a;

    public acdl(acdr acdr) {
        this.a = acdr;
    }

    public final void a(Object obj) {
        acdr acdr = this.a;
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        acdr.d = advertisingInfo.b;
        String str = advertisingInfo.d;
        String str2 = advertisingInfo.c;
        acdr.a.a("Retrieved advertising info.", new Object[0]);
        iwd iwd = acdr.a;
        String valueOf = String.valueOf(acdr.d);
        iwd.a(valueOf.length() == 0 ? new String("mDeviceName fetched: ") : "mDeviceName fetched: ".concat(valueOf), new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString("deviceName", acdr.d);
        bundle.putString("pairingCode", str);
        bundle.putString("encodedKey", str2);
        acdr.g.b(116, bundle);
    }
}
