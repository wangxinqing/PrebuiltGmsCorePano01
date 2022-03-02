package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: oxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oxm extends oxk {
    Map a;
    private final Thing[] b;

    public final oxj a(SQLiteDatabase sQLiteDatabase, ovw ovw, ozc ozc, oyb oyb) {
        Set set;
        Thing[] thingArr = this.b;
        iva.a(sQLiteDatabase.inTransaction());
        String str = ozc.f;
        int length = thingArr.length;
        if (length == 0) {
            set = Collections.emptySet();
        } else {
            if (apmu.a(3)) {
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    apmu.a(String.format(Locale.US, "Patch Indexable %d / %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(length)}));
                    apmu.a(thingArr[i].toString());
                    i = i2;
                }
            }
            amxc p = amxc.p();
            for (Thing thing : thingArr) {
                p.a((Object) oyb.b(thing.e).b, (Object) thing);
            }
            amxc p2 = amxc.p();
            Set a2 = ovv.a(sQLiteDatabase, str, oyb);
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                oxe oxe = (oxe) it.next();
                String str2 = oxe.a.b;
                if (p.d(str2)) {
                    p2.a((Object) str2, (Object) oxe);
                } else {
                    it.remove();
                }
            }
            for (Map.Entry entry : p2.l()) {
                oxe oxe2 = (oxe) entry.getValue();
                for (Thing thing2 : p.c((Object) (String) entry.getKey())) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("action", "mod");
                    contentValues.put("uri", thing2.d);
                    contentValues.put("section_thing_proto", oyl.a(thing2));
                    sQLiteDatabase.insertOrThrow(oyc.a(oxe2.a()), (String) null, contentValues);
                }
            }
            set = a2;
        }
        return oxj.a(set);
    }

    public oxm(Thing[] thingArr) {
        super(oxt.a(thingArr), 4);
        this.b = thingArr;
    }

    public final void a(osf osf, ozc ozc, owf owf) {
        oxt.a(osf, "patch");
        iva.a((Object) this.a, (Object) "execute called without validateInput");
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
                ora.a = 2;
                owf.a((ora) o.i());
            }
        }
    }

    public final void a(ozc ozc, osf osf, oyb oyb) {
        oxz.a(this.b, ozc.f, osf.b, true, oyb);
        this.a = oxf.a(this.b, ozc.f, oyb);
    }
}
