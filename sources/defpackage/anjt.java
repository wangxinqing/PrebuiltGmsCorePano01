package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: anjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjt extends anjf implements anja {
    private final String a;

    public anjt(String str, String str2) {
        super(str2);
        if (str.length() + str2.length() > 23) {
            String replace = str2.replace('$', '.');
            str2 = replace.substring(replace.lastIndexOf(46) + 1);
        }
        String valueOf = String.valueOf(str2);
        String str3 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        this.a = str3.substring(0, Math.min(str3.length(), 23));
    }

    public final void a(anir anir) {
        anjb.a(anir, (anja) this);
    }

    public final void a(Level level, String str, Throwable th) {
        int a2 = anjo.a(level);
        if (a2 != 2 && a2 != 3) {
            if (a2 == 4) {
                Log.i(this.a, str, th);
            } else if (a2 != 5) {
                Log.e(this.a, str, th);
            } else {
                Log.w(this.a, str, th);
            }
        }
    }

    public final boolean a(Level level) {
        int a2 = anjo.a(level);
        return Log.isLoggable(this.a, a2) || Log.isLoggable("all", a2);
    }
}
