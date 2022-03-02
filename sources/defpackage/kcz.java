package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class kcz implements Runnable {
    private final kdb a;

    public kcz(kdb kdb) {
        this.a = kdb;
    }

    public final void run() {
        Cursor a2;
        kdb kdb = this.a;
        if (!kdb.f.a()) {
            kdb.a.b("Do not attempt to cleanup while offline. Will retry when we go online");
            return;
        }
        HashMap hashMap = new HashMap();
        kdb.b.d();
        try {
            if (!kdb.b.a(kom.a)) {
                long currentTimeMillis = System.currentTimeMillis();
                kkf kkf = kdb.b;
                long j = kdb.e;
                long j2 = currentTimeMillis - j;
                long j3 = currentTimeMillis + j;
                kkb kkb = ((kjp) kkf).a;
                kqh kqh = kol.APPLY_ON_SERVER_TIME.e;
                a2 = kkb.a(kom.a.b(), (String[]) null, kqz.b(kqh.a(j2), kqh.d(j3)), String.valueOf(kol.ACTION_ID.e.a()).concat(" ASC"));
                ArrayList<koj> arrayList = new ArrayList<>(a2.getCount());
                while (a2.moveToNext()) {
                    arrayList.add(koj.a(kkb, a2));
                }
                a2.close();
                for (koj koj : arrayList) {
                    String str = kdb.b.c(koj.d).a;
                    long j4 = koj.m;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(str, list);
                    }
                    list.add(Long.valueOf(j4));
                }
                kdb.b.f();
                kdb.b.e();
                ley ley = kdb.c.j;
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    int a3 = ley.a(str2, 102, 4, (List) null);
                    if (a3 == 0 || a3 == 1) {
                        ley.a(str2, (lev) new kda(kdb, str2, list2));
                    }
                }
                kdb.d();
                return;
            }
            kdb.a.b("Stopping cleanup loop. No pending cleanups");
            kdb.b.f();
            kdb.b.e();
        } catch (Throwable th) {
            kdb.b.e();
            throw th;
        }
    }
}
