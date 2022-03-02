package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: ahak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahak {
    public static final ahak a = new ahak();

    private ahak() {
    }

    public static final File a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new ahbk("Scheme must be 'file'");
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new ahbk("Did not expect uri to have query");
        } else if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        } else {
            throw new ahbk("Did not expect uri to have authority");
        }
    }
}
