package defpackage;

import android.os.RemoteException;

/* renamed from: vap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vap extends arwm {
    final /* synthetic */ vaq a;
    final /* synthetic */ var b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vap(var var, String str, vaq vaq) {
        super(str);
        this.b = var;
        this.a = vaq;
    }

    public final void run() {
        vcq vcq = (vcq) this.b.c.c(this.a);
        if (vcq != null) {
            try {
                jjg jjg = tgc.a;
                vcq.b();
            } catch (RemoteException e) {
            }
            this.b.c.b(this.a);
            this.b.d.remove(this.a);
        }
        this.b.a();
    }
}
