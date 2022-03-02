package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GcmProxyIntentOperation extends IntentOperation {
    public static void a(Context context, Intent intent) {
        nqw.a(context);
        if (nqw.d() == 0) {
            a(intent, 0);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gcm.USER_FORWARD");
        intent2.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
        intent2.putExtra("intent", intent);
        intent2.putExtra("userSerial", nqw.d());
        nqw.a(context, intent2);
    }

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gcm.USER_FORWARD".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unexpected intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            return;
        }
        a((Intent) intent.getParcelableExtra("intent"), intent.getIntExtra("userSerial", -1));
    }

    private static void a(Intent intent, int i) {
        iva.a(nqw.d() == 0);
        if (i < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        nrr a = nrr.a();
        if ("com.google.android.gcm.intent.SEND".equals(action)) {
            nrj f = a.f();
            if (!aekv.a(f.a)) {
                GcmSenderChimeraProxy.a(f.a);
                f.b.execute(new nqz(f, intent, i));
            }
        } else if ("com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD".equals(action)) {
            ntj ntj = a.c;
            Parcelable parcelableExtra = intent.getParcelableExtra("msg");
            if (!(parcelableExtra instanceof Message)) {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("Invalid forwarded request: ");
                sb.append(valueOf);
                Log.w("GCM", sb.toString());
                return;
            }
            ntj.a((Message) parcelableExtra, i);
        } else if ("com.google.android.c2dm.intent.REGISTER".equals(action)) {
            nyn e = a.e();
            nyq a2 = nyq.a(1, i, intent, Collections.emptyMap());
            if (a2 != null) {
                e.a(a2);
            }
        } else if ("com.google.android.c2dm.intent.UNREGISTER".equals(action)) {
            nyn e2 = a.e();
            nyq a3 = nyq.a(2, i, intent, nyq.a(0));
            if (a3 != null) {
                e2.a(a3);
            }
        } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            ntx a4 = GcmPackageIntentOperation.a(intent, i);
            if (a4 != null) {
                nrr.a().c().a(a4);
            }
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            ntx a5 = GcmPackageIntentOperation.a(intent, i);
            if (a5 != null) {
                nrr.a().c().b(a5);
            }
        } else {
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Unexpected forwarded intent: ");
            sb2.append(valueOf2);
            Log.w("GCM", sb2.toString());
        }
    }
}
