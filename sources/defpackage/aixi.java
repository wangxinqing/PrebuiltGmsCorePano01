package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;

/* renamed from: aixi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aixi implements ajbj {
    private final Context a;
    private int b = 0;

    public aixi(Context context) {
        this.a = context.getApplicationContext();
    }

    public final synchronized int a() {
        return this.b;
    }

    public final void b() {
        iby a2 = rmf.a(this.a);
        Account[] a3 = qub.a(this.a).a("com.google");
        int length = a3.length;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (true) {
            if (i2 < length) {
                try {
                    if (((ReportingState) acws.a(a2.a(a3[i2]))).b) {
                        i = 1;
                        break;
                    }
                    i2++;
                } catch (InterruptedException | ExecutionException e) {
                    z = false;
                }
            } else if (z) {
                i = 2;
            }
        }
        synchronized (this) {
            this.b = i;
        }
    }
}
