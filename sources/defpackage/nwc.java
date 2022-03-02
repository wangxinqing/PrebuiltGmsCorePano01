package defpackage;

import java.util.Locale;

/* renamed from: nwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nwc implements Comparable {
    public static final nwc d = new nwc();
    public final String a;
    public final String b;
    public final boolean c;

    private nwc() {
        this.a = "";
        this.b = null;
        this.c = false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((nwc) obj).a.compareTo(this.a);
    }

    public nwc(String str) {
        int i;
        String[] split = nwe.a.split(str);
        int length = split.length;
        if (length != 0) {
            boolean z = false;
            this.a = split[0];
            String str2 = null;
            int i2 = 1;
            while (i2 < length) {
                String lowerCase = split[i2].toLowerCase(Locale.US);
                if (lowerCase.equals("rewrite") && (i = i2 + 1) < length) {
                    str2 = split[i];
                    i2 += 2;
                } else if (!lowerCase.equals("block")) {
                    throw new nwd(str.length() == 0 ? new String("Illegal rule: ") : "Illegal rule: ".concat(str));
                } else {
                    i2++;
                    z = true;
                }
            }
            this.b = str2;
            this.c = z;
            return;
        }
        throw new nwd("Empty rule");
    }
}
