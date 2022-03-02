package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: xbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface xbq {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Data.CONTENT_URI, "contactables");
        a = withAppendedPath;
        b = Uri.withAppendedPath(withAppendedPath, "filter");
    }
}
