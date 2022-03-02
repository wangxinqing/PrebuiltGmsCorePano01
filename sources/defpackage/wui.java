package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wui implements wuk {
    public static final wui a;
    public static final wui b = new wui("Data", new wuh[]{new wuh(ContactsContract.Data.CONTENT_URI, new String[]{"_id", "mimetype", "raw_contact_id", "is_primary", "is_super_primary", "data_version", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4"})});
    public static final wui c = new wui("SyncState", new wuh[]{new wuh(ContactsContract.SyncState.CONTENT_URI, new String[]{"_id", "account_name", "account_type", "data"})});
    public static final wui d = new wui("Groups", new wuh[]{new wuh(ContactsContract.Groups.CONTENT_URI, new String[]{"account_type", "account_name", "sourceid", "version", "dirty", "title", "title_res", "notes", "system_id", "deleted", "group_visible", "should_sync", "auto_add", "favorites", "group_is_read_only", "sync1", "sync2", "sync3", "sync4"})});
    private final String e;
    private final wuh[] f;

    static {
        Uri uri = ContactsContract.RawContacts.CONTENT_URI;
        int i = Build.VERSION.SDK_INT;
        a = new wui("RawContacts", new wuh[]{new wuh(ContactsContract.Data.CONTENT_URI, new String[]{"mimetype", "raw_contact_id", "contact_id", "display_name", "display_name_alt", "data1", "data1", "data2", "data3", "data1", "data2", "data3", "is_primary", "is_super_primary", "data1"}), new wuh(uri, new String[]{"last_time_contacted", "pinned", "starred", "times_contacted", "sourceid", "custom_ringtone", "send_to_voicemail", "dirty", "deleted", "starred", "sync1", "sync2", "sync3", "sync4"}, "_id = ?", new String[]{"raw_contact_id"})});
    }

    public wui(String str, wuh[] wuhArr) {
        this.e = str;
        this.f = wuhArr;
    }

    private static final String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 0).trim();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String a() {
        return this.e;
    }

    public final void b() {
    }

    private final List a(Context context, List list, int i, Map map) {
        String[] strArr;
        String str;
        wuh wuh = this.f[i];
        String[] strArr2 = wuh.d;
        if (strArr2 != null) {
            String[] strArr3 = new String[strArr2.length];
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                strArr3[i2] = (String) list.get(((Integer) map.get(strArr2[i2])).intValue());
            }
            strArr = strArr3;
        } else {
            strArr = new String[0];
        }
        Cursor query = context.getContentResolver().query(Uri.parse(wuh.a), wuh.b, wuh.c, strArr, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            ArrayList arrayList2 = new ArrayList(list);
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < query.getColumnCount(); i3++) {
                int type = query.getType(i3);
                if (type == 0) {
                    str = "NULL";
                } else if (type == 1) {
                    str = Long.toString(query.getLong(i3));
                } else if (type == 2) {
                    str = Double.toString(query.getDouble(i3));
                } else if (type == 3) {
                    str = query.getString(i3);
                } else if (type != 4) {
                    str = String.format("BAD_TYPE(%s)", new Object[]{Integer.valueOf(query.getType(i3))});
                } else {
                    str = a(query.getBlob(i3));
                }
                arrayList3.add(str);
            }
            arrayList2.addAll(arrayList3);
            if (i == this.f.length - 1) {
                aucd o = xoo.b.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xoo xoo = (xoo) o.b;
                if (!xoo.a.a()) {
                    xoo.a = aucj.a(xoo.a);
                }
                auab.a((Iterable) arrayList2, (List) xoo.a);
                arrayList.add((xoo) o.i());
            } else {
                arrayList.addAll(a(context, arrayList2, i + 1, map));
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ wuj a(icc icc) {
        wuh[] wuhArr = this.f;
        ArrayList arrayList = new ArrayList();
        for (wuh wuh : wuhArr) {
            int i = 0;
            while (true) {
                String[] strArr = wuh.b;
                if (i >= strArr.length) {
                    break;
                }
                arrayList.add(strArr[i]);
                i++;
            }
        }
        aucd o = xon.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xon xon = (xon) o.b;
        if (!xon.a.a()) {
            xon.a = aucj.a(xon.a);
        }
        auab.a((Iterable) arrayList, (List) xon.a);
        xon xon2 = (xon) o.i();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < xon2.a.size(); i2++) {
            if (!hashMap.containsKey((String) xon2.a.get(i2))) {
                hashMap.put((String) xon2.a.get(i2), Integer.valueOf(i2));
            }
        }
        return new wug(this.e, xon2, a(((iey) icc).d, new ArrayList(), 0, hashMap));
    }
}
