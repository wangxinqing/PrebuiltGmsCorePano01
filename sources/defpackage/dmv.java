package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: dmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmv extends dma {
    public volatile String a;
    public Future b;

    protected dmv(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final String b() {
        String str;
        q();
        synchronized (this) {
            if (this.a == null) {
                this.b = g().a((Callable) new dmt(this));
            }
            Future future = this.b;
            if (future != null) {
                try {
                    this.a = (String) future.get();
                } catch (InterruptedException e) {
                    d("ClientId loading or generation was interrupted", e);
                    this.a = "0";
                } catch (ExecutionException e2) {
                    e("Failed to load or generate client id", e2);
                    this.a = "0";
                }
                if (this.a == null) {
                    this.a = "0";
                }
                a("Loaded clientId", this.a);
                this.b = null;
            }
            str = this.a;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e A[SYNTHETIC, Splitter:B:32:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006a A[SYNTHETIC, Splitter:B:40:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s() {
        /*
            r7 = this;
            java.lang.String r0 = "0"
            java.lang.String r1 = "Failed to close clientId writing stream"
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            dkw r3 = r7.g()     // Catch:{ Exception -> 0x0073 }
            android.content.Context r3 = r3.b     // Catch:{ Exception -> 0x0073 }
            defpackage.iva.c(r2)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r4 = "ClientId should be saved from worker thread"
            defpackage.iva.b((java.lang.String) r4)     // Catch:{ Exception -> 0x0073 }
            r4 = 0
            java.lang.String r5 = "Storing clientId"
            r7.a(r5, r2)     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0047 }
            java.lang.String r5 = "gaClientId"
            r6 = 0
            java.io.FileOutputStream r4 = r3.openFileOutput(r5, r6)     // Catch:{ FileNotFoundException -> 0x0055, IOException -> 0x0047 }
            byte[] r3 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0041, all -> 0x003f }
            r4.write(r3)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0041, all -> 0x003f }
            if (r4 == 0) goto L_0x003e
            r4.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r3 = move-exception
            r7.e(r1, r3)     // Catch:{ Exception -> 0x0073 }
        L_0x003e:
            return r2
        L_0x003f:
            r2 = move-exception
            goto L_0x0068
        L_0x0041:
            r2 = move-exception
            goto L_0x0048
        L_0x0043:
            r2 = move-exception
            goto L_0x0056
        L_0x0045:
            r2 = move-exception
            goto L_0x0068
        L_0x0047:
            r2 = move-exception
        L_0x0048:
            java.lang.String r3 = "Error writing to clientId file"
            r7.e(r3, r2)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0066
            r4.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0066
        L_0x0053:
            r2 = move-exception
            goto L_0x0063
        L_0x0055:
            r2 = move-exception
        L_0x0056:
            java.lang.String r3 = "Error creating clientId file"
            r7.e(r3, r2)     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            r4.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r2 = move-exception
        L_0x0063:
            r7.e(r1, r2)     // Catch:{ Exception -> 0x0073 }
        L_0x0066:
            return r0
        L_0x0067:
            r2 = move-exception
        L_0x0068:
            if (r4 == 0) goto L_0x0072
            r4.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r3 = move-exception
            r7.e(r1, r3)     // Catch:{ Exception -> 0x0073 }
        L_0x0072:
            throw r2     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            r1 = move-exception
            java.lang.String r2 = "Error saving clientId file"
            r7.e(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmv.s():java.lang.String");
    }
}
