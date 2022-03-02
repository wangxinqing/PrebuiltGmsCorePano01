package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* renamed from: agyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class agyr {
    private static final Pattern a = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    static {
        anil.a("UrlChecker");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str);

    public final boolean a(Uri uri) {
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment((String) null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        String uri2 = encodedFragment.build().toString();
        if (a.matcher(uri2).find()) {
            agyq.a(uri);
            return false;
        } else if ((!amrk.a(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return a(uri2);
        } else {
            agyq.a(uri);
            return false;
        }
    }
}
