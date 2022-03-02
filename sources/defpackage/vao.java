package defpackage;

import android.os.RemoteException;

/* renamed from: vao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vao extends arwm {
    final /* synthetic */ String a;
    final /* synthetic */ var b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vao(var var, String str, String str2) {
        super(str);
        this.b = var;
        this.a = str2;
    }

    public final void run() {
        vcm vcm = (vcm) this.b.a.c(this.a);
        if (vcm != null) {
            try {
                jjg jjg = tgc.a;
                vcm.b();
            } catch (RemoteException e) {
            }
            this.b.a.b(this.a);
            this.b.b.remove(this.a);
        }
        this.b.a();
    }
}
