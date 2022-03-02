package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: qbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qbx {
    public static SafeParcelable a(Bundle bundle, String str, Class cls) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return (SafeParcelable) bundle2.getParcelable("parcelable");
    }

    public static void a(Bundle bundle, String str, SafeParcelable safeParcelable) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("parcelable", safeParcelable);
        bundle.putBundle(str, bundle2);
    }
}
