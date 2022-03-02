package defpackage;

import com.google.android.chimera.Activity;

/* renamed from: mfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mfy {
    public static Object a(Class cls, Activity activity) {
        if (cls.isInstance(activity)) {
            return cls.cast(activity);
        }
        String simpleName = activity.getClass().getSimpleName();
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 16 + String.valueOf(canonicalName).length());
        sb.append(simpleName);
        sb.append(" must implement ");
        sb.append(canonicalName);
        throw new IllegalStateException(sb.toString());
    }
}
