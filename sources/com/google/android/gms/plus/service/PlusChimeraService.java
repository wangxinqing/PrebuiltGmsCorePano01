package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.ClientContext;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusChimeraService extends Service {
    public static final SparseArray a;
    public static final String[] b = new String[0];

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, "all");
    }

    public static IBinder a(String str, Context context, ClientContext clientContext, ClientContext clientContext2, zas zas) {
        if ("com.google.android.gms.plus.service.START".equals(str)) {
            return new ytt(context, clientContext, clientContext2);
        }
        if ("com.google.android.gms.plus.service.internal.START".equals(str)) {
            return new ytm(context, clientContext, clientContext2);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
    }

    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.plus.service.START".equals(action) || "com.google.android.gms.plus.service.internal.START".equals(action)) {
            return new zau(this, action, this);
        }
        return null;
    }

    public static void a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }
}
