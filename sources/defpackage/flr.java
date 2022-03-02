package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: flr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class flr implements amqy {
    private final flt a;

    public flr(flt flt) {
        this.a = flt;
    }

    public final Object a(Object obj) {
        flt flt = this.a;
        wla wla = (wla) obj;
        if (wla.b() != null && wla.b().a() > 0) {
            return wla;
        }
        ilm a2 = DataHolder.a(new String[]{"account_name", "display_name", "given_name", "family_name", "avatar"});
        anhk i = flt.a.listIterator();
        while (i.hasNext()) {
            Account account = (Account) i.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_name", account.name);
            contentValues.put("display_name", account.name);
            contentValues.putNull("given_name");
            contentValues.putNull("family_name");
            contentValues.putNull("avatar");
            a2.a(contentValues);
        }
        return new fls(a2);
    }
}
