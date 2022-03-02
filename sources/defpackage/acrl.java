package defpackage;

import android.content.Context;
import android.os.Debug;
import android.os.DropBoxManager;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: acrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acrl extends acrk {
    protected static final String[] g = new String[0];
    public final String f;

    /* access modifiers changed from: protected */
    public final avwc a(Context context, InputStream inputStream, long j, long j2, hph hph) {
        return a(context, inputStream, j, j2, hph, false);
    }

    /* access modifiers changed from: protected */
    public abstract String[] a(long j, long j2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avwc b(android.content.Context r13, long r14, long r16, defpackage.hph r18) {
        /*
            r12 = this;
            r1 = 0
            java.io.File r2 = r12.c(r13, r14, r16, r18)     // Catch:{ IOException -> 0x004d, all -> 0x0049 }
            azor r0 = defpackage.azor.a     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            azos r0 = r0.a()     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0021
        L_0x0012:
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            if (r0 != 0) goto L_0x0021
            defpackage.jjt.a((java.io.Closeable) r1)
            if (r2 == 0) goto L_0x0020
            r2.delete()
        L_0x0020:
            return r1
        L_0x0021:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            r11.<init>(r2)     // Catch:{ IOException -> 0x0045, all -> 0x0041 }
            r3 = r12
            r4 = r13
            r5 = r11
            r6 = r14
            r8 = r16
            r10 = r18
            avwc r0 = r3.b(r4, r5, r6, r8, r10)     // Catch:{ IOException -> 0x003f, all -> 0x003b }
            defpackage.jjt.a((java.io.Closeable) r11)
            if (r2 == 0) goto L_0x003a
            r2.delete()
        L_0x003a:
            return r0
        L_0x003b:
            r0 = move-exception
            r3 = r2
            r1 = r11
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            goto L_0x0047
        L_0x0041:
            r0 = move-exception
            r3 = r2
        L_0x0043:
            r2 = r12
            goto L_0x005e
        L_0x0045:
            r0 = move-exception
            r11 = r1
        L_0x0047:
            r1 = r2
            goto L_0x004f
        L_0x0049:
            r0 = move-exception
            r2 = r12
            r3 = r1
            goto L_0x005e
        L_0x004d:
            r0 = move-exception
            r11 = r1
        L_0x004f:
            r2 = r12
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x005b }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x005b }
            acrj r3 = new acrj     // Catch:{ all -> 0x005b }
            r3.<init>((java.lang.Exception) r0)     // Catch:{ all -> 0x005b }
            throw r3     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r3 = r1
            r1 = r11
        L_0x005e:
            defpackage.jjt.a((java.io.Closeable) r1)
            if (r3 == 0) goto L_0x0066
            r3.delete()
        L_0x0066:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrl.b(android.content.Context, long, long, hph):avwc");
    }

    /* access modifiers changed from: protected */
    public abstract avwc b(Context context, InputStream inputStream, long j, long j2, hph hph);

    public File c(Context context, long j, long j2, hph hph) {
        File fileStreamPath = context.getFileStreamPath(String.valueOf(this.a).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileStreamPath);
            try {
                if (Debug.dumpService(this.f, fileOutputStream2.getFD(), a(j, j2))) {
                    jjt.a((Closeable) fileOutputStream2);
                    return fileStreamPath;
                }
                Log.w(this.a, "Dumpsys failed.");
                throw new acrj(String.valueOf(this.a).concat(" dumpsys failed."));
            } catch (IOException | NullPointerException | SecurityException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new acrj(e);
                } catch (Throwable th) {
                    th = th;
                    jjt.a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                jjt.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (IOException | NullPointerException | SecurityException e2) {
            e = e2;
            throw new acrj(e);
        } catch (Throwable th3) {
            th = th3;
            jjt.a((Closeable) fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acrl(String str, String str2, String str3, boolean z) {
        super(str, str3, z, false);
        avsd avsd = avsd.DEFAULT;
        this.f = str2;
    }

    /* access modifiers changed from: protected */
    public final avwc a(Context context, InputStream inputStream, long j, long j2, hph hph, boolean z) {
        avwc avwc;
        Context context2 = context;
        avvz avvz = (avvz) avwc.v.o();
        if (avvz.c) {
            avvz.c();
            avvz.c = false;
        }
        avwc avwc2 = (avwc) avvz.b;
        int i = avwc2.a | 1;
        avwc2.a = i;
        avwc2.d = j;
        avwc2.a = i | 2;
        avwc2.e = j2;
        try {
            byte[] b = jjt.b(inputStream);
            if (!z) {
                try {
                    String str = new String(b, acrk.e);
                    if (avvz.c) {
                        avvz.c();
                        avvz.c = false;
                    }
                    avwc avwc3 = (avwc) avvz.b;
                    str.getClass();
                    avwc3.a |= 8;
                    avwc3.g = str;
                    hph hph2 = hph;
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f);
                    hph.c(valueOf.length() == 0 ? new String("DumpsysOutOfMemory") : "DumpsysOutOfMemory".concat(valueOf)).a();
                    hph.d();
                    avwc = (avwc) avvz.i();
                }
            } else {
                hph hph3 = hph;
                auay a = auay.a(b);
                if (avvz.c) {
                    avvz.c();
                    avvz.c = false;
                }
                avwc avwc4 = (avwc) avvz.b;
                a.getClass();
                avwc4.a |= 16777216;
                avwc4.t = a;
            }
            if (h()) {
                avvz.a((Iterable) Arrays.asList(actx.a(context, context.getSharedPreferences("com.google.android.metrics", 0), (DropBoxManager) context.getSystemService("dropbox"), this.a, j, j2, false, hph)));
            }
            avwc = (avwc) avvz.i();
        } catch (IOException e2) {
            Log.w(this.a, "Failed to read dumpsys output file.");
            avwc = (avwc) avvz.i();
        } catch (Throwable th) {
            jjt.a((Closeable) inputStream);
            throw th;
        }
        jjt.a((Closeable) inputStream);
        return avwc;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acrl(String str, String str2, String str3, boolean z, byte[] bArr) {
        super(str, str3, z, true);
        avsd avsd = avsd.DEFAULT;
        this.f = str2;
    }
}
