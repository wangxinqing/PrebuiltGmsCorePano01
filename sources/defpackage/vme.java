package defpackage;

import android.os.IBinder;

/* renamed from: vme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vme implements IBinder.DeathRecipient {
    private final vmt a;
    private final vyt b;

    public vme(vmt vmt, vyt vyt) {
        this.a = vmt;
        this.b = vyt;
    }

    public final void binderDied() {
        vmt vmt = this.a;
        vyt vyt = this.b;
        wbi wbi = new wbi();
        wbi.a(vyt);
        wbi.a((ifu) vmt.b);
        vmt.a(wbi.a);
    }
}
