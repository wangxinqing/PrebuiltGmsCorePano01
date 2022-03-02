package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.WifiRadio$1;

/* renamed from: upa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class upa implements Runnable {
    private final WifiRadio$1 a;
    private final Intent b;

    public upa(WifiRadio$1 wifiRadio$1, Intent intent) {
        this.a = wifiRadio$1;
        this.b = intent;
    }

    public final void run() {
        WifiRadio$1 wifiRadio$1 = this.a;
        wifiRadio$1.a.a(this.b);
    }
}
