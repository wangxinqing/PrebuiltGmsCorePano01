package defpackage;

/* renamed from: amqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amqm implements amrm {
    protected amqm() {
    }

    public static amqm a(char c, char c2) {
        return new amqf(c, c2);
    }

    public static amqm b(char c) {
        return new amqg(c);
    }

    public static amqm c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return amqj.a;
        }
        if (length == 1) {
            return b(charSequence.charAt(0));
        }
        if (length != 2) {
            return new amqc(charSequence);
        }
        return new amqh(charSequence.charAt(0), charSequence.charAt(1));
    }

    public abstract boolean a(char c);

    public final String d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && a(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public int a(CharSequence charSequence) {
        return a(charSequence, 0);
    }

    public String b(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int a = a((CharSequence) charSequence2);
        if (a == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            a++;
            while (a != charArray.length) {
                if (!a(charArray[a])) {
                    charArray[a - i] = charArray[a];
                    a++;
                } else {
                    i++;
                }
            }
            return new String(charArray, 0, a - i);
        }
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        amrl.b(i, length);
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a(((Character) obj).charValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(char r6) {
        /*
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {92, 117, 0, 0, 0, 0} // fill-array
            r1 = 0
        L_0x0007:
            r2 = 4
            if (r1 >= r2) goto L_0x001a
            int r3 = 5 - r1
            r4 = r6 & 15
            java.lang.String r5 = "0123456789ABCDEF"
            char r4 = r5.charAt(r4)
            r0[r3] = r4
            int r6 = r6 >> r2
            int r1 = r1 + 1
            goto L_0x0007
        L_0x001a:
            java.lang.String r6 = java.lang.String.copyValueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqm.c(char):java.lang.String");
    }
}
