package com.google.android.gms.auth.account.accounttransfer;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RestoreDataSender$1 extends ResultReceiver {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RestoreDataSender$1(Handler handler, aosh aosh) {
        super(handler);
        this.a = aosh;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        this.a.b((Object) null);
    }
}
