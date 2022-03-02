package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaV2VerifyOperation$1 extends ResultReceiver {
    final /* synthetic */ zpx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecaptchaV2VerifyOperation$1(zpx zpx) {
        super((Handler) null);
        this.a = zpx;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 0) {
            try {
                this.a.a(new Status(bundle.getInt("errorCode", 13), bundle.getString("error", "")));
            } catch (RemoteException e) {
            }
        } else {
            zpx zpx = this.a;
            zpx.a.a(new Status(0), new RecaptchaResultData(bundle.getString("token")));
        }
    }
}
