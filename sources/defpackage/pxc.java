package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: pxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pxc implements Comparable {
    public String a;
    public String b;
    public Long c;
    public String d = "";

    public pxc(Context context, String str, String str2, Long l) {
        try {
            String concat = String.valueOf(new File(String.valueOf(context.getFilesDir().getPath()).concat("/..")).getCanonicalPath()).concat("/");
            this.d = concat;
            this.a = str.split(concat)[1];
            this.b = str2;
            this.c = l;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            oso.b(valueOf.length() == 0 ? new String("Error getting path of package directory: ") : "Error getting path of package directory: ".concat(valueOf));
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pxc pxc = (pxc) obj;
        if (Long.valueOf(this.c.longValue()).compareTo(Long.valueOf(pxc.c.longValue())) == 0) {
            return this.a.compareTo(pxc.a);
        }
        return -Long.valueOf(this.c.longValue()).compareTo(Long.valueOf(pxc.c.longValue()));
    }

    public final String toString() {
        return String.format(Locale.US, " %10d bytes | %4s | %s", new Object[]{this.c, this.b, this.a});
    }
}
