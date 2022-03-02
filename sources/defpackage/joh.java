package defpackage;

import android.util.Log;
import com.google.android.gms.config.ConfigChimeraService;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: joh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class joh implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ jop c;
    final /* synthetic */ jof d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ acrz f;
    final /* synthetic */ ConfigChimeraService g;
    private jog h;

    public joh(ConfigChimeraService configChimeraService, jog jog, String str, long j, jop jop, jof jof, byte[] bArr, acrz acrz) {
        this.g = configChimeraService;
        this.a = str;
        this.b = j;
        this.c = jop;
        this.d = jof;
        this.e = bArr;
        this.f = acrz;
        this.h = jog;
    }

    private final joz a(opc opc, jow jow) {
        IOException e2;
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            URL url = new URL("https://cloudconfig.googleapis.com/config");
            izj.b(1035);
            try {
                HttpURLConnection a2 = ((opl) opc.a).a(url);
                a2.setRequestMethod("POST");
                a2.setRequestProperty("Content-Type", "application/x-protobuffer");
                a2.setDoOutput(true);
                a2.setConnectTimeout(this.h.f);
                a2.setReadTimeout(this.h.g);
                if (a2 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) a2).setSSLSocketFactory(opc.a());
                }
                anmx a3 = anmx.a();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(a2.getOutputStream());
                    a3.a((Closeable) gZIPOutputStream);
                    jow.a(gZIPOutputStream);
                    a3.close();
                    a2.connect();
                    int responseCode = a2.getResponseCode();
                    if (responseCode != 200) {
                        String responseMessage = a2.getResponseMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(responseMessage).length() + 38);
                        sb.append("bad response from server: ");
                        sb.append(responseCode);
                        sb.append(" ");
                        sb.append(responseMessage);
                        Log.w("FetchTask", sb.toString());
                        anmt.a((InputStream) null);
                        izj.a();
                        return null;
                    }
                    gZIPInputStream = new GZIPInputStream(a2.getInputStream());
                    try {
                        joz joz = (joz) aucj.a((aucj) joz.d, (InputStream) gZIPInputStream, aubs.c());
                        anmt.a((InputStream) gZIPInputStream);
                        izj.a();
                        return joz;
                    } catch (IOException e3) {
                        e2 = e3;
                        try {
                            String valueOf = String.valueOf(e2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
                            sb2.append("exception on config fetch: ");
                            sb2.append(valueOf);
                            Log.w("FetchTask", sb2.toString(), e2);
                            anmt.a((InputStream) gZIPInputStream);
                            izj.a();
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            gZIPInputStream2 = gZIPInputStream;
                            anmt.a((InputStream) gZIPInputStream2);
                            izj.a();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    a3.close();
                    throw th2;
                }
            } catch (IOException e4) {
                e2 = e4;
                gZIPInputStream = null;
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                sb22.append("exception on config fetch: ");
                sb22.append(valueOf2);
                Log.w("FetchTask", sb22.toString(), e2);
                anmt.a((InputStream) gZIPInputStream);
                izj.a();
                return null;
            } catch (Throwable th3) {
                th = th3;
                anmt.a((InputStream) gZIPInputStream2);
                izj.a();
                throw th;
            }
        } catch (MalformedURLException e5) {
            Log.e("FetchTask", "bad config fetch url https://cloudconfig.googleapis.com/config");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x07cc A[SYNTHETIC, Splitter:B:294:0x07cc] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0807 A[Catch:{ RemoteException -> 0x0838 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r1 = r32
            r2 = 1
            jog[] r0 = new defpackage.jog[r2]
            jog r3 = r1.h
            r4 = 0
            r0[r4] = r3
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r6 = "FetchTask"
            r5.setName(r6)
            r0 = r0[r4]
            r1.h = r0
            jow r0 = defpackage.jow.o
            aucd r0 = r0.o()
            jog r5 = r1.h
            com.google.android.gms.config.ConfigChimeraService r5 = r5.a
            android.content.Context r5 = r5.getApplicationContext()
            boolean r6 = r0.c
            if (r6 == 0) goto L_0x0036
            r0.c()
            r0.c = r4
        L_0x0036:
            aucj r6 = r0.b
            jow r6 = (defpackage.jow) r6
            int r7 = r6.a
            r7 = r7 | 16
            r6.a = r7
            r8 = 3
            r6.f = r8
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r7
            r6.k = r2
            hal r5 = defpackage.gwd.h(r5)
            int r5 = r5.i
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r0.c()
            r0.c = r4
        L_0x0059:
            aucj r6 = r0.b
            jow r6 = (defpackage.jow) r6
            int r7 = r6.a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r6.a = r7
            r6.l = r5
            jog r5 = r1.h
            com.google.android.gms.config.ConfigChimeraService r5 = r5.a
            android.content.ContentResolver r5 = r5.getContentResolver()
            r6 = 0
            java.lang.String r9 = "android_id"
            long r5 = defpackage.aeeg.a((android.content.ContentResolver) r5, (java.lang.String) r9, (long) r6)
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x007a
            goto L_0x007f
        L_0x007a:
            r0.c()
            r0.c = r4
        L_0x007f:
            aucj r7 = r0.b
            jow r7 = (defpackage.jow) r7
            int r9 = r7.a
            r10 = 2
            r9 = r9 | r10
            r7.a = r9
            r7.b = r5
            jog r5 = r1.h
            com.google.android.gms.config.ConfigChimeraService r5 = r5.a
            long r5 = defpackage.gwd.b((android.content.Context) r5)
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0098
            goto L_0x009d
        L_0x0098:
            r0.c()
            r0.c = r4
        L_0x009d:
            aucj r7 = r0.b
            jow r7 = (defpackage.jow) r7
            int r9 = r7.a
            r9 = r9 | 8
            r7.a = r9
            r7.e = r5
            jog r5 = r1.h
            com.google.android.gms.config.ConfigChimeraService r5 = r5.a
            java.lang.String r5 = defpackage.gwd.g(r5)
            r6 = 4
            if (r5 == 0) goto L_0x00cc
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            r0.c()
            r0.c = r4
        L_0x00be:
            aucj r7 = r0.b
            jow r7 = (defpackage.jow) r7
            r5.getClass()
            int r9 = r7.a
            r9 = r9 | r6
            r7.a = r9
            r7.d = r5
        L_0x00cc:
            jog r5 = r1.h
            jof r5 = r5.d
            int r5 = r5.b
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            r0.c()
            r0.c = r4
        L_0x00dc:
            aucj r7 = r0.b
            jow r7 = (defpackage.jow) r7
            int r9 = r7.a
            r9 = r9 | 32
            r7.a = r9
            r7.g = r5
            jog r5 = r1.h
            jof r5 = r5.d
            int r5 = r5.c
            r9 = r9 | 64
            r7.a = r9
            r7.h = r5
            java.lang.String r5 = java.lang.Integer.toString(r5)
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r0.c()
            r0.c = r4
        L_0x0102:
            aucj r7 = r0.b
            jow r7 = (defpackage.jow) r7
            r5.getClass()
            int r9 = r7.a
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r7.a = r9
            r7.m = r5
            jog r5 = r1.h
            jof r5 = r5.d
            java.lang.String r11 = r5.i
            r11.getClass()
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r7.a = r9
            r7.n = r11
            java.lang.String r11 = r5.d
            r11.getClass()
            r9 = r9 | 128(0x80, float:1.794E-43)
            r7.a = r9
            r7.i = r11
            java.lang.String r5 = r5.e
            r5.getClass()
            r9 = r9 | 256(0x100, float:3.59E-43)
            r7.a = r9
            r7.j = r5
            jpc r5 = defpackage.jpc.q
            aucd r5 = r5.o()
            jog r7 = r1.h
            java.lang.String r7 = r7.b
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x0145
            goto L_0x014a
        L_0x0145:
            r5.c()
            r5.c = r4
        L_0x014a:
            aucj r9 = r5.b
            jpc r9 = (defpackage.jpc) r9
            r7.getClass()
            int r11 = r9.a
            r11 = r11 | 16
            r9.a = r11
            r9.b = r7
            jog r7 = r1.h
            jof r12 = r7.d
            int r13 = r12.a
            r11 = r11 | 256(0x100, float:3.59E-43)
            r9.a = r11
            r9.g = r13
            java.lang.String r13 = r12.h
            if (r13 == 0) goto L_0x0173
            r13.getClass()
            r11 = r11 | 512(0x200, float:7.175E-43)
            r9.a = r11
            r9.h = r13
            goto L_0x0174
        L_0x0173:
        L_0x0174:
            java.lang.String r13 = r12.f
            if (r13 == 0) goto L_0x0181
            r13.getClass()
            r11 = r11 | 32
            r9.a = r11
            r9.c = r13
        L_0x0181:
            java.lang.String r12 = r12.g
            if (r12 == 0) goto L_0x018e
            r12.getClass()
            r11 = r11 | 64
            r9.a = r11
            r9.d = r12
        L_0x018e:
            java.util.Map r7 = r7.c
            if (r7 == 0) goto L_0x0213
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x019a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0213
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            jpb r11 = defpackage.jpb.d
            aucd r11 = r11.o()
            java.lang.Object r12 = r9.getKey()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r11.c
            if (r13 == 0) goto L_0x01bb
            r11.c()
            r11.c = r4
        L_0x01bb:
            aucj r13 = r11.b
            jpb r13 = (defpackage.jpb) r13
            r12.getClass()
            int r14 = r13.a
            r14 = r14 | r2
            r13.a = r14
            r13.b = r12
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            boolean r12 = r11.c
            if (r12 == 0) goto L_0x01d8
            r11.c()
            r11.c = r4
        L_0x01d8:
            aucj r12 = r11.b
            jpb r12 = (defpackage.jpb) r12
            r9.getClass()
            int r13 = r12.a
            r13 = r13 | r10
            r12.a = r13
            r12.c = r9
            aucj r9 = r11.i()
            jpb r9 = (defpackage.jpb) r9
            boolean r11 = r5.c
            if (r11 != 0) goto L_0x01f1
            goto L_0x01f6
        L_0x01f1:
            r5.c()
            r5.c = r4
        L_0x01f6:
            aucj r11 = r5.b
            jpc r11 = (defpackage.jpc) r11
            r9.getClass()
            aucx r12 = r11.e
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x020d
            aucx r12 = r11.e
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)
            r11.e = r12
        L_0x020d:
            aucx r11 = r11.e
            r11.add(r9)
            goto L_0x019a
        L_0x0213:
            jog r7 = r1.h
            java.util.Map r7 = r7.e
            if (r7 == 0) goto L_0x029a
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0221:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x029a
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            jpb r11 = defpackage.jpb.d
            aucd r11 = r11.o()
            java.lang.Object r12 = r9.getKey()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r11.c
            if (r13 == 0) goto L_0x0242
            r11.c()
            r11.c = r4
        L_0x0242:
            aucj r13 = r11.b
            jpb r13 = (defpackage.jpb) r13
            r12.getClass()
            int r14 = r13.a
            r14 = r14 | r2
            r13.a = r14
            r13.b = r12
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            boolean r12 = r11.c
            if (r12 == 0) goto L_0x025f
            r11.c()
            r11.c = r4
        L_0x025f:
            aucj r12 = r11.b
            jpb r12 = (defpackage.jpb) r12
            r9.getClass()
            int r13 = r12.a
            r13 = r13 | r10
            r12.a = r13
            r12.c = r9
            aucj r9 = r11.i()
            jpb r9 = (defpackage.jpb) r9
            boolean r11 = r5.c
            if (r11 != 0) goto L_0x0278
            goto L_0x027d
        L_0x0278:
            r5.c()
            r5.c = r4
        L_0x027d:
            aucj r11 = r5.b
            jpc r11 = (defpackage.jpc) r11
            r9.getClass()
            aucx r12 = r11.f
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x0294
            aucx r12 = r11.f
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)
            r11.f = r12
        L_0x0294:
            aucx r11 = r11.f
            r11.add(r9)
            goto L_0x0221
        L_0x029a:
            jog r7 = r1.h
            java.util.List r7 = r7.h
            if (r7 == 0) goto L_0x02d6
            int r9 = r7.size()
            r11 = 0
        L_0x02a5:
            if (r11 >= r9) goto L_0x02d6
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r5.c
            if (r13 != 0) goto L_0x02b2
            goto L_0x02b7
        L_0x02b2:
            r5.c()
            r5.c = r4
        L_0x02b7:
            aucj r13 = r5.b
            jpc r13 = (defpackage.jpc) r13
            r12.getClass()
            aucx r14 = r13.k
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x02ce
            aucx r14 = r13.k
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.k = r14
        L_0x02ce:
            aucx r13 = r13.k
            r13.add(r12)
            int r11 = r11 + 1
            goto L_0x02a5
        L_0x02d6:
            jog r7 = r1.h
            java.lang.String r7 = r7.i
            if (r7 == 0) goto L_0x02f5
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x02e1
            goto L_0x02e6
        L_0x02e1:
            r5.c()
            r5.c = r4
        L_0x02e6:
            aucj r9 = r5.b
            jpc r9 = (defpackage.jpc) r9
            r7.getClass()
            int r11 = r9.a
            r11 = r11 | 1024(0x400, float:1.435E-42)
            r9.a = r11
            r9.i = r7
        L_0x02f5:
            jog r7 = r1.h
            java.lang.String r7 = r7.j
            if (r7 == 0) goto L_0x0314
            boolean r9 = r5.c
            if (r9 != 0) goto L_0x0300
            goto L_0x0305
        L_0x0300:
            r5.c()
            r5.c = r4
        L_0x0305:
            aucj r9 = r5.b
            jpc r9 = (defpackage.jpc) r9
            r7.getClass()
            int r11 = r9.a
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r9.a = r11
            r9.j = r7
        L_0x0314:
            jog r7 = r1.h
            int r7 = r7.k
            boolean r9 = r5.c
            if (r9 == 0) goto L_0x0321
            r5.c()
            r5.c = r4
        L_0x0321:
            aucj r9 = r5.b
            jpc r9 = (defpackage.jpc) r9
            int r11 = r9.a
            r11 = r11 | 4096(0x1000, float:5.74E-42)
            r9.a = r11
            r9.l = r7
            jog r7 = r1.h
            java.util.List r7 = r7.l
            if (r7 == 0) goto L_0x03a4
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x03a4
            jog r7 = r1.h
            java.util.List r7 = r7.l
            int r9 = r7.size()
            r11 = 0
        L_0x0342:
            if (r11 >= r9) goto L_0x03a4
            java.lang.Object r12 = r7.get(r11)
            com.google.android.gms.config.internal.AnalyticsUserProperty r12 = (com.google.android.gms.config.internal.AnalyticsUserProperty) r12
            jpb r13 = defpackage.jpb.d
            aucd r13 = r13.o()
            java.lang.String r14 = r12.a
            boolean r15 = r13.c
            if (r15 != 0) goto L_0x0357
            goto L_0x035c
        L_0x0357:
            r13.c()
            r13.c = r4
        L_0x035c:
            aucj r15 = r13.b
            jpb r15 = (defpackage.jpb) r15
            r14.getClass()
            int r6 = r15.a
            r6 = r6 | r2
            r15.a = r6
            r15.b = r14
            java.lang.String r12 = r12.b
            r12.getClass()
            r6 = r6 | r10
            r15.a = r6
            r15.c = r12
            aucj r6 = r13.i()
            jpb r6 = (defpackage.jpb) r6
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x037f
            goto L_0x0384
        L_0x037f:
            r5.c()
            r5.c = r4
        L_0x0384:
            aucj r12 = r5.b
            jpc r12 = (defpackage.jpc) r12
            r6.getClass()
            aucx r13 = r12.m
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x039b
            aucx r13 = r12.m
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)
            r12.m = r13
        L_0x039b:
            aucx r12 = r12.m
            r12.add(r6)
            int r11 = r11 + 1
            r6 = 4
            goto L_0x0342
        L_0x03a4:
            jog r6 = r1.h
            int r6 = r6.m
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x03ad
            goto L_0x03b2
        L_0x03ad:
            r5.c()
            r5.c = r4
        L_0x03b2:
            aucj r7 = r5.b
            jpc r7 = (defpackage.jpc) r7
            int r9 = r7.a
            r9 = r9 | 8192(0x2000, float:1.14794E-41)
            r7.a = r9
            r7.n = r6
            jog r6 = r1.h
            int r11 = r6.n
            r12 = 32768(0x8000, float:4.5918E-41)
            r9 = r9 | r12
            r7.a = r9
            r7.p = r11
            int r6 = r6.o
            r9 = r9 | 16384(0x4000, float:2.2959E-41)
            r7.a = r9
            r7.o = r6
            boolean r6 = r0.c
            if (r6 != 0) goto L_0x03d7
            goto L_0x03dc
        L_0x03d7:
            r0.c()
            r0.c = r4
        L_0x03dc:
            aucj r6 = r0.b
            jow r6 = (defpackage.jow) r6
            aucj r5 = r5.i()
            jpc r5 = (defpackage.jpc) r5
            r5.getClass()
            aucx r7 = r6.c
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x03f9
            aucx r7 = r6.c
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r6.c = r7
        L_0x03f9:
            aucx r6 = r6.c
            r6.add(r5)
            aucj r0 = r0.i()
            jow r0 = (defpackage.jow) r0
            opc r6 = new opc     // Catch:{ IOException -> 0x043c }
            jog r7 = r1.h     // Catch:{ IOException -> 0x043c }
            com.google.android.gms.config.ConfigChimeraService r7 = r7.a     // Catch:{ IOException -> 0x043c }
            android.content.Context r7 = r7.getApplicationContext()     // Catch:{ IOException -> 0x043c }
            java.lang.String r9 = "ConfigFetchTask-"
            int r11 = defpackage.hxj.b     // Catch:{ IOException -> 0x043c }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ IOException -> 0x043c }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x043c }
            int r12 = r11.length()     // Catch:{ IOException -> 0x043c }
            if (r12 != 0) goto L_0x0426
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x043c }
            r11.<init>(r9)     // Catch:{ IOException -> 0x043c }
            goto L_0x042a
        L_0x0426:
            java.lang.String r11 = r9.concat(r11)     // Catch:{ IOException -> 0x043c }
        L_0x042a:
            r6.<init>((android.content.Context) r7, (java.lang.String) r11, (boolean) r4, (boolean) r2)     // Catch:{ IOException -> 0x043c }
            joz r0 = r1.a(r6, r0)     // Catch:{ IOException -> 0x043c }
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.setName(r3)
            goto L_0x0464
        L_0x0439:
            r0 = move-exception
            goto L_0x086b
        L_0x043c:
            r0 = move-exception
            java.lang.String r6 = "FetchTask"
            java.lang.String r7 = "Config fetch from backend failed for package: "
            jog r9 = r1.h     // Catch:{ all -> 0x0439 }
            java.lang.String r9 = r9.b     // Catch:{ all -> 0x0439 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0439 }
            int r11 = r9.length()     // Catch:{ all -> 0x0439 }
            if (r11 != 0) goto L_0x0455
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0439 }
            r9.<init>(r7)     // Catch:{ all -> 0x0439 }
            goto L_0x0459
        L_0x0455:
            java.lang.String r9 = r7.concat(r9)     // Catch:{ all -> 0x0439 }
        L_0x0459:
            android.util.Log.e(r6, r9, r0)     // Catch:{ all -> 0x0439 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setName(r3)
            r0 = 0
        L_0x0464:
            if (r0 != 0) goto L_0x0468
            goto L_0x06d4
        L_0x0468:
            int r3 = r0.a
            int r3 = defpackage.joy.a(r3)
            if (r3 != 0) goto L_0x0471
            goto L_0x0473
        L_0x0471:
            if (r3 != r2) goto L_0x06d4
        L_0x0473:
            com.google.android.gms.config.ConfigChimeraService r3 = r1.g
            java.lang.String r6 = r1.a
            long r11 = r1.b
            jof r7 = r1.d
            byte[] r17 = defpackage.jof.a(r7)
            byte[] r7 = r1.e
            jop r9 = r1.c
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.Object r13 = r3.a
            monitor-enter(r13)
            java.util.Map r14 = r3.c     // Catch:{ all -> 0x06d1 }
            java.lang.Object r14 = r14.get(r6)     // Catch:{ all -> 0x06d1 }
            job r14 = (defpackage.job) r14     // Catch:{ all -> 0x06d1 }
            java.util.Map r4 = r3.d     // Catch:{ all -> 0x06d1 }
            if (r4 == 0) goto L_0x049d
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x06d1 }
            r2.<init>(r4)     // Catch:{ all -> 0x06d1 }
            goto L_0x049e
        L_0x049d:
            r2 = 0
        L_0x049e:
            java.util.Map r4 = r3.b     // Catch:{ all -> 0x06d1 }
            if (r4 == 0) goto L_0x04b6
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x06d1 }
            if (r4 == 0) goto L_0x04b6
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x06d1 }
            java.util.Map r5 = r3.b     // Catch:{ all -> 0x06d1 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x06d1 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x06d1 }
            r4.<init>(r5)     // Catch:{ all -> 0x06d1 }
            goto L_0x04b7
        L_0x04b6:
            r4 = 0
        L_0x04b7:
            monitor-exit(r13)     // Catch:{ all -> 0x06d1 }
            if (r14 == 0) goto L_0x04bd
            java.util.Map r5 = r14.a
            goto L_0x04be
        L_0x04bd:
            r5 = 0
        L_0x04be:
            if (r5 != 0) goto L_0x04c5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x04c5:
            if (r4 != 0) goto L_0x04cc
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x04cc:
            if (r2 != 0) goto L_0x04d4
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L_0x04d7
        L_0x04d4:
            com.google.android.gms.config.ConfigChimeraService.a((java.util.Map) r2, (java.lang.String) r6)
        L_0x04d7:
            aucx r13 = r0.b
            int r8 = r13.size()
            r10 = 0
        L_0x04de:
            if (r10 >= r8) goto L_0x04fe
            java.lang.Object r16 = r13.get(r10)
            r23 = r8
            r8 = r16
            jpa r8 = (defpackage.jpa) r8
            r16 = r13
            java.lang.String r13 = r8.a
            auay r8 = r8.b
            byte[] r8 = r8.k()
            r2.put(r13, r8)
            int r10 = r10 + 1
            r13 = r16
            r8 = r23
            goto L_0x04de
        L_0x04fe:
            aucx r0 = r0.c
            int r8 = r0.size()
            r10 = 0
        L_0x0505:
            if (r10 >= r8) goto L_0x0632
            java.lang.Object r13 = r0.get(r10)
            jos r13 = (defpackage.jos) r13
            r16 = r0
            java.lang.String r0 = r13.a
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0616
            java.util.Set r0 = r4.keySet()
            r23 = r8
            aucx r8 = r13.b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0547
            int r0 = r8.size()
            r24 = r9
            r9 = 0
        L_0x0531:
            if (r9 >= r0) goto L_0x0549
            java.lang.Object r25 = r8.get(r9)
            r26 = r0
            r0 = r25
            jov r0 = (defpackage.jov) r0
            java.lang.String r0 = r0.a
            r1.remove(r0)
            int r9 = r9 + 1
            r0 = r26
            goto L_0x0531
        L_0x0547:
            r24 = r9
        L_0x0549:
            java.util.Iterator r0 = r1.iterator()
        L_0x054d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0560
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r4.remove(r1)
            r5.remove(r1)
            goto L_0x054d
        L_0x0560:
            aucx r0 = r13.b
            int r1 = r0.size()
            r8 = 0
        L_0x0567:
            if (r8 >= r1) goto L_0x05f4
            java.lang.Object r9 = r0.get(r8)
            jov r9 = (defpackage.jov) r9
            r25 = r0
            java.lang.String r0 = r9.a
            r26 = r1
            int r1 = r9.d
            int r1 = defpackage.jou.a(r1)
            if (r1 == 0) goto L_0x057e
            goto L_0x057f
        L_0x057e:
            r1 = 1
        L_0x057f:
            int r1 = r1 + -1
            if (r1 == 0) goto L_0x05b2
            r27 = r2
            r2 = 2
            if (r1 == r2) goto L_0x05a8
            r2 = 3
            if (r1 == r2) goto L_0x0596
            r4.remove(r0)
            r5.remove(r0)
            r28 = r7
            r29 = r11
            goto L_0x05e6
        L_0x0596:
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r4.put(r0, r1)
            java.lang.String r1 = r9.b
            r5.put(r0, r1)
            r28 = r7
            r29 = r11
            goto L_0x05e6
        L_0x05a8:
            java.lang.String r1 = r9.b
            r5.put(r0, r1)
            r28 = r7
            r29 = r11
            goto L_0x05e6
        L_0x05b2:
            r27 = r2
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            aucx r2 = r9.c
            r28 = r7
            int r7 = r2.size()
            r29 = r11
            r11 = 0
        L_0x05c4:
            if (r11 >= r7) goto L_0x05de
            java.lang.Object r12 = r2.get(r11)
            jpa r12 = (defpackage.jpa) r12
            r31 = r2
            java.lang.String r2 = r12.a
            auay r12 = r12.b
            byte[] r12 = r12.k()
            r1.put(r2, r12)
            int r11 = r11 + 1
            r2 = r31
            goto L_0x05c4
        L_0x05de:
            r4.put(r0, r1)
            java.lang.String r1 = r9.b
            r5.put(r0, r1)
        L_0x05e6:
            int r8 = r8 + 1
            r0 = r25
            r1 = r26
            r2 = r27
            r7 = r28
            r11 = r29
            goto L_0x0567
        L_0x05f4:
            r27 = r2
            r28 = r7
            r29 = r11
            amqt r0 = defpackage.auga.a
            aucx r1 = r13.c
            java.lang.Iterable r0 = r0.a((java.lang.Iterable) r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0606:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0620
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            r15.add(r1)
            goto L_0x0606
        L_0x0616:
            r27 = r2
            r28 = r7
            r23 = r8
            r24 = r9
            r29 = r11
        L_0x0620:
            int r10 = r10 + 1
            r1 = r32
            r0 = r16
            r8 = r23
            r9 = r24
            r2 = r27
            r7 = r28
            r11 = r29
            goto L_0x0505
        L_0x0632:
            r27 = r2
            r28 = r7
            r24 = r9
            r29 = r11
            if (r14 == 0) goto L_0x063f
            java.util.List r0 = r14.d
            goto L_0x0640
        L_0x063f:
            r0 = 0
        L_0x0640:
            if (r14 == 0) goto L_0x0645
            java.util.List r1 = r14.e
            goto L_0x0646
        L_0x0645:
            r1 = 0
        L_0x0646:
            int r2 = r3.b((java.lang.String) r6)
            r7 = r29
            java.util.List r14 = com.google.android.gms.config.ConfigChimeraService.a((java.util.List) r0, (long) r7, (int) r2)
            job r20 = new job
            r13 = r20
            r0 = r15
            r15 = r1
            r16 = r5
            r18 = r28
            r13.<init>(r14, r15, r16, r17, r18)
            r17 = r3
            r18 = r6
            r19 = r4
            r21 = r27
            r22 = r0
            r17.a((java.lang.String) r18, (java.util.HashMap) r19, (defpackage.job) r20, (java.util.Map) r21, (java.util.List) r22)
            if (r24 == 0) goto L_0x06cd
            com.google.android.gms.common.data.DataHolder r1 = r3.b((java.util.Map) r4)     // Catch:{ RemoteException -> 0x06a4 }
            com.google.android.gms.common.data.DataHolder r0 = r3.b((java.util.List) r0)     // Catch:{ RemoteException -> 0x06a4 }
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x06a4 }
            com.google.android.gms.config.internal.FetchConfigIpcResponse r3 = new com.google.android.gms.config.internal.FetchConfigIpcResponse     // Catch:{ RemoteException -> 0x06a4 }
            r4 = -6505(0xffffffffffffe697, float:NaN)
            r3.<init>(r4, r1, r0)     // Catch:{ RemoteException -> 0x06a4 }
            r4 = r24
            r4.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.config.internal.FetchConfigIpcResponse) r3)     // Catch:{ RemoteException -> 0x06a4 }
            if (r1 == 0) goto L_0x068d
            boolean r2 = r1.b()     // Catch:{ RemoteException -> 0x06a4 }
            if (r2 != 0) goto L_0x068d
            r1.close()     // Catch:{ RemoteException -> 0x06a4 }
        L_0x068d:
            if (r0 == 0) goto L_0x06a0
            boolean r1 = r0.b()     // Catch:{ RemoteException -> 0x06a4 }
            if (r1 != 0) goto L_0x069c
            r0.close()     // Catch:{ RemoteException -> 0x06a4 }
            r1 = r32
            goto L_0x085d
        L_0x069c:
            r1 = r32
            goto L_0x085d
        L_0x06a0:
            r1 = r32
            goto L_0x085d
        L_0x06a4:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 47
            r2.<init>(r1)
            java.lang.String r1 = "Failed to call callback method for fetchConfig."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "ConfigChimeraService"
            android.util.Log.e(r1, r0)
            r1 = r32
            goto L_0x085d
        L_0x06cd:
            r1 = r32
            goto L_0x085d
        L_0x06d1:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x06d1 }
            throw r0
        L_0x06d4:
            r1 = r32
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g     // Catch:{ all -> 0x0868 }
            java.util.Map r0 = r0.b     // Catch:{ all -> 0x0868 }
            java.lang.String r3 = r1.a     // Catch:{ all -> 0x0868 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0868 }
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0868 }
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g     // Catch:{ all -> 0x0868 }
            java.util.Map r0 = r0.e     // Catch:{ all -> 0x0868 }
            java.lang.String r4 = r1.a     // Catch:{ all -> 0x0868 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0868 }
            r4 = r0
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x0868 }
            monitor-exit(r2)     // Catch:{ all -> 0x0868 }
            com.google.android.gms.config.ConfigChimeraService r2 = r1.g
            java.lang.String r5 = r1.a
            long r6 = r1.b
            java.lang.Object r8 = r2.a
            monitor-enter(r8)
            java.util.Map r0 = r2.c     // Catch:{ all -> 0x0865 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0865 }
            job r0 = (defpackage.job) r0     // Catch:{ all -> 0x0865 }
            monitor-exit(r8)     // Catch:{ all -> 0x0865 }
            if (r0 == 0) goto L_0x0723
            java.util.List r8 = r0.e
            int r9 = r2.c(r5)
            java.util.List r12 = com.google.android.gms.config.ConfigChimeraService.a((java.util.List) r8, (long) r6, (int) r9)
            job r6 = new job
            java.util.List r11 = r0.d
            java.util.Map r13 = r0.a
            byte[] r14 = r0.b
            byte[] r15 = r0.c
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0736
        L_0x0723:
            int r0 = r2.c(r5)
            r8 = 0
            java.util.List r11 = com.google.android.gms.config.ConfigChimeraService.a((java.util.List) r8, (long) r6, (int) r0)
            job r6 = new job
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x0736:
            jnz r0 = r2.j     // Catch:{ IllegalStateException -> 0x073d }
            android.database.sqlite.SQLiteDatabase r8 = r0.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x073d }
            goto L_0x0746
        L_0x073d:
            r0 = move-exception
            java.lang.String r7 = "ConfigChimeraService"
            java.lang.String r8 = "Database not in a state to be opened. We are probably being destroyed."
            android.util.Log.e(r7, r8, r0)
            r8 = 0
        L_0x0746:
            if (r8 == 0) goto L_0x07ca
            java.lang.String r0 = "DELETE FROM fetch_metadata WHERE package = ?"
            android.database.sqlite.SQLiteStatement r7 = r8.compileStatement(r0)
            java.lang.String r0 = "INSERT INTO fetch_metadata (package, namespace_digest, recent_success_times, recent_failure_times, device_context_digest, app_context_digest) VALUES (?, ?, ?, ?, ?, ?)"
            android.database.sqlite.SQLiteStatement r9 = r8.compileStatement(r0)
            r8.beginTransaction()
            r10 = 1
            r7.bindString(r10, r5)     // Catch:{ all -> 0x07b6 }
            r7.execute()     // Catch:{ all -> 0x07b6 }
            r9.bindString(r10, r5)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = r6.b()     // Catch:{ all -> 0x07b6 }
            r10 = 2
            r9.bindString(r10, r0)     // Catch:{ all -> 0x07b6 }
            java.util.List r0 = r6.d     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = com.google.android.gms.config.ConfigChimeraService.a((java.util.List) r0)     // Catch:{ all -> 0x07b6 }
            r10 = 3
            r9.bindString(r10, r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = r6.a()     // Catch:{ all -> 0x07b6 }
            r10 = 4
            r9.bindString(r10, r0)     // Catch:{ all -> 0x07b6 }
            byte[] r0 = r6.b     // Catch:{ all -> 0x07b6 }
            r10 = 5
            if (r0 == 0) goto L_0x0784
            r9.bindBlob(r10, r0)     // Catch:{ all -> 0x07b6 }
            goto L_0x0788
        L_0x0784:
            r9.bindNull(r10)     // Catch:{ all -> 0x07b6 }
        L_0x0788:
            byte[] r0 = r6.c     // Catch:{ all -> 0x07b6 }
            r10 = 6
            if (r0 == 0) goto L_0x0791
            r9.bindBlob(r10, r0)     // Catch:{ all -> 0x07b6 }
            goto L_0x0795
        L_0x0791:
            r9.bindNull(r10)     // Catch:{ all -> 0x07b6 }
        L_0x0795:
            r9.execute()     // Catch:{ all -> 0x07b6 }
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x07b6 }
            r7.close()
            r9.close()
            r8.endTransaction()     // Catch:{ IllegalStateException -> 0x07b3 }
            java.lang.Object r7 = r2.a
            monitor-enter(r7)
            java.util.Map r0 = r2.c     // Catch:{ all -> 0x07b0 }
            if (r0 == 0) goto L_0x07ae
            r0.put(r5, r6)     // Catch:{ all -> 0x07b0 }
        L_0x07ae:
            monitor-exit(r7)     // Catch:{ all -> 0x07b0 }
            goto L_0x07ca
        L_0x07b0:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x07b0 }
            throw r0
        L_0x07b3:
            r0 = move-exception
            r2 = r0
            goto L_0x07c3
        L_0x07b6:
            r0 = move-exception
            r7.close()
            r9.close()
            r8.endTransaction()     // Catch:{ IllegalStateException -> 0x07c1 }
            throw r0
        L_0x07c1:
            r0 = move-exception
            r2 = r0
        L_0x07c3:
            java.lang.String r0 = "ConfigChimeraService"
            java.lang.String r5 = "Exception while ending the db transaction."
            android.util.Log.e(r0, r5, r2)
        L_0x07ca:
            if (r3 != 0) goto L_0x0803
            jop r0 = r1.c     // Catch:{ RemoteException -> 0x0838 }
            if (r0 == 0) goto L_0x0803
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g     // Catch:{ RemoteException -> 0x0838 }
            r2 = 0
            com.google.android.gms.common.data.DataHolder r0 = r0.b((java.util.Map) r2)     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.config.ConfigChimeraService r2 = r1.g     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.common.data.DataHolder r2 = r2.b((java.util.List) r4)     // Catch:{ RemoteException -> 0x0838 }
            jop r3 = r1.c     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.config.internal.FetchConfigIpcResponse r5 = new com.google.android.gms.config.internal.FetchConfigIpcResponse     // Catch:{ RemoteException -> 0x0838 }
            r6 = 6503(0x1967, float:9.113E-42)
            r5.<init>(r6, r0, r2)     // Catch:{ RemoteException -> 0x0838 }
            r3.a((com.google.android.gms.common.api.Status) r4, (com.google.android.gms.config.internal.FetchConfigIpcResponse) r5)     // Catch:{ RemoteException -> 0x0838 }
            if (r0 == 0) goto L_0x07f6
            boolean r3 = r0.b()     // Catch:{ RemoteException -> 0x0838 }
            if (r3 != 0) goto L_0x07f6
            r0.close()     // Catch:{ RemoteException -> 0x0838 }
        L_0x07f6:
            if (r2 != 0) goto L_0x07f9
            goto L_0x085d
        L_0x07f9:
            boolean r0 = r2.b()     // Catch:{ RemoteException -> 0x0838 }
            if (r0 != 0) goto L_0x085d
            r2.close()     // Catch:{ RemoteException -> 0x0838 }
            goto L_0x085d
        L_0x0803:
            jop r0 = r1.c     // Catch:{ RemoteException -> 0x0838 }
            if (r0 == 0) goto L_0x085d
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.common.data.DataHolder r0 = r0.b((java.util.Map) r3)     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.config.ConfigChimeraService r2 = r1.g     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.common.data.DataHolder r2 = r2.b((java.util.List) r4)     // Catch:{ RemoteException -> 0x0838 }
            jop r3 = r1.c     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.a     // Catch:{ RemoteException -> 0x0838 }
            com.google.android.gms.config.internal.FetchConfigIpcResponse r5 = new com.google.android.gms.config.internal.FetchConfigIpcResponse     // Catch:{ RemoteException -> 0x0838 }
            r6 = 6504(0x1968, float:9.114E-42)
            r5.<init>(r6, r0, r2)     // Catch:{ RemoteException -> 0x0838 }
            r3.a((com.google.android.gms.common.api.Status) r4, (com.google.android.gms.config.internal.FetchConfigIpcResponse) r5)     // Catch:{ RemoteException -> 0x0838 }
            if (r0 == 0) goto L_0x082c
            boolean r3 = r0.b()     // Catch:{ RemoteException -> 0x0838 }
            if (r3 != 0) goto L_0x082c
            r0.close()     // Catch:{ RemoteException -> 0x0838 }
        L_0x082c:
            if (r2 == 0) goto L_0x085d
            boolean r0 = r2.b()     // Catch:{ RemoteException -> 0x0838 }
            if (r0 != 0) goto L_0x085d
            r2.close()     // Catch:{ RemoteException -> 0x0838 }
            goto L_0x085d
        L_0x0838:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 47
            r3.<init>(r2)
            java.lang.String r2 = "Failed to call callback method for fetchConfig."
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "ConfigChimeraService"
            android.util.Log.e(r2, r0)
        L_0x085d:
            com.google.android.gms.config.ConfigChimeraService r0 = r1.g
            acrz r2 = r1.f
            r0.a((defpackage.acrz) r2)
            return
        L_0x0865:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0865 }
            throw r0
        L_0x0868:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0868 }
            throw r0
        L_0x086b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r3)
            goto L_0x0874
        L_0x0873:
            throw r0
        L_0x0874:
            goto L_0x0873
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joh.run():void");
    }
}
