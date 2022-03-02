package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: pou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pou {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    static final String[] b = {"_id"};
    public static final anax c = anax.a("image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "text/plain", "video/mp4");
    public static final String[] d = {"_id", "type", "thread_id", "address", "date", "subject", "body", "read"};
    public static final String[] e = {"_id", "msg_box", "thread_id", "date", "sub", "read"};
    public static final String[] f = {"type", "address"};
    public static final String[] g = {"_id", "ct", "text"};
    public static final String h = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", new Object[]{"date", "date", "_id", "date"});
    public static final String i = String.format("(%s>? OR ((%s=?) AND (%s>?))) AND (%s<?)", new Object[]{"date", "date", "_id", "date"});
    public final Context j;
    public final pni k;

    public pou(Context context, pni pni) {
        this.j = context;
        this.k = pni;
    }

    private static String a(List list) {
        return String.format("_id || ';' || date IN (%s) AND read IS 1", new Object[]{TextUtils.join(",", list)});
    }

    public final int b(Uri uri) {
        Cursor a2 = this.k.a(uri, b, (String) null, (String[]) null, "_id DESC LIMIT 1");
        int i2 = -1;
        if (a2 == null) {
            return -1;
        }
        try {
            if (a2.moveToFirst()) {
                i2 = jit.a(a2, 0, (Integer) -1).intValue();
            }
            a2.close();
            return i2;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private final void a(Uri uri, String str, List list) {
        Cursor a2 = this.k.a(uri, b, str, (String[]) null, (String) null);
        if (a2 != null) {
            while (a2.moveToNext()) {
                try {
                    Integer a3 = jit.a(a2, 0);
                    if (a3 != null) {
                        list.add(a3);
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
        }
        if (a2 != null) {
            a2.close();
            return;
        }
        return;
        throw th;
    }

    public final int a(Uri uri, boolean z) {
        String str;
        if (z) {
            str = "read IS 0";
        } else {
            str = null;
        }
        Cursor a2 = this.k.a(uri, new String[]{"count(*) as count"}, str, (String[]) null, (String) null);
        if (a2 != null) {
            try {
                if (a2.moveToFirst()) {
                    int intValue = jit.a(a2, 0, (Integer) 0).intValue();
                    a2.close();
                    return intValue;
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        if (a2 != null) {
            a2.close();
        }
        return 0;
        throw th;
    }

    public final Iterator a(Uri uri) {
        return new pog("_id", this.k, uri);
    }

    public final List a(int i2, Uri uri, Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
            if (arrayList.size() == i2) {
                a(uri, a((List) arrayList), (List) arrayList2);
                arrayList.clear();
            }
        }
        if (!arrayList.isEmpty()) {
            a(uri, a((List) arrayList), (List) arrayList2);
        }
        return arrayList2;
    }
}
