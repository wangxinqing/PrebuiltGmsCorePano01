package com.google.android.location.fused.orientation;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceOrientationDetector$1 extends nla {
    final /* synthetic */ aihs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceOrientationDetector$1(aihs aihs, String str) {
        super(str);
        this.a = aihs;
    }

    public final void a(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            aihs aihs = this.a;
            int i = aihs.l;
            aihs.i = false;
            aihs.c();
            synchronized (this.a.j) {
                aihs aihs2 = this.a;
                if (aihs2.b) {
                    aihs2.b();
                }
            }
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            aihs aihs3 = this.a;
            int i2 = aihs.l;
            aihs3.i = true;
            synchronized (aihs3.j) {
                aihs aihs4 = this.a;
                if (aihs4.b) {
                    aihs4.a();
                }
            }
        }
    }
}
