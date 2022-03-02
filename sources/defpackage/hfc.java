package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: hfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfc extends ContextWrapper {
    public hfc(Context context) {
        super(context);
    }

    public final Context getApplicationContext() {
        return this;
    }
}
