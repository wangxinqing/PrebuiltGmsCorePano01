package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: coz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class coz implements cpb {
    private final cpe a;
    private final cmm b;

    public coz(cpe cpe, cmm cmm) {
        this.a = cpe;
        this.b = cmm;
    }

    public final Object a(Object obj) {
        char c;
        cpe cpe = this.a;
        cmm cmm = this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = new ArrayList();
        Long a2 = cpe.a(sQLiteDatabase, cmm);
        if (a2 != null) {
            c = 1;
            cpe.a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{a2.toString()}, (String) null, (String) null, (String) null, String.valueOf(cpe.b.b())), (cpb) new con(arrayList, cmm));
        } else {
            c = 1;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((cok) arrayList.get(i)).a());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        String[] strArr = new String[3];
        strArr[0] = "event_id";
        strArr[c] = "name";
        strArr[2] = "value";
        cpe.a(sQLiteDatabase.query("event_metadata", strArr, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), (cpb) new coo(hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            cok cok = (cok) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(cok.a()))) {
                cmi c2 = cok.c();
                cmh cmh = new cmh();
                cmh.a(c2.a());
                cmh.a = c2.b();
                cmh.a(c2.c());
                cmh.a(c2.d());
                cmh.b(c2.e());
                cmh.b = new HashMap(c2.f());
                for (cpc cpc : (Set) hashMap.get(Long.valueOf(cok.a()))) {
                    String str = cpc.a;
                    String str2 = cpc.b;
                    Map map = cmh.b;
                    if (map != null) {
                        map.put(str, str2);
                    } else {
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    }
                }
                listIterator.set(cok.a(cok.a(), cok.b(), cmh.a()));
            }
        }
        return arrayList;
    }
}
