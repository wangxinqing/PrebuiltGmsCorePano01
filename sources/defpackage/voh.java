package defpackage;

import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: voh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class voh implements acvv {
    private final ReceiveSurfaceChimeraActivity a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public voh(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, boolean z, boolean z2, boolean z3) {
        this.a = receiveSurfaceChimeraActivity;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final void a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        if (((Boolean) obj).booleanValue() && z && z2 && z3) {
            receiveSurfaceChimeraActivity.i();
        } else {
            receiveSurfaceChimeraActivity.j();
        }
    }
}
