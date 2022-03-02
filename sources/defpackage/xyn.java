package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: xyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyn {
    private final xvw a;
    private final Account b;
    private final ContentResolver c;

    public xyn(xvw xvw, Account account, ContentResolver contentResolver) {
        this.a = xvw;
        this.b = account;
        this.c = contentResolver;
    }

    private final Map a(Uri uri, long j, Set set) {
        String str;
        HashMap a2 = anet.a();
        if (set != null) {
            String join = TextUtils.join(",", set);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 88);
            sb.append("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id IN (");
            sb.append(join);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "mimetype='vnd.android.cursor.item/group_membership' AND data1=?";
        }
        Cursor query = this.c.query(uri, new String[]{"raw_contact_id", "_id"}, str, new String[]{String.valueOf(j)}, (String) null);
        while (query.moveToNext()) {
            try {
                a2.put(Long.valueOf(query.getLong(0)), Long.valueOf(query.getLong(1)));
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return a2;
    }

    public final int a(long j, long j2, long j3) {
        Map map;
        long j4 = j;
        long j5 = j2;
        Uri a2 = xvw.a(ContactsContract.Data.CONTENT_URI, this.b);
        Map a3 = a(a2, j4, (Set) null);
        if (((long) a3.size()) > j3) {
            xdt.a("GroupMembershipMigrater", "Too many contacts to move, contact count = %d", Integer.valueOf(a3.size()));
            return -1;
        }
        Map a4 = a(a2, j5, a3.keySet());
        int size = a3.size();
        StringBuilder sb = new StringBuilder(83);
        sb.append("Moving ");
        sb.append(size);
        sb.append(" contacts from group ");
        sb.append(j4);
        sb.append(" to ");
        sb.append(j5);
        sb.toString();
        Set<Long> keySet = a3.keySet();
        try {
            for (Long longValue : keySet) {
                long longValue2 = longValue.longValue();
                Long valueOf = Long.valueOf(longValue2);
                if (!a4.containsKey(valueOf)) {
                    map = a4;
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Changing membership of contact ");
                    sb2.append(longValue2);
                    sb2.append(" to ");
                    sb2.append(j5);
                    sb2.toString();
                    xvx xvx = this.a.e;
                    xvx.b.a(ContentProviderOperation.newAssertQuery(xvx.a).withSelection("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(j2), String.valueOf(longValue2)}).withExpectedCount(0), false);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data1", Long.valueOf(j2));
                    this.a.d.a((Long) a3.get(valueOf), contentValues);
                    xvy xvy = this.a.b;
                    xvy.a(xvy.a, "dirty", valueOf, true);
                } else {
                    map = a4;
                    StringBuilder sb3 = new StringBuilder(63);
                    sb3.append("Removing contact ");
                    sb3.append(longValue2);
                    sb3.append(" from ");
                    sb3.append(j4);
                    sb3.toString();
                    xvx xvx2 = this.a.e;
                    xvx2.b.a(ContentProviderOperation.newAssertQuery(xvx2.a).withSelection("mimetype='vnd.android.cursor.item/group_membership' AND data1=? AND raw_contact_id=?", new String[]{String.valueOf(j2), String.valueOf(longValue2)}).withExpectedCount(1), false);
                    this.a.d.a((Long) a3.get(valueOf), false);
                }
                this.a.a();
                j5 = j2;
                a4 = map;
            }
            this.a.b();
            xdt.a("GroupMembershipMigrater", "Successfully moved %d contacts and deleted group membership for %d contacts", a3.size() - a4.size(), a4.size());
            return keySet.size();
        } catch (xye e) {
            Log.e("GroupMembershipMigrater", "Failed to move contacts", e);
            return -2;
        }
    }
}
