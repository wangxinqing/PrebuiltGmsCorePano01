package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;

/* renamed from: aboy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aboy {
    public static final acpz a = acqa.a("DirectTransferListenerHolder");
    public final abwu b;

    public aboy(abwu abwu) {
        this.b = abwu;
    }

    public final void a(PendingIntent pendingIntent) {
        try {
            this.b.a(pendingIntent);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }
}
