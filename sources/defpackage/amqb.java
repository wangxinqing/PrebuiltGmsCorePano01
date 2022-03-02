package defpackage;

/* renamed from: amqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum amqb {
    LOWER_HYPHEN("-"),
    LOWER_UNDERSCORE("_"),
    LOWER_CAMEL(amqm.a('A', 'Z'), ""),
    UPPER_CAMEL(amqm.a('A', 'Z'), ""),
    UPPER_UNDERSCORE("_");
    
    private final amqm f;
    private final String g;

    /* access modifiers changed from: public */
    amqb(amqm amqm, String str) {
        this.f = amqm;
        this.g = str;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char charAt = str.charAt(0);
        String a = ampw.a(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1);
        sb.append(ampw.a(charAt));
        sb.append(a);
        return sb.toString();
    }

    public String a(amqb amqb, String str) {
        StringBuilder sb = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            i = this.f.a((CharSequence) str, i + 1);
            if (i == -1) {
                break;
            }
            if (i2 == 0) {
                sb = new StringBuilder(str.length() + (amqb.g.length() * 4));
                sb.append(amqb.b(str.substring(0, i)));
            } else {
                sb.append(amqb.a(str.substring(i2, i)));
            }
            sb.append(amqb.g);
            i2 = this.g.length() + i;
        }
        if (i2 == 0) {
            return amqb.b(str);
        }
        sb.append(amqb.a(str.substring(i2)));
        return sb.toString();
    }

    public final String b(amqb amqb, String str) {
        amrl.a((Object) amqb);
        amrl.a((Object) str);
        return amqb != this ? a(amqb, str) : str;
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        if (ordinal() != 2) {
            return a(str);
        }
        return ampw.a(str);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return ampw.a(str);
        }
        if (ordinal == 1) {
            return ampw.a(str);
        }
        if (ordinal == 2 || ordinal == 3) {
            return c(str);
        }
        if (ordinal == 4) {
            return ampw.b(str);
        }
        throw null;
    }
}
