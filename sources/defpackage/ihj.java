package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: ihj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihj extends isu {
    public ihj(Context context) {
        super(context);
    }

    public final boolean a(Thread thread, Throwable th) {
        String str;
        boolean z;
        try {
            String c = jhy.c(jil.a(ModuleManager.get(this.a)).a());
            if (c == null) {
                str = "";
            } else {
                int intValue = ((Integer) iks.x.c()).intValue();
                if (intValue > 0) {
                    z = true;
                } else {
                    z = false;
                }
                amrl.a(z, (Object) "The length may not be less than 1");
                String a = amre.a("\n").a(new amsk(new amsg(intValue)).a((CharSequence) c));
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
                sb.append(a);
                sb.append("\n");
                sb.append("GCore-Chimera-Crash");
                str = sb.toString();
            }
            Log.i("GCore-Chimera-Crash", str);
            return false;
        } catch (RuntimeException e) {
            Log.e("GCore-Chimera-Crash", "Hit an exception while processing the UncaughtExceptionHandler:", e);
            return false;
        }
    }
}
