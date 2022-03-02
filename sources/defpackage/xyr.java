package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: xyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyr extends xyl {
    public static final String[] e = {"sourceid", "_id"};
    public final Uri f;
    private final Map g = new HashMap();
    private final Set h = new HashSet();
    private final yaz i;
    private final xym j;
    private final xwn k;

    /* JADX INFO: finally extract failed */
    public xyr(ContentResolver contentResolver, Account account, xvp xvp, yaz yaz, xwn xwn) {
        super(contentResolver, account, xvp);
        String str;
        this.i = yaz;
        this.j = new xym(account, contentResolver);
        this.k = xwn;
        Uri a = xvw.a(ContactsContract.Groups.CONTENT_URI, account);
        this.f = a;
        xwb a2 = xwb.a(contentResolver, a, (String[]) null, "sourceid IS NULL AND (system_id = 'Contacts' OR title = 'Starred in Android')", (String[]) null, "_id");
        while (true) {
            try {
                xvu a3 = a2.b();
                if (a3 != null) {
                    if (!TextUtils.equals(a3.l(), "Starred in Android")) {
                        str = a3.k();
                    } else {
                        str = "Starred in Android";
                    }
                    if (!this.g.containsKey(str)) {
                        this.g.put(str, a3);
                    }
                    this.h.add(a3.g());
                } else {
                    a2.f();
                    this.g.size();
                    return;
                }
            } catch (Throwable th) {
                a2.f();
                throw th;
            }
        }
    }

    public final List a(Long l, String str) {
        String str2;
        ContentResolver contentResolver = this.a;
        Uri uri = this.f;
        String[] strArr = xvw.a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = l;
        if (aysf.a.a().a()) {
            str2 = DatabaseUtils.sqlEscapeString(str);
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("'");
            sb.append(str);
            sb.append("'");
            str2 = sb.toString();
        }
        objArr[1] = str2;
        xwb b = xwb.b(contentResolver, uri, (String[]) null, String.format(locale, "data_set IS NULL AND (sourceid IS NOT NULL AND _id != %d AND title = %s AND deleted = 0)", objArr), (String[]) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                xvu a = b.b();
                if (a == null) {
                    return arrayList;
                }
                arrayList.add(a);
            } finally {
                b.f();
            }
        }
    }

    public final void b(List list, yaq yaq) {
        Throwable th;
        xwb xwb;
        list.size();
        this.c.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            iva.a((Object) linkedHashMap);
            iva.b(linkedHashMap.isEmpty());
            StringBuilder sb = new StringBuilder("sourceid");
            sb.append(" in (");
            StringBuilder sb2 = new StringBuilder(String.format("(%s is NULL) AND (%s is NULL) AND %s in (", new Object[]{"sourceid", "system_id", "title"}));
            Iterator it = list.iterator();
            boolean z = true;
            boolean z2 = true;
            while (it.hasNext()) {
                xvu xvu = (xvu) it.next();
                if (xvu != null) {
                    String j2 = xvu.j();
                    if (!TextUtils.isEmpty(j2)) {
                        if (!z) {
                            sb.append(",");
                        }
                        linkedHashMap.put(j2, xvu);
                        DatabaseUtils.appendEscapedSQLString(sb, j2);
                        if (TextUtils.isEmpty(xvu.l())) {
                            z = false;
                        } else {
                            if (!z2) {
                                sb2.append(",");
                            }
                            DatabaseUtils.appendEscapedSQLString(sb2, xvu.l());
                            z = false;
                            z2 = false;
                        }
                    }
                }
            }
            sb.append(")");
            sb2.append(")");
            String format = String.format("%s OR (%s)", new Object[]{sb.toString(), sb2.toString()});
            ContentResolver contentResolver = this.a;
            Uri uri = this.f;
            String[] strArr = xvw.a;
            xwb = xwb.a(contentResolver, uri, (String[]) null, format, (String[]) null, (String) null);
            try {
                linkedHashMap.size();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (true) {
                    xvu a = xwb.b();
                    if (a == null) {
                        break;
                    }
                    this.c.a();
                    if (!TextUtils.isEmpty(a.j())) {
                        hashMap.put(a.j(), a);
                    } else if (!this.h.contains(a.g())) {
                        hashMap2.put(a.l(), a);
                    }
                }
                xwb.f();
                for (String str : linkedHashMap.keySet()) {
                    xvu xvu2 = (xvu) linkedHashMap.get(str);
                    if (hashMap.containsKey(str)) {
                        yaq.a((Object) new yad(xvu2, (xvu) hashMap.get(str)));
                    } else if (!hashMap2.containsKey(xvu2.l())) {
                        this.g.size();
                        xvu xvu3 = (xvu) this.g.remove(xvu2.k());
                        if (xvu3 == null) {
                            xvu3 = (xvu) this.g.remove(xvu2.l());
                        }
                        if (xvu3 != null) {
                            xvu2.j();
                            xvu2.j();
                            yaq.a((Object) new yad(xvu2, xvu3));
                        } else {
                            yaq.a((Object) new yad(xvu2));
                        }
                    } else {
                        xvu2.l();
                        yaq.a((Object) new yad(xvu2, (xvu) hashMap2.remove(xvu2.l())));
                    }
                }
                xip.a();
                if (((Boolean) xfy.a.a()).booleanValue() && xwb != null) {
                    xwb.f();
                }
            } catch (Throwable th2) {
                th = th2;
                xip.a();
                if (((Boolean) xfy.a.a()).booleanValue() && xwb != null) {
                    xwb.f();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xwb = null;
            xip.a();
            xwb.f();
            throw th;
        }
    }

    public final void a(String str) {
        Log.e("FSA2_LocalGroupsReader", str);
        for (xvu xvu : this.g.values()) {
            aucd o = xnm.d.o();
            xnk a = yax.a(xvu);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnm xnm = (xnm) o.b;
            a.getClass();
            xnm.b = a;
            xnm.a |= 1;
            xip.a();
            if (((Boolean) xgg.a.a()).booleanValue()) {
                try {
                    xnl a2 = this.j.a(xvu.g().longValue());
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    xnm xnm2 = (xnm) o.b;
                    a2.getClass();
                    xnm2.c = a2;
                    xnm2.a |= 2;
                } catch (RemoteException e2) {
                }
            }
            this.i.a((xnm) o.i());
        }
        if (aysc.a.a().b()) {
            this.k.b();
        }
        throw new xye(new xyd(str));
    }
}
