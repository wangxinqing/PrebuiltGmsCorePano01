package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: aayo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayo {
    static final byte[] a = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, -37, 0, 67, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -64, 0, 11, 8, 0, 1, 0, 1, 1, 1, 17, 0, -1, -60, 0, 20, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, -60, 0, 20, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -38, 0, 8, 1, 1, 0, 0, 63, 0, 71, -1, -39};
    private final Context b;
    private final aayc c;
    private final aayy d = new aayy(this.b);

    public aayo(Context context, aayc aayc) {
        this.b = context;
        this.c = aayc;
    }

    private static int a(byte[] bArr) {
        if (bArr == null) {
            return a.length;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i >= Math.min(length, a.length)) {
                return i2 + Math.abs(length - a.length);
            }
            if (bArr[i] != a[i]) {
                i2++;
            }
            i++;
        }
    }

    static boolean a(byte[] bArr, File file) {
        if (!aaza.a(bArr, file)) {
            return false;
        }
        if (a(aaza.b(file)) == 0) {
            return true;
        }
        file.delete();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (r1 != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aayn a() {
        /*
            r10 = this;
            aaym r0 = new aaym
            r0.<init>()
            r1 = 0
            r0.a((boolean) r1)
            r0.c(r1)
            r2 = 0
            r0.b((long) r2)
            r0.a((int) r1)
            r0.b((boolean) r1)
            r0.a((long) r2)
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            java.lang.String r3 = "mounted"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x002b
            aayn r0 = r0.a()
            return r0
        L_0x002b:
            android.content.Context r2 = r10.b
            r3 = 0
            java.io.File r2 = r2.getExternalFilesDir(r3)
            if (r2 != 0) goto L_0x0039
            aayn r0 = r0.a()
            return r0
        L_0x0039:
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x0042
            r2.mkdirs()
        L_0x0042:
            aayy r3 = r10.d
            android.content.SharedPreferences r3 = r3.a
            java.lang.String r4 = "snet_jpeg_written_to_sdcard"
            boolean r3 = r3.getBoolean(r4, r1)
            aayy r4 = r10.d
            android.content.SharedPreferences r4 = r4.a
            java.lang.String r5 = "snet_jpeg_previously_tampered"
            boolean r4 = r4.getBoolean(r5, r1)
            aayc r5 = r10.c
            aayb r5 = r5.b
            java.lang.String r6 = "sd_card_jpeg_name"
            java.lang.String r5 = r5.a(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            java.lang.String r5 = "gmsnet2.jpg"
        L_0x0069:
            r0.a = r5
            aayy r6 = r10.d
            android.content.SharedPreferences r6 = r6.a
            java.lang.String r7 = "snet_jpeg_filename"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0089
            aayy r3 = r10.d
            r3.a((boolean) r1)
            aayy r3 = r10.d
            r3.b((boolean) r1)
            r3 = 0
            r4 = 0
        L_0x0089:
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r5)
            boolean r2 = r6.exists()
            r7 = 1
            if (r2 == 0) goto L_0x00db
            if (r3 == 0) goto L_0x0110
            long r2 = r6.length()
            byte[] r5 = a
            int r5 = r5.length
            long r8 = (long) r5
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x00ae
            r0.c(r7)
            long r1 = r6.length()
            r0.b((long) r1)
            goto L_0x00c3
        L_0x00ae:
            byte[] r2 = defpackage.aaza.b((java.io.File) r6)
            int r2 = a(r2)
            r0.a((int) r2)
            if (r2 == 0) goto L_0x00bd
            r1 = 1
            goto L_0x00be
        L_0x00bd:
        L_0x00be:
            r0.c(r1)
            if (r1 == 0) goto L_0x0110
        L_0x00c3:
            long r1 = r6.lastModified()
            r5 = 86400(0x15180, double:4.26873E-319)
            long r1 = r1 / r5
            long r1 = r1 * r5
            r0.a((long) r1)
            if (r4 != 0) goto L_0x0110
            r0.b((boolean) r7)
            aayy r1 = r10.d
            r1.b((boolean) r7)
            goto L_0x0110
        L_0x00db:
            if (r3 == 0) goto L_0x00f9
            r0.a((boolean) r7)
            byte[] r2 = a
            boolean r2 = a(r2, r6)
            if (r2 != 0) goto L_0x00ee
            aayy r2 = r10.d
            r2.a((boolean) r1)
            goto L_0x010b
        L_0x00ee:
            aayy r2 = r10.d
            r2.a((boolean) r7)
            aayy r2 = r10.d
            r2.a((java.lang.String) r5)
            goto L_0x010b
        L_0x00f9:
            byte[] r2 = a
            boolean r2 = a(r2, r6)
            if (r2 == 0) goto L_0x010b
            aayy r2 = r10.d
            r2.a((java.lang.String) r5)
            aayy r2 = r10.d
            r2.a((boolean) r7)
        L_0x010b:
            aayy r2 = r10.d
            r2.b((boolean) r1)
        L_0x0110:
            aayn r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayo.a():aayn");
    }
}
