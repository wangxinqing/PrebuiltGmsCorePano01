package defpackage;

import java.util.Collections;

/* renamed from: aidi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aidi implements Runnable {
    private final aidm a;

    public aidi(aidm aidm) {
        this.a = aidm;
    }

    public final void run() {
        aidm aidm = this.a;
        aidm.b.a(Collections.emptyList(), false);
        rom rom = aidm.a;
        if (rom != null) {
            rom.b();
        }
    }
}
