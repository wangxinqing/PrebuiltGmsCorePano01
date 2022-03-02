package defpackage;

import android.content.Intent;
import com.google.android.libraries.bluetooth.fastpair.ConnectException;

/* renamed from: aeff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeff extends aegd {
    final /* synthetic */ aefi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeff(aefi aefi, aefu aefu) {
        super(aefi.a, aefi.b, aefi.d, aefu.c);
        this.a = aefi;
    }

    public final void b(Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", Integer.MIN_VALUE);
        ((anih) ((anih) aehd.a.d()).a("aeff", "b", 647, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Connection state changed to %d", intExtra);
        if (intExtra == 0) {
            throw new ConnectException(4, "Disconnected", new Object[0]);
        } else if (intExtra == 2) {
            aeih aeih = new aeih(this.a.f, "Close ConnectedReceiver");
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
