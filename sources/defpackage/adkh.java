package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: adkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkh {
    public static final iwd a = adnt.c("Ui");
    public static final Pattern b = Pattern.compile(String.format(Locale.US, "^%d$", new Object[]{0}));
    public static final Pattern c = Pattern.compile(String.format(Locale.US, "^%d,(\\d+)$", new Object[]{1}));

    public static int a(long j) {
        String a2 = ayoi.a.a().a();
        if (amrk.a(a2)) {
            return 0;
        }
        long j2 = 0;
        int i = 0;
        for (String str : amsk.a(',').a((CharSequence) a2)) {
            try {
                j2 += Long.parseLong(str.trim());
                if (j < j2) {
                    break;
                }
                i++;
            } catch (NumberFormatException e) {
                a.b("Malformed elapsed time string: %s.", str);
            }
        }
        return i;
    }
}
