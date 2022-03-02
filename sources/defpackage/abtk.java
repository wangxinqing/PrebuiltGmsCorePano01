package defpackage;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;

/* renamed from: abtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abtk implements abtl {
    private final abtm a;
    private final abnn b;
    private final BootstrapConfigurations c;

    public abtk(abtm abtm, abnn abnn, BootstrapConfigurations bootstrapConfigurations) {
        iva.a((Object) abtm, (Object) "controller cannot be null.");
        this.a = abtm;
        this.b = abnn;
        iva.a((Object) bootstrapConfigurations, (Object) "bootstrapConfigurations cannot be null.");
        this.c = bootstrapConfigurations;
    }

    public final void a() {
        abtm.d.b("Processing Wi-Fi in BootstrapConfigurations.", new Object[0]);
        String str = this.c.d;
        iwd iwd = abtm.d;
        String valueOf = String.valueOf(str);
        iwd.a(valueOf.length() == 0 ? new String("BootstrapConfigurations SSID: ") : "BootstrapConfigurations SSID: ".concat(valueOf), new Object[0]);
        abtm.d.a("Creating WifiConfiguration", new Object[0]);
        try {
            BootstrapConfigurations bootstrapConfigurations = this.c;
            if (new acqk(this.a.e).a(acqo.a(bootstrapConfigurations.f, bootstrapConfigurations.d, bootstrapConfigurations.e, false)) == -1) {
                abtm.d.e("Could not setup wifi, likely due to authentication error", new Object[0]);
                abtm abtm = this.a;
                MessagePayload messagePayload = new MessagePayload();
                messagePayload.h = new ProgressEvent((byte[]) null);
                messagePayload.a.add(8);
                abtm.b(messagePayload);
                abtm.i = true;
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ssid", str);
            this.a.a(new BootstrapProgressResult(2, bundle));
        } catch (UnsupportedOperationException e) {
            abtm.d.e("Exception setting up WiFi", e, new Object[0]);
            this.a.d(10574);
            this.b.a(10574);
        }
    }
}
