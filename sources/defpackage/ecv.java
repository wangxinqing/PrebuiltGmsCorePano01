package defpackage;

import android.os.RemoteException;

/* renamed from: ecv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ecv implements Runnable {
    private final efi a;

    public ecv(efi efi) {
        this.a = efi;
    }

    public final void run() {
        try {
            this.a.b();
        } catch (RemoteException e) {
            anih anih = (anih) edx.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("eda", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't close audio stream");
        }
    }
}
