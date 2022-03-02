package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: ceh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ceh extends ccy {
    public static final ccj b = new ccj(new ceg(), "PhoneCallProducer", new int[]{37}, (int[]) null);
    private attk k;

    public ceh(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        int callState = ((TelephonyManager) context.getSystemService("phone")).getCallState();
        aucd o = attk.c.o();
        if (callState == 2 || callState == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            attk attk = (attk) o.b;
            attk.b = 1;
            attk.a |= 1;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            attk attk2 = (attk) o.b;
            attk2.b = 2;
            attk2.a |= 1;
        }
        this.k = (attk) o.i();
    }

    private final void b(long j) {
        jti jti = new jti(7, 37, 1);
        jti.a(jut.b(j));
        jti.a(attk.d, this.k);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        return new IntentFilter("android.intent.action.PHONE_STATE");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        b(cbi.i().a());
    }

    public final void a(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE")) {
            int i = 2;
            if (!TextUtils.equals(TelephonyManager.EXTRA_STATE_OFFHOOK, intent.getStringExtra("state")) && !TextUtils.equals(TelephonyManager.EXTRA_STATE_RINGING, intent.getStringExtra("state"))) {
                i = 3;
            }
            int a = attj.a(this.k.b);
            if (a == 0) {
                a = 1;
            }
            if (a != i) {
                aucd o = attk.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                attk attk = (attk) o.b;
                attk.b = i - 1;
                attk.a = 1 | attk.a;
                this.k = (attk) o.i();
                long a2 = cbi.i().a();
                a(a2);
                b(a2 + 1);
            }
        }
    }
}
