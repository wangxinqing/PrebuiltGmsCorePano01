package defpackage;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: aeel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeel implements BaseColumns {
    public static final Uri a = Uri.parse("content://subscribedfeeds/feeds");

    static {
        Uri.parse("content://subscribedfeeds/deleted_feeds");
    }
}
