package defpackage;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;

/* renamed from: vmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vmg implements Runnable {
    private final vmi a;
    private final OnShareTargetDiscoveredParams b;
    private final String c;
    private final vsh d;

    public vmg(vmi vmi, OnShareTargetDiscoveredParams onShareTargetDiscoveredParams, String str, vsh vsh) {
        this.a = vmi;
        this.b = onShareTargetDiscoveredParams;
        this.c = str;
        this.d = vsh;
    }

    public final void run() {
        vmi vmi = this.a;
        OnShareTargetDiscoveredParams onShareTargetDiscoveredParams = this.b;
        String str = this.c;
        vsh vsh = this.d;
        vmi.b.b.c.w.a(onShareTargetDiscoveredParams.a, str);
        vsh.a(onShareTargetDiscoveredParams.a);
        jjg jjg = vvj.a;
    }
}
