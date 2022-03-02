package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ChangeReceiver extends nla {
    private static final ith a = new ith("ChangeReceiver", "");
    private final Context b;
    private final Set c = new HashSet();
    private lgv d;

    protected ChangeReceiver(Context context, String... strArr) {
        super("drive");
        this.b = context;
        if (r4 <= 0) {
            a.c("ChangeReceiver", "At least one action must be defined in a ChangeReceiver.");
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        this.b.registerReceiver(this, intentFilter);
    }

    public final synchronized void a(lgu lgu) {
        lgv lgv = this.d;
        if (lgv == null) {
            a.c("ChangeReceiver", "The state must be updated before adding the first listener.");
        } else {
            lgu.a(lgv);
        }
        if (!this.c.add(lgu)) {
            a.c("ChangeReceiver", "The listener is already registered.");
        }
    }

    public final synchronized void b(lgu lgu) {
        if (!this.c.remove(lgu)) {
            a.c("ChangeReceiver", "Ignoring request to remove unknown listener");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(lgv lgv) {
        ArrayList arrayList;
        if (lgv == null) {
            a.c("ChangeReceiver", "The state cannot be null.");
            return;
        }
        synchronized (this) {
            lgv lgv2 = this.d;
            if (lgv2 != null) {
                if (lgv2.equals(lgv)) {
                    arrayList = null;
                }
            }
            this.d = lgv;
            arrayList = new ArrayList(this.c);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lgu) arrayList.get(i)).a(lgv);
            }
        }
    }
}
