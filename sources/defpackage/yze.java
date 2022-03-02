package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;
import java.util.Locale;

/* renamed from: yze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yze {
    public static CharSequence a(yxv yxv, String str, String str2, List list) {
        return a(yxv, str, str2, (List) null, list, (List) null);
    }

    private static zdr b(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zdr zdr = (zdr) list.get(i);
                if (zdr.c() && str.equals(zdr.b())) {
                    return zdr;
                }
            }
        }
        return null;
    }

    private static zif c(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zif zif = (zif) list.get(i);
                if (zif.c() && str.equals(zif.b())) {
                    return zif;
                }
            }
        }
        return null;
    }

    public static zea d(zii zii) {
        if (zii.b()) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) zii;
            if (upgradeAccountEntity.d.b()) {
                List list = upgradeAccountEntity.d.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    zea zea = (zea) list.get(i);
                    if (zea.c()) {
                        return zea;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence a(defpackage.yxv r9, java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.List r13, java.util.List r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00ce
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r1 = "<p>|</p>"
            java.lang.String r2 = " "
            java.lang.String r10 = r10.replaceAll(r1, r2)
            android.text.Spanned r10 = android.text.Html.fromHtml(r10)
            r0.<init>(r10)
            int r10 = r0.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r10 = r0.getSpans(r2, r10, r1)
            android.text.style.URLSpan[] r10 = (android.text.style.URLSpan[]) r10
            if (r10 == 0) goto L_0x0028
            int r1 = r10.length
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
        L_0x002a:
            if (r2 >= r1) goto L_0x00cd
            r3 = r10[r2]
            java.lang.String r4 = r3.getURL()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x003a
            goto L_0x00c9
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 0
            if (r5 != 0) goto L_0x0070
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0070
            if (r12 == 0) goto L_0x0056
            zdt r5 = a(r4, r12)
            if (r5 == 0) goto L_0x0091
            android.text.style.ClickableSpan r6 = r9.a((java.lang.String) r11, (defpackage.zdt) r5)
            goto L_0x00b5
        L_0x0056:
            if (r13 == 0) goto L_0x0063
            zdr r5 = b(r4, r13)
            if (r5 == 0) goto L_0x0091
            android.text.style.ClickableSpan r6 = r9.a((defpackage.zdr) r5)
            goto L_0x00b5
        L_0x0063:
            if (r14 == 0) goto L_0x0091
            zif r5 = c(r4, r14)
            if (r5 == 0) goto L_0x0091
            android.text.style.ClickableSpan r6 = r9.a((defpackage.zif) r5)
            goto L_0x00b5
        L_0x0070:
            if (r12 == 0) goto L_0x007b
            zdt r5 = a(r4, r12)
            android.text.style.ClickableSpan r6 = r9.a((java.lang.String) r11, (defpackage.zdt) r5, (java.lang.String) r4)
            goto L_0x00b5
        L_0x007b:
            if (r13 == 0) goto L_0x0086
            zdr r5 = b(r4, r13)
            android.text.style.ClickableSpan r6 = r9.a((java.lang.String) r11, (defpackage.zdr) r5, (java.lang.String) r4)
            goto L_0x00b5
        L_0x0086:
            if (r14 == 0) goto L_0x0091
            zif r5 = c(r4, r14)
            android.text.style.ClickableSpan r6 = r9.a((java.lang.String) r11, (defpackage.zif) r5, (java.lang.String) r4)
            goto L_0x00b5
        L_0x0091:
            r5 = 5
            java.lang.String r7 = "UpgradeAccount"
            boolean r5 = android.util.Log.isLoggable(r7, r5)
            if (r5 == 0) goto L_0x00b4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Failed to create ClickableSpan for url: "
            int r8 = r4.length()
            if (r8 != 0) goto L_0x00ac
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r4 = r5.concat(r4)
        L_0x00b0:
            android.util.Log.w(r7, r4)
            goto L_0x00b5
        L_0x00b4:
        L_0x00b5:
            if (r6 == 0) goto L_0x00c6
            int r4 = r0.getSpanStart(r3)
            int r5 = r0.getSpanEnd(r3)
            int r7 = r0.getSpanFlags(r3)
            r0.setSpan(r6, r4, r5, r7)
        L_0x00c6:
            r0.removeSpan(r3)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x00cd:
            return r0
        L_0x00ce:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yze.a(yxv, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List):java.lang.CharSequence");
    }

    public static boolean b(zii zii) {
        if (zii.c()) {
            return "error".equals(((UpgradeAccountEntity) zii).e);
        }
        return false;
    }

    public static boolean c(zii zii) {
        if (zii != null && zii.b()) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) zii;
            if (upgradeAccountEntity.d.b()) {
                List list = upgradeAccountEntity.d.c;
                int size = list.size();
                boolean z = false;
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    zea zea = (zea) list.get(i2);
                    if ("termsOfService".equals(zea.f())) {
                        z = true;
                    }
                    if (!"button".equals(zea.n())) {
                        i++;
                    }
                }
                if (!z || i != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static zdt a(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                zdt zdt = (zdt) list.get(i);
                if (zdt.c() && str.equals(zdt.b())) {
                    return zdt;
                }
            }
        }
        return null;
    }

    public static boolean a() {
        String lowerCase = Locale.getDefault().getLanguage().toLowerCase();
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 2);
        sb.append("*");
        sb.append(lowerCase);
        sb.append("*");
        return ((String) ysu.L.c()).contains(sb.toString());
    }

    public static boolean a(zea zea) {
        return zea != null && "name".equals(zea.f()) && "name".equals(zea.n());
    }

    public static boolean a(zii zii) {
        return zii != null && zii.c() && "ok".equals(((UpgradeAccountEntity) zii).e);
    }
}
