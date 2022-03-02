package defpackage;

import android.os.IBinder;

/* renamed from: vkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vkk implements IBinder.DeathRecipient {
    private final vmt a;
    private final vyt b;

    public vkk(vmt vmt, vyt vyt) {
        this.a = vmt;
        this.b = vyt;
    }

    public final void binderDied() {
        vmt vmt = this.a;
        vyt vyt = this.b;
        wbg wbg = new wbg();
        wbg.a(vyt);
        vmt.a(wbg.a);
    }
}
