package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: wqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wqh {
    public final Map a;
    public final Set b;
    public Cursor c;
    public int d;

    public wqh(Resources resources) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new wpz(resources));
        this.a.put("vnd.android.cursor.item/nickname", new wqa());
        this.a.put("vnd.android.cursor.item/note", new wqb());
        this.a.put("vnd.android.cursor.item/organization", new wqc());
        this.a.put("vnd.android.cursor.item/phone_v2", new wqd(resources));
        this.a.put("vnd.android.cursor.item/postal-address_v2", new wqg(resources));
        this.a.put("vnd.android.cursor.item/name", new wqf());
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add("mimetype");
        for (wpy a2 : this.a.values()) {
            a2.a(this.b);
        }
    }
}
