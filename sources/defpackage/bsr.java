package defpackage;

import android.os.Process;
import android.util.Log;

/* renamed from: bsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bsr implements Runnable {
    final /* synthetic */ bss a;

    public bsr(bss bss) {
        this.a = bss;
    }

    public final void run() {
        Process.sendSignal(Process.myPid(), 3);
        String valueOf = String.valueOf(this.a.b);
        Log.wtf("ChimeraSliceProviderCom", valueOf.length() == 0 ? new String("Timed out while handling slice callback ") : "Timed out while handling slice callback ".concat(valueOf));
    }
}
