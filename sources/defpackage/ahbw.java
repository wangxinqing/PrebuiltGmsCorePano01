package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ahbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbw {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static amzy a(Uri uri) {
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            return amzy.h();
        }
        return amzy.a(amsk.a("+").a().a((CharSequence) encodedFragment.substring(10)));
    }

    public static String a(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid fragment spec: ") : "Invalid fragment spec: ".concat(valueOf));
    }

    public static String a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        String valueOf = String.valueOf(amre.a("+").a((Iterable) list));
        return valueOf.length() == 0 ? new String("transform=") : "transform=".concat(valueOf);
    }
}
