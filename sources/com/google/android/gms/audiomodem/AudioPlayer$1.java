package com.google.android.gms.audiomodem;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudioPlayer$1 extends nla {
    final /* synthetic */ edf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioPlayer$1(edf edf, String str) {
        super(str);
        this.a = edf;
    }

    public final void a(Context context, Intent intent) {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
            int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
            if (intExtra != -1 && intExtra2 != -1 && intExtra3 != -1 && intExtra2 != intExtra3 && intExtra == 3) {
                edf edf = this.a;
                edf.j = intExtra2;
                edf.c();
            }
        }
    }
}
