package com.google.android.location.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AriLoggingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.location.settings.LOG_NLP_CONSENT".equals(intent.getAction())) {
            int a = aqng.a(intent.getIntExtra("source", 0));
            boolean booleanExtra = intent.getBooleanExtra("consent", false);
            int[] intArrayExtra = intent.getIntArrayExtra("textResources");
            aucd o = aqny.e.o();
            int i = 3;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                if (length < 4) {
                    aqni aqni = (aqni) aqnj.b.o();
                    aqni.a((Iterable) aoog.b(intArrayExtra));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aqny aqny = (aqny) o.b;
                    aqnj aqnj = (aqnj) aqni.i();
                    aqnj.getClass();
                    aqny.c = aqnj;
                    aqny.a |= 128;
                } else {
                    aucd o2 = aqnd.f.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqnd.a((aqnd) o2.b);
                    aqni aqni2 = (aqni) aqnj.b.o();
                    aqni2.a(intArrayExtra[0]);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqnd aqnd = (aqnd) o2.b;
                    aqnj aqnj2 = (aqnj) aqni2.i();
                    aqnj2.getClass();
                    aqnd.b = aqnj2;
                    aqnd.a |= 2;
                    aqni aqni3 = (aqni) aqnj.b.o();
                    aqni3.a(intArrayExtra[1]);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqnd aqnd2 = (aqnd) o2.b;
                    aqnj aqnj3 = (aqnj) aqni3.i();
                    aqnj3.getClass();
                    aqnd2.d = aqnj3;
                    aqnd2.a |= 8;
                    aqni aqni4 = (aqni) aqnj.b.o();
                    aqni4.a(intArrayExtra[2]);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqnd aqnd3 = (aqnd) o2.b;
                    aqnj aqnj4 = (aqnj) aqni4.i();
                    aqnj4.getClass();
                    aqnd3.e = aqnj4;
                    aqnd3.a |= 16;
                    aqni aqni5 = (aqni) aqnj.b.o();
                    aqni5.a((Iterable) aoog.b(Arrays.copyOfRange(intArrayExtra, 3, length)));
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aqnd aqnd4 = (aqnd) o2.b;
                    aqnj aqnj5 = (aqnj) aqni5.i();
                    aqnj5.getClass();
                    aqnd4.c = aqnj5;
                    aqnd4.a |= 4;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aqny aqny2 = (aqny) o.b;
                    aqnd aqnd5 = (aqnd) o2.i();
                    aqnd5.getClass();
                    aqny2.b = aqnd5;
                    aqny2.a |= 1;
                }
            }
            aucd o3 = aqnr.d.o();
            aucd o4 = aqnp.c.o();
            String hexString = Long.toHexString(((Long) jhg.b.c()).longValue());
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aqnp aqnp = (aqnp) o4.b;
            hexString.getClass();
            aqnp.a |= 1;
            aqnp.b = hexString;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aqnr aqnr = (aqnr) o3.b;
            aqnp aqnp2 = (aqnp) o4.i();
            aqnp2.getClass();
            aqnr.c = aqnp2;
            aqnr.a |= 2;
            aqnr aqnr2 = (aqnr) o3.i();
            aqnk aqnk = (aqnk) aqnl.g.o();
            aucd o5 = aqnt.d.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aqnt aqnt = (aqnt) o5.b;
            aqnt.b = 1;
            int i2 = aqnt.a | 1;
            aqnt.a = i2;
            aqnr2.getClass();
            aqnt.c = aqnr2;
            aqnt.a = i2 | 2;
            aqnk.a(o5);
            aucd o6 = aqnt.d.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aqnt aqnt2 = (aqnt) o6.b;
            aqnt2.b = 2;
            int i3 = aqnt2.a | 1;
            aqnt2.a = i3;
            aqnr2.getClass();
            aqnt2.c = aqnr2;
            aqnt2.a = i3 | 2;
            aqnk.a(o6);
            aucd o7 = aqnu.d.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            aqnu aqnu = (aqnu) o7.b;
            aqnu.b = 40;
            aqnu.a |= 1;
            aucd o8 = aqnv.f.o();
            aucd o9 = aqnh.d.o();
            aucd o10 = aqoa.c.o();
            if (booleanExtra) {
                i = 2;
            }
            if (o10.c) {
                o10.c();
                o10.c = false;
            }
            aqoa aqoa = (aqoa) o10.b;
            aqoa.b = i - 1;
            aqoa.a |= 1;
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            aqnh aqnh = (aqnh) o9.b;
            aqoa aqoa2 = (aqoa) o10.i();
            aqoa2.getClass();
            aqnh.b = aqoa2;
            aqnh.a |= 1;
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            aqnh aqnh2 = (aqnh) o9.b;
            int i4 = a - 1;
            if (a != 0) {
                aqnh2.c = i4;
                aqnh2.a |= 2;
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                aqnv aqnv = (aqnv) o8.b;
                aqnh aqnh3 = (aqnh) o9.i();
                aqnh3.getClass();
                aqnv.c = aqnh3;
                aqnv.a |= 4;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                aqnu aqnu2 = (aqnu) o7.b;
                aqnv aqnv2 = (aqnv) o8.i();
                aqnv2.getClass();
                aqnu2.c = aqnv2;
                aqnu2.a |= 2;
                if (aqnk.c) {
                    aqnk.c();
                    aqnk.c = false;
                }
                aqnl aqnl = (aqnl) aqnk.b;
                aqnu aqnu3 = (aqnu) o7.i();
                aqnu3.getClass();
                aqnl.e = aqnu3;
                aqnl.a |= 4;
                aucd o11 = aqob.d.o();
                if (o11.c) {
                    o11.c();
                    o11.c = false;
                }
                aqob aqob = (aqob) o11.b;
                aqob.b = 46;
                aqob.a |= 1;
                aqny aqny3 = (aqny) o.i();
                aqny3.getClass();
                aqob.c = aqny3;
                aqob.a |= 8;
                if (aqnk.c) {
                    aqnk.c();
                    aqnk.c = false;
                }
                aqnl aqnl2 = (aqnl) aqnk.b;
                aqob aqob2 = (aqob) o11.i();
                aqob2.getClass();
                aqnl2.f = aqob2;
                aqnl2.a |= 8;
                egm a2 = egj.a(this);
                egr egr = new egr();
                egr.a = 41;
                egr.b();
                egr.a(((aqnl) aqnk.i()).k());
                a2.a(egr.a()).a(ajoj.a);
                return;
            }
            throw null;
        }
    }
}
