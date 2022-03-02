package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.google.android.gms.appinvite.sms.SendSmsOperation;

/* renamed from: dxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxd extends PhoneStateListener {
    final /* synthetic */ TelephonyManager a;
    final /* synthetic */ Context b;
    final /* synthetic */ Intent c;
    private boolean d = false;

    public dxd(TelephonyManager telephonyManager, Context context, Intent intent) {
        this.a = telephonyManager;
        this.b = context;
        this.c = intent;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState.getState() == 0 && !this.d) {
            this.a.listen(this, 0);
            SendSmsOperation.a(this.b, this.c);
            this.d = true;
        }
    }
}
