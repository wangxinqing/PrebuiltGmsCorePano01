package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaybackCapabilityHelper$1 extends nla {
    final /* synthetic */ eee a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaybackCapabilityHelper$1(eee eee, String str) {
        super(str);
        this.a = eee;
    }

    public final void a(Context context, Intent intent) {
        int intExtra;
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && ((intExtra = intent.getIntExtra("state", -1)) == 0 || intExtra == 1)) {
            this.a.c();
        }
        if (intent.getAction().equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED") || intent.getAction().equals("android.media.SCO_AUDIO_STATE_CHANGED")) {
            int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            if (intExtra2 == 0 || intExtra2 == 1 || intExtra2 == 2) {
                this.a.c();
            }
        }
    }
}
