package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ztx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ztx {
    public static final zsg a = zsg.a("ContactsDataHandler");
    public final Map b;
    public final Set c;
    public Cursor d;
    public int e;

    public ztx(Resources resources) {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new ztp(resources));
        this.b.put("vnd.android.cursor.item/nickname", new ztq());
        this.b.put("vnd.android.cursor.item/note", new ztr());
        this.b.put("vnd.android.cursor.item/organization", new zts());
        this.b.put("vnd.android.cursor.item/phone_v2", new ztt(resources));
        this.b.put("vnd.android.cursor.item/postal-address_v2", new ztw(resources));
        this.b.put("vnd.android.cursor.item/name", new ztv());
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        hashSet.add("mimetype");
        for (zto a2 : this.b.values()) {
            a2.a(this.c);
        }
    }
}
