package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseLockscreenMessageChimeraService$1 extends nla {
    public BaseLockscreenMessageChimeraService$1(String str) {
        super(str);
    }

    public final void a(Context context, Intent intent) {
        if (((TelephonyManager) context.getSystemService("phone")).getCallState() == 0) {
            context.startActivity(smf.a(context, (String) smo.f.a(), (String) smo.g.a(), true));
        }
    }
}
