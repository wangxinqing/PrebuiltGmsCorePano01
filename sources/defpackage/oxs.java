package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: oxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxs extends oxk {
    Map a;
    private final Thing[] b;

    /* JADX INFO: finally extract failed */
    public final oxj a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        Set set;
        String str;
        String str2;
        Iterator it;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        ozc ozc2 = ozc;
        oyb oyb2 = oyb;
        String str3 = "type_indexapi";
        String str4 = "incarnation_indexapi";
        iva.a((Object) this.a, (Object) "execute called without validateInput");
        Map map = this.a;
        iva.a(sQLiteDatabase.inTransaction());
        String str5 = ozc2.f;
        if (map.isEmpty()) {
            set = Collections.emptySet();
        } else {
            if (!"com.google.android.apps.messaging".equals(ozc2.f) || !axry.a.a().b()) {
                set = null;
            } else {
                set = new HashSet();
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                oxe oxe = (oxe) entry.getKey();
                String a2 = oxe.a();
                if (!dvk.c(sQLiteDatabase2, a2)) {
                    ArrayList arrayList = new ArrayList();
                    List a3 = oyc.a(oxe.a);
                    int size = a3.size();
                    int i = 0;
                    while (true) {
                        it = it2;
                        if (i >= size) {
                            break;
                        }
                        Pair pair = (Pair) a3.get(i);
                        String str6 = (String) pair.first;
                        String str7 = (String) pair.second;
                        String str8 = str3;
                        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 3 + String.valueOf(str7).length());
                        sb.append("[");
                        sb.append(str6);
                        sb.append("] ");
                        sb.append(str7);
                        arrayList.add(sb.toString());
                        i++;
                        str3 = str8;
                        it2 = it;
                        str4 = str4;
                    }
                    String a4 = oxe.a();
                    String join = TextUtils.join(", ", arrayList);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a4).length() + 32 + String.valueOf(join).length());
                    sb2.append("CREATE TABLE IF NOT EXISTS [");
                    sb2.append(a4);
                    sb2.append("] (");
                    sb2.append(join);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    String b2 = oyc.b(oxe.a());
                    sQLiteDatabase.beginTransaction();
                    try {
                        String str9 = oxe.b;
                        String hexString = Long.toHexString(new Random().nextLong());
                        ContentValues contentValues = new ContentValues(2);
                        contentValues.put("app_name", str9);
                        contentValues.put("incarnation", hexString);
                        sQLiteDatabase2.insertWithOnConflict(str4, (String) null, contentValues, 4);
                        oso.a("Updated %s with: %s.", (Object) str4, (Object) hexString);
                        ContentValues contentValues2 = new ContentValues(2);
                        contentValues2.put("app_name", oxe.b);
                        contentValues2.put("type", oxe.c());
                        sQLiteDatabase2.insertWithOnConflict(str3, (String) null, contentValues2, 4);
                        oso.b("Updated %s with (%s, %s).", str3, oxe.b, oxe.c());
                        sQLiteDatabase2.execSQL(sb3);
                        if (sQLiteDatabase.getVersion() >= 9) {
                            sQLiteDatabase2.execSQL(b2);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        oso.a("Updated incarnation and type table.");
                        oso.b("Created sequence table: %s. SQL: %s; %s", a2, sb3, b2);
                        sQLiteDatabase.endTransaction();
                        str = str3;
                        str2 = str4;
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    str = str3;
                    str2 = str4;
                    it = it2;
                }
                List<Thing> list = (List) entry.getValue();
                iva.b(sQLiteDatabase.inTransaction());
                Set<oxe> a5 = ovv.a(sQLiteDatabase2, oxe.b, oyb2);
                if (!a5.remove(oxe)) {
                    String valueOf = String.valueOf(oxe.a.b);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing type: ") : "Missing type: ".concat(valueOf));
                }
                if (set != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(oxe.a.b);
                    if ("LocalBusiness".equals(oxe.a.b)) {
                        arrayList2.add("DigitalDocument");
                    }
                    if ("DigitalDocument".equals(oxe.a.b)) {
                        arrayList2.add("LocalBusiness");
                    }
                    a5 = ovw.a(a5, (List) arrayList2);
                }
                if (set != null) {
                    set.addAll(a5);
                    set.add(oxe);
                }
                for (Thing thing : list) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("uri", thing.d);
                    contentValues3.put("action", "del");
                    for (oxe a6 : a5) {
                        sQLiteDatabase2.insertOrThrow(oyc.a(a6.a()), (String) null, contentValues3);
                    }
                    contentValues3.put("action", "add");
                    contentValues3.put("doc_score", Integer.valueOf(thing.c.b));
                    contentValues3.put("created_timestamp", Long.valueOf(System.currentTimeMillis()));
                    contentValues3.put("section_thing_proto", oyl.a(thing));
                    aucx aucx = oxe.a.d;
                    int size2 = aucx.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ovn ovn = (ovn) aucx.get(i2);
                        List a7 = oyb.a(thing, ovn.b);
                        if (!a7.isEmpty()) {
                            String valueOf2 = String.valueOf(ovn.b);
                            contentValues3.put(valueOf2.length() == 0 ? new String("section_") : "section_".concat(valueOf2), TextUtils.join("\u0000", a7));
                        }
                    }
                    sQLiteDatabase2.insertOrThrow(oyc.a(oxe.a()), (String) null, contentValues3);
                }
                str3 = str;
                it2 = it;
                str4 = str2;
            }
            if (set == null) {
                set = ovv.a(sQLiteDatabase2, str5, oyb2);
            }
        }
        return new oxj(set, this.a.keySet());
    }

    public oxs(Thing[] thingArr) {
        super(oxt.a(thingArr), 3);
        this.b = thingArr;
    }

    public final void a(osf osf, ozc ozc, owf owf) {
        oxt.a(osf, "update");
        iva.a((Object) this.a, (Object) "execute called without validateInput");
        if (axsj.b()) {
            owz.a(this.a);
        }
        oyg.a(ozc, osf, this.a);
        for (oxe a2 : this.a.keySet()) {
            ovz.a(osf, ozc, a2);
        }
        for (Map.Entry entry : this.a.entrySet()) {
            oxe oxe = (oxe) entry.getKey();
            for (Thing b2 : (List) entry.getValue()) {
                avqi b3 = oyl.b(b2);
                aucd o = ora.c.o();
                aucd o2 = ore.d.o();
                String str = oxe.b;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                str.getClass();
                ((ore) o2.b).a = str;
                String b4 = oxe.b();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                ore ore = (ore) o2.b;
                b4.getClass();
                ore.b = b4;
                b3.getClass();
                ore.c = b3;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ora ora = (ora) o.b;
                ore ore2 = (ore) o2.i();
                ore2.getClass();
                ora.b = ore2;
                ora.a = 1;
                owf.a((ora) o.i());
            }
        }
    }

    public final void a(ozc ozc, osf osf) {
        if (axsj.b()) {
            owz.a(this.a);
        }
        oyg.a(ozc, osf, this.a);
    }

    public final void a(ozc ozc, osf osf, oyb oyb) {
        String str = ozc.f;
        oxz.a(this.b, str, osf.b, false, oyb);
        if (apmu.a(3)) {
            int length = this.b.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                apmu.a(String.format(Locale.US, "Update Indexable %d / %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length)}));
                apmu.a(this.b[i].toString());
                i = i2;
            }
        }
        this.a = oxf.a(this.b, str, oyb);
    }
}
