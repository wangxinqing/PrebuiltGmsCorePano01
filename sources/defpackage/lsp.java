package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: lsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsp {
    public final SimpleDateFormat a;
    public final Object b;

    public lsp(String str, Locale locale) {
        Object obj = new Object();
        this.b = obj;
        synchronized (obj) {
            this.a = new SimpleDateFormat(str, locale);
        }
    }

    public final String a(Date date) {
        String format;
        synchronized (this.b) {
            format = this.a.format(date);
        }
        return format;
    }

    public final boolean equals(Object obj) {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (obj != null) {
                try {
                    if (obj.getClass() == getClass() && ((lsp) obj).a.equals(this.a)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    public final void a(TimeZone timeZone) {
        synchronized (this.b) {
            this.a.setTimeZone(timeZone);
        }
    }
}
