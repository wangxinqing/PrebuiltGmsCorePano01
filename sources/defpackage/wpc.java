package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: wpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wpc extends xqg {
    private static final ExecutorService a = jfm.b(9);
    public static final byte[] c = new byte[0];
    public static final byte[] d = new byte[0];
    private final boolean b = ayuq.b();
    protected final boolean e = false;
    protected wmi f;
    protected final wmq g;

    protected wpc(String str, int i, wmq wmq, String str2) {
        super(str, i, (String) null, str2, (byte[]) null);
        this.g = wmq;
    }

    private final void a(wpb wpb) {
        wmi wmi;
        wmi wmi2;
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            yco yco = wpb.f;
            if (yco != null) {
                parcelFileDescriptor = yco.a;
            } else {
                parcelFileDescriptor = null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("width", wpb.g);
            bundle.putInt("height", wpb.h);
            bundle.putBoolean("rewindable", wpb.i);
            a();
            xqy xqy = wpb.e;
            int i = wpb.g;
            int i2 = wpb.h;
            boolean z = wpb.i;
            ycp.a(parcelFileDescriptor);
            wmq wmq = this.g;
            xqy xqy2 = wpb.e;
            wmq.a(xqy2.a, xqy2.b, parcelFileDescriptor, bundle);
        } catch (DeadObjectException e2) {
            if (this.b && (wmi = this.r) != null) {
                wmi.b(7, 0);
            }
        } catch (Exception e3) {
            Log.e("BasePeopleOperation", "Unknown error", e3);
            if (this.b && (wmi2 = this.r) != null) {
                wmi2.b(6, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r5) {
        /*
            r4 = this;
            boolean r0 = r4.p
            r1 = 0
            if (r0 == 0) goto L_0x0020
            boolean r5 = r4.e
            r0 = 8
            if (r5 == 0) goto L_0x0014
            wmi r5 = r4.f
            if (r5 != 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            r5.a(r0, r1)
        L_0x0014:
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x001f
            wmi r5 = r4.r
            if (r5 == 0) goto L_0x001f
            r5.b(r0, r1)
        L_0x001f:
            return
        L_0x0020:
            r0 = 1
            wpb r5 = r4.c(r5)     // Catch:{ Exception -> 0x0082 }
            yco r2 = r5.f     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x002e
            java.util.Set r3 = r4.q     // Catch:{ Exception -> 0x0082 }
            r3.add(r2)     // Catch:{ Exception -> 0x0082 }
        L_0x002e:
            r4.a(r5)     // Catch:{ Exception -> 0x0082 }
            boolean r2 = r4.e     // Catch:{ Exception -> 0x0082 }
            r3 = 2
            if (r2 != 0) goto L_0x003d
            boolean r2 = r4.b     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 1
            goto L_0x0064
        L_0x003d:
            yco r2 = r5.f     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0063
            android.os.ParcelFileDescriptor r2 = r2.a     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0063
            java.io.FileDescriptor r2 = r2.getFileDescriptor()     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0063
            yco r2 = r5.f     // Catch:{ Exception -> 0x0082 }
            android.os.ParcelFileDescriptor r2 = r2.a     // Catch:{ Exception -> 0x0082 }
            java.io.FileDescriptor r2 = r2.getFileDescriptor()     // Catch:{ Exception -> 0x0082 }
            boolean r2 = r2.valid()     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0063
            int r2 = r5.h     // Catch:{ Exception -> 0x0082 }
            if (r2 == 0) goto L_0x0063
            int r5 = r5.g     // Catch:{ Exception -> 0x0082 }
            if (r5 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
        L_0x0064:
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x0070
            wmi r5 = r4.f
            if (r5 != 0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            r5.a(r3, r1)
        L_0x0070:
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x00b6
            wmi r5 = r4.r
            if (r5 == 0) goto L_0x00b6
            int r2 = r5.r
            if (r2 != r0) goto L_0x00b6
            r5.b(r3, r1)
            return
        L_0x0080:
            r5 = move-exception
            goto L_0x00b7
        L_0x0082:
            r5 = move-exception
            java.lang.String r2 = "BasePeopleOperation"
            java.lang.String r3 = "Error during operation"
            android.util.Log.e(r2, r3, r5)     // Catch:{ all -> 0x0080 }
            wpb r5 = defpackage.wpb.c     // Catch:{ all -> 0x0080 }
            r4.a(r5)     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.e     // Catch:{ all -> 0x0080 }
            r2 = 6
            if (r5 != 0) goto L_0x009b
            boolean r3 = r4.b     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r2 = 1
            goto L_0x009c
        L_0x009b:
        L_0x009c:
            if (r5 == 0) goto L_0x00a7
            wmi r5 = r4.f
            if (r5 != 0) goto L_0x00a3
            goto L_0x00a7
        L_0x00a3:
            r5.a(r2, r1)
        L_0x00a7:
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x00b6
            wmi r5 = r4.r
            if (r5 == 0) goto L_0x00b6
            int r3 = r5.r
            if (r3 != r0) goto L_0x00b6
            r5.b(r2, r1)
        L_0x00b6:
            return
        L_0x00b7:
            boolean r2 = r4.e
            if (r2 == 0) goto L_0x00c3
            wmi r2 = r4.f
            if (r2 != 0) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            r2.a(r0, r1)
        L_0x00c3:
            boolean r2 = r4.b
            if (r2 == 0) goto L_0x00d2
            wmi r2 = r4.r
            if (r2 == 0) goto L_0x00d2
            int r3 = r2.r
            if (r3 != r0) goto L_0x00d2
            r2.b(r0, r1)
        L_0x00d2:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpc.b(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public abstract wpb c(Context context);

    /* access modifiers changed from: protected */
    public final ExecutorService j() {
        return a;
    }

    public wpc(String str, String str2, int i, wmq wmq, String str3) {
        super(str, i, str2, str3, (byte[]) null);
        this.g = wmq;
        xip.a();
        if (this.e) {
            wmi wmi = new wmi(str3);
            this.f = wmi;
            wmi.b = str2;
            wmi.c = str;
        }
    }
}
