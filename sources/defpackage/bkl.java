package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;

/* renamed from: bkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bkl extends BroadcastReceiver implements bou {
    public static final bkk c = new bkk();
    public com.google.android.chimera.BroadcastReceiver a;
    public Context b;

    /* access modifiers changed from: protected */
    public final com.google.android.chimera.BroadcastReceiver a(Context context) {
        Context context2 = this.b;
        if (!(context2 == null || ((ContextWrapper) context2).getBaseContext() == context)) {
            this.b = null;
            this.a = null;
        }
        if (this.b == null) {
            b(context);
        }
        return this.a;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, Context context) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b(Context context) {
        throw null;
    }

    public void onReceive(Context context, Intent intent) {
        com.google.android.chimera.BroadcastReceiver a2 = a(context);
        if (a2 != null) {
            Context context2 = this.b;
            amtf.a((Object) context2);
            intent.setExtrasClassLoader(context2.getClassLoader());
            a2.onReceive(context2, intent);
            return;
        }
        String name = getClass().getName();
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(action).length());
        sb.append(name);
        sb.append(" dropping broadcast ");
        sb.append(action);
        Log.e("ChimeraRcvrProxy", sb.toString());
    }
}
