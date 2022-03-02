package com.google.android.gms.org.conscrypt;

import java.net.Socket;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreKitKatPlatformOpenSSLSocketAdapterFactory extends BaseOpenSSLSocketAdapterFactory {
    public PreKitKatPlatformOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        super(openSSLSocketFactoryImpl);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.net.Socket, com.google.android.gms.org.conscrypt.PreKitKatPlatformOpenSSLSocketImplAdapter] */
    /* access modifiers changed from: protected */
    public Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) {
        return new PreKitKatPlatformOpenSSLSocketImplAdapter(openSSLSocketImpl);
    }
}
