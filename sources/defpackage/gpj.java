package defpackage;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: gpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gpj implements Runnable {
    private final gqa a;
    private final boolean b;

    public gpj(gqa gqa, boolean z) {
        this.a = gqa;
        this.b = z;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        alhg alhg;
        gqa gqa = this.a;
        boolean z = this.b;
        if (gqa.G && (glifMinuteMaidLayout = gqa.I) != null && (alhg = glifMinuteMaidLayout.d) != null) {
            alhg.a(z);
        }
    }
}
