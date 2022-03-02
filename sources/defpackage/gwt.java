package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: gwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gwt implements Runnable {
    private static final iwd a = gzk.a("ClearcutEventLogUploadRunnable");
    private final DropBoxManager b;
    private final Map c;
    private final Map d;
    private final String e;
    private final hol f;
    private final Context g;
    private final SharedPreferences h;
    private final String i = awrq.f();
    private final boolean j;

    public gwt(Context context, DropBoxManager dropBoxManager, hol hol, boolean z) {
        boolean z2;
        this.g = context;
        this.b = dropBoxManager;
        ContentResolver contentResolver = context.getContentResolver();
        String g2 = awrq.g();
        Map a2 = gxo.a(aeeg.a(contentResolver, "checkin_dropbox_upload:"), "checkin_dropbox_upload:", z, g2);
        String f2 = awrq.f();
        if (f2 == null || !aeeg.c.matcher(f2).matches()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && !z && !TextUtils.isEmpty(g2)) {
            for (String str : amsk.a(',').a((CharSequence) g2)) {
                String valueOf = String.valueOf(str);
                if (!a2.containsKey(valueOf.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf))) {
                    String valueOf2 = String.valueOf(str);
                    a2.put(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2), "true");
                }
            }
        }
        if (z) {
            a2.put("checkin_dropbox_upload", String.valueOf(z2).toLowerCase(Locale.US));
        }
        this.c = anaf.a(a2);
        Map a3 = aeeg.a(context.getContentResolver(), "checkin_logging_policy:");
        anab h2 = anaf.h();
        for (Map.Entry entry : a3.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!str2.startsWith("checkin_logging_policy:")) {
                a.e("Unexpected logging policy: %s key.", str2);
            } else {
                h2.a(str2.replaceFirst("checkin_logging_policy:", ""), (String) entry.getValue());
            }
        }
        this.d = h2.a();
        this.e = aeeg.a(context.getContentResolver(), "checkin_logging_policy", "TAG_AND_VALUE");
        this.j = awrh.b();
        this.f = hol;
        this.h = context.getSharedPreferences("EventLogAggregator", 0);
    }

    private final long a() {
        return a(this.h, "clearcut_bookmark_shared_preference_key", gwk.l(this.g).getLong("CheckinTask_bookmark", 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021c, code lost:
        r2 = r0;
        r14 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0223, code lost:
        r23 = r4;
        r22 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024b, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02fb, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0477, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0478, code lost:
        r2 = r0;
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x047b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x021b A[ExcHandler: all (r0v20 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r15 
      PHI: (r15v18 android.os.DropBoxManager$Entry) = (r15v16 android.os.DropBoxManager$Entry), (r15v16 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry), (r15v20 android.os.DropBoxManager$Entry) binds: [B:3:0x0027, B:4:?, B:9:0x003a, B:42:0x00ab, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0277 A[SYNTHETIC, Splitter:B:123:0x0277] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a7 A[LOOP:4: B:142:0x02a7->B:163:0x02fe, LOOP_START, PHI: r3 r8 
      PHI: (r3v12 java.lang.String) = (r3v8 java.lang.String), (r3v39 java.lang.String) binds: [B:141:0x02a5, B:163:0x02fe] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v8 android.os.DropBoxManager$Entry) = (r8v7 android.os.DropBoxManager$Entry), (r8v11 android.os.DropBoxManager$Entry) binds: [B:141:0x02a5, B:163:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0477 A[ExcHandler: all (r0v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r8 
      PHI: (r8v6 android.os.DropBoxManager$Entry) = (r8v4 android.os.DropBoxManager$Entry), (r8v4 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry), (r8v8 android.os.DropBoxManager$Entry) binds: [B:138:0x029d, B:139:?, B:193:0x03d5, B:198:0x03ee, B:143:0x02a9] A[DONT_GENERATE, DONT_INLINE], Splitter:B:138:0x029d] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "Can't copy dropbox data"
            java.lang.String r3 = "event_log"
            android.content.Context r4 = r1.g
            java.lang.String r5 = "EventLogAggregator"
            r6 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)
            android.content.SharedPreferences r5 = r1.h
            long r7 = r24.a()
            java.lang.String r9 = "clearcut_event_log_bookmark_shared_preference_key"
            long r7 = a(r5, r9, r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13 = 2
            android.os.DropBoxManager r15 = r1.b     // Catch:{ IOException -> 0x0230, SecurityException -> 0x022e, all -> 0x0229 }
            android.os.DropBoxManager$Entry r15 = r15.getNextEntry(r3, r7)     // Catch:{ IOException -> 0x0230, SecurityException -> 0x022e, all -> 0x0229 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ IOException -> 0x0222, SecurityException -> 0x0220, all -> 0x021b }
            r14.<init>()     // Catch:{ IOException -> 0x0222, SecurityException -> 0x0220, all -> 0x021b }
            r16 = -1
            r20 = r16
            r18 = 0
            r19 = 0
        L_0x0034:
            if (r15 == 0) goto L_0x01e7
            r11 = r20
        L_0x0038:
            if (r15 == 0) goto L_0x010b
            int r6 = r14.size()     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            if (r6 < r13) goto L_0x004a
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x004a
            r23 = r4
            r22 = r9
            goto L_0x010f
        L_0x004a:
            if (r18 != 0) goto L_0x005f
            java.io.InputStream r6 = r15.getInputStream()     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            if (r6 == 0) goto L_0x005f
            java.io.BufferedReader r13 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            r10.<init>(r6)     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            r6 = 4096(0x1000, float:5.74E-42)
            r13.<init>(r10, r6)     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            goto L_0x0062
        L_0x005f:
            r13 = r18
        L_0x0062:
            r14.clear()     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            if (r13 == 0) goto L_0x00de
            boolean r6 = defpackage.ish.a((java.io.BufferedReader) r13, (java.util.List) r14)     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            if (r6 == 0) goto L_0x00d9
            int r6 = r14.size()     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            r10 = 4
            if (r6 >= r10) goto L_0x0083
            iwd r6 = a     // Catch:{ IOException -> 0x0104, SecurityException -> 0x0102, all -> 0x021b }
            java.lang.String r10 = "event_log tagname does not exist"
            r23 = r4
            r22 = r9
            r9 = 0
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.e(r10, r4)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            goto L_0x00e2
        L_0x0083:
            r23 = r4
            r22 = r9
            boolean r4 = r14.isEmpty()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r4 != 0) goto L_0x00d5
            r4 = 0
            java.lang.Object r6 = r14.get(r4)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00a9 }
            r4 = 46
            int r4 = r6.indexOf(r4)     // Catch:{ NumberFormatException -> 0x00a9 }
            r9 = -1
            if (r4 != r9) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            r9 = 0
            java.lang.String r6 = r6.substring(r9, r4)     // Catch:{ NumberFormatException -> 0x00a9 }
        L_0x00a3:
            long r9 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            r11 = r9
            goto L_0x00d6
        L_0x00a9:
            r0 = move-exception
            r4 = r0
            iwd r6 = a     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r9 = "Can't parse event_log timestamp: "
            r10 = 0
            java.lang.Object r11 = r14.get(r10)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r11 = r10.length()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r11 != 0) goto L_0x00c6
            java.lang.String r10 = new java.lang.String     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r10.<init>(r9)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x00ca:
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.e(r10, r4, r11)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r18 = r13
            r11 = r16
            goto L_0x00fa
        L_0x00d5:
        L_0x00d6:
            r18 = r13
            goto L_0x00fa
        L_0x00d9:
            r23 = r4
            r22 = r9
            goto L_0x00e2
        L_0x00de:
            r23 = r4
            r22 = r9
        L_0x00e2:
            long r9 = r15.getTimeMillis()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r13 != 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            r13.close()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x00ec:
            r15.close()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r14.clear()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            android.os.DropBoxManager r4 = r1.b     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            android.os.DropBoxManager$Entry r15 = r4.getNextEntry(r3, r9)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r18 = 0
        L_0x00fa:
            r9 = r22
            r4 = r23
            r6 = 0
            r13 = 2
            goto L_0x0038
        L_0x0102:
            r0 = move-exception
            goto L_0x0105
        L_0x0104:
            r0 = move-exception
        L_0x0105:
            r23 = r4
            r22 = r9
            goto L_0x0227
        L_0x010b:
            r23 = r4
            r22 = r9
        L_0x010f:
            if (r15 != 0) goto L_0x011b
            r20 = r11
            r9 = r22
            r4 = r23
            r6 = 0
            r13 = 2
            goto L_0x0034
        L_0x011b:
            hah r4 = defpackage.hah.e     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            aucd r4 = r4.o()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6 = 3
            java.lang.Object r6 = r14.get(r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            boolean r9 = r4.c     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r9 != 0) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            r4.c()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9 = 0
            r4.c = r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x0133:
            aucj r9 = r4.b     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            hah r9 = (defpackage.hah) r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.getClass()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r10 = r9.a     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r13 = 1
            r10 = r10 | r13
            r9.a = r10     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9.b = r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6 = r10 | 4
            r9.a = r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9.d = r11     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r6 = r14.size()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9 = 5
            if (r6 != r9) goto L_0x0171
            r6 = 4
            java.lang.Object r9 = r14.get(r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            boolean r6 = r4.c     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r6 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            r4.c()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6 = 0
            r4.c = r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x0161:
            aucj r6 = r4.b     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            hah r6 = (defpackage.hah) r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9.getClass()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r10 = r6.a     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r13 = 2
            r10 = r10 | r13
            r6.a = r10     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.c = r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            goto L_0x01bb
        L_0x0171:
            int r6 = r14.size()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r6 <= r9) goto L_0x01bb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.<init>()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r10 = 4
            java.lang.Object r13 = r14.get(r10)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            defpackage.ish.a((java.lang.String) r13, (java.lang.Appendable) r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x0186:
            int r10 = r14.size()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r9 >= r10) goto L_0x019d
            r10 = 44
            r6.append(r10)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.Object r10 = r14.get(r9)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            defpackage.ish.a((java.lang.String) r10, (java.lang.Appendable) r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r9 = r9 + 1
            goto L_0x0186
        L_0x019d:
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            boolean r9 = r4.c     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r9 != 0) goto L_0x01a6
            goto L_0x01ac
        L_0x01a6:
            r4.c()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9 = 0
            r4.c = r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x01ac:
            aucj r9 = r4.b     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            hah r9 = (defpackage.hah) r9     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r6.getClass()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            int r10 = r9.a     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r13 = 2
            r10 = r10 | r13
            r9.a = r10     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r9.c = r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x01bb:
            aucj r6 = r4.i()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            hah r6 = (defpackage.hah) r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            amri r6 = r1.a((defpackage.hah) r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            boolean r9 = r6.a()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            if (r9 == 0) goto L_0x01d4
            java.lang.Object r6 = r6.b()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            hah r6 = (defpackage.hah) r6     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r5.add(r6)     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
        L_0x01d4:
            r14.clear()     // Catch:{ IOException -> 0x01e5, SecurityException -> 0x01e3, all -> 0x021b }
            r19 = r4
            r20 = r11
            r9 = r22
            r4 = r23
            r6 = 0
            r13 = 2
            goto L_0x0034
        L_0x01e3:
            r0 = move-exception
            goto L_0x0227
        L_0x01e5:
            r0 = move-exception
            goto L_0x0227
        L_0x01e7:
            r23 = r4
            r22 = r9
            if (r18 == 0) goto L_0x01fb
            r18.close()     // Catch:{ IOException -> 0x01f8, SecurityException -> 0x01f6, all -> 0x01f1 }
            goto L_0x01fb
        L_0x01f1:
            r0 = move-exception
            r2 = r0
            r14 = r15
            goto L_0x04c9
        L_0x01f6:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f8:
            r0 = move-exception
        L_0x01f9:
            r4 = r0
            goto L_0x0237
        L_0x01fb:
            if (r15 != 0) goto L_0x01fe
            goto L_0x0201
        L_0x01fe:
            r15.close()
        L_0x0201:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x020d
            gws r4 = new gws
            r4.<init>(r7, r5)
            goto L_0x024e
        L_0x020d:
            gws r4 = new gws
            r6 = r19
            aucj r6 = r6.b
            hah r6 = (defpackage.hah) r6
            long r6 = r6.d
            r4.<init>(r6, r5)
            goto L_0x024e
        L_0x021b:
            r0 = move-exception
            r2 = r0
            r14 = r15
            goto L_0x04c9
        L_0x0220:
            r0 = move-exception
            goto L_0x0223
        L_0x0222:
            r0 = move-exception
        L_0x0223:
            r23 = r4
            r22 = r9
        L_0x0227:
            r4 = r0
            goto L_0x0237
        L_0x0229:
            r0 = move-exception
            r2 = r0
            r14 = 0
            goto L_0x04c9
        L_0x022e:
            r0 = move-exception
            goto L_0x0231
        L_0x0230:
            r0 = move-exception
        L_0x0231:
            r23 = r4
            r22 = r9
            r4 = r0
            r15 = 0
        L_0x0237:
            iwd r5 = a     // Catch:{ all -> 0x04c6 }
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x04c6 }
            r5.e(r2, r4, r9)     // Catch:{ all -> 0x04c6 }
            gws r4 = new gws     // Catch:{ all -> 0x04c6 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x04c6 }
            r5.<init>()     // Catch:{ all -> 0x04c6 }
            r4.<init>(r7, r5)     // Catch:{ all -> 0x04c6 }
            if (r15 == 0) goto L_0x024e
            r15.close()
        L_0x024e:
            java.util.List r5 = r4.b
            r1.a((java.util.List) r5)
            android.content.SharedPreferences$Editor r5 = r23.edit()
            long r6 = r4.a
            r4 = r22
            android.content.SharedPreferences$Editor r4 = r5.putLong(r4, r6)
            r4.apply()
            android.content.SharedPreferences r4 = r1.h
            long r5 = r24.a()
            java.lang.String r7 = "clearcut_non_event_log_bookmark_shared_preference_key"
            long r4 = a(r4, r7, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r8 = r1.i     // Catch:{ IOException -> 0x0490, SecurityException -> 0x048e, all -> 0x0489 }
            if (r8 == 0) goto L_0x0293
            java.util.regex.Pattern r8 = defpackage.aeeg.c     // Catch:{ IOException -> 0x028e, SecurityException -> 0x028c, all -> 0x0287 }
            java.lang.String r9 = r1.i     // Catch:{ IOException -> 0x028e, SecurityException -> 0x028c, all -> 0x0287 }
            java.util.regex.Matcher r8 = r8.matcher(r9)     // Catch:{ IOException -> 0x028e, SecurityException -> 0x028c, all -> 0x0287 }
            boolean r8 = r8.matches()     // Catch:{ IOException -> 0x028e, SecurityException -> 0x028c, all -> 0x0287 }
            if (r8 == 0) goto L_0x0293
            r9 = 1
            goto L_0x0294
        L_0x0287:
            r0 = move-exception
            r2 = r0
            r9 = 0
            goto L_0x048c
        L_0x028c:
            r0 = move-exception
            goto L_0x028f
        L_0x028e:
            r0 = move-exception
        L_0x028f:
            r3 = r0
            r9 = 0
            goto L_0x0493
        L_0x0293:
            r9 = 0
        L_0x0294:
            android.os.DropBoxManager r8 = r1.b     // Catch:{ IOException -> 0x0490, SecurityException -> 0x048e, all -> 0x0489 }
            r10 = 0
            android.os.DropBoxManager$Entry r8 = r8.getNextEntry(r10, r4)     // Catch:{ IOException -> 0x0486, SecurityException -> 0x0484, all -> 0x0481 }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x047d, SecurityException -> 0x047b, all -> 0x0477 }
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x047d, SecurityException -> 0x047b, all -> 0x0477 }
            r11.<init>()     // Catch:{ IOException -> 0x047d, SecurityException -> 0x047b, all -> 0x0477 }
            r12 = 0
        L_0x02a5:
            if (r8 == 0) goto L_0x0459
        L_0x02a7:
            if (r8 == 0) goto L_0x0317
            java.lang.String r13 = r8.getTag()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r14 = r13.equals(r3)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r14 == 0) goto L_0x02bc
            int r14 = r8.getFlags()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r15 = 1
            r14 = r14 & r15
            if (r14 != 0) goto L_0x02bc
            goto L_0x02fe
        L_0x02bc:
            java.lang.String r14 = "checkin_dropbox_upload:"
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r15 = r13.length()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r15 != 0) goto L_0x02ce
            java.lang.String r13 = new java.lang.String     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r13.<init>(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            goto L_0x02d2
        L_0x02ce:
            java.lang.String r13 = r14.concat(r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x02d2:
            java.util.Map r14 = r1.c     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.Object r13 = r14.get(r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r13 == 0) goto L_0x02e8
            java.util.regex.Pattern r14 = defpackage.aeeg.c     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.util.regex.Matcher r14 = r14.matcher(r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r14 = r14.matches()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r14 != 0) goto L_0x02fb
        L_0x02e8:
            if (r9 == 0) goto L_0x02fe
            if (r13 == 0) goto L_0x02fb
            java.util.regex.Pattern r14 = defpackage.aeeg.d     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.util.regex.Matcher r13 = r14.matcher(r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r13 = r13.matches()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r13 != 0) goto L_0x02fe
            r16 = r3
            goto L_0x0319
        L_0x02fb:
            r16 = r3
            goto L_0x0319
        L_0x02fe:
            long r13 = r8.getTimeMillis()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r8.close()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            android.os.DropBoxManager r15 = r1.b     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r16 = r3
            r3 = 0
            android.os.DropBoxManager$Entry r8 = r15.getNextEntry(r3, r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3 = r16
            goto L_0x02a7
        L_0x0311:
            r0 = move-exception
            goto L_0x047e
        L_0x0314:
            r0 = move-exception
            goto L_0x047e
        L_0x0317:
            r16 = r3
        L_0x0319:
            if (r8 == 0) goto L_0x044e
            hah r3 = defpackage.hah.e     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            aucd r12 = r3.o()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r3 = r8.getTag()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r13 = r12.c     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r13 != 0) goto L_0x032a
            goto L_0x0330
        L_0x032a:
            r12.c()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r13 = 0
            r12.c = r13     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x0330:
            aucj r13 = r12.b     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            hah r13 = (defpackage.hah) r13     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3.getClass()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r14 = r13.a     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r15 = 1
            r14 = r14 | r15
            r13.a = r14     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r13.b = r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            long r13 = r8.getTimeMillis()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r3 = r12.c     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r3 != 0) goto L_0x0348
            goto L_0x034e
        L_0x0348:
            r12.c()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3 = 0
            r12.c = r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x034e:
            aucj r3 = r12.b     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r15 = r3.a     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r17 = 4
            r15 = r15 | 4
            r3.a = r15     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3.d = r13     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r11.reset()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.io.InputStream r3 = r8.getInputStream()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x0363:
            if (r3 == 0) goto L_0x03cd
            int r13 = r3.read(r10)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r13 <= 0) goto L_0x03ca
            int r14 = r11.size()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r15 = 196608(0x30000, float:2.75506E-40)
            int r14 = r15 - r14
            int r14 = java.lang.Math.min(r14, r13)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r15 = 0
            r11.write(r10, r15, r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r14 >= r13) goto L_0x03c7
            iwd r13 = a     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r14 = r8.getTag()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r15 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r15 = r15.length()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r19 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r15 = r15 + 49
            r9.<init>(r15)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r15 = "Truncating "
            r9.append(r15)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r9.append(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r14 = " entry to "
            r9.append(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r14 = 196608(0x30000, float:2.75506E-40)
            r9.append(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r14 = " bytes for upload"
            r9.append(r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r13.d(r9, r15)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r9 = r8.getFlags()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r13 = 2
            r9 = r9 & r13
            if (r9 == 0) goto L_0x03cf
            java.lang.String r9 = "\n=== TRUNCATED FOR UPLOAD ===\n"
            byte[] r9 = r9.getBytes()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r11.write(r9)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            goto L_0x03cf
        L_0x03c7:
            r19 = r9
            goto L_0x0363
        L_0x03ca:
            r19 = r9
            goto L_0x03cf
        L_0x03cd:
            r19 = r9
        L_0x03cf:
            if (r3 != 0) goto L_0x03d2
            goto L_0x03d5
        L_0x03d2:
            r3.close()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x03d5:
            byte[] r3 = r11.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            int r3 = r3.length     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            if (r3 <= 0) goto L_0x03ec
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            byte[] r9 = r11.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            java.lang.String r13 = "ISO-8859-1"
            r3.<init>(r9, r13)     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            amri r3 = defpackage.amri.b(r3)     // Catch:{ UnsupportedEncodingException -> 0x0444 }
            goto L_0x03ee
        L_0x03ec:
            ampu r3 = defpackage.ampu.a     // Catch:{ UnsupportedEncodingException -> 0x0444 }
        L_0x03ee:
            boolean r9 = r3.a()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r9 != 0) goto L_0x03f6
            r14 = 2
            goto L_0x0416
        L_0x03f6:
            java.lang.Object r3 = r3.b()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r9 = r12.c     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r9 != 0) goto L_0x0401
            goto L_0x0407
        L_0x0401:
            r12.c()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r9 = 0
            r12.c = r9     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x0407:
            aucj r9 = r12.b     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            hah r9 = (defpackage.hah) r9     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3.getClass()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            int r13 = r9.a     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r14 = 2
            r13 = r13 | r14
            r9.a = r13     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r9.c = r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x0416:
            aucj r3 = r12.i()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            amri r3 = r1.a((defpackage.hah) r3)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            boolean r9 = r3.a()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            if (r9 != 0) goto L_0x0427
            goto L_0x0430
        L_0x0427:
            java.lang.Object r3 = r3.b()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r6.add(r3)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x0430:
            long r14 = r8.getTimeMillis()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r8.close()     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            android.os.DropBoxManager r3 = r1.b     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r9 = 0
            android.os.DropBoxManager$Entry r8 = r3.getNextEntry(r9, r14)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            r3 = r16
            r9 = r19
            goto L_0x02a5
        L_0x0444:
            r0 = move-exception
            r3 = r0
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            java.lang.String r9 = "ISO-8859-1 not supported?"
            r6.<init>(r9, r3)     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
            throw r6     // Catch:{ IOException -> 0x0314, SecurityException -> 0x0311, all -> 0x0477 }
        L_0x044e:
            r19 = r9
            r9 = 0
            r17 = 4
            r3 = r16
            r9 = r19
            goto L_0x02a5
        L_0x0459:
            if (r8 != 0) goto L_0x045c
            goto L_0x045f
        L_0x045c:
            r8.close()
        L_0x045f:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x046b
            gws r2 = new gws
            r2.<init>(r4, r6)
            goto L_0x04ab
        L_0x046b:
            gws r2 = new gws
            aucj r3 = r12.b
            hah r3 = (defpackage.hah) r3
            long r3 = r3.d
            r2.<init>(r3, r6)
            goto L_0x04ab
        L_0x0477:
            r0 = move-exception
            r2 = r0
            r14 = r8
            goto L_0x04c0
        L_0x047b:
            r0 = move-exception
            goto L_0x047e
        L_0x047d:
            r0 = move-exception
        L_0x047e:
            r3 = r0
            r14 = r8
            goto L_0x0494
        L_0x0481:
            r0 = move-exception
            r9 = r10
            goto L_0x048b
        L_0x0484:
            r0 = move-exception
            goto L_0x0487
        L_0x0486:
            r0 = move-exception
        L_0x0487:
            r9 = r10
            goto L_0x0492
        L_0x0489:
            r0 = move-exception
            r9 = 0
        L_0x048b:
            r2 = r0
        L_0x048c:
            r14 = r9
            goto L_0x04c0
        L_0x048e:
            r0 = move-exception
            goto L_0x0491
        L_0x0490:
            r0 = move-exception
        L_0x0491:
            r9 = 0
        L_0x0492:
            r3 = r0
        L_0x0493:
            r14 = r9
        L_0x0494:
            iwd r6 = a     // Catch:{ all -> 0x04be }
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x04be }
            r6.e(r2, r3, r8)     // Catch:{ all -> 0x04be }
            gws r2 = new gws     // Catch:{ all -> 0x04be }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x04be }
            r3.<init>()     // Catch:{ all -> 0x04be }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x04be }
            if (r14 == 0) goto L_0x04ab
            r14.close()
        L_0x04ab:
            java.util.List r3 = r2.b
            r1.a((java.util.List) r3)
            android.content.SharedPreferences$Editor r3 = r23.edit()
            long r4 = r2.a
            android.content.SharedPreferences$Editor r2 = r3.putLong(r7, r4)
            r2.apply()
            return
        L_0x04be:
            r0 = move-exception
            r2 = r0
        L_0x04c0:
            if (r14 == 0) goto L_0x04c5
            r14.close()
        L_0x04c5:
            throw r2
        L_0x04c6:
            r0 = move-exception
            r2 = r0
            r14 = r15
        L_0x04c9:
            if (r14 == 0) goto L_0x04ce
            r14.close()
        L_0x04ce:
            goto L_0x04d0
        L_0x04cf:
            throw r2
        L_0x04d0:
            goto L_0x04cf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwt.run():void");
    }

    private static long a(SharedPreferences sharedPreferences, String str, long j2) {
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (ClassCastException | NumberFormatException e2) {
            a.e(str.length() == 0 ? new String("Non-long value in sharedPrefs. key: ") : "Non-long value in sharedPrefs. key: ".concat(str), new Object[0]);
            return j2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.amri a(defpackage.hah r11) {
        /*
            r10 = this;
            awrh r0 = defpackage.awrh.a
            awri r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = r11.b
            java.util.Map r1 = r10.d
            boolean r1 = r1.containsKey(r0)
            r2 = 2
            r3 = 5
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0028
            java.util.Map r1 = r10.d
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            amri r0 = defpackage.amri.b(r0)
            goto L_0x0098
        L_0x0028:
            java.lang.String r1 = "event_data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r11.c
            java.lang.String r1 = "\\r?\\n"
            java.lang.String[] r0 = r0.split(r1, r3)
            ampu r1 = defpackage.ampu.a
            int r6 = r0.length
            r7 = 4
            if (r6 < r7) goto L_0x007b
            r8 = r0[r5]
            java.lang.String r9 = "start="
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x007b
            r8 = r0[r4]
            java.lang.String r9 = "end="
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x007b
            r8 = r0[r2]
            java.lang.String r9 = "log_start="
            boolean r8 = r8.startsWith(r9)
            if (r8 != 0) goto L_0x0061
            r6 = 3
            r0 = r0[r6]
            goto L_0x0067
        L_0x0061:
            if (r6 < r3) goto L_0x0066
            r0 = r0[r7]
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 == 0) goto L_0x007a
            java.lang.String r6 = ","
            int r6 = r0.indexOf(r6)
            if (r6 <= 0) goto L_0x007a
            java.lang.String r0 = r0.substring(r5, r6)
            amri r1 = defpackage.amri.b(r0)
            goto L_0x007c
        L_0x007a:
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            boolean r0 = r1.a()
            if (r0 == 0) goto L_0x0093
            java.util.Map r0 = r10.d
            java.lang.Object r1 = r1.b()
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            amri r0 = defpackage.amri.c(r0)
            goto L_0x0098
        L_0x0093:
            ampu r0 = defpackage.ampu.a
            goto L_0x0098
        L_0x0096:
            ampu r0 = defpackage.ampu.a
        L_0x0098:
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r0 = r10.e
        L_0x00a7:
            int r1 = r0.hashCode()
            r6 = 82810(0x1437a, float:1.16042E-40)
            if (r1 == r6) goto L_0x00cf
            r6 = 2402104(0x24a738, float:3.366065E-39)
            if (r1 == r6) goto L_0x00c5
            r6 = 702693956(0x29e24244, float:1.00479114E-13)
            if (r1 == r6) goto L_0x00bb
            goto L_0x00d9
        L_0x00bb:
            java.lang.String r1 = "TAG_AND_VALUE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d9
            r1 = 0
            goto L_0x00da
        L_0x00c5:
            java.lang.String r1 = "NONE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d9
            r1 = 2
            goto L_0x00da
        L_0x00cf:
            java.lang.String r1 = "TAG"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00d9
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = -1
        L_0x00da:
            if (r1 == 0) goto L_0x0121
            if (r1 == r4) goto L_0x00f1
            if (r1 == r2) goto L_0x00ee
            iwd r11 = a
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r0
            java.lang.String r0 = "Unexpected logging policy: %s"
            r11.e(r0, r1)
            ampu r11 = defpackage.ampu.a
            return r11
        L_0x00ee:
            ampu r11 = defpackage.ampu.a
            return r11
        L_0x00f1:
            java.lang.Object r0 = r11.c(r3)
            aucd r0 = (defpackage.aucd) r0
            r0.a((defpackage.aucj) r11)
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            r0.c()
            r0.c = r5
        L_0x0104:
            aucj r11 = r0.b
            hah r11 = (defpackage.hah) r11
            hah r1 = defpackage.hah.e
            int r1 = r11.a
            r1 = r1 & -3
            r11.a = r1
            hah r1 = defpackage.hah.e
            java.lang.String r1 = r1.c
            r11.c = r1
            aucj r11 = r0.i()
            hah r11 = (defpackage.hah) r11
            amri r11 = defpackage.amri.b(r11)
            return r11
        L_0x0121:
            amri r11 = defpackage.amri.b(r11)
            return r11
        L_0x0126:
            amri r11 = defpackage.amri.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwt.a(hah):amri");
    }

    private final void a(List list) {
        gzi gzi = new gzi(this.f, gwk.l(this.g));
        long size = (long) list.size();
        if (size > 0 && this.j) {
            a.b("Clearcut logging start.", new Object[0]);
            aucd o = hah.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            hah hah = (hah) o.b;
            "clearcut_checkin_event_log_diagnosis".getClass();
            int i2 = hah.a | 1;
            hah.a = i2;
            hah.b = "clearcut_checkin_event_log_diagnosis";
            "clearcut_logging_start".getClass();
            hah.a = i2 | 2;
            hah.c = "clearcut_logging_start";
            long currentTimeMillis = System.currentTimeMillis();
            if (o.c) {
                o.c();
                o.c = false;
            }
            hah hah2 = (hah) o.b;
            hah2.a |= 4;
            hah2.d = currentTimeMillis;
            gzi.a((hah) o.i());
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            gzi.a((hah) list.get(i3));
        }
        if (size > 0 && awrh.b()) {
            iwd iwd = a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Clearcut log lines: ");
            sb.append(size);
            iwd.b(sb.toString(), new Object[0]);
            aucd o2 = hah.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            hah hah3 = (hah) o2.b;
            "clearcut_checkin_event_log_diagnosis".getClass();
            hah3.a |= 1;
            hah3.b = "clearcut_checkin_event_log_diagnosis";
            String valueOf = String.valueOf(size);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            hah hah4 = (hah) o2.b;
            valueOf.getClass();
            hah4.a |= 2;
            hah4.c = valueOf;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            hah hah5 = (hah) o2.b;
            hah5.a |= 4;
            hah5.d = currentTimeMillis2;
            gzi.a((hah) o2.i());
        }
    }
}
