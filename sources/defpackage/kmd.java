package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: kmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kmd extends kqq {
    private static final ith g = new ith("DriveAppRow", "");
    public final long a;
    public final String b;
    public long c;
    public Long d;
    public Boolean e;
    public Set f;

    public kmd(kqg kqg, long j, long j2, String str, long j3, Long l, Boolean bool, Set set) {
        super(kqg, kmg.a, j);
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = l;
        this.e = bool;
        this.f = set;
    }

    public static kmd a(kqg kqg, Cursor cursor) {
        String[] strArr;
        int i;
        Cursor cursor2 = cursor;
        long longValue = kmf.ACCOUNT_ID.h.b(cursor2).longValue();
        String a2 = kmf.SDK_APP_ID.h.a(cursor2);
        long c2 = kmf.EXPIRY_TIMESTAMP.h.c(cursor2);
        Long b2 = kmf.APPDATA_ROOT_ENTRY_ID.h.b(cursor2);
        Boolean d2 = kmf.IS_APPDATA_ROOT_PLACEHOLDER.h.d(cursor2);
        long longValue2 = kmg.a.a.b(cursor2).longValue();
        String a3 = kmf.SCOPES.h.a(cursor2);
        HashSet hashSet = new HashSet();
        if (a3 != null && !a3.isEmpty()) {
            String[] split = TextUtils.split(a3, ",");
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String str = split[i2];
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (jzl.a(intValue) == null) {
                        strArr = split;
                        try {
                            g.b("DriveAppRow", "Invalid scope int in database: %s", str);
                            i = length;
                        } catch (NumberFormatException e2) {
                            e = e2;
                            Object[] objArr = {str};
                            i = length;
                            g.c("DriveAppRow", String.format("Invalid scope string in database %s", objArr), e);
                            i2++;
                            length = i;
                            split = strArr;
                        }
                    } else {
                        strArr = split;
                        hashSet.add(jzl.a(intValue));
                        i = length;
                    }
                } catch (NumberFormatException e3) {
                    e = e3;
                    strArr = split;
                    Object[] objArr2 = {str};
                    i = length;
                    g.c("DriveAppRow", String.format("Invalid scope string in database %s", objArr2), e);
                    i2++;
                    length = i;
                    split = strArr;
                }
                i2++;
                length = i;
                split = strArr;
            }
        }
        return new kmd(kqg, longValue2, longValue, a2, c2, b2, d2, hashSet);
    }

    private static String b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((jzl) it.next()).g));
        }
        return TextUtils.join(",", hashSet);
    }

    public final String toString() {
        return String.format(Locale.US, "DriveAppRow [accountId=%d sdkAppId=%s, expiryTimestamp=%d, appDataRootEntryId=%s, isAppDataRootPlaceHolder=%s, scopes=%s]", new Object[]{Long.valueOf(this.a), this.b, Long.valueOf(this.c), this.d, this.e, b(this.f)});
    }

    public final void b() {
        this.e = false;
    }

    /* access modifiers changed from: protected */
    public final void a(ContentValues contentValues) {
        contentValues.put(kmf.ACCOUNT_ID.h.a(), Long.valueOf(this.a));
        contentValues.put(kmf.SDK_APP_ID.h.a(), this.b);
        contentValues.put(kmf.EXPIRY_TIMESTAMP.h.a(), Long.valueOf(this.c));
        contentValues.put(kmf.APPDATA_ROOT_ENTRY_ID.h.a(), this.d);
        contentValues.put(kmf.IS_APPDATA_ROOT_PLACEHOLDER.h.a(), this.e);
        contentValues.put(kmf.SCOPES.h.a(), b(this.f));
    }

    public final void a(Set set) {
        this.f = new HashSet(set);
    }
}
