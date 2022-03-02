package defpackage;

import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;

/* renamed from: uew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uew implements ufq {
    private final String a;

    public uew(String str) {
        this.a = str;
    }

    public final void a(ueq ueq, idg idg) {
        String str = this.a;
        int i = ufu.b;
        uhe uhe = new uhe();
        uen uen = new uen(idg);
        InitiateBandwidthUpgradeParams initiateBandwidthUpgradeParams = uhe.a;
        initiateBandwidthUpgradeParams.a = uen;
        initiateBandwidthUpgradeParams.b = str;
        ((ugu) ueq.x()).a(initiateBandwidthUpgradeParams);
    }
}
