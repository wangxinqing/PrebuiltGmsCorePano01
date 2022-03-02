package defpackage;

import android.content.Intent;

/* renamed from: aefh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aefh extends aegd {
    final /* synthetic */ aefi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aefh(aefi aefi) {
        super(aefi.a, aefi.b, aefi.d, "android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.a = aefi;
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        if (this.a.d.getBondState() == 10) {
            aeih aeih = new aeih(this.a.f, "Close UnbondedReceiver");
            try {
                close();
                aeih.close();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
