package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: acuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuo implements BaseColumns {
    public static final Uri a = Uri.parse("content://com.google.android.gms.subscribedfeeds/feeds");

    static {
        Uri.parse("content://com.google.android.gms.subscribedfeeds/deleted_feeds");
    }
}
