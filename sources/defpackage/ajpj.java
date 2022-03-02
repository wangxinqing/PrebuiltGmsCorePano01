package defpackage;

import com.google.android.location.ui.widget.DeviceSwitch;

/* renamed from: ajpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpj implements Runnable {
    final /* synthetic */ DeviceSwitch a;

    public ajpj(DeviceSwitch deviceSwitch) {
        this.a = deviceSwitch;
    }

    public final void run() {
        this.a.b.setVisibility(4);
        this.a.c.setVisibility(0);
    }
}
