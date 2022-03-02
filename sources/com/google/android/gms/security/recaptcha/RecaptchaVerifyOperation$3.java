package com.google.android.gms.security.recaptcha;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RecaptchaVerifyOperation$3 extends ResultReceiver {
    final /* synthetic */ aaot a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecaptchaVerifyOperation$3(aaot aaot) {
        super((Handler) null);
        this.a = aaot;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 0) {
            try {
                this.a.a(new Status(bundle.getInt("errorCode", 13), bundle.getString("error", "")));
            } catch (RemoteException e) {
            }
        } else {
            this.a.a(new Status(0), bundle.getString("token"));
        }
    }
}
