package defpackage;

import android.util.Log;

/* renamed from: ish  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ish {
    public static void a(String str, Appendable appendable) {
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(length - 1);
            if (charAt != ' ' && charAt != 9 && charAt2 != ' ' && charAt2 != 9 && str.indexOf(34) < 0 && str.indexOf(44) < 0 && str.indexOf(13) < 0 && str.indexOf(10) < 0) {
                appendable.append(str);
            } else {
                appendable.append('\"').append(str.replace("\"", "\"\"")).append('\"');
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.BufferedReader r8, java.util.List r9) {
        /*
            java.lang.String r0 = r8.readLine()
            r1 = 0
            if (r0 == 0) goto L_0x0071
        L_0x0007:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x000c:
            r3 = 44
            int r3 = r0.indexOf(r3, r1)
            r4 = 34
            int r5 = r0.indexOf(r4, r1)
            r6 = 1
            r7 = -1
            if (r5 == r7) goto L_0x005a
            if (r3 == r7) goto L_0x0020
            if (r3 < r5) goto L_0x005a
        L_0x0020:
            if (r1 > 0) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            int r3 = r1 + -1
            char r3 = r0.charAt(r3)
            if (r3 != r4) goto L_0x002e
            r2.append(r4)
        L_0x002e:
            r2.append(r0, r1, r5)
        L_0x0031:
            int r5 = r5 + r6
            int r1 = r0.indexOf(r4, r5)
            if (r1 != r7) goto L_0x0054
            int r1 = r0.length()
            r2.append(r0, r5, r1)
            r0 = 10
            r2.append(r0)
            java.lang.String r0 = r8.readLine()
            if (r0 == 0) goto L_0x004c
            r5 = -1
            goto L_0x0031
        L_0x004c:
            java.lang.String r8 = r2.toString()
            r9.add(r8)
            return r6
        L_0x0054:
            r2.append(r0, r5, r1)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x005a:
            if (r3 != r7) goto L_0x0061
            int r4 = r0.length()
            goto L_0x0062
        L_0x0061:
            r4 = r3
        L_0x0062:
            r2.append(r0, r1, r4)
            java.lang.String r1 = r2.toString()
            r9.add(r1)
            int r1 = r3 + 1
            if (r1 > 0) goto L_0x0007
            return r6
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ish.a(java.io.BufferedReader, java.util.List):boolean");
    }

    public static boolean a(String str, String str2) {
        int indexOf;
        if (str2.indexOf(44) >= 0) {
            String valueOf = String.valueOf(str2);
            Log.w("Csv", valueOf.length() == 0 ? new String("Search entry has a comma: ") : "Search entry has a comma: ".concat(valueOf));
            return false;
        } else if ("*".equals(str)) {
            return true;
        } else {
            if (str2.length() != 0) {
                int i = 0;
                while (i < str.length() && (indexOf = str.indexOf(str2, i)) != -1) {
                    int length = str2.length() + indexOf;
                    if ((indexOf != i && str.charAt(indexOf - 1) != ',') || (length != str.length() && str.charAt(length) != ',')) {
                        i = str.indexOf(44, length) + 1;
                        if (i == 0) {
                            break;
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            } else if (str.length() == 0 || str.charAt(0) == ',' || str.charAt(str.length() - 1) == ',' || str.indexOf(",,", 1) >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
