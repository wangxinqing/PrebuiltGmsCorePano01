package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wtw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wtw {
    public final wtz a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final jkh d = new jkh();
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    public wtw(wtz wtz) {
        this.a = wtz;
    }

    private final wtv a(String str, String str2, boolean z) {
        wtv wtv;
        Object obj;
        if (!z) {
            jkh jkh = this.d;
            synchronized (jkh.a) {
                int size = jkh.a.size();
                if (size > 0) {
                    obj = jkh.a.remove(size - 1);
                } else {
                    obj = new wtv();
                }
            }
            wtv = (wtv) obj;
        } else {
            wtv = new wtv();
        }
        wtv.a = str;
        wtv.b = str2;
        return wtv;
    }

    public final String b(String str, String str2) {
        long a2 = a(str, str2);
        if (a2 == -1) {
            return "";
        }
        ConcurrentHashMap concurrentHashMap = this.e;
        Long valueOf = Long.valueOf(a2);
        String str3 = (String) concurrentHashMap.get(valueOf);
        if (str3 != null) {
            return str3;
        }
        String valueOf2 = String.valueOf(a2);
        this.e.put(valueOf, valueOf2);
        return valueOf2;
    }

    public static final wtw a(Context context) {
        return wtz.a(context).f;
    }

    public final long a(String str, String str2) {
        long j;
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        wtv a2 = a(str, str2, false);
        try {
            Long l = (Long) this.b.get(a2);
            if (l == null) {
                wtx b2 = this.a.b();
                if (b2 != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        cursor = b2.a("SELECT _id FROM owners WHERE (account_name = ?1) AND (page_gaia_id = ?2)", new String[]{str, str2});
                    } else {
                        cursor = b2.a("SELECT _id FROM owners WHERE (account_name = ?1) AND (page_gaia_id IS NULL)", new String[]{str});
                    }
                    if (cursor.moveToFirst()) {
                        j = cursor.getLong(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        j = -1;
                    }
                } else {
                    j = -1;
                }
                if (j != -1) {
                    this.b.put(a(str, str2, true), Long.valueOf(j));
                }
            } else {
                j = l.longValue();
            }
            this.d.a(a2);
            return j;
        } catch (Throwable th) {
            this.d.a(a2);
            throw th;
        }
    }
}
