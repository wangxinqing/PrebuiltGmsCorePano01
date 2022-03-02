package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ahnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnp {
    public static final Intent a(Context context) {
        Intent className = new Intent().setClassName(context, "com.google.android.location.settings.DrivingConditionProvider");
        className.setAction("ActivityTransition");
        return className;
    }
}
