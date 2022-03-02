package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: kjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjh extends kja {
    private static final ith f = new ith("ResumableUploader", "");
    private final Set g = new LinkedHashSet();
    private long h = 0;
    private BufferedInputStream i = null;

    private kjh(Context context, kjl kjl, kht kht, kjn kjn) {
        super(context, kjl, kht, kjn);
    }

    private static final kjc a(String str) {
        try {
            return kjc.a(str);
        } catch (ParseException e) {
            throw new kjj(str.length() == 0 ? new String("Unable to upload file: invalid byte range returned by server. ") : "Unable to upload file: invalid byte range returned by server. ".concat(str));
        }
    }

    private final long b(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        a(httpURLConnection);
        if (responseCode == 308) {
            String headerField = httpURLConnection.getHeaderField("Range");
            if (headerField == null) {
                return 0;
            }
            kjc a = a(headerField);
            if (a.c == 0) {
                return a.d + 1;
            }
            throw new kjj("Unable to upload item: Bytes lost in transmission.");
        } else if (responseCode == this.b.h.intValue()) {
            throw new kji("Conflict uploading");
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unexpected response code ");
            sb.append(responseCode);
            throw new kjj(sb.toString(), c(httpURLConnection));
        }
    }

    private static final kcx c(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        lrx a = lry.a(httpURLConnection.getErrorStream());
        return new kcx(kbn.a(responseCode, a), responseCode, a);
    }

    private static final void d(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200 && responseCode != 201 && responseCode != 308) {
            lry.a(responseCode, lry.a(httpURLConnection.getErrorStream()));
        }
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "resumable";
    }

    public final amzy e() {
        return amzy.a((Collection) this.g);
    }

    public static kjh a(Context context, kjl kjl, kht kht, kjn kjn) {
        return new kjh(context, kjl, kht, kjn);
    }

    private final lnj a(HttpURLConnection httpURLConnection, ClientContext clientContext) {
        int responseCode = httpURLConnection.getResponseCode();
        a(httpURLConnection);
        if (responseCode == 201 || responseCode == 200) {
            return new lnl(kjn.a(httpURLConnection.getInputStream()), clientContext, httpURLConnection.getHeaderField("X-Server-Object-Version"));
        }
        return null;
    }

    private final void a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-GUploader-UploadID");
        if (headerField != null) {
            this.g.add(headerField);
        }
    }

    private final void a(HttpURLConnection httpURLConnection, izw izw) {
        if (httpURLConnection.getResponseCode() == 401) {
            f.b("Response from server is UNAUTHORIZED. Invalidating OAuth token.");
            izw.c(this.a);
        }
    }

    private static final void a(HttpURLConnection httpURLConnection, kjl kjl) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 400 || responseCode == 404 || responseCode == 401 || responseCode == 500) {
            kjl.a((String) null);
            throw new kjj("Url expired.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x036e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x036f, code lost:
        r3 = r0;
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0373, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0374, code lost:
        r28 = r14;
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0379, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0410, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0413, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0414, code lost:
        r2 = r0;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x041a, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0421, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0422, code lost:
        r2 = r0;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0443, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0448, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015b, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
        r2 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0162, code lost:
        r2 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0174, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0176, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0177, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204 A[SYNTHETIC, Splitter:B:119:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0413 A[ExcHandler: all (r0v19 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:182:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0421 A[ExcHandler: lhp (r0v17 'e' lhp A[CUSTOM_DECLARE]), Splitter:B:182:0x03c3] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0443 A[ExcHandler: all (th java.lang.Throwable), PHI: r24 
      PHI: (r24v7 lib) = (r24v8 lib), (r24v11 lib), (r24v16 lib), (r24v16 lib), (r24v16 lib), (r24v16 lib) binds: [B:226:0x043f, B:179:0x03af, B:150:0x0301, B:153:0x031f, B:154:?, B:159:0x0348] A[DONT_GENERATE, DONT_INLINE], Splitter:B:150:0x0301] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x046f A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0470 A[Catch:{ all -> 0x0532 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0545 A[SYNTHETIC, Splitter:B:294:0x0545] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015a A[ExcHandler: all (r0v42 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:7:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0170 A[SYNTHETIC, Splitter:B:87:0x0170] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0185 A[SYNTHETIC, Splitter:B:99:0x0185] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0150=Splitter:B:68:0x0150, B:81:0x0164=Splitter:B:81:0x0164} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lnj a(defpackage.kjk r30, defpackage.lic r31, com.google.android.gms.common.internal.ClientContext r32) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            java.lang.String r5 = ""
            r6 = 2
            r1.e = r6
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            kjl r8 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            lsr r8 = r8.a()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r9 = 262144(0x40000, float:3.67342E-40)
            r7.<init>(r8, r9)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r1.i = r7     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            kjl r7 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r7 = r7.g     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r8 = "Content-Type"
            java.lang.String r10 = "Content-Range"
            java.lang.String r11 = "PUT"
            if (r7 != 0) goto L_0x0189
            ith r7 = f     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r15 = "Starting from the beginning"
            r7.b(r15)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            kjl r7 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r16 = r10
            long r9 = r7.e     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r2.a(r9)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            kjl r7 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.net.URL r9 = r29.b()     // Catch:{ IOException -> 0x0161, Exception -> 0x015d, all -> 0x015a }
            lib r9 = r3.a(r9)     // Catch:{ IOException -> 0x0161, Exception -> 0x015d, all -> 0x015a }
            java.net.HttpURLConnection r10 = r9.a()     // Catch:{ IOException -> 0x0157 }
            java.lang.String r15 = r29.d()     // Catch:{ IOException -> 0x0157 }
            r10.setRequestMethod(r15)     // Catch:{ IOException -> 0x0157 }
            kjl r15 = r1.b     // Catch:{ IOException -> 0x0157 }
            java.lang.String r15 = r15.f     // Catch:{ IOException -> 0x0157 }
            if (r15 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            java.lang.String r6 = "If-Match"
            r10.setRequestProperty(r6, r15)     // Catch:{ IOException -> 0x0157 }
        L_0x0059:
            java.lang.String r6 = "application/json; charset=UTF-8"
            r10.setRequestProperty(r8, r6)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r6 = "Host"
            agvx r15 = defpackage.jzq.K     // Catch:{ IOException -> 0x0157 }
            java.lang.Object r15 = r15.c()     // Catch:{ IOException -> 0x0157 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0157 }
            java.lang.String r12 = "https://"
            java.lang.String r12 = r15.replace(r12, r5)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r15 = "http://"
            java.lang.String r5 = r12.replace(r15, r5)     // Catch:{ IOException -> 0x0157 }
            r10.setRequestProperty(r6, r5)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r5 = "X-Upload-Content-Type"
            java.lang.String r6 = r7.b()     // Catch:{ IOException -> 0x0157 }
            r10.setRequestProperty(r5, r6)     // Catch:{ IOException -> 0x0157 }
            java.lang.String r5 = "X-Upload-Content-Length"
            long r13 = r7.e     // Catch:{ IOException -> 0x0157 }
            java.lang.String r13 = java.lang.Long.toString(r13)     // Catch:{ IOException -> 0x0157 }
            r10.setRequestProperty(r5, r13)     // Catch:{ IOException -> 0x0157 }
            android.content.Context r5 = r1.a     // Catch:{ IOException -> 0x0157 }
            izw r5 = defpackage.kht.a(r10, r4, r5)     // Catch:{ IOException -> 0x0157 }
            r12 = 1
            r10.setDoOutput(r12)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r6 = 0
            r10.setChunkedStreamingMode(r6)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            java.io.BufferedWriter r13 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0143, all -> 0x013f }
            java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0143, all -> 0x013f }
            java.io.OutputStream r15 = r10.getOutputStream()     // Catch:{ IOException -> 0x0143, all -> 0x013f }
            java.lang.String r6 = "UTF-8"
            r14.<init>(r15, r6)     // Catch:{ IOException -> 0x0143, all -> 0x013f }
            r13.<init>(r14)     // Catch:{ IOException -> 0x0143, all -> 0x013f }
            java.lang.String r6 = r7.b     // Catch:{ IOException -> 0x013c, all -> 0x0139 }
            r13.write(r6)     // Catch:{ IOException -> 0x013c, all -> 0x0139 }
            defpackage.jjt.a((java.io.Closeable) r13)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            r10.getResponseCode()     // Catch:{ IOException -> 0x012f }
            d(r10)     // Catch:{ IOException -> 0x012f }
            r1.a((java.net.HttpURLConnection) r10, (defpackage.izw) r5)     // Catch:{ IOException -> 0x012f }
            java.net.HttpURLConnection r5 = r9.a()     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            a((java.net.HttpURLConnection) r5, (defpackage.kjl) r7)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.String r6 = r5.getResponseMessage()     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            int r10 = r5.getResponseCode()     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r1.a((java.net.HttpURLConnection) r5)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r10 != r13) goto L_0x00f2
            java.lang.String r6 = "Location"
            java.lang.String r5 = r5.getHeaderField(r6)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            if (r5 == 0) goto L_0x00ea
            r7.a(r5)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            if (r9 == 0) goto L_0x00e5
            r9.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r10 = r16
            r14 = 0
            goto L_0x0202
        L_0x00e5:
            r10 = r16
            r14 = 0
            goto L_0x0202
        L_0x00ea:
            kjj r2 = new kjj     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.String r3 = "Unable to upload item: Server upload URI invalid."
            r2.<init>(r3)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            throw r2     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
        L_0x00f2:
            kjl r2 = r1.b     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.Integer r2 = r2.h     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            int r2 = r2.intValue()     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            if (r10 == r2) goto L_0x011e
            kjj r2 = new kjj     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r8 = 0
            r3[r8] = r4     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            com.google.android.gms.drive.DriveId r4 = r7.d     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r7 = 1
            r3[r7] = r4     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r4 = 2
            r3[r4] = r6     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.String r4 = "Unable to upload item: %d to upload %s %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            kcx r4 = c(r5)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            throw r2     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
        L_0x011e:
            kji r2 = new kji     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            java.lang.String r3 = "Conflict uploading"
            r2.<init>(r3)     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
            throw r2     // Catch:{ IOException -> 0x012b, all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            r2 = r0
            r15 = r9
            goto L_0x0183
        L_0x012b:
            r0 = move-exception
            r2 = r0
            r15 = r9
            goto L_0x0179
        L_0x012f:
            r0 = move-exception
            r2 = r0
            kjj r3 = new kjj     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            java.lang.String r4 = "Failed to upload metadata"
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            throw r3     // Catch:{ Exception -> 0x0154, all -> 0x015a }
        L_0x0139:
            r0 = move-exception
            r2 = r0
            goto L_0x0150
        L_0x013c:
            r0 = move-exception
            r2 = r0
            goto L_0x0146
        L_0x013f:
            r0 = move-exception
            r2 = r0
            r13 = 0
            goto L_0x0150
        L_0x0143:
            r0 = move-exception
            r2 = r0
            r13 = 0
        L_0x0146:
            kjj r3 = new kjj     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "Failed to write to the connection output stream"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x014e }
            throw r3     // Catch:{ all -> 0x014e }
        L_0x014e:
            r0 = move-exception
            r2 = r0
        L_0x0150:
            defpackage.jjt.a((java.io.Closeable) r13)     // Catch:{ Exception -> 0x0154, all -> 0x015a }
            throw r2     // Catch:{ Exception -> 0x0154, all -> 0x015a }
        L_0x0154:
            r0 = move-exception
            r2 = r0
            goto L_0x016e
        L_0x0157:
            r0 = move-exception
            r2 = r0
            goto L_0x0164
        L_0x015a:
            r0 = move-exception
            r2 = r0
            goto L_0x0174
        L_0x015d:
            r0 = move-exception
            r2 = r0
            r9 = 0
            goto L_0x016e
        L_0x0161:
            r0 = move-exception
            r2 = r0
            r9 = 0
        L_0x0164:
            kjj r3 = new kjj     // Catch:{ Exception -> 0x016c, all -> 0x015a }
            java.lang.String r4 = "Failed to init session"
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x016c, all -> 0x015a }
            throw r3     // Catch:{ Exception -> 0x016c, all -> 0x015a }
        L_0x016c:
            r0 = move-exception
            r2 = r0
        L_0x016e:
            if (r9 == 0) goto L_0x0173
            r9.close()     // Catch:{ IOException -> 0x0176, all -> 0x015a }
        L_0x0173:
            throw r2     // Catch:{ IOException -> 0x0176, all -> 0x015a }
        L_0x0174:
            r15 = 0
            goto L_0x0183
        L_0x0176:
            r0 = move-exception
            r2 = r0
            r15 = 0
        L_0x0179:
            kjj r3 = new kjj     // Catch:{ all -> 0x0181 }
            java.lang.String r4 = "Failed to start request"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0181 }
            throw r3     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            r2 = r0
        L_0x0183:
            if (r15 == 0) goto L_0x0188
            r15.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x0188:
            throw r2     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x0189:
            r16 = r10
            ith r5 = f     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r7 = "Starting from status request"
            r5.b(r7)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            kjl r5 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.net.URL r7 = new java.net.URL     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r9 = r5.g     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r7.<init>(r9)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            lib r7 = r3.a(r7)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.net.HttpURLConnection r9 = r7.a()     // Catch:{ all -> 0x0556 }
            r9.setRequestMethod(r11)     // Catch:{ all -> 0x0556 }
            java.lang.String r10 = "bytes */"
            long r13 = r5.e     // Catch:{ all -> 0x0556 }
            java.lang.String r13 = java.lang.Long.toString(r13)     // Catch:{ all -> 0x0556 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0556 }
            int r14 = r13.length()     // Catch:{ all -> 0x0556 }
            if (r14 != 0) goto L_0x01be
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x0556 }
            r13.<init>(r10)     // Catch:{ all -> 0x0556 }
            goto L_0x01c2
        L_0x01be:
            java.lang.String r13 = r10.concat(r13)     // Catch:{ all -> 0x0556 }
        L_0x01c2:
            r10 = r16
            r9.setRequestProperty(r10, r13)     // Catch:{ all -> 0x0556 }
            r12 = 1
            r9.setDoOutput(r12)     // Catch:{ all -> 0x0556 }
            android.content.Context r13 = r1.a     // Catch:{ all -> 0x0556 }
            izw r13 = defpackage.kht.a(r9, r4, r13)     // Catch:{ all -> 0x0556 }
            java.io.OutputStream r14 = r9.getOutputStream()     // Catch:{ all -> 0x0556 }
            r14.close()     // Catch:{ all -> 0x0556 }
            lnj r14 = r1.a((java.net.HttpURLConnection) r9, (com.google.android.gms.common.internal.ClientContext) r4)     // Catch:{ all -> 0x0556 }
            if (r14 != 0) goto L_0x01f7
            d(r9)     // Catch:{ all -> 0x0556 }
            r1.a((java.net.HttpURLConnection) r9, (defpackage.izw) r13)     // Catch:{ all -> 0x0556 }
            a((java.net.HttpURLConnection) r9, (defpackage.kjl) r5)     // Catch:{ all -> 0x0556 }
            long r13 = r1.b(r9)     // Catch:{ all -> 0x0556 }
            r1.h = r13     // Catch:{ all -> 0x0556 }
            java.io.BufferedInputStream r5 = r1.i     // Catch:{ all -> 0x0556 }
            r5.skip(r13)     // Catch:{ all -> 0x0556 }
            r7.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r14 = 0
            goto L_0x01fa
        L_0x01f7:
            r7.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x01fa:
            if (r14 == 0) goto L_0x0202
            java.io.BufferedInputStream r2 = r1.i
        L_0x01fe:
            defpackage.jjt.a((java.io.Closeable) r2)
            return r14
        L_0x0202:
            if (r14 != 0) goto L_0x054f
            boolean r5 = java.lang.Thread.interrupted()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            if (r5 != 0) goto L_0x0549
            kjl r5 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            long r13 = r5.e     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            long r6 = r1.h     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            long r6 = r13 - r6
            r19 = r13
            r12 = 262144(0x40000, double:1.295163E-318)
            long r6 = java.lang.Math.min(r6, r12)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            int r7 = (int) r6     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            ith r13 = f     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r6 = 3
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r12 = 0
            r14[r12] = r6     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r16 = r10
            long r9 = r1.h     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r10 = 1
            r14[r10] = r9     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r10 = 2
            r14[r10] = r9     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.String r9 = "Sending next chunk: %s bytes. Confirmed: %s/%s"
            r13.a((java.lang.String) r9, (java.lang.Object[]) r14)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r13 = 1
            long r9 = r9.toMillis(r13)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            agvx r13 = defpackage.jzq.aZ     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Object r13 = r13.c()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Double r13 = (java.lang.Double) r13     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            double r13 = r13.doubleValue()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            agvx r15 = defpackage.jzq.aY     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Object r15 = r15.c()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.lang.Double r15 = (java.lang.Double) r15     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            double r21 = r15.doubleValue()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            lrq r15 = new lrq     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r13
            long r9 = (long) r9
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r15
            r19 = r9
            r18.<init>(r19, r21, r23)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            agvx r9 = defpackage.jzq.ba     // Catch:{ all -> 0x0540 }
            java.lang.Object r9 = r9.c()     // Catch:{ all -> 0x0540 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0540 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0540 }
            r10 = 0
            r13 = 0
        L_0x0282:
            if (r10 >= r9) goto L_0x04b9
            ith r14 = f     // Catch:{ all -> 0x04b1 }
            r12 = 1
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x04b1 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04b1 }
            r18 = 0
            r6[r18] = r19     // Catch:{ all -> 0x04b1 }
            java.lang.String r12 = "Send chunk attempt: %d"
            r14.a((java.lang.String) r12, (java.lang.Object[]) r6)     // Catch:{ all -> 0x04b1 }
            java.io.BufferedInputStream r6 = r1.i     // Catch:{ all -> 0x04b1 }
            r14 = 262144(0x40000, float:3.67342E-40)
            r6.mark(r14)     // Catch:{ all -> 0x04b1 }
            java.lang.String r6 = r5.g     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            ith r12 = f     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            r19 = r12
            r14 = 1
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            r14 = r19
            r18 = 0
            r12[r18] = r6     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            java.lang.String r6 = "Uploading to url %s"
            r14.a((java.lang.String) r6, (java.lang.Object[]) r12)     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            java.net.URL r6 = new java.net.URL     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            java.lang.String r12 = r5.g     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            r6.<init>(r12)     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            lib r14 = r3.a(r6)     // Catch:{ lhp -> 0x049f, IOException -> 0x044a }
            java.net.HttpURLConnection r12 = r14.a()     // Catch:{ Exception -> 0x042b }
            lho r6 = r14.b()     // Catch:{ Exception -> 0x042b }
            java.lang.String r3 = "Connection interrupted"
            r6.a(r3)     // Catch:{ Exception -> 0x042b }
            java.lang.String r3 = r5.b()     // Catch:{ Exception -> 0x042b }
            r12.setRequestProperty(r8, r3)     // Catch:{ Exception -> 0x042b }
            android.content.Context r3 = r1.a     // Catch:{ Exception -> 0x042b }
            izw r3 = defpackage.kht.a(r12, r4, r3)     // Catch:{ Exception -> 0x042b }
            r12.setRequestMethod(r11)     // Catch:{ Exception -> 0x042b }
            if (r7 <= 0) goto L_0x039b
            r20 = r6
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ Exception -> 0x0385 }
            r21 = r8
            r17 = r11
            r8 = 3
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x037f }
            r22 = r9
            long r8 = r1.h     // Catch:{ Exception -> 0x037d }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x037d }
            r9 = 0
            r11[r9] = r8     // Catch:{ Exception -> 0x037d }
            r8 = r20
            r18 = r10
            long r9 = r1.h     // Catch:{ Exception -> 0x037b }
            r25 = r12
            r24 = r13
            long r12 = (long) r7
            long r9 = r9 + r12
            r26 = -1
            long r9 = r9 + r26
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            r10 = 1
            r11[r10] = r9     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            r9 = r25
            r19 = r11
            long r10 = r5.e     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            r11 = 2
            r19[r11] = r10     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            java.lang.String r10 = "bytes %d-%d/%d"
            r11 = r19
            java.lang.String r6 = java.lang.String.format(r6, r10, r11)     // Catch:{ Exception -> 0x0379, all -> 0x0443 }
            r10 = r16
            r9.setRequestProperty(r10, r6)     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            r6 = 1
            r9.setDoOutput(r6)     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            r9.setFixedLengthStreamingMode(r7)     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            lhb r6 = new lhb     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            java.io.OutputStream r11 = r9.getOutputStream()     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            r6.<init>(r11, r8)     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            java.io.BufferedInputStream r8 = r1.i     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            r11 = 16384(0x4000, float:2.2959E-41)
            byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x0373, all -> 0x0443 }
            r25 = 0
        L_0x033a:
            int r16 = (r25 > r12 ? 1 : (r25 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x0363
            r16 = r5
            r4 = 16384(0x4000, double:8.0948E-320)
            r28 = r14
            r27 = r15
            long r14 = r12 - r25
            long r4 = java.lang.Math.min(r4, r14)     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            int r5 = (int) r4     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            r4 = 0
            int r5 = r8.read(r11, r4, r5)     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            r6.write(r11, r4, r5)     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            r4 = r6
            long r14 = (long) r5     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            long r25 = r25 + r14
            r6 = r4
            r5 = r16
            r15 = r27
            r14 = r28
            r4 = r32
            goto L_0x033a
        L_0x0363:
            r16 = r5
            r4 = r6
            r28 = r14
            r27 = r15
            r4.close()     // Catch:{ Exception -> 0x036e, all -> 0x0443 }
            goto L_0x03bd
        L_0x036e:
            r0 = move-exception
            r3 = r0
            r5 = r16
            goto L_0x0397
        L_0x0373:
            r0 = move-exception
            r28 = r14
            r27 = r15
            goto L_0x0396
        L_0x0379:
            r0 = move-exception
            goto L_0x0390
        L_0x037b:
            r0 = move-exception
            goto L_0x038e
        L_0x037d:
            r0 = move-exception
            goto L_0x0382
        L_0x037f:
            r0 = move-exception
            r22 = r9
        L_0x0382:
            r18 = r10
            goto L_0x038e
        L_0x0385:
            r0 = move-exception
            r21 = r8
            r22 = r9
            r18 = r10
            r17 = r11
        L_0x038e:
            r24 = r13
        L_0x0390:
            r28 = r14
            r27 = r15
            r10 = r16
        L_0x0396:
            r3 = r0
        L_0x0397:
            r6 = 0
            r12 = 1
            goto L_0x043f
        L_0x039b:
            r21 = r8
            r22 = r9
            r18 = r10
            r17 = r11
            r9 = r12
            r24 = r13
            r28 = r14
            r27 = r15
            r10 = r16
            r16 = r5
            r4 = 1
            r9.setDoOutput(r4)     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
            r4 = 0
            r9.setFixedLengthStreamingMode(r4)     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
            java.io.OutputStream r4 = r9.getOutputStream()     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
            r4.close()     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
        L_0x03bd:
            d(r9)     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
            r1.a((java.net.HttpURLConnection) r9, (defpackage.izw) r3)     // Catch:{ Exception -> 0x0427, all -> 0x0443 }
            java.net.HttpURLConnection r3 = r28.a()     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            int r4 = r3.getResponseCode()     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            ith r5 = f     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            r6 = 0
            r9[r6] = r8     // Catch:{ lhp -> 0x0421, IOException -> 0x040f, all -> 0x0413 }
            java.lang.String r11 = "HTTP upload status %d"
            r5.a((java.lang.String) r11, (java.lang.Object[]) r9)     // Catch:{ lhp -> 0x0421, IOException -> 0x0419, all -> 0x0413 }
            r5 = r16
            a((java.net.HttpURLConnection) r3, (defpackage.kjl) r5)     // Catch:{ lhp -> 0x0421, IOException -> 0x040d, all -> 0x0413 }
            r3 = 500(0x1f4, float:7.0E-43)
            if (r4 >= r3) goto L_0x03ec
            r13 = r28
            r3 = 1
            r6 = 0
            r12 = 1
            goto L_0x04c4
        L_0x03ec:
            r3 = 599(0x257, float:8.4E-43)
            if (r4 > r3) goto L_0x0406
            ith r3 = f     // Catch:{ lhp -> 0x0421, IOException -> 0x040d, all -> 0x0413 }
            r12 = 1
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ lhp -> 0x0421, IOException -> 0x0403, all -> 0x0413 }
            r6 = 0
            r4[r6] = r8     // Catch:{ lhp -> 0x0421, IOException -> 0x0401, all -> 0x0413 }
            java.lang.String r8 = "Upload attempt failed with response %d, retrying."
            r3.a((java.lang.String) r8, (java.lang.Object[]) r4)     // Catch:{ lhp -> 0x0421, IOException -> 0x0401, all -> 0x0413 }
            r13 = r28
            goto L_0x0464
        L_0x0401:
            r0 = move-exception
            goto L_0x041e
        L_0x0403:
            r0 = move-exception
            r6 = 0
            goto L_0x041e
        L_0x0406:
            r6 = 0
            r12 = 1
            r13 = r28
            r3 = 1
            goto L_0x04c4
        L_0x040d:
            r0 = move-exception
            goto L_0x041c
        L_0x040f:
            r0 = move-exception
            r5 = r16
            goto L_0x041d
        L_0x0413:
            r0 = move-exception
            r2 = r0
            r15 = r28
            goto L_0x0543
        L_0x0419:
            r0 = move-exception
            r5 = r16
        L_0x041c:
            r6 = 0
        L_0x041d:
            r12 = 1
        L_0x041e:
            r13 = r28
            goto L_0x045d
        L_0x0421:
            r0 = move-exception
            r2 = r0
            r15 = r28
            goto L_0x04a5
        L_0x0427:
            r0 = move-exception
            r5 = r16
            goto L_0x043c
        L_0x042b:
            r0 = move-exception
            r21 = r8
            r22 = r9
            r18 = r10
            r17 = r11
            r24 = r13
            r28 = r14
            r27 = r15
            r10 = r16
        L_0x043c:
            r6 = 0
            r12 = 1
            r3 = r0
        L_0x043f:
            r28.close()     // Catch:{ lhp -> 0x0448, IOException -> 0x0446, all -> 0x0443 }
            throw r3     // Catch:{ lhp -> 0x0448, IOException -> 0x0446, all -> 0x0443 }
        L_0x0443:
            r0 = move-exception
            goto L_0x04b4
        L_0x0446:
            r0 = move-exception
            goto L_0x045b
        L_0x0448:
            r0 = move-exception
            goto L_0x04a2
        L_0x044a:
            r0 = move-exception
            r21 = r8
            r22 = r9
            r18 = r10
            r17 = r11
            r24 = r13
            r27 = r15
            r10 = r16
            r6 = 0
            r12 = 1
        L_0x045b:
            r13 = r24
        L_0x045d:
            ith r3 = f     // Catch:{ all -> 0x049a }
            java.lang.String r4 = "Upload attempt failed on IO, retrying."
            r3.b(r4)     // Catch:{ all -> 0x049a }
        L_0x0464:
            java.io.BufferedInputStream r3 = r1.i     // Catch:{ all -> 0x0532 }
            r3.reset()     // Catch:{ all -> 0x0532 }
            int r9 = r22 + -1
            r3 = r18
            if (r3 < r9) goto L_0x0470
            goto L_0x0487
        L_0x0470:
            if (r13 != 0) goto L_0x0473
            goto L_0x0476
        L_0x0473:
            r13.close()     // Catch:{ all -> 0x0532 }
        L_0x0476:
            ith r4 = f     // Catch:{ all -> 0x0532 }
            java.lang.String r8 = "Waiting for rate limiter token"
            r4.b(r8)     // Catch:{ all -> 0x0532 }
            r27.f()     // Catch:{ all -> 0x0532 }
            ith r4 = f     // Catch:{ all -> 0x0532 }
            java.lang.String r8 = "Got token"
            r4.b(r8)     // Catch:{ all -> 0x0532 }
        L_0x0487:
            int r3 = r3 + 1
            r4 = r32
            r16 = r10
            r11 = r17
            r8 = r21
            r9 = r22
            r15 = r27
            r10 = r3
            r3 = r31
            goto L_0x0282
        L_0x049a:
            r0 = move-exception
            r2 = r0
            r15 = r13
            goto L_0x0543
        L_0x049f:
            r0 = move-exception
            r24 = r13
        L_0x04a2:
            r2 = r0
            r15 = r24
        L_0x04a5:
            ith r3 = f     // Catch:{ all -> 0x04ad }
            java.lang.String r4 = "Upload attempt failed on PermitTokenException, aborting."
            r3.b(r4)     // Catch:{ all -> 0x04ad }
            throw r2     // Catch:{ all -> 0x04ad }
        L_0x04ad:
            r0 = move-exception
            r2 = r0
            goto L_0x0543
        L_0x04b1:
            r0 = move-exception
            r24 = r13
        L_0x04b4:
            r2 = r0
            r15 = r24
            goto L_0x0543
        L_0x04b9:
            r21 = r8
            r17 = r11
            r24 = r13
            r10 = r16
            r6 = 0
            r12 = 1
            r3 = 0
        L_0x04c4:
            if (r13 == 0) goto L_0x0527
            if (r3 == 0) goto L_0x0527
            java.net.HttpURLConnection r3 = r13.a()     // Catch:{ all -> 0x0532 }
            r4 = r32
            lnj r3 = r1.a((java.net.HttpURLConnection) r3, (com.google.android.gms.common.internal.ClientContext) r4)     // Catch:{ all -> 0x0532 }
            if (r3 != 0) goto L_0x0510
            java.net.HttpURLConnection r3 = r13.a()     // Catch:{ all -> 0x0532 }
            long r8 = r1.b(r3)     // Catch:{ all -> 0x0532 }
            long r14 = r1.h     // Catch:{ all -> 0x0532 }
            long r6 = (long) r7     // Catch:{ all -> 0x0532 }
            long r14 = r14 + r6
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x04ef
            r1.h = r8     // Catch:{ all -> 0x0532 }
            if (r13 == 0) goto L_0x04ed
            r13.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r14 = 0
            goto L_0x0516
        L_0x04ed:
            r14 = 0
            goto L_0x0516
        L_0x04ef:
            kjj r2 = new kjj     // Catch:{ all -> 0x0532 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0532 }
            r4 = 93
            r3.<init>(r4)     // Catch:{ all -> 0x0532 }
            java.lang.String r4 = "Server did not receive the correct number of bytes."
            r3.append(r4)     // Catch:{ all -> 0x0532 }
            r3.append(r14)     // Catch:{ all -> 0x0532 }
            java.lang.String r4 = ", "
            r3.append(r4)     // Catch:{ all -> 0x0532 }
            r3.append(r8)     // Catch:{ all -> 0x0532 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0532 }
            r2.<init>(r3)     // Catch:{ all -> 0x0532 }
            throw r2     // Catch:{ all -> 0x0532 }
        L_0x0510:
            if (r13 == 0) goto L_0x0515
            r13.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x0515:
            r14 = r3
        L_0x0516:
            kjl r3 = r1.b     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            long r5 = r1.h     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            long r7 = r3.e     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r2.a(r5, r7)     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r3 = r31
            r11 = r17
            r8 = r21
            goto L_0x0202
        L_0x0527:
            if (r13 == 0) goto L_0x0535
            java.net.HttpURLConnection r2 = r13.a()     // Catch:{ all -> 0x0532 }
            kcx r15 = c(r2)     // Catch:{ all -> 0x0532 }
            goto L_0x0536
        L_0x0532:
            r0 = move-exception
            r2 = r0
            goto L_0x053e
        L_0x0535:
            r15 = 0
        L_0x0536:
            kjj r2 = new kjj     // Catch:{ all -> 0x0532 }
            java.lang.String r3 = "Failed to upload. Ran out of tries"
            r2.<init>(r3, r15)     // Catch:{ all -> 0x0532 }
            throw r2     // Catch:{ all -> 0x0532 }
        L_0x053e:
            r15 = r13
            goto L_0x0543
        L_0x0540:
            r0 = move-exception
            r2 = r0
            r15 = 0
        L_0x0543:
            if (r15 == 0) goto L_0x0548
            r15.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x0548:
            throw r2     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x0549:
            java.lang.InterruptedException r2 = new java.lang.InterruptedException     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            r2.<init>()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            throw r2     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x054f:
            r30.a()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            java.io.BufferedInputStream r2 = r1.i
            goto L_0x01fe
        L_0x0556:
            r0 = move-exception
            r2 = r0
            r7.close()     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
            throw r2     // Catch:{ lhp -> 0x0569, IOException -> 0x055f }
        L_0x055c:
            r0 = move-exception
            r2 = r0
            goto L_0x056c
        L_0x055f:
            r0 = move-exception
            r2 = r0
            kjj r3 = new kjj     // Catch:{ all -> 0x055c }
            java.lang.String r4 = "Upload exception"
            r3.<init>(r4, r2)     // Catch:{ all -> 0x055c }
            throw r3     // Catch:{ all -> 0x055c }
        L_0x0569:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x055c }
        L_0x056c:
            java.io.BufferedInputStream r3 = r1.i
            defpackage.jjt.a((java.io.Closeable) r3)
            goto L_0x0573
        L_0x0572:
            throw r2
        L_0x0573:
            goto L_0x0572
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjh.a(kjk, lic, com.google.android.gms.common.internal.ClientContext):lnj");
    }
}
