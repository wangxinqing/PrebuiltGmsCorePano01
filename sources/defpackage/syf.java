package defpackage;

import android.content.Intent;

/* renamed from: syf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class syf implements Runnable {
    private final syj a;
    private final int b;
    private final sut c;
    private final Intent d;

    public syf(syj syj, int i, sut sut, Intent intent) {
        this.a = syj;
        this.b = i;
        this.c = sut;
        this.d = intent;
    }

    public final void run() {
        syj syj = this.a;
        int i = this.b;
        sut sut = this.c;
        Intent intent = this.d;
        if (((syi) syj.a).a(i)) {
            sut.k.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            syj.c().k.a("Completed wakeful intent.");
            ((syi) syj.a).a(intent);
        }
    }
}
