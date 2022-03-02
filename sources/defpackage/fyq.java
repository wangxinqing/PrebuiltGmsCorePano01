package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: fyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyq {
    private fyk a;

    public fyq() {
    }

    public static final void a(int i, fyk fyk) {
        if (!fyk.a(i)) {
            String[] a2 = fyk.c.a(i);
            if (a2 != null) {
                for (String str : a2) {
                    try {
                        PackageInfo b = fyk.c.b(str, 0);
                        if (!(b == null || (b.applicationInfo.flags & 1) == 0)) {
                            int i2 = Build.VERSION.SDK_INT;
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.w("GLSActivity", String.format("Could not find package [%s]", new Object[]{str}), e);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(38);
                sb.append("No known packages with uid ");
                sb.append(i);
                Log.w("GLSActivity", sb.toString());
            }
            throw new SecurityException(String.format("UID %s is not associated with a first party app!", new Object[]{Integer.valueOf(i)}));
        }
    }

    @Deprecated
    public final void b(int i) {
        iva.a((Object) this.a);
        a(i, this.a);
    }

    @Deprecated
    public fyq(fyk fyk) {
        this.a = fyk;
    }

    @Deprecated
    public final void a(int i) {
        iva.a((Object) this.a);
        a(i, this.a);
    }
}
