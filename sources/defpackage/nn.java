package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: nn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nn {
    static final np a = nw.c;
    static final nn b = new nn(false, 2, a);
    static final nn c = new nn(true, 2, a);
    private static final String d = Character.toString(8206);
    private static final String e = Character.toString(8207);
    private final boolean f;
    private final int g;
    private final np h;

    public nn(boolean z, int i, np npVar) {
        this.f = z;
        this.g = i;
        this.h = npVar;
    }

    public static nn a() {
        return new nl().a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1 = r1 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(java.lang.CharSequence r7) {
        /*
            nm r0 = new nm
            r0.<init>(r7)
            int r7 = r0.b
            r0.c = r7
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L_0x0042
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r5) goto L_0x0032
            r6 = 2
            if (r3 == r6) goto L_0x0032
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002d;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
        L_0x0026:
            goto L_0x0040
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 == r1) goto L_0x0034
            goto L_0x002f
        L_0x002d:
            if (r2 == r1) goto L_0x003b
        L_0x002f:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0032:
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            r7 = 1
            goto L_0x0043
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x0026
        L_0x0039:
            if (r1 != 0) goto L_0x003d
        L_0x003b:
            r7 = -1
            goto L_0x0043
        L_0x003d:
            if (r2 != 0) goto L_0x000c
            goto L_0x0026
        L_0x0040:
            r2 = r1
            goto L_0x000c
        L_0x0042:
        L_0x0043:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.b(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.CharSequence r9) {
        /*
            nm r0 = new nm
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.c
            int r7 = r0.b
            if (r6 >= r7) goto L_0x006b
            if (r3 != 0) goto L_0x006b
            java.lang.CharSequence r7 = r0.a
            char r6 = r7.charAt(r6)
            r0.d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.a
            int r7 = r0.c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.c
            int r8 = java.lang.Character.charCount(r6)
            int r7 = r7 + r8
            r0.c = r7
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x0044
        L_0x0039:
            int r6 = r0.c
            int r6 = r6 + r2
            r0.c = r6
            char r6 = r0.d
            byte r6 = defpackage.nm.a(r6)
        L_0x0044:
            if (r6 == 0) goto L_0x0064
            if (r6 == r2) goto L_0x005f
            r7 = 2
            if (r6 == r7) goto L_0x005f
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x005b;
                case 15: goto L_0x005b;
                case 16: goto L_0x0057;
                case 17: goto L_0x0057;
                case 18: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0067
        L_0x0053:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0057:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x005b:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x005f:
            if (r5 == 0) goto L_0x0062
            goto L_0x0052
        L_0x0062:
            r9 = 1
            goto L_0x008d
        L_0x0064:
            if (r5 == 0) goto L_0x0069
            goto L_0x0052
        L_0x0067:
            r3 = r5
            goto L_0x000d
        L_0x0069:
            r9 = -1
            goto L_0x008d
        L_0x006b:
            if (r3 != 0) goto L_0x006e
            goto L_0x008d
        L_0x006e:
            if (r4 != 0) goto L_0x008c
        L_0x0070:
            int r4 = r0.c
            if (r4 <= 0) goto L_0x008b
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x0084;
                case 15: goto L_0x0084;
                case 16: goto L_0x007f;
                case 17: goto L_0x007f;
                case 18: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0070
        L_0x007c:
            int r5 = r5 + 1
            goto L_0x0070
        L_0x007f:
            if (r3 == r5) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r9 = 1
            goto L_0x008d
        L_0x0084:
            if (r3 == r5) goto L_0x0089
        L_0x0086:
            int r5 = r5 + -1
            goto L_0x0070
        L_0x0089:
            r9 = -1
            goto L_0x008d
        L_0x008b:
            goto L_0x008d
        L_0x008c:
            r9 = r4
        L_0x008d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.c(java.lang.CharSequence):int");
    }

    public static nn a(Locale locale) {
        return new nl(locale).a();
    }

    static boolean b(Locale locale) {
        return nx.a(locale) == 1;
    }

    public final CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.h);
    }

    public final CharSequence a(CharSequence charSequence, np npVar) {
        char c2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean a2 = npVar.a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if ((this.g & 2) != 0) {
            boolean a3 = (!a2 ? nw.a : nw.b).a(charSequence, charSequence.length());
            if (!this.f && (a3 || c(charSequence) == 1)) {
                str = d;
            } else if (this.f && (!a3 || c(charSequence) == -1)) {
                str = e;
            } else {
                str = str2;
            }
            spannableStringBuilder.append(str);
        }
        if (a2 != this.f) {
            if (!a2) {
                c2 = 8234;
            } else {
                c2 = 8235;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean a4 = (!a2 ? nw.a : nw.b).a(charSequence, charSequence.length());
        if (!this.f && (a4 || b(charSequence) == 1)) {
            str2 = d;
        } else if (this.f && (!a4 || b(charSequence) == -1)) {
            str2 = e;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }

    public final String a(String str) {
        return a(str, this.h);
    }

    public final String a(String str, np npVar) {
        if (str != null) {
            return a((CharSequence) str, npVar).toString();
        }
        return null;
    }
}
