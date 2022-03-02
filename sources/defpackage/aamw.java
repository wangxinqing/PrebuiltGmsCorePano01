package defpackage;

import android.content.Context;
import android.os.RemoteException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: aamw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamw {
    private static aamw b;
    iwn a;
    private final Object c = new Object();

    public static aamw a() {
        if (b == null) {
            b = new aamw();
        }
        return b;
    }

    public final iwn a(Context context) {
        iwn iwn;
        synchronized (this.c) {
            if (this.a == null) {
                iva.a((Object) context, (Object) "Context must not be null");
                try {
                    this.a = iwm.asInterface(mcx.a(context, mcx.b, "providerinstaller").a("com.google.android.gms.common.net.SocketFactoryCreatorImplV2"));
                } catch (mct e) {
                    this.a = (iwn) new aamv().a(context);
                }
            }
            iwn = this.a;
        }
        return iwn;
    }

    public final SSLSocketFactory a(Context context, TrustManager[] trustManagerArr, boolean z) {
        try {
            return (SSLSocketFactory) mbz.a(a(context).newSocketFactory(mbz.a((Object) context), mbz.a((Object) null), mbz.a((Object) trustManagerArr), z));
        } catch (RemoteException | mca e) {
            throw new RuntimeException(e);
        }
    }
}
