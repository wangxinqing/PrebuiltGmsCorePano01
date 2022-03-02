package defpackage;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: tkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkj implements Runnable {
    private final Callable a;
    private final uha b;

    public tkj(Callable callable, uha uha) {
        this.a = callable;
        this.b = uha;
    }

    public final void run() {
        int i;
        Callable callable = this.a;
        uha uha = this.b;
        try {
            i = ((Integer) callable.call()).intValue();
        } catch (Exception e) {
            i = 13;
        }
        try {
            uha.a(i);
        } catch (RemoteException e2) {
            tky.a(e2, "Exception invoking IResultListener callback", new Object[0]);
        }
    }
}
