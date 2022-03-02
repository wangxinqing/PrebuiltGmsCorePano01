package defpackage;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.security.KeyChainException;
import android.webkit.ClientCertRequest;

/* renamed from: gms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gms implements KeyChainAliasCallback {
    final /* synthetic */ ClientCertRequest a;
    final /* synthetic */ Context b;

    public gms(ClientCertRequest clientCertRequest, Context context) {
        this.a = clientCertRequest;
        this.b = context;
    }

    public final void alias(String str) {
        if (str != null) {
            try {
                this.a.proceed(KeyChain.getPrivateKey(this.b, str), KeyChain.getCertificateChain(this.b, str));
            } catch (KeyChainException | InterruptedException e) {
                gmx.a.d("Error retrieving keychain information", e, new Object[0]);
                this.a.ignore();
            }
        } else {
            this.a.cancel();
        }
    }
}
