package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: gph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gph implements Runnable {
    private final gqa a;
    private final String b;
    private final int c;

    public gph(gqa gqa, String str, int i) {
        this.a = gqa;
        this.b = str;
        this.c = i;
    }

    public final void run() {
        GlifMinuteMaidLayout glifMinuteMaidLayout;
        gqa gqa = this.a;
        String str = this.b;
        int i = this.c;
        if (gqa.G && (glifMinuteMaidLayout = gqa.I) != null) {
            if (TextUtils.isEmpty(str)) {
                alhg alhg = glifMinuteMaidLayout.d;
                if (alhg != null) {
                    alhg.a(8);
                    return;
                }
                return;
            }
            alhf alhf = new alhf(glifMinuteMaidLayout.a);
            alhf.c = i;
            alhf.d = 2132018061;
            alhf.a = str;
            glifMinuteMaidLayout.d = alhf.a();
            glifMinuteMaidLayout.d.a(0);
            glifMinuteMaidLayout.b.b(glifMinuteMaidLayout.d);
            glifMinuteMaidLayout.d.f = new gos(gqa);
        }
    }
}
