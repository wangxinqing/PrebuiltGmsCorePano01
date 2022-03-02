package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.drive.DriveId;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: lkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lkm {
    private static final ith c = new ith("RealtimeDocumentCachePr", "");
    public final kkb a;
    public final kkf b;
    private final Context d;
    private final lkc e;
    private final ConcurrentMap f = new ConcurrentHashMap();

    public lkm(Context context, kkb kkb, kkf kkf) {
        this.d = context;
        this.a = kkb;
        this.e = new lkc();
        this.b = kkf;
    }

    public final lkk a(ljt ljt, boolean z) {
        lkk lkk;
        do {
            kpf b2 = b(ljt);
            lkk lkk2 = (lkk) this.f.get(b2.c);
            lkk = null;
            if (lkk2 != null) {
                if (z) {
                    c.a("RealtimeDocumentCachePr", "Closing cache (lock steal): %s", ljt);
                    lkk2.f();
                } else {
                    c.a("RealtimeDocumentCachePr", "Cannot open; cache is already in use: %s", ljt);
                    return null;
                }
            }
            String str = b2.c;
            lkk lkk3 = new lkk(str, new lll(this.d, new File(lkb.a(this.d), str).getAbsolutePath(), "drive_real_time"), b2, this.f);
            if (this.f.putIfAbsent(str, lkk3) == null) {
                lkk = lkk3;
                continue;
            }
        } while (lkk == null);
        return lkk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.kpf b(defpackage.ljt r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            kpf r2 = r20.c(r21)
            if (r2 != 0) goto L_0x0055
            kkf r2 = r0.b
            kkz r3 = r1.d
            java.lang.String r4 = r1.e
            kmd r2 = r2.e(r3, r4)
            long r10 = r2.m
            com.google.android.gms.drive.DriveId r2 = r1.a
            r3 = 0
            if (r2 == 0) goto L_0x0029
            long r4 = r2.b
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0029
            knc r4 = defpackage.knc.a(r4)
            r7 = r4
            goto L_0x002a
        L_0x0029:
            r7 = r3
        L_0x002a:
            kpf r19 = new kpf
            kkb r4 = r0.a
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = r2.a
            r8 = r2
            goto L_0x0035
        L_0x0034:
            r8 = r3
        L_0x0035:
            r5 = -1
            java.lang.String r9 = r1.b
            long r12 = java.lang.System.currentTimeMillis()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r14 = r1.toString()
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r3 = r19
            r3.<init>(r4, r5, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r19.t()
            return r19
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkm.b(ljt):kpf");
    }

    /* access modifiers changed from: package-private */
    public final kpf c(ljt ljt) {
        kmd e2 = this.b.e(ljt.d, ljt.e);
        if (e2 == null) {
            return null;
        }
        long j = e2.m;
        kqy[] kqyArr = new kqy[2];
        ArrayList arrayList = new ArrayList();
        DriveId driveId = ljt.a;
        if (driveId != null) {
            String str = driveId.a;
            if (str != null) {
                arrayList.add(kph.RESOURCE_ID.n.b(str));
            }
            long j2 = driveId.b;
            if (j2 != 0) {
                arrayList.add(kph.ENTRY_ID.n.e(j2));
            }
        }
        if (ljt.b != null) {
            arrayList.add(kph.LOCAL_ID.n.b(ljt.b));
        }
        kqyArr[0] = kqz.b((List) arrayList);
        kqyArr[1] = kph.DRIVE_APP_ID.n.e(j);
        Cursor a2 = this.a.a(kpi.a.b(), (String[]) null, kqz.a(kqyArr), (String) null);
        try {
            if (a2.getCount() == 1) {
                a2.moveToFirst();
                return kpf.a(this.a, a2);
            }
            c.b("No cached realtime content.");
            a2.close();
            return null;
        } finally {
            a2.close();
        }
    }

    public final void a(List list) {
        this.a.b();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kpf c2 = c((ljt) it.next());
                if (c2 != null) {
                    c2.u();
                }
            }
            this.a.f();
        } finally {
            this.a.d();
            lkj.a(this.d, this.b);
        }
    }

    public final synchronized boolean a(ljt ljt) {
        return c(ljt) != null;
    }
}
