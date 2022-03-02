package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aded  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aded implements adew {
    public final Context a;
    public final ahei b;
    private final Map c = new ConcurrentHashMap();

    public aded(Context context, ahei ahei) {
        this.a = context;
        this.b = ahei;
    }

    public static final String a() {
        return String.format("%s/%s", new Object[]{"udc", "sc"});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r5 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0025
            java.io.File[] r0 = r7.listFiles()
            if (r0 == 0) goto L_0x0025
            int r3 = r0.length
            r4 = 0
            r5 = 1
        L_0x0011:
            if (r4 >= r3) goto L_0x0023
            r6 = r0[r4]
            if (r5 == 0) goto L_0x001f
            boolean r5 = a((java.io.File) r6)
            if (r5 == 0) goto L_0x001f
            r5 = 1
            goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0023:
            if (r5 == 0) goto L_0x002c
        L_0x0025:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L_0x002c
            return r1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aded.a(java.io.File):boolean");
    }

    public final aorr a(Account account, aoru aoru) {
        aorr aorr = (aorr) this.c.get(account);
        if (aorr == null) {
            synchronized (this) {
                aorr = (aorr) this.c.get(account);
                if (aorr == null) {
                    aorr b2 = aoru.b(new adec(this, account));
                    this.c.put(account, b2);
                    aorr = b2;
                }
            }
        }
        return aorr;
    }

    public final void a(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(eim.f(this.a, ((Account) it.next()).name));
            } catch (eif | IOException e) {
                anie c2 = addh.a().c();
                c2.a((int) azrk.k());
                c2.a(e);
                c2.a("aded", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to resolve account ID during wipeout.");
            }
        }
        File[] listFiles = new File(this.a.getFilesDir(), a()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!hashSet.contains(file.getName()) && !a(file)) {
                    anie c3 = addh.a().c();
                    c3.a((int) azrk.k());
                    c3.a("aded", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failure during wipeout.");
                }
            }
        }
    }
}
