package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Locale;

/* renamed from: acpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpz extends iwd {
    public final String b;
    private final String c;

    public acpz(String str, String... strArr) {
        super(str, strArr);
        String str2;
        this.b = str;
        if (r6 != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        this.c = str2;
    }

    public static final boolean a() {
        return "user".equals(Build.TYPE);
    }

    public final void b(String str, Object... objArr) {
        if (a(3) || !a()) {
            Log.d(this.b, h(str, objArr));
        }
    }

    public final String h(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.c.concat(str);
    }

    public final void a(String str, Throwable th, Object... objArr) {
        if (a(2) || !a()) {
            Log.v(this.b, h(str, objArr), th);
        }
    }

    public final void a(String str, Object... objArr) {
        if (a(2) || !a()) {
            Log.v(this.b, h(str, objArr));
        }
    }
}
