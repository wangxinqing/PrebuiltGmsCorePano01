package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: abtc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abtc implements abtb {
    public static final acpz a = acqa.a("TargetBootstrapListenerHolder");
    public final abxn b;
    public final Context c;

    public abtc(abxn abxn, Context context) {
        this.b = abxn;
        this.c = context;
    }

    public final void a(int i) {
        try {
            this.b.a(i);
        } catch (RemoteException e) {
            a.a((Throwable) e);
        }
    }
}
