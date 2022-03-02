package com.google.android.gms.people.sync.focus.notification;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class NotificationReceiver extends nla {
    public xxi a;
    private final wss b;

    public NotificationReceiver(wss wss, xxi xxi) {
        super("people");
        this.b = wss;
        this.a = xxi;
    }

    private static void a(xxd xxd, int i) {
        int i2;
        if (ayug.f()) {
            wml.a();
            String str = xxd.a;
            String str2 = xxd.b;
            aucd o = xnj.e.o();
            int i3 = xxd.c;
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnj xnj = (xnj) o.b;
            xnj.a |= 1;
            xnj.b = i3;
            aucd o2 = xni.f.o();
            if (xxd.d == xkm.UNKNOWN_STAGE) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xni xni = (xni) o2.b;
            xni.b = i2 - 1;
            int i4 = xni.a | 1;
            xni.a = i4;
            xni.c = xxd.d.h;
            int i5 = i4 | 2;
            xni.a = i5;
            int i6 = xxd.e;
            int i7 = i6 - 1;
            if (i6 != 0) {
                xni.d = i7;
                int i8 = i5 | 4;
                xni.a = i8;
                xni.e = i - 1;
                xni.a = i8 | 8;
                xni xni2 = (xni) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xnj xnj2 = (xnj) o.b;
                xni2.getClass();
                xnj2.a();
                xnj2.d.add(xni2);
                xnj xnj3 = (xnj) o.i();
                aucd o3 = xny.w.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                xny xny = (xny) o3.b;
                int i9 = xny.a | 8;
                xny.a = i9;
                xny.e = 80;
                if (str != null) {
                    str.getClass();
                    xny.a = i9 | 32768;
                    xny.s = str;
                }
                aucd o4 = xno.o.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                xno xno = (xno) o4.b;
                xnj3.getClass();
                xno.a();
                xno.m.add(xnj3);
                xno xno2 = (xno) o4.i();
                aucd o5 = xnq.h.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                xnq xnq = (xnq) o5.b;
                xno2.getClass();
                xnq.f = xno2;
                xnq.b |= 2;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                xny xny2 = (xny) o3.b;
                xnq xnq2 = (xnq) o5.i();
                xnq2.getClass();
                xny2.n = xnq2;
                xny2.a |= 2048;
                aucd o6 = xol.w.o();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                xol xol = (xol) o6.b;
                xny xny3 = (xny) o3.i();
                xny3.getClass();
                xol.d = xny3;
                xol.a |= 4;
                wmm.a(str2, o6);
                return;
            }
            throw null;
        }
    }

    public final void a(Context context, Intent intent) {
        Intent c;
        String action = intent.getAction();
        if (action != null) {
            xxd d = this.a.d();
            if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN")) {
                this.b.m(d.b);
                if (ayug.f()) {
                    a(d, 8);
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_UP")) {
                this.b.m(d.b);
                if (ayug.a.a().l()) {
                    a(d, 8);
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN")) {
                Intent c2 = this.a.c();
                if (c2 != null) {
                    context.startActivity(c2.setFlags(268435456));
                    if (ayug.a.a().p()) {
                        a(d, 7);
                    }
                }
            } else if (action.equals("com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_UP") && (c = this.a.c()) != null) {
                context.startActivity(c.setFlags(268435456));
                if (ayug.a.a().q()) {
                    a(d, 7);
                }
            }
        } else {
            Log.e("FSA2_NotificationReceiver", "Should not receive null intent.");
        }
    }
}
