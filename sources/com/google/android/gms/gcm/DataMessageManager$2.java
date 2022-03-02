package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataMessageManager$2 extends nla {
    final /* synthetic */ nrj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMessageManager$2(nrj nrj, String str) {
        super(str);
        this.a = nrj;
    }

    public final void a(Context context, Intent intent) {
        nrj nrj;
        nut nut;
        ntw ntw;
        String action = intent.getAction();
        if ((action.equals("android.intent.action.USER_ADDED") || action.equals("android.intent.action.USER_REMOVED") || action.equals("android.intent.action.USER_STARTING") || action.equals("android.intent.action.USER_STOPPED") || action.equals("android.intent.action.USER_STOPPING") || action.equals("android.intent.action.USER_SWITCHED")) && (nut = (nrj = this.a).p) != null && (ntw = nrj.c) != null && nut.a()) {
            int i = -1;
            if ("android.intent.action.USER_STOPPING".equals(intent.getAction())) {
                i = intent.getIntExtra("android.intent.extra.user_handle", -1);
            }
            ou ouVar = new ou();
            if (ntw.a(ouVar, i)) {
                amnb amnb = (amnb) amnc.r.o();
                if (amnb.c) {
                    amnb.c();
                    amnb.c = false;
                }
                amnc amnc = (amnc) amnb.b;
                "com.google.android.gsf.gtalkservice".getClass();
                amnc.a |= 16;
                amnc.e = "com.google.android.gsf.gtalkservice";
                for (int i2 = 0; i2 < ouVar.h; i2++) {
                    nrj.a(amnb, (String) ouVar.b(i2), (String) ouVar.c(i2));
                }
                nut.a((audw) amnb);
            }
        }
    }
}
