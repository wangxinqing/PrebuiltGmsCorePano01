package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Collection;

/* renamed from: qjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjq implements qjt {
    private final Context a;
    private final qjv b;

    public qjq(Context context, qjv qjv) {
        this.a = context;
        this.b = qjv;
    }

    public final int a() {
        return this.b.a();
    }

    public final int b(avwm avwm) {
        return this.b.b(avwm);
    }

    public final int c() {
        return this.b.c();
    }

    public final long d() {
        return this.b.d();
    }

    public final int a(avwm avwm) {
        return this.b.a(avwm);
    }

    public final synchronized void b() {
        this.b.b();
    }

    public final qje a(String str) {
        return this.b.a(str);
    }

    public final byte[] b(String str) {
        return this.b.b(str);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qjw a(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            android.net.Uri r0 = android.net.Uri.parse(r11)
            android.content.Context r1 = r10.a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri r1 = defpackage.qln.a
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r3 = "resolveUrl"
            android.net.Uri$Builder r1 = r1.appendPath(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "uri"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r3, r0)
            android.net.Uri r3 = r0.build()
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = "splitId"
            r1 = 0
            r4[r1] = r0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)
            r2 = 0
            if (r0 == 0) goto L_0x0056
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L_0x0055
            byte[] r0 = r0.getBlob(r1)     // Catch:{ auda -> 0x004e }
            aubs r1 = defpackage.aubs.b()     // Catch:{ auda -> 0x004e }
            arbf r2 = defpackage.arbf.e     // Catch:{ auda -> 0x004e }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r0, (defpackage.aubs) r1)     // Catch:{ auda -> 0x004e }
            r2 = r0
            arbf r2 = (defpackage.arbf) r2     // Catch:{ auda -> 0x004e }
            goto L_0x0057
        L_0x004e:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x0055:
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            if (r2 == 0) goto L_0x006a
            java.lang.String r5 = r2.a
            int r6 = r2.c
            int r7 = r2.d
            java.lang.String r8 = r2.b
            qjw r11 = new qjw
            r4 = 0
            r9 = 1
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        L_0x006a:
            qjv r0 = r10.b
            qjw r11 = r0.a((java.lang.String) r11, (boolean) r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjq.a(java.lang.String, boolean):qjw");
    }

    public final void a(PrintWriter printWriter) {
        this.b.a(printWriter);
    }

    public final void a(Collection collection, Collection collection2) {
        this.b.a(collection, collection2);
    }

    public final void a(qka qka) {
        this.b.a(qka);
    }
}
