package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: qxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class qxm implements qxp {
    protected final Context a;
    private final PendingIntent b;
    private final int c;
    private final int d;

    public qxm(Context context, int i, int i2) {
        this.a = context;
        this.c = i;
        this.d = i2;
        this.b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    private final Intent a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.b);
        intent.putExtra("source", this.c);
        intent.putExtra("source_version", 201216000);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    /* access modifiers changed from: protected */
    public final Intent a(ComponentName componentName) {
        Intent a2 = a("CANCEL_ALL");
        a2.putExtra("component", componentName);
        return a2;
    }

    /* access modifiers changed from: protected */
    public final Intent a(ComponentName componentName, String str) {
        Intent a2 = a("CANCEL_TASK");
        a2.putExtra("component", componentName);
        a2.putExtra("tag", str);
        return a2;
    }

    /* access modifiers changed from: protected */
    public final Intent a(qxx qxx) {
        Intent a2 = a("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        qxx.a(bundle, this.d);
        a2.putExtras(bundle);
        return a2;
    }
}
