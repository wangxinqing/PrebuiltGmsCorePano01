package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: hdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdw extends IntentOperation {
    private final njy a;
    private final IntentOperation b;

    public hdw(IntentOperation intentOperation, njy njy) {
        this.b = intentOperation;
        this.a = njy;
    }

    public final void init(Context context) {
        super.init(context);
        amky b2 = this.a.b("init");
        try {
            this.b.init(context);
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        amky b2 = this.a.b("onDestroy");
        try {
            this.b.onDestroy();
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onHandleIntent(Intent intent) {
        quu a2;
        amky a3 = this.a.a("onHandleIntent", intent);
        try {
            a2 = qut.a();
            this.b.onHandleIntent(intent);
            if (a2 != null) {
                a2.close();
            }
            if (a3 != null) {
                a3.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (a3 != null) {
                try {
                    a3.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }

    public final void onHandleIntent(Intent intent, boolean z) {
        quu a2;
        amky a3 = this.a.a("onHandleIntentWithRedelivery", intent);
        try {
            a2 = qut.a();
            this.b.onHandleIntent(intent, z);
            if (a2 != null) {
                a2.close();
            }
            if (a3 != null) {
                a3.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (a3 != null) {
                try {
                    a3.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
