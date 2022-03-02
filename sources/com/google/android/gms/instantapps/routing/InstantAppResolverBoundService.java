package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppResolverBoundService extends BoundService {
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        qfq a = qfq.a(this);
        printWriter.println();
        printWriter.printf("\nInstant Apps enabled: %s\n", new Object[]{Boolean.valueOf(aecx.a())});
        printWriter.printf("Instant App resolver enabled: %s\n", new Object[]{Boolean.valueOf(axuy.c())});
        printWriter.printf("Accounts: %s\n", new Object[]{Arrays.toString(a.c.d())});
        printWriter.printf("Opt-in account: %s\n", new Object[]{a.c.a()});
        printWriter.printf("Opt-in state: %s\n", new Object[]{Integer.valueOf(a.d.a())});
        printWriter.println("\nEvent Log:");
        ListIterator b = a.p.iterator();
        while (b.hasNext()) {
            printWriter.println((String) b.next());
        }
        printWriter.println();
    }

    public final IBinder onBind(Intent intent) {
        if (!jkr.e()) {
            return null;
        }
        if ("android.intent.action.RESOLVE_EPHEMERAL_PACKAGE".equals(intent.getAction()) || "android.intent.action.RESOLVE_INSTANT_APP_PACKAGE".equals(intent.getAction())) {
            qfq a = qfq.a(this);
            qkg qkg = new qkg(a.q, a.t, a.r, a.d, a.k);
            try {
                ContextWrapper.class.getDeclaredMethod("attachBaseContext", new Class[]{Context.class}).invoke(qkg, new Object[]{this});
                return qkg.onBind(intent);
            } catch (Exception e) {
                Log.e("InstantAppResolver", "Failed to call attachBaseContext", e);
                return null;
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("InstantAppResolver", valueOf.length() == 0 ? new String("Unexpected action: ") : "Unexpected action: ".concat(valueOf));
            return null;
        }
    }
}
