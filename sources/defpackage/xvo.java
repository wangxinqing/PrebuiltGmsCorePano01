package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: xvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvo {
    private final Context a;

    public xvo(Context context) {
        this.a = context;
    }

    public static boolean a(int i, int i2) {
        if (((long) i2) <= aytd.a.a().q()) {
            double d = (double) i;
            double r = aytd.a.a().r();
            Double.isNaN(d);
            if (((double) i2) <= d * r) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        return !aytd.l();
    }

    public static boolean d() {
        return !aytd.m();
    }

    private static String e() {
        wmh wmh = new wmh(ayql.b());
        wmb wmb = wmb.DEVICE;
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < wmh.a.a.size(); i++) {
            wmb a2 = wmb.a(((wly) wmh.a.a.get(i)).a);
            if (a2 == null) {
                a2 = wmb.UNKNOWN;
            }
            if (a2 == wmb) {
                arrayList.clear();
                arrayList.addAll((Collection) wmh.b.get(i));
                arrayList.removeAll((Collection) wmh.c.get(i));
                hashSet.addAll(arrayList);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (aytd.k()) {
            sb.append("(data_set IS NULL) AND ");
        }
        sb.append("(deleted = 0) AND ((account_name IS NULL AND account_type IS NULL) OR (account_type IN ( ");
        ArrayList arrayList2 = new ArrayList();
        for (String sqlEscapeString : hashSet) {
            arrayList2.add(DatabaseUtils.sqlEscapeString(sqlEscapeString));
        }
        sb.append(TextUtils.join(",", arrayList2));
        sb.append(")))");
        return sb.toString();
    }

    public final int b() {
        return a(e());
    }

    public final int a() {
        String e = e();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 11);
        sb.append("(");
        sb.append(e);
        sb.append(") AND (%s)");
        return a(String.format(sb.toString(), new Object[]{"sourceid IS NOT NULL OR sync1 IS NOT NULL OR sync2 IS NOT NULL OR sync3 IS NOT NULL OR sync4 IS NOT NULL"}));
    }

    public final int a(Uri uri, String str) {
        int i;
        String[] strArr = xvw.a;
        Cursor query = this.a.getContentResolver().query(uri, new String[]{"_count"}, str, (String[]) null, (String) null);
        if (query != null) {
            try {
                boolean moveToLast = query.moveToLast();
                if (!aysu.a.a().a()) {
                    i = query.getInt(0);
                } else if (moveToLast) {
                    i = query.getInt(0);
                } else {
                    throw new nja(13, "Failed to operate Cursor.moveToLast()");
                }
                query.close();
                return i;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new nja(13, "Failed to query contact count: NULL cursor");
        }
        throw th;
    }

    public final int a(String str) {
        return a(ContactsContract.RawContacts.CONTENT_URI, str);
    }
}
