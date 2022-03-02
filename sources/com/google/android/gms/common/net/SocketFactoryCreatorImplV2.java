package com.google.android.gms.common.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.ClientSessionContext;
import com.google.android.gms.org.conscrypt.FileClientSessionCache;
import com.google.android.gms.org.conscrypt.OpenSSLContextImpl;
import com.google.android.gms.org.conscrypt.SSLClientSessionCache;
import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SocketFactoryCreatorImplV2 extends iwm {
    private static final SSLClientSessionCache a(Context context, String str) {
        File dir = context.getDir(str, 0);
        try {
            return FileClientSessionCache.usingDirectory(dir);
        } catch (IOException e) {
            String valueOf = String.valueOf(dir);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unable to create SSL session cache in ");
            sb.append(valueOf);
            Log.w("SSLCertSocketFactory", sb.toString(), e);
            return null;
        }
    }

    public mby newSocketFactory(mby mby, mby mby2, mby mby3, boolean z) {
        SSLClientSessionCache sSLClientSessionCache;
        Context context = (Context) mbz.a(mby);
        if (z) {
            sSLClientSessionCache = a(context, "sslcache");
        } else {
            sSLClientSessionCache = null;
        }
        return mbz.a((Object) a((KeyManager[]) mbz.a(mby2), (TrustManager[]) mbz.a(mby3), sSLClientSessionCache));
    }

    public mby newSocketFactoryWithCacheDir(mby mby, mby mby2, mby mby3, String str) {
        return mbz.a((Object) a((KeyManager[]) mbz.a(mby2), (TrustManager[]) mbz.a(mby3), a((Context) mbz.a(mby), str)));
    }

    private static final SSLSocketFactory a(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SSLClientSessionCache sSLClientSessionCache) {
        try {
            OpenSSLContextImpl preferred = OpenSSLContextImpl.getPreferred();
            preferred.engineInit(keyManagerArr, trustManagerArr, (SecureRandom) null);
            ((ClientSessionContext) preferred.engineGetClientSessionContext()).setPersistentCache(sSLClientSessionCache);
            return preferred.engineGetSocketFactory();
        } catch (KeyManagementException e) {
            Log.wtf("SSLCertSocketFactory", e);
            return (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
    }
}
