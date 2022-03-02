package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: ju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ju {
    private final Intent a;

    private ju(Context context, ComponentName componentName) {
        ot.a((Object) context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.a = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        this.a.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        this.a.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
        this.a.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        this.a.addFlags(524288);
    }

    public static ju a(Activity activity) {
        ot.a((Object) activity);
        return new ju(activity, activity.getComponentName());
    }

    public final void b(String str) {
        this.a.setType(str);
    }

    public final Intent a() {
        if ("android.intent.action.SEND_MULTIPLE".equals(this.a.getAction())) {
            this.a.setAction("android.intent.action.SEND");
            this.a.removeExtra("android.intent.extra.STREAM");
        }
        return this.a;
    }

    public final void a(CharSequence charSequence) {
        this.a.putExtra("android.intent.extra.TEXT", charSequence);
    }

    public final void a(String str) {
        this.a.putExtra("android.intent.extra.SUBJECT", str);
    }
}
