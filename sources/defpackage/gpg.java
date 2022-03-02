package defpackage;

import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;

/* renamed from: gpg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gpg implements Runnable {
    private final gqa a;
    private final String b;
    private final int c;

    public gpg(gqa gqa, String str, int i) {
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
            glifMinuteMaidLayout.a(str, i, gqa);
        }
    }
}
