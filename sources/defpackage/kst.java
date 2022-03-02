package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: kst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class kst implements Runnable {
    private final ksw a;

    public kst(ksw ksw) {
        this.a = ksw;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        ksw ksw = this.a;
        if (ksw.i.a()) {
            long currentTimeMillis = System.currentTimeMillis();
            kkb kkb = ((kjp) lsm.a().d).a;
            Cursor a2 = kkb.a(kpc.a.b(), (String[]) null, kpb.NEXT_NOTIFICATION_TIME.g.b(currentTimeMillis), String.valueOf(kpc.a.a.a()).concat(" ASC"));
            try {
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    arrayList.add(kov.a(kkb, a2));
                }
                a2.close();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ksw.a((kov) arrayList.get(i));
                }
                if (!arrayList.isEmpty()) {
                    ksw.a();
                    return;
                }
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        if (!lsm.a().d.a(kpc.a)) {
            ksw.a();
        }
    }
}
