package defpackage;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: ascj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ascj extends asdz {
    final /* synthetic */ ascn a;

    public ascj(ascn ascn) {
        this.a = ascn;
    }

    public final void a(int i, BleSighting bleSighting) {
        this.a.d.c(new ascg(this, "BackgroundBleScanner_onScanResult", bleSighting));
    }

    public final void b(int i) {
        this.a.d.c(new asci(this, "BackgroundBleScanner_onScanModeUpdate", i));
    }

    public final void a(String str) {
        this.a.d.c(new asch(this, "BackgroundBleScanner_onDeviceLost", str));
    }
}
