package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;
import java.util.concurrent.Callable;

/* renamed from: tkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tkk implements Runnable {
    private final Callable a;
    private final uhd b;

    public tkk(Callable callable, uhd uhd) {
        this.a = callable;
        this.b = uhd;
    }

    public final void run() {
        OnStartAdvertisingResultParams onStartAdvertisingResultParams;
        Callable callable = this.a;
        uhd uhd = this.b;
        try {
            onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) callable.call();
        } catch (Exception e) {
            uif uif = new uif();
            uif.a(13);
            onStartAdvertisingResultParams = uif.a;
        }
        try {
            uhd.a(onStartAdvertisingResultParams);
        } catch (RemoteException e2) {
            tky.a(e2, "Exception invoking IStartAdvertisingResultListener callback", new Object[0]);
        }
    }
}
