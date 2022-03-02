package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abyt implements igp {
    private final D2DDevice a;
    private final BootstrapConfigurations b;
    private final abpu c;
    private final abqf d;

    public abyt(abqf abqf, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, abpu abpu) {
        this.d = abqf;
        this.a = d2DDevice;
        this.b = bootstrapConfigurations;
        this.c = abpu;
    }

    public final void a(Object obj, Object obj2) {
        abqf abqf = this.d;
        D2DDevice d2DDevice = this.a;
        BootstrapConfigurations bootstrapConfigurations = this.b;
        abpu abpu = this.c;
        abzc abzc = new abzc((acwd) obj2);
        ((abxh) ((abyj) obj).x()).a((abxe) new abyb(abzc), d2DDevice, bootstrapConfigurations, (abwy) new abwx(new abza(abqf, abpu)));
    }
}
