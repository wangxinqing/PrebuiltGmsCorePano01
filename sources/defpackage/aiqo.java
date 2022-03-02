package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiqo implements arnc {
    private static aiqo e;
    private static Boolean f = null;
    public final aneu a = amzg.q();
    public final Map b = new HashMap();
    public final ExecutorService c;
    public boolean d;

    public aiqo(ExecutorService executorService) {
        this.c = executorService;
    }

    public static synchronized aiqo a() {
        aiqo aiqo;
        synchronized (aiqo.class) {
            if (e == null) {
                e = new aiqo(jfm.b(9));
            }
            aiqo = e;
        }
        return aiqo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1.getContextHubHandles().length != 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean b() {
        /*
            java.lang.Class<aiqo> r0 = defpackage.aiqo.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0062
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x006a }
            r2 = 26
            r3 = 1
            r4 = 0
            if (r1 < r2) goto L_0x005b
            ihs r1 = defpackage.ihs.b()     // Catch:{ all -> 0x006a }
            boolean r1 = defpackage.jgu.f(r1)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x005b
            ihs r1 = defpackage.ihs.b()     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "contexthub"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.location.ContextHubManager r1 = (android.hardware.location.ContextHubManager) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x005b
            int[] r1 = r1.getContextHubHandles()     // Catch:{ Exception -> 0x002f }
            int r1 = r1.length     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x005b
            goto L_0x005c
        L_0x002f:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x006a }
            int r2 = r2.length()     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            int r2 = r2 + 12
            r4.<init>(r2)     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "getHandles: "
            r4.append(r2)     // Catch:{ all -> 0x006a }
            r4.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x006a }
            ihs r2 = defpackage.ihs.b()     // Catch:{ all -> 0x006a }
            aipf r2 = defpackage.aipf.a((android.content.Context) r2)     // Catch:{ all -> 0x006a }
            r2.a((java.lang.String) r1)     // Catch:{ all -> 0x006a }
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x006a }
            f = r1     // Catch:{ all -> 0x006a }
        L_0x0062:
            java.lang.Boolean r1 = f     // Catch:{ all -> 0x006a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x006a }
            monitor-exit(r0)
            return r1
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqo.b():boolean");
    }

    public static boolean c() {
        return aydr.a.a().nanoAppUploadEnabled() && b();
    }

    public final List a(Long l) {
        ArrayList arrayList;
        Set a2 = ((amxb) this.a).c((Object) l);
        if (a2 != null) {
            arrayList = anda.a((Iterable) a2);
        } else {
            arrayList = anda.a();
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = {"Manager:", l, Integer.valueOf(arrayList.size())};
        return arrayList;
    }

    public final void a(long j) {
        Long valueOf = Long.valueOf(j);
        Object[] objArr = {"Manager:", valueOf};
        List a2 = a(valueOf);
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            aiqn aiqn = (aiqn) a2.get(i);
            aiqn.c.post(new aiqk(aiqn));
        }
    }

    public final void a(long j, int i) {
        try {
            this.c.submit(new aiqh(this, j, i)).get(11, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Object[] objArr = {"Manager:", e2};
        }
        Object[] objArr2 = {"Manager:", Long.valueOf(j)};
    }

    public final void b(long j, int i) {
        Long valueOf = Long.valueOf(j);
        Object[] objArr = {"Manager:", valueOf};
        List a2 = a(valueOf);
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            aiqn aiqn = (aiqn) a2.get(i2);
            aiqn.c.post(new aiql(aiqn, i));
        }
    }

    public final void a(Set set) {
        new Object[1][0] = "Manager:";
        for (Long l : this.a.m()) {
            if (set.contains(l)) {
                a(l.longValue());
            } else {
                b(l.longValue(), 2);
            }
        }
    }
}
