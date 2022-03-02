package com.google.android.gms.common.net;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SocketFactoryCreatorImpl extends iwm {
    private iwn a;
    private final Object b = new Object();

    public iwn getImplV2Instance(Context context) {
        iwn iwn;
        synchronized (this.b) {
            if (this.a == null) {
                try {
                    this.a = iwm.asInterface(mcx.a(context, mcx.b, "providerinstaller").a("com.google.android.gms.common.net.SocketFactoryCreatorImplV2"));
                } catch (mct e) {
                    this.a = new SocketFactoryCreatorImplV2();
                }
            }
            iwn = this.a;
        }
        return iwn;
    }

    public mby newSocketFactory(mby mby, mby mby2, mby mby3, boolean z) {
        return getImplV2Instance((Context) mbz.a(mby)).newSocketFactory(mby, mby2, mby3, z);
    }

    public mby newSocketFactoryWithCacheDir(mby mby, mby mby2, mby mby3, String str) {
        return getImplV2Instance((Context) mbz.a(mby)).newSocketFactoryWithCacheDir(mby, mby2, mby3, str);
    }
}
