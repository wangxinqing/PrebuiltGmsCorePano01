package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController$ImportReceiver;

/* renamed from: absw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absw implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ TargetAccountImportController$ImportReceiver b;

    public absw(TargetAccountImportController$ImportReceiver targetAccountImportController$ImportReceiver, Intent intent) {
        this.b = targetAccountImportController$ImportReceiver;
        this.a = intent;
    }

    public final void run() {
        absy absy = this.b.a;
        Bundle extras = this.a.getExtras();
        iwd iwd = absy.a;
        absy.d.a(extras.getString("restoreAccount"), extras.getString("restoreToken"));
        ResultReceiver resultReceiver = (ResultReceiver) extras.getParcelable("resultReceiver");
        if (resultReceiver == null) {
            absy.a.e("ResultReceiver was null", new Object[0]);
        } else {
            resultReceiver.send(0, (Bundle) null);
        }
    }
}
