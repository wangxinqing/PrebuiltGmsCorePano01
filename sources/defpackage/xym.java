package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;

/* renamed from: xym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xym {
    private final Account a;
    private final ContentResolver b;

    public xym(Account account, ContentResolver contentResolver) {
        this.a = account;
        this.b = contentResolver;
    }

    private final int a(String str, long j) {
        Uri a2 = xvw.a(ContactsContract.RawContactsEntity.CONTENT_URI, this.a);
        StringBuilder sb = new StringBuilder();
        sb.append("mimetype='vnd.android.cursor.item/group_membership' AND data1=?");
        if (!TextUtils.isEmpty(str)) {
            sb.append(" AND  (");
            sb.append(str);
            sb.append(")");
        }
        return xvw.a(this.b, a2, sb.toString(), new String[]{String.valueOf(j)});
    }

    public final xnl a(long j) {
        aucd o = xnl.f.o();
        int a2 = a((String) null, j);
        if (a2 > 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnl xnl = (xnl) o.b;
            xnl.a |= 1;
            xnl.b = a2;
            int a3 = a(String.format("%s = 1 and %s = 1", new Object[]{"dirty", "deleted"}), j);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnl xnl2 = (xnl) o.b;
            xnl2.a |= 8;
            xnl2.e = a3;
            int a4 = a(String.format("%s = 1 and %s is null", new Object[]{"dirty", "sourceid"}), j);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnl xnl3 = (xnl) o.b;
            xnl3.a |= 2;
            xnl3.c = a4;
            int a5 = a(String.format("%s = 1 and %s is not null", new Object[]{"dirty", "sourceid"}), j);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnl xnl4 = (xnl) o.b;
            xnl4.a |= 4;
            xnl4.d = a5;
            o.i();
        }
        return (xnl) o.i();
    }
}
