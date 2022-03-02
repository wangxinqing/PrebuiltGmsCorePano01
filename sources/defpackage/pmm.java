package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: pmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pmm {
    public final Map a;
    public final Set b;
    public Cursor c;
    public int d;

    public pmm(Resources resources) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("vnd.android.cursor.item/email_v2", new pme(resources));
        this.a.put("vnd.android.cursor.item/nickname", new pmf());
        this.a.put("vnd.android.cursor.item/note", new pmg());
        this.a.put("vnd.android.cursor.item/organization", new pmh());
        this.a.put("vnd.android.cursor.item/phone_v2", new pmi(resources));
        this.a.put("vnd.android.cursor.item/postal-address_v2", new pml(resources));
        this.a.put("vnd.android.cursor.item/name", new pmk());
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add("mimetype");
        for (pmd a2 : this.a.values()) {
            a2.a(this.b);
        }
    }
}
