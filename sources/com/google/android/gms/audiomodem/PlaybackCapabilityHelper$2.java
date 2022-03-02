package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaybackCapabilityHelper$2 extends nla {
    final /* synthetic */ eee a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaybackCapabilityHelper$2(eee eee, String str) {
        super(str);
        this.a = eee;
    }

    public final void a(Context context, Intent intent) {
        eee eee;
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            eee = this.a;
            eee.j = true;
        } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(intent.getStringExtra("state")) || TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
            eee = this.a;
            eee.j = false;
        } else {
            return;
        }
        eee.c();
    }
}
