package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final iwd b = ehv.a("GcmChimeraBroadcastReceiver");
    private static final fze c = eld.a;

    public final void onReceive(Context context, Intent intent) {
        fze fze;
        String str;
        if (awly.b() || awly.c()) {
            aucd o = anpx.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anpx anpx = (anpx) o.b;
            anpx.b = 1;
            anpx.a |= 1;
            try {
                String stringExtra = intent.getStringExtra("EXTRA_GAIA_ID");
                if (stringExtra != null) {
                    String stringExtra2 = intent.getStringExtra("EXTRA_ACTION");
                    if (stringExtra2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("EXTRA_GAIA_ID", stringExtra);
                        bundle.putString("EXTRA_ACTION", stringExtra2);
                        qwq a = qwq.a(context);
                        qxf qxf = new qxf();
                        qxf.i = "com.google.android.gms.auth.account.be.accountstate.GcmTaskService";
                        byte[] a2 = jhg.a(stringExtra, "SHA-256");
                        if (a2 == null) {
                            str = "";
                        } else {
                            str = jjp.a(a2);
                        }
                        String str2 = str.length() == 0 ? new String(stringExtra2) : stringExtra2.concat(str);
                        if (str2.length() > 100) {
                            str2 = str2.substring(0, 100);
                        }
                        qxf.k = str2;
                        qxf.b(1);
                        qxf.a(0);
                        qxf.s = bundle;
                        qxf.a(0, awly.a.a().d());
                        a.a((qxx) qxf.b());
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anpx anpx2 = (anpx) o.b;
                        anpx2.c = 1;
                        anpx2.a |= 2;
                        fze = c;
                    } else {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anpx anpx3 = (anpx) o.b;
                        anpx3.c = 4;
                        anpx3.a |= 2;
                        fze = c;
                    }
                } else {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    anpx anpx4 = (anpx) o.b;
                    anpx4.c = 2;
                    anpx4.a |= 2;
                    fze = c;
                }
                ((elg) fze.a(context)).a(b, (anpx) o.i());
            } catch (Throwable th) {
                ((elg) c.a(context)).a(b, (anpx) o.i());
                throw th;
            }
        }
    }
}
