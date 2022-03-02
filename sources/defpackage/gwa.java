package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

/* renamed from: gwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwa {
    public static final iwd a = gzk.a("CheckinRequestProcessor");
    private final gvv b;
    private final amri c;
    private final Context d;
    private boolean e = false;
    private int f = 0;
    private final ArrayList g = new ArrayList();

    public gwa(Context context, gvv gvv) {
        this.d = context;
        this.b = gvv;
        this.c = ampu.a;
    }

    private static long a(long j, gwr gwr, aucd aucd) {
        long j2;
        boolean z;
        ContentResolver contentResolver = gwr.m.getContentResolver();
        ArrayList arrayList = new ArrayList();
        boolean z2 = gwr.h;
        if (gwr.a == null || !gwr.n || !awrh.a.a().d()) {
            j2 = j;
        } else {
            String g2 = awrq.g();
            Map a2 = gxo.a(aeeg.a(contentResolver, "checkin_dropbox_upload:"), "checkin_dropbox_upload:", z2, g2);
            String f2 = awrq.f();
            if (f2 == null || !aeeg.c.matcher(f2).matches()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !z2 && !TextUtils.isEmpty(g2)) {
                for (String str : amsk.a(',').a((CharSequence) g2)) {
                    String valueOf = String.valueOf(str);
                    if (!a2.containsKey(valueOf.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf))) {
                        String valueOf2 = String.valueOf(str);
                        a2.put(valueOf2.length() == 0 ? new String("checkin_dropbox_upload:") : "checkin_dropbox_upload:".concat(valueOf2), "true");
                    }
                }
            }
            if (z2) {
                a2.put("checkin_dropbox_upload", String.valueOf(z).toLowerCase(Locale.US));
            }
            j2 = gvu.a(gwr.a, a2, j, aucd);
        }
        if (!gwr.d) {
            arrayList.add(0, 5);
            arrayList.add(1, Long.valueOf(j));
            arrayList.add(2, Long.valueOf(j2));
            gwd.a(arrayList.toArray());
        }
        return j2;
    }

    private static void b(gwr gwr) {
        if (gwr.i) {
            izj.a();
        }
    }

    public static void b(gwr gwr, amsn amsn) {
        if (gwr.d) {
            return;
        }
        if (!amsn.a) {
            a.e("Trying to stop stopwatch that is not running", new Object[0]);
        } else {
            amsn.e();
        }
    }

    public gwa(Context context, gvv gvv, gvy gvy) {
        this.d = context;
        this.b = gvv;
        this.c = amri.b(gvy);
    }

    /* JADX INFO: finally extract failed */
    static gzs a(gwr gwr, HttpURLConnection httpURLConnection, int i) {
        String responseMessage = httpURLConnection.getResponseMessage();
        if (i != 200) {
            a(httpURLConnection);
            String valueOf = String.valueOf(responseMessage);
            throw new IOException(valueOf.length() == 0 ? new String("Rejected response from server: ") : "Rejected response from server: ".concat(valueOf));
        }
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            throw new IOException("No Content-Type header");
        } else if (!contentType.startsWith("application/x-protobuffer")) {
            throw new IOException(contentType.length() == 0 ? new String("Bad Content-Type: ") : "Bad Content-Type: ".concat(contentType));
        } else {
            InputStream inputStream = httpURLConnection.getInputStream();
            String contentEncoding = httpURLConnection.getContentEncoding();
            if (contentEncoding != null && contentEncoding.contains("gzip")) {
                inputStream = new GZIPInputStream(inputStream);
            }
            gzs gzs = gzs.l;
            try {
                gzs gzs2 = (gzs) aucj.a((aucj) gzs.l, inputStream, aubs.c());
                inputStream.close();
                if ((gzs2.a & 1) != 0 && gzs2.b) {
                    return gzs2;
                }
                throw new IOException("Server refused checkin");
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    public static List a(Context context) {
        qub a2 = qub.a(context);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, a2.a("com.google.work"));
        Collections.addAll(arrayList, a2.a("com.google"));
        if (jix.a(context)) {
            arrayList.addAll(jgu.c(context, context.getPackageName(), "cn.google"));
        }
        return arrayList;
    }

    public static void a(gwr gwr, amsn amsn) {
        if (!gwr.d) {
            if (amsn.a) {
                a.e("Trying to onFragmentStart already running stopwatch", new Object[0]);
            }
            amsn.d();
        }
    }

    private static void a(gwr gwr, boolean z, int i, boolean z2, boolean z3) {
        if (!gwr.d) {
            int i2 = !z ? 7 : 23;
            if (z2) {
                i2 |= 32;
            }
            int i3 = i2 | ((i & 15) << 6);
            if (z3) {
                i3 |= 1024;
            }
            gwd.a(i3);
        }
    }

    private static void a(String str, anab anab, gwr gwr, amsn amsn) {
        amsn.a(TimeUnit.MILLISECONDS);
        if (!amsn.a) {
            a.e("Trying to restart stopwatch that is not running.", new Object[0]);
        }
        amsn.c();
        amsn.d();
        if (!gwr.d) {
            anab.a(str, Long.valueOf(amsn.a(TimeUnit.MILLISECONDS)));
        }
    }

    static void a(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            try {
                Long.parseLong(headerField);
                a.d("Got Retry-After: %s", headerField);
            } catch (NumberFormatException e2) {
                a.e("Can't parse Retry-After: %s", headerField);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:225:0x057f, code lost:
        if (r6.c != false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0582, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0588, code lost:
        r6 = (defpackage.gzb) r6.b;
        r9 = (defpackage.gza) r14.i();
        r9.getClass();
        r6.b = r9;
        r6.a |= 1;
        r6 = new defpackage.gvz(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        b(r49);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r8.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05ab, code lost:
        r3 = r0;
        r12 = r25;
        r6 = r32;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0757, code lost:
        r37 = r3;
        r34 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        r8.b();
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x075f, code lost:
        defpackage.gwd.a("CheckinTask:ReceivedResponse", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0775, code lost:
        if (r6 == null) goto L_0x0c0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0777, code lost:
        r3 = r6.a;
        r4 = r6.b;
        a("send_request", r7, r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0780, code lost:
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0782, code lost:
        if (r12 == null) goto L_0x08e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r5 = r12.d.size();
        r6 = r3.d.size();
        r9 = 0;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0792, code lost:
        if (r9 >= r5) goto L_0x07dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0794, code lost:
        r14 = (defpackage.haj) r12.d.get(r9);
        r15 = r14.b;
        r21 = r4;
        r4 = 0;
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07a3, code lost:
        if (r4 < r6) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07a5, code lost:
        if (r25 == false) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07a7, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07aa, code lost:
        if (r10 != null) goto L_0x07b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07ac, code lost:
        r10 = new java.util.ArrayList(r3.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07b3, code lost:
        r10.add(r14);
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07b9, code lost:
        if (r25 != false) goto L_0x07d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07bb, code lost:
        r4 = r4 + 1;
        r25 = r15.equals(((defpackage.haj) r3.d.get(r4)).b);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07d4, code lost:
        r25 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07d6, code lost:
        r9 = r9 + 1;
        r4 = r21;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07dd, code lost:
        r21 = r4;
        r5 = (defpackage.aucd) r3.c(5);
        r5.a((defpackage.aucj) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07e9, code lost:
        if (r10 == null) goto L_0x0827;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07ed, code lost:
        if (r5.c != false) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07f0, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07f7, code lost:
        r9 = defpackage.gzs.l;
        ((defpackage.gzs) r5.b).d = defpackage.aucj.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0805, code lost:
        if (r5.c != false) goto L_0x0808;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0808, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x080e, code lost:
        r6 = (defpackage.gzs) r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0818, code lost:
        if (r6.d.a() != false) goto L_0x0822;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x081a, code lost:
        r6.d = defpackage.aucj.a(r6.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0822, code lost:
        defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r6.d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x082b, code lost:
        if ((r12.a & 128) == 0) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0835, code lost:
        if ((((defpackage.gzs) r5.b).a & 128) != 0) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0837, code lost:
        r6 = r12.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x083b, code lost:
        if (r5.c != false) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x083e, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0844, code lost:
        r9 = (defpackage.gzs) r5.b;
        r10 = defpackage.gzs.l;
        r6.getClass();
        r9.a |= 128;
        r9.i = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0859, code lost:
        if ((r12.a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x0884;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0863, code lost:
        if ((((defpackage.gzs) r5.b).a & com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) goto L_0x0866;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0866, code lost:
        r6 = r12.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x086a, code lost:
        if (r5.c != false) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x086d, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0873, code lost:
        r9 = (defpackage.gzs) r5.b;
        r10 = defpackage.gzs.l;
        r6.getClass();
        r9.a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r9.j = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x088a, code lost:
        if (r12.k.size() <= 0) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0896, code lost:
        if (((defpackage.gzs) r5.b).k.size() == 0) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x089b, code lost:
        if (r5.c != false) goto L_0x089e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x089e, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x08a4, code lost:
        r9 = defpackage.gzs.l;
        ((defpackage.gzs) r5.b).k = defpackage.aucj.s();
        r6 = r12.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x08b4, code lost:
        if (r5.c != false) goto L_0x08b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08b7, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x08bd, code lost:
        r9 = (defpackage.gzs) r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08c7, code lost:
        if (r9.k.a() != false) goto L_0x08d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08c9, code lost:
        r9.k = defpackage.aucj.a(r9.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x08d1, code lost:
        defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r9.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08dc, code lost:
        r25 = (defpackage.gzs) r5.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x08df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x08e0, code lost:
        r3 = r0;
        r6 = r32;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x08e5, code lost:
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x08e9, code lost:
        r21 = r4;
        r25 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x08f0, code lost:
        if (r2.n == false) goto L_0x090b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:?, code lost:
        r5 = r2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08f4, code lost:
        if (r5 == null) goto L_0x090b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08f6, code lost:
        r5 = r5.edit();
        r6 = r29;
        r9 = r34;
        r5.putLong(r6, r9);
        r5.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0905, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0906, code lost:
        r3 = r0;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x090b, code lost:
        r6 = r29;
        r9 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        a("combine_responses", r7, r2, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0914, code lost:
        if (r3 != null) goto L_0x0922;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0916, code lost:
        r29 = r6;
        r34 = r9;
        r5 = r33;
        r33 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0928, code lost:
        if ((r3.a & 64) == 0) goto L_0x09e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        r14 = r3.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0930, code lost:
        if (r14 != 0) goto L_0x093a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0932, code lost:
        r29 = r6;
        r34 = r9;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x093a, code lost:
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:?, code lost:
        defpackage.gwk.a(r5, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0943, code lost:
        if (defpackage.awrq.h() == false) goto L_0x09db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0949, code lost:
        if ((r3.a & 8) == 0) goto L_0x09a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x094b, code lost:
        r14 = r3.g.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0955, code lost:
        if (r14.hasNext() == false) goto L_0x09a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0957, code lost:
        r15 = (defpackage.gzu) r14.next();
        r4 = r15.a.l();
        r15 = r15.b.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x096d, code lost:
        if ("android_id".equals(r4) == false) goto L_0x09a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:?, code lost:
        r14 = java.lang.Long.parseLong(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0973, code lost:
        r29 = r6;
        r34 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r29 = r6;
        r34 = r9;
        a.d("NumberFormatException while parsing AID from response", new java.lang.Object[0]);
        r6 = java.lang.String.valueOf(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0991, code lost:
        if (r6.length() == 0) goto L_0x0993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0993, code lost:
        r6 = new java.lang.String("NumberFormatException parsing AID from response:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0999, code lost:
        r6 = "NumberFormatException parsing AID from response:".concat(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x099d, code lost:
        defpackage.gwd.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x09a1, code lost:
        r29 = r6;
        r34 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x09a7, code lost:
        r29 = r6;
        r34 = r9;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x09b1, code lost:
        if (r14 != 0) goto L_0x09c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x09b3, code lost:
        a.c("updateCheckinIdTokenFileFromResponse, Reading existing AID", new java.lang.Object[0]);
        r14 = defpackage.gwk.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x09c7, code lost:
        if ((r3.a & 64) == 0) goto L_0x09d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x09c9, code lost:
        r9 = r3.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x09cf, code lost:
        if (r9 != 0) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x09d3, code lost:
        r9 = defpackage.gwd.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x09d7, code lost:
        defpackage.gwk.a(r5, r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x09db, code lost:
        r29 = r6;
        r34 = r9;
        defpackage.gwk.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09e3, code lost:
        r29 = r6;
        r34 = r9;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09e9, code lost:
        r4 = r5.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x09ef, code lost:
        if (r4 != null) goto L_0x09f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:?, code lost:
        r9 = new android.content.ContentValues();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x09fa, code lost:
        if ((r3.a & 8) != 0) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09fc, code lost:
        r10 = r3.g.iterator();
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0a07, code lost:
        if (r10.hasNext() != false) goto L_0x0a09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:?, code lost:
        r15 = (defpackage.gzu) r10.next();
        r26 = r10;
        r10 = r15.a.l();
        r15 = r15.b.l();
        r9.put(r10, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0a24, code lost:
        if ("android_id".equals(r10) != false) goto L_0x0a26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a26, code lost:
        defpackage.gwk.a(r5, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a29, code lost:
        r10 = r26;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a2d, code lost:
        r10 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a30, code lost:
        if (r14 == false) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:?, code lost:
        r14 = defpackage.gwk.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a3b, code lost:
        if (r14 != 0) goto L_0x0a3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:?, code lost:
        defpackage.gwk.a(r5, java.lang.Long.toString(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a4a, code lost:
        if (r3.e == false) goto L_0x0a4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:?, code lost:
        r10 = r9.size();
        r12 = new java.lang.StringBuilder(41);
        r12.append("From server: ");
        r12.append(r10);
        r12.append(" gservices [full]");
        android.util.Log.i("CheckinResponseProcess", r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:?, code lost:
        r4.update(defpackage.jnl.a, r9, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a6f, code lost:
        r33 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a73, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:?, code lost:
        r1 = r0.getMessage();
        r10 = r5.getPackageName();
        r33 = r11;
        r11 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 60) + java.lang.String.valueOf(r10).length());
        r11.append("Caught exception updating gservices MAIN: ");
        r11.append(r1);
        r11.append(" Context package: ");
        r11.append(r10);
        android.util.Log.w("CheckinResponseProcess", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0aae, code lost:
        r33 = r11;
        r1 = r3.f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0aba, code lost:
        if (r1.hasNext() != false) goto L_0x0abc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0abc, code lost:
        r10 = (java.lang.String) r1.next();
        r26 = r1;
        r9.put(r10, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0acf, code lost:
        if ("android_id".equals(r10) != false) goto L_0x0ad1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ad1, code lost:
        android.util.Log.w("CheckinResponseProcess", "Removing Android ID from Gservices");
        defpackage.gwd.b("ERROR: Removing Android ID from Gservices");
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ade, code lost:
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0ae1, code lost:
        r1 = r3.g.size();
        r10 = r3.f.size();
        r11 = new java.lang.StringBuilder(66);
        r11.append("From server: ");
        r11.append(r1);
        r11.append(" gservices updates and ");
        r11.append(r10);
        r11.append(" deletes");
        android.util.Log.i("CheckinResponseProcess", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:?, code lost:
        r4.update(defpackage.jnl.b, r9, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0b15, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b17, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:?, code lost:
        r1 = r0.getMessage();
        r11 = r5.getPackageName();
        r10 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 65) + java.lang.String.valueOf(r11).length());
        r10.append("Caught exception updating gservices MAIN DIFF: ");
        r10.append(r1);
        r10.append(" Context package: ");
        r10.append(r11);
        android.util.Log.w("CheckinResponseProcess", r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b4f, code lost:
        defpackage.gwb.a(r5, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b53, code lost:
        r33 = r11;
        defpackage.gwb.a(r5, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b59, code lost:
        r33 = r11;
        android.util.Log.w("CheckinResponseProcess", "Content Resolver is null, not updating gservices");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b64, code lost:
        if ((r3.a & 64) == 0) goto L_0x0b98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b6c, code lost:
        if (r3.h != 0) goto L_0x0b6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b6e, code lost:
        defpackage.gwk.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b77, code lost:
        if (defpackage.gwk.b(r5) == 0) goto L_0x0b79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b79, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b7b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b7c, code lost:
        r3 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b80, code lost:
        if (r3.c == false) goto L_0x0b82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b83, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b89, code lost:
        r3 = (defpackage.gzb) r3.b;
        r4 = defpackage.gzb.j;
        r3.a |= 32;
        r3.g = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b9a, code lost:
        a("update_id_token", r7, r2, r13);
        b(r2, r13);
        r1 = new java.util.ArrayList(r7.a().values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0bb7, code lost:
        r1.add(0, 6L);
        defpackage.gwd.a(r1.toArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0bcc, code lost:
        r22 = r22 | r33.b;
        r1 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:?, code lost:
        r1.g.add(r8.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0bf5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0bf6, code lost:
        r1 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0bfa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0bfb, code lost:
        r1 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0bfe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0c00, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0c01, code lost:
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0c03, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0c04, code lost:
        r12 = r25;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c0a, code lost:
        r12 = r25;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0c10, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c11, code lost:
        r12 = r25;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c30, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c31, code lost:
        r30 = r5;
        r31 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c36, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c37, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c3d, code lost:
        r32 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c40, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c41, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r32 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c4a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c4b, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r32 = r12;
        r26 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c55, code lost:
        r27 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c57, code lost:
        r12 = r25;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0cc8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0cc9, code lost:
        r30 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0cce, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0ccf, code lost:
        r30 = r5;
        r31 = r6;
        r28 = r7;
        r27 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0d1b, code lost:
        r5 = android.os.Build.VERSION.SDK_INT;
        r5 = android.os.Build.VERSION.SDK_INT;
        r5 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0d22, code lost:
        defpackage.gwk.f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0d29, code lost:
        if (r12 != null) goto L_0x0d2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d2b, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d2d, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0d2e, code lost:
        a(r2, false, r6, r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0d35, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0d37, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d3e, code lost:
        r1.g.add(r8.a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04d6 A[SYNTHETIC, Splitter:B:181:0x04d6] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0512 A[SYNTHETIC, Splitter:B:195:0x0512] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0521 A[Catch:{ IOException -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0522 A[Catch:{ IOException -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x053d  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0544 A[Catch:{ IOException -> 0x05b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0545 A[Catch:{ IOException -> 0x05b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0563 A[Catch:{ IOException -> 0x05b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0564 A[Catch:{ IOException -> 0x05b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x05ce A[Catch:{ all -> 0x05ba, all -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06e4 A[Catch:{ all -> 0x05ba, all -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06e5 A[ADDED_TO_REGION, Catch:{ all -> 0x05ba, all -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06f1 A[ADDED_TO_REGION, Catch:{ all -> 0x05ba, all -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0b66 A[Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0b98 A[Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0cc8 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v11 int) = (r5v1 int), (r5v1 int), (r5v12 int), (r5v12 int), (r5v12 int), (r5v12 int), (r5v12 int), (r5v1 int) binds: [B:88:0x032f, B:89:?, B:101:0x0360, B:102:?, B:104:0x036f, B:111:0x0382, B:122:0x03b2, B:93:0x0341] A[DONT_GENERATE, DONT_INLINE], Splitter:B:88:0x032f] */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x0d1b A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0d22 A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0d29 A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:623:0x0d35 A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0d37 A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0d3e A[Catch:{ all -> 0x0d96 }] */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0d60  */
    /* JADX WARNING: Removed duplicated region for block: B:636:0x0d82  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gvx a(defpackage.gwr r49) {
        /*
            r48 = this;
            r1 = r48
            r2 = r49
            java.lang.String r3 = "gzip"
            boolean r4 = r2.i
            defpackage.gwe.a = r4
            android.content.Context r4 = r2.m
            android.content.Context r4 = r4.getApplicationContext()
            int r5 = android.os.Process.myTid()
            int r5 = android.os.Process.getThreadPriority(r5)
            r6 = 9
            android.os.Process.setThreadPriority(r6)
            r6 = 0
            r1.e = r6
            r1.f = r6
            ampu r7 = defpackage.ampu.a
            amri r8 = r1.c
            boolean r8 = r8.a()
            r9 = 5
            if (r8 == 0) goto L_0x02ae
            amri r8 = r1.c
            java.lang.Object r8 = r8.b()
            gvy r8 = (defpackage.gvy) r8
            android.content.Context r8 = r8.a
            java.util.List r8 = a((android.content.Context) r8)
            amri r12 = r1.c
            java.lang.Object r12 = r12.b()
            gvy r12 = (defpackage.gvy) r12
            amtd r13 = defpackage.ampt.a
            amsn r13 = defpackage.amsn.b(r13)
            hag r14 = r2.p
            gzr r14 = defpackage.gvu.a((defpackage.hag) r14)
            java.lang.Object r15 = r14.c(r9)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r14)
            r12.d = r15
            int r14 = android.os.Build.VERSION.SDK_INT
            android.content.Context r14 = r12.a
            java.lang.String r15 = "user"
            java.lang.Object r14 = r14.getSystemService(r15)
            android.os.UserManager r14 = (android.os.UserManager) r14
            awrq r15 = defpackage.awrq.a
            awrr r15 = r15.a()
            boolean r15 = r15.N()
            if (r15 != 0) goto L_0x0074
            r9 = 0
            goto L_0x00ad
        L_0x0074:
            if (r14 == 0) goto L_0x00ac
            boolean r14 = r14.isManagedProfile()
            if (r14 == 0) goto L_0x00ac
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L_0x00ac
            int r14 = r8.size()
            r15 = 0
        L_0x0087:
            if (r15 >= r14) goto L_0x00aa
            java.lang.Object r16 = r8.get(r15)
            r9 = r16
            android.accounts.Account r9 = (android.accounts.Account) r9
            java.lang.String r11 = r9.type
            java.lang.String r10 = "com.google.work"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00ac
            int r15 = r15 + 1
            java.lang.String r9 = r9.name
            java.lang.String r10 = "@android-for-work.gserviceaccount.com"
            boolean r9 = r9.endsWith(r10)
            if (r9 != 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            r9 = 5
            goto L_0x0087
        L_0x00aa:
            r9 = 1
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            r12.c = r9
            amtd r9 = defpackage.ampt.a
            amsn r9 = defpackage.amsn.a((defpackage.amtd) r9)
            a(r2, r9)
            gzo r10 = defpackage.gzo.d
            aucd r10 = r10.o()
            boolean r11 = r49.a()
            if (r11 == 0) goto L_0x00cd
            android.content.Context r11 = r12.a
            aucd r14 = r12.d
            android.content.SharedPreferences r15 = r2.b
            defpackage.gvu.a((android.content.Context) r11, (defpackage.aucd) r14, (android.content.SharedPreferences) r15)
        L_0x00cd:
            java.lang.String r11 = "build"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.b()
            if (r11 == 0) goto L_0x00e0
            android.content.Context r11 = r12.a
            aucd r14 = r12.d
            defpackage.gvu.a((android.content.Context) r11, (defpackage.aucd) r14)
        L_0x00e0:
            java.lang.String r11 = "package_properties"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.c()
            if (r11 == 0) goto L_0x011f
            android.content.Context r11 = r12.a
            java.lang.String r14 = "connectivity"
            java.lang.Object r11 = r11.getSystemService(r14)
            r21 = r11
            android.net.ConnectivityManager r21 = (android.net.ConnectivityManager) r21
            android.content.Context r11 = r12.a
            java.lang.String r14 = "phone"
            java.lang.Object r11 = r11.getSystemService(r14)
            r19 = r11
            android.telephony.TelephonyManager r19 = (android.telephony.TelephonyManager) r19
            android.content.Context r11 = r12.a
            java.lang.String r14 = "wifi"
            java.lang.Object r11 = r11.getSystemService(r14)
            r20 = r11
            android.net.wifi.WifiManager r20 = (android.net.wifi.WifiManager) r20
            android.content.Context r11 = r12.a
            boolean r14 = r12.c
            aucd r15 = r12.d
            r18 = r11
            r22 = r14
            r23 = r15
            defpackage.gvu.a(r18, r19, r20, r21, r22, r23)
        L_0x011f:
            java.lang.String r11 = "network_properties"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.d()
            if (r11 == 0) goto L_0x0134
            java.util.Locale r11 = java.util.Locale.getDefault()
            aucd r14 = r12.d
            defpackage.gvu.a((java.util.Locale) r11, (defpackage.aucd) r14)
        L_0x0134:
            java.lang.String r11 = "local_property"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.e()
            if (r11 == 0) goto L_0x0149
            android.content.Context r11 = r12.a
            boolean r14 = r12.c
            aucd r15 = r12.d
            defpackage.gvu.a((android.content.Context) r11, (boolean) r14, (defpackage.aucd) r15)
        L_0x0149:
            java.lang.String r11 = "id_property"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.f()
            if (r11 != 0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            android.content.Context r11 = r12.a
            aucd r14 = r12.d
            defpackage.gvu.a((android.content.Context) r11, (java.util.List) r8, (defpackage.aucd) r14)
        L_0x015d:
            java.lang.String r11 = "acct_info"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.g()
            if (r11 != 0) goto L_0x016a
            goto L_0x0173
        L_0x016a:
            java.util.TimeZone r11 = java.util.TimeZone.getDefault()
            aucd r14 = r12.d
            defpackage.gvu.a((java.util.TimeZone) r11, (defpackage.aucd) r14)
        L_0x0173:
            java.lang.String r11 = "time_zone"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.h()
            if (r11 == 0) goto L_0x0186
            android.content.Context r11 = r12.a
            aucd r14 = r12.d
            defpackage.gvu.e(r11, r14)
        L_0x0186:
            java.lang.String r11 = "device_config"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r49.i()
            if (r11 == 0) goto L_0x0197
            aucd r11 = r12.d
            defpackage.gvu.a((defpackage.aucd) r11)
        L_0x0197:
            java.lang.String r11 = "requested_groups"
            defpackage.gvy.a(r11, r9)
            boolean r11 = r2.r
            if (r11 == 0) goto L_0x01a9
            android.content.Context r11 = r12.a
            aucd r14 = r12.d
            defpackage.gvu.f(r11, r14)
            goto L_0x01b2
        L_0x01a9:
            iwd r11 = a
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r15 = "Skipping droidguard"
            r11.c(r15, r14)
        L_0x01b2:
            java.lang.String r11 = "droid_guard"
            long r14 = defpackage.gvy.a(r11, r9)
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x01be
            goto L_0x01c3
        L_0x01be:
            r10.c()
            r10.c = r6
        L_0x01c3:
            aucj r11 = r10.b
            gzo r11 = (defpackage.gzo) r11
            int r6 = r11.a
            r17 = 2
            r6 = r6 | 2
            r11.a = r6
            r11.c = r14
            boolean r6 = r49.j()
            if (r6 == 0) goto L_0x01de
            android.content.Context r6 = r12.a
            aucd r11 = r12.d
            defpackage.gvu.h(r6, r11)
        L_0x01de:
            java.lang.String r6 = "managing_app_info"
            defpackage.gvy.a(r6, r9)
            boolean r6 = r49.k()
            if (r6 == 0) goto L_0x01f1
            android.content.Context r6 = r12.a
            aucd r11 = r12.d
            defpackage.gvu.g(r6, r11)
        L_0x01f1:
            java.lang.String r6 = "device_data_version_info"
            defpackage.gvy.a(r6, r9)
            boolean r6 = r49.l()
            if (r6 == 0) goto L_0x0204
            android.content.Context r6 = r12.a
            aucd r11 = r12.d
            defpackage.gvu.b(r6, r11)
        L_0x0204:
            java.lang.String r6 = "device_subtype_properties"
            defpackage.gvy.a(r6, r9)
            boolean r6 = r49.m()
            if (r6 == 0) goto L_0x0217
            android.content.Context r6 = r12.a
            aucd r11 = r12.d
            defpackage.gvu.d(r6, r11)
        L_0x0217:
            java.lang.String r6 = "restricted_device_flags"
            defpackage.gvy.a(r6, r9)
            boolean r6 = r49.n()
            if (r6 == 0) goto L_0x022a
            android.content.Context r6 = r2.m
            aucd r11 = r12.d
            defpackage.gvu.c(r6, r11)
        L_0x022a:
            java.lang.String r6 = "clock_work_data"
            defpackage.gvy.a(r6, r9)
            b(r2, r9)
            r13.e()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r13 = r13.a((java.util.concurrent.TimeUnit) r6)
            boolean r6 = r10.c
            if (r6 != 0) goto L_0x0241
            goto L_0x0247
        L_0x0241:
            r10.c()
            r6 = 0
            r10.c = r6
        L_0x0247:
            aucj r6 = r10.b
            gzo r6 = (defpackage.gzo) r6
            int r9 = r6.a
            r11 = 1
            r9 = r9 | r11
            r6.a = r9
            r6.b = r13
            aucj r6 = r10.i()
            gzo r6 = (defpackage.gzo) r6
            amri r6 = defpackage.amri.b(r6)
            r12.b = r6
            aucd r6 = r12.d
            boolean r9 = r2.c
            boolean r10 = r6.c
            if (r10 != 0) goto L_0x0268
            goto L_0x026e
        L_0x0268:
            r6.c()
            r10 = 0
            r6.c = r10
        L_0x026e:
            aucj r6 = r6.b
            gzr r6 = (defpackage.gzr) r6
            gzr r10 = defpackage.gzr.A
            int r10 = r6.a
            r11 = 8388608(0x800000, float:1.17549435E-38)
            r10 = r10 | r11
            r6.a = r10
            r6.y = r9
            aucd r6 = r12.d
            boolean r9 = r2.k
            boolean r10 = r6.c
            if (r10 != 0) goto L_0x0286
            goto L_0x028c
        L_0x0286:
            r6.c()
            r10 = 0
            r6.c = r10
        L_0x028c:
            aucj r6 = r6.b
            gzr r6 = (defpackage.gzr) r6
            int r10 = r6.a
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            r10 = r10 | r11
            r6.a = r10
            r6.z = r9
            aucd r6 = r12.d
            aucj r6 = r6.i()
            gzr r6 = (defpackage.gzr) r6
            r9 = 5
            java.lang.Object r10 = r6.c(r9)
            aucd r10 = (defpackage.aucd) r10
            r10.a((defpackage.aucj) r6)
            r6 = r10
            r10 = r8
            goto L_0x02f9
        L_0x02ae:
            java.util.List r8 = a((android.content.Context) r4)
            hbq r6 = new hbq
            r6.<init>()
            defpackage.awdx.a(r49)
            r6.a = r2
            amzy r7 = defpackage.amzy.a((java.util.Collection) r8)
            defpackage.awdx.a(r7)
            r6.b = r7
            gwr r7 = r6.a
            java.lang.Class<gwr> r9 = defpackage.gwr.class
            defpackage.awdx.a((java.lang.Object) r7, (java.lang.Class) r9)
            amzy r7 = r6.b
            java.lang.Class<amzy> r9 = defpackage.amzy.class
            defpackage.awdx.a((java.lang.Object) r7, (java.lang.Class) r9)
            hcw r7 = new hcw
            gwr r9 = r6.a
            amzy r6 = r6.b
            r7.<init>(r9, r6)
            amri r7 = defpackage.amri.b(r7)
            r6 = r7
            amrt r6 = (defpackage.amrt) r6
            java.lang.Object r6 = r6.a
            hcw r6 = (defpackage.hcw) r6
            hcv r6 = r6.a()
            gzr r6 = r6.a
            r9 = 5
            java.lang.Object r10 = r6.c(r9)
            aucd r10 = (defpackage.aucd) r10
            r10.a((defpackage.aucj) r6)
            r6 = r10
            r10 = r8
        L_0x02f9:
            java.lang.String r8 = r2.o
            if (r8 == 0) goto L_0x02fe
            goto L_0x0328
        L_0x02fe:
            gvv r8 = r1.b     // Catch:{ RuntimeException -> 0x0317 }
            android.content.Context r9 = r1.d     // Catch:{ RuntimeException -> 0x0317 }
            java.lang.String r8 = r8.a((android.content.Context) r9)     // Catch:{ RuntimeException -> 0x0317 }
            if (r8 == 0) goto L_0x0328
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ RuntimeException -> 0x0317 }
            r9 = 0
            r11[r9] = r8     // Catch:{ RuntimeException -> 0x0317 }
            java.lang.String r8 = "NID=%s"
            java.lang.String r8 = java.lang.String.format(r8, r11)     // Catch:{ RuntimeException -> 0x0317 }
            r2.o = r8     // Catch:{ RuntimeException -> 0x0317 }
            goto L_0x0328
        L_0x0317:
            r0 = move-exception
            r8 = r0
            iwd r9 = a
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r11 = r2.f
            r13 = 0
            r12[r13] = r11
            java.lang.String r11 = "%s : Error getting cookie."
            r9.d(r11, r8, r12)
        L_0x0328:
            gzc r8 = new gzc
            amtd r9 = defpackage.ampt.a
            r8.<init>(r9)
            boolean r13 = r2.n     // Catch:{ IOException -> 0x0cce, all -> 0x0cc8 }
            java.lang.String r14 = "CheckinTask_bookmark"
            r15 = r10
            r9 = 0
            if (r13 != 0) goto L_0x0341
            r12 = 0
            r13 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            goto L_0x035c
        L_0x0341:
            android.content.SharedPreferences r13 = r2.b     // Catch:{ IOException -> 0x0cbe, all -> 0x0cc8 }
            if (r13 != 0) goto L_0x034e
            r12 = 0
            r13 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            goto L_0x035c
        L_0x034e:
            long r20 = r13.getLong(r14, r9)     // Catch:{ IOException -> 0x0cbe, all -> 0x0cc8 }
            r9 = r20
            r12 = 0
            r13 = 0
            r21 = 0
            r22 = 0
            r25 = 0
        L_0x035c:
            r11 = 10
            if (r12 >= r11) goto L_0x0c5f
            amsn r11 = r8.a     // Catch:{ IOException -> 0x0c4a, all -> 0x0cc8 }
            r11.d()     // Catch:{ IOException -> 0x0c4a, all -> 0x0cc8 }
            r11 = 0
            r1.e = r11     // Catch:{ IOException -> 0x0c4a, all -> 0x0cc8 }
            gvw r11 = new gvw     // Catch:{ IOException -> 0x0c4a, all -> 0x0cc8 }
            r11.<init>()     // Catch:{ IOException -> 0x0c4a, all -> 0x0cc8 }
            r26 = r13
            boolean r13 = r6.c     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
            if (r13 != 0) goto L_0x0374
            goto L_0x037a
        L_0x0374:
            r6.c()     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
            r13 = 0
            r6.c = r13     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
        L_0x037a:
            aucj r13 = r6.b     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
            gzr r13 = (defpackage.gzr) r13     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
            gzr r27 = defpackage.gzr.A     // Catch:{ IOException -> 0x0c40, all -> 0x0cc8 }
            r27 = r15
            int r15 = r13.a     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r28 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 | r28
            r13.a = r15     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r13.r = r12     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            had r13 = r13.l     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            if (r13 == 0) goto L_0x0392
            goto L_0x0394
        L_0x0392:
            had r13 = defpackage.had.o     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
        L_0x0394:
            r15 = 5
            java.lang.Object r28 = r13.c(r15)     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r15 = r28
            aucd r15 = (defpackage.aucd) r15     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r15.a((defpackage.aucj) r13)     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            boolean r13 = r15.c     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            if (r13 != 0) goto L_0x03a6
            goto L_0x03ac
        L_0x03a6:
            r15.c()     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r13 = 0
            r15.c = r13     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
        L_0x03ac:
            aucj r13 = r15.b     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            had r13 = (defpackage.had) r13     // Catch:{ IOException -> 0x0c36, all -> 0x0cc8 }
            r28 = r7
            aucx r7 = defpackage.aucj.s()     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            r13.e = r7     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            boolean r7 = r6.c     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            if (r7 != 0) goto L_0x03bd
            goto L_0x03c3
        L_0x03bd:
            r6.c()     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            r7 = 0
            r6.c = r7     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
        L_0x03c3:
            aucj r7 = r6.b     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            gzr r7 = (defpackage.gzr) r7     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            aucj r13 = r15.i()     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            had r13 = (defpackage.had) r13     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            r13.getClass()     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            r7.l = r13     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            int r13 = r7.a     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            r13 = r13 | 256(0x100, float:3.59E-43)
            r7.a = r13     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            anab r7 = defpackage.anaf.h()     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            amtd r13 = defpackage.ampt.a     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            amsn r13 = defpackage.amsn.a((defpackage.amtd) r13)     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            a(r2, r13)     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            boolean r15 = r2.n     // Catch:{ IOException -> 0x0c30, all -> 0x0cc8 }
            if (r15 == 0) goto L_0x0406
            long r29 = a((long) r9, (defpackage.gwr) r2, (defpackage.aucd) r6)     // Catch:{ IOException -> 0x03fa, all -> 0x03f4 }
            r46 = r29
            r29 = r14
            r14 = r46
            goto L_0x0409
        L_0x03f4:
            r0 = move-exception
            r2 = r0
            r30 = r5
            goto L_0x0d99
        L_0x03fa:
            r0 = move-exception
            r3 = r0
            r30 = r5
            r31 = r6
            r6 = r12
            r12 = r25
            r5 = r4
            goto L_0x0cdd
        L_0x0406:
            r29 = r14
            r14 = r9
        L_0x0409:
            r30 = r5
            java.lang.String r5 = "add_event_log"
            a(r5, r7, r2, r13)     // Catch:{ IOException -> 0x0c27 }
            if (r12 > 0) goto L_0x0413
            goto L_0x0420
        L_0x0413:
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0420
            r5 = r4
            r31 = r6
            r32 = r12
            r12 = r25
            goto L_0x0c6e
        L_0x0420:
            long r9 = defpackage.gwd.b((android.content.Context) r4)     // Catch:{ IOException -> 0x0c27 }
            defpackage.gvu.a((android.content.Context) r4, (long) r9, (defpackage.aucd) r6)     // Catch:{ IOException -> 0x0c27 }
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0c27 }
            java.lang.String r5 = "CheckinTask:SentRequest"
            r10 = 0
            r9[r10] = r5     // Catch:{ IOException -> 0x0c27 }
            long r31 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0c27 }
            java.lang.Long r5 = java.lang.Long.valueOf(r31)     // Catch:{ IOException -> 0x0c27 }
            r10 = 1
            r9[r10] = r5     // Catch:{ IOException -> 0x0c27 }
            defpackage.gwd.a((java.lang.Object[]) r9)     // Catch:{ IOException -> 0x0c27 }
            gvv r5 = r1.b     // Catch:{ IOException -> 0x0c27 }
            aucj r9 = r6.i()     // Catch:{ IOException -> 0x0c27 }
            gzr r9 = (defpackage.gzr) r9     // Catch:{ IOException -> 0x0c27 }
            gwq r10 = r2.e     // Catch:{ IOException -> 0x0c27 }
            boolean r10 = r10.b     // Catch:{ IOException -> 0x0c27 }
            if (r10 == 0) goto L_0x045a
            afzd r10 = r5.a()     // Catch:{ IOException -> 0x0450 }
            goto L_0x045b
        L_0x0450:
            r0 = move-exception
            r3 = r0
            r5 = r4
            r31 = r6
            r6 = r12
            r12 = r25
            goto L_0x0cdd
        L_0x045a:
            r10 = 0
        L_0x045b:
            r31 = r6
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0c24 }
            r32 = r12
            java.lang.String r12 = r2.q     // Catch:{ IOException -> 0x0c21 }
            r6.<init>(r12)     // Catch:{ IOException -> 0x0c21 }
            amsn r12 = r8.b     // Catch:{ all -> 0x0c16 }
            r12.d()     // Catch:{ all -> 0x0c16 }
            r12 = 0
        L_0x046c:
            r33 = r4
            r4 = 3
            if (r12 >= r4) goto L_0x0757
            int r12 = r12 + 1
            r34 = r14
            long r14 = (long) r12
            aucd r4 = r8.c     // Catch:{ all -> 0x074f }
            r36 = r12
            boolean r12 = r4.c     // Catch:{ all -> 0x074f }
            if (r12 != 0) goto L_0x047f
            goto L_0x0485
        L_0x047f:
            r4.c()     // Catch:{ all -> 0x074f }
            r12 = 0
            r4.c = r12     // Catch:{ all -> 0x074f }
        L_0x0485:
            aucj r4 = r4.b     // Catch:{ all -> 0x074f }
            gzb r4 = (defpackage.gzb) r4     // Catch:{ all -> 0x074f }
            gzb r12 = defpackage.gzb.j     // Catch:{ all -> 0x074f }
            int r12 = r4.a     // Catch:{ all -> 0x074f }
            r12 = r12 | 128(0x80, float:1.794E-43)
            r4.a = r12     // Catch:{ all -> 0x074f }
            r4.i = r14     // Catch:{ all -> 0x074f }
            boolean r4 = r2.i     // Catch:{ all -> 0x074f }
            r12 = 1032(0x408, float:1.446E-42)
            if (r4 != 0) goto L_0x049d
            android.net.TrafficStats.setThreadStatsTag(r12)     // Catch:{ all -> 0x074f }
            goto L_0x04a1
        L_0x049d:
            defpackage.izj.b(r12)     // Catch:{ all -> 0x074f }
        L_0x04a1:
            if (r10 == 0) goto L_0x04ae
            boolean r12 = r11.b     // Catch:{ IOException -> 0x05be }
            if (r12 == 0) goto L_0x04ae
            java.lang.String r12 = r2.q     // Catch:{ IOException -> 0x05be }
            java.net.HttpURLConnection r12 = r5.a(r12, r10)     // Catch:{ IOException -> 0x05be }
            goto L_0x04b4
        L_0x04ae:
            java.lang.String r12 = r2.q     // Catch:{ IOException -> 0x05be }
            java.net.HttpURLConnection r12 = r5.b(r12)     // Catch:{ IOException -> 0x05be }
        L_0x04b4:
            java.lang.String r14 = r2.o     // Catch:{ IOException -> 0x05be }
            java.lang.String r15 = "Content-type"
            java.lang.String r4 = "application/x-protobuffer"
            r12.setRequestProperty(r15, r4)     // Catch:{ IOException -> 0x05be }
            java.lang.String r4 = "Content-encoding"
            r12.setRequestProperty(r4, r3)     // Catch:{ IOException -> 0x05be }
            java.lang.String r4 = "Accept-encoding"
            r12.setRequestProperty(r4, r3)     // Catch:{ IOException -> 0x05be }
            r4 = 1
            r12.setDoOutput(r4)     // Catch:{ IOException -> 0x05be }
            r4 = 120000(0x1d4c0, float:1.68156E-40)
            r12.setConnectTimeout(r4)     // Catch:{ IOException -> 0x05be }
            r12.setReadTimeout(r4)     // Catch:{ IOException -> 0x05be }
            if (r14 != 0) goto L_0x04ef
            iwd r4 = a     // Catch:{ IOException -> 0x04e5 }
            java.lang.String r14 = "cookie is null"
            r37 = r3
            r15 = 0
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x04e3 }
            r4.b(r14, r3)     // Catch:{ IOException -> 0x04e3 }
            goto L_0x04f6
        L_0x04e3:
            r0 = move-exception
            goto L_0x04e8
        L_0x04e5:
            r0 = move-exception
            r37 = r3
        L_0x04e8:
            r3 = r0
            r38 = r6
            r39 = r9
            goto L_0x05c6
        L_0x04ef:
            r37 = r3
            java.lang.String r3 = "Cookie"
            r12.setRequestProperty(r3, r14)     // Catch:{ IOException -> 0x05b8 }
        L_0x04f6:
            anmz r3 = new anmz     // Catch:{ IOException -> 0x05b8 }
            java.io.OutputStream r4 = r12.getOutputStream()     // Catch:{ IOException -> 0x05b8 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x05b8 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x05b8 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x05b8 }
            r9.a(r4)     // Catch:{ IOException -> 0x05b8 }
            r4.close()     // Catch:{ IOException -> 0x05b8 }
            r3.close()     // Catch:{ IOException -> 0x05b8 }
            r12.connect()     // Catch:{ IOException -> 0x05b8 }
            if (r10 == 0) goto L_0x0519
            java.lang.String r3 = r6.getHost()     // Catch:{ IOException -> 0x04e3 }
            r10.b(r3)     // Catch:{ IOException -> 0x04e3 }
        L_0x0519:
            int r3 = r12.getResponseCode()     // Catch:{ IOException -> 0x05b8 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0522
            goto L_0x052d
        L_0x0522:
            r4 = 401(0x191, float:5.62E-43)
            if (r3 != r4) goto L_0x0528
            r4 = 1
            goto L_0x0529
        L_0x0528:
            r4 = 0
        L_0x0529:
            r1.e = r4     // Catch:{ IOException -> 0x05b8 }
            r1.f = r3     // Catch:{ IOException -> 0x05b8 }
        L_0x052d:
            gzs r4 = a((defpackage.gwr) r2, (java.net.HttpURLConnection) r12, (int) r3)     // Catch:{ IOException -> 0x05b8 }
            java.lang.String r12 = r4.j     // Catch:{ IOException -> 0x05b8 }
            aucd r14 = r8.c     // Catch:{ IOException -> 0x05b8 }
            int r15 = r4.a     // Catch:{ IOException -> 0x05b8 }
            r15 = r15 & 64
            if (r15 == 0) goto L_0x053d
            r15 = 1
            goto L_0x053e
        L_0x053d:
            r15 = 0
        L_0x053e:
            r38 = r6
            boolean r6 = r14.c     // Catch:{ IOException -> 0x05b6 }
            if (r6 != 0) goto L_0x0545
            goto L_0x054b
        L_0x0545:
            r14.c()     // Catch:{ IOException -> 0x05b6 }
            r6 = 0
            r14.c = r6     // Catch:{ IOException -> 0x05b6 }
        L_0x054b:
            aucj r6 = r14.b     // Catch:{ IOException -> 0x05b6 }
            gzb r6 = (defpackage.gzb) r6     // Catch:{ IOException -> 0x05b6 }
            int r14 = r6.a     // Catch:{ IOException -> 0x05b6 }
            r14 = r14 | 16
            r6.a = r14     // Catch:{ IOException -> 0x05b6 }
            r6.f = r15     // Catch:{ IOException -> 0x05b6 }
            aucd r6 = r8.c     // Catch:{ IOException -> 0x05b6 }
            gza r14 = defpackage.gza.c     // Catch:{ IOException -> 0x05b6 }
            aucd r14 = r14.o()     // Catch:{ IOException -> 0x05b6 }
            boolean r15 = r14.c     // Catch:{ IOException -> 0x05b6 }
            if (r15 != 0) goto L_0x0564
            goto L_0x056a
        L_0x0564:
            r14.c()     // Catch:{ IOException -> 0x05b6 }
            r15 = 0
            r14.c = r15     // Catch:{ IOException -> 0x05b6 }
        L_0x056a:
            aucj r15 = r14.b     // Catch:{ IOException -> 0x05b6 }
            gza r15 = (defpackage.gza) r15     // Catch:{ IOException -> 0x05b6 }
            r12.getClass()     // Catch:{ IOException -> 0x05b6 }
            r39 = r9
            int r9 = r15.a     // Catch:{ IOException -> 0x05b4 }
            r16 = 1
            r9 = r9 | 1
            r15.a = r9     // Catch:{ IOException -> 0x05b4 }
            r15.b = r12     // Catch:{ IOException -> 0x05b4 }
            boolean r9 = r6.c     // Catch:{ IOException -> 0x05b4 }
            if (r9 != 0) goto L_0x0582
            goto L_0x0588
        L_0x0582:
            r6.c()     // Catch:{ IOException -> 0x05b4 }
            r9 = 0
            r6.c = r9     // Catch:{ IOException -> 0x05b4 }
        L_0x0588:
            aucj r6 = r6.b     // Catch:{ IOException -> 0x05b4 }
            gzb r6 = (defpackage.gzb) r6     // Catch:{ IOException -> 0x05b4 }
            aucj r9 = r14.i()     // Catch:{ IOException -> 0x05b4 }
            gza r9 = (defpackage.gza) r9     // Catch:{ IOException -> 0x05b4 }
            r9.getClass()     // Catch:{ IOException -> 0x05b4 }
            r6.b = r9     // Catch:{ IOException -> 0x05b4 }
            int r9 = r6.a     // Catch:{ IOException -> 0x05b4 }
            r12 = 1
            r9 = r9 | r12
            r6.a = r9     // Catch:{ IOException -> 0x05b4 }
            gvz r6 = new gvz     // Catch:{ IOException -> 0x05b4 }
            r6.<init>(r4, r3)     // Catch:{ IOException -> 0x05b4 }
            b(r49)     // Catch:{ all -> 0x074f }
            r8.b()     // Catch:{ IOException -> 0x05aa }
            goto L_0x075f
        L_0x05aa:
            r0 = move-exception
            r3 = r0
            r12 = r25
            r6 = r32
            r5 = r33
            goto L_0x0cdd
        L_0x05b4:
            r0 = move-exception
            goto L_0x05c5
        L_0x05b6:
            r0 = move-exception
            goto L_0x05c3
        L_0x05b8:
            r0 = move-exception
            goto L_0x05c1
        L_0x05ba:
            r0 = move-exception
            r3 = r0
            goto L_0x074b
        L_0x05be:
            r0 = move-exception
            r37 = r3
        L_0x05c1:
            r38 = r6
        L_0x05c3:
            r39 = r9
        L_0x05c5:
            r3 = r0
        L_0x05c6:
            boolean r4 = r3 instanceof javax.net.ssl.SSLException     // Catch:{ all -> 0x05ba }
            if (r4 == 0) goto L_0x06f1
            boolean r6 = r11.a     // Catch:{ all -> 0x05ba }
            if (r6 != 0) goto L_0x06f1
            iwd r4 = a     // Catch:{ all -> 0x05ba }
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x05ba }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x05ba }
            r12 = 0
            r9[r12] = r6     // Catch:{ all -> 0x05ba }
            java.lang.String r6 = "SSL error, attempting time correction: %s."
            r4.d(r6, r3, r9)     // Catch:{ all -> 0x05ba }
            java.lang.String r4 = r2.q     // Catch:{ IOException -> 0x06c8 }
            java.net.HttpURLConnection r4 = r5.a((java.lang.String) r4)     // Catch:{ IOException -> 0x06c8 }
            boolean r6 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x06c8 }
            if (r6 == 0) goto L_0x069f
            long r14 = r2.g     // Catch:{ IOException -> 0x06c8 }
            gvb r6 = new gvb     // Catch:{ IOException -> 0x06c8 }
            r6.<init>()     // Catch:{ IOException -> 0x06c8 }
            r9 = 120000(0x1d4c0, float:1.68156E-40)
            r6.a = r9     // Catch:{ IOException -> 0x06c8 }
            r6.b = r9     // Catch:{ IOException -> 0x06c8 }
            long r14 = r6.a(r4, r2, r14)     // Catch:{ IOException -> 0x06c8 }
            long r40 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x06c8 }
            long r42 = r14 - r40
            long r42 = java.lang.Math.abs(r42)     // Catch:{ IOException -> 0x06c8 }
            r44 = 604800000(0x240c8400, double:2.988109026E-315)
            int r4 = (r42 > r44 ? 1 : (r42 == r44 ? 0 : -1))
            if (r4 >= 0) goto L_0x0620
            iwd r4 = a     // Catch:{ IOException -> 0x06c8 }
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x06c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r42)     // Catch:{ IOException -> 0x06c8 }
            r12 = 0
            r9[r12] = r6     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r6 = "Server time agrees: delta %d msec"
            r4.c(r6, r9)     // Catch:{ IOException -> 0x06c8 }
            r14 = 0
            goto L_0x0679
        L_0x0620:
            android.content.Context r4 = r2.m     // Catch:{ IOException -> 0x06c8 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r6 = "checkin_disable_time_adjustment"
            r9 = 0
            boolean r4 = defpackage.aeeg.a((android.content.ContentResolver) r4, (java.lang.String) r6, (boolean) r9)     // Catch:{ IOException -> 0x06c8 }
            if (r4 == 0) goto L_0x063b
            iwd r4 = a     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r6 = "Disabled time adjustment"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x06c8 }
            r4.c(r6, r12)     // Catch:{ IOException -> 0x06c8 }
            r14 = 0
            goto L_0x0679
        L_0x063b:
            iwd r4 = a     // Catch:{ IOException -> 0x06c8 }
            r6 = 2
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x06c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r40)     // Catch:{ IOException -> 0x06c8 }
            r12 = 0
            r9[r12] = r6     // Catch:{ IOException -> 0x06c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x06c8 }
            r12 = 1
            r9[r12] = r6     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r6 = "Changing time from %d to %d"
            r4.d(r6, r9)     // Catch:{ IOException -> 0x06c8 }
            r4 = 2
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r4 = "Fixing system time skew"
            r9 = 0
            r6[r9] = r4     // Catch:{ IOException -> 0x06c8 }
            long r40 = r40 - r14
            long r40 = java.lang.Math.abs(r40)     // Catch:{ IOException -> 0x06c8 }
            java.lang.Long r4 = java.lang.Long.valueOf(r40)     // Catch:{ IOException -> 0x06c8 }
            r9 = 1
            r6[r9] = r4     // Catch:{ IOException -> 0x06c8 }
            defpackage.gwd.a((java.lang.Object[]) r6)     // Catch:{ IOException -> 0x06c8 }
            jbs r4 = new jbs     // Catch:{ IOException -> 0x06c8 }
            android.content.Context r6 = r2.m     // Catch:{ IOException -> 0x06c8 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x06c8 }
            android.app.AlarmManager r4 = r4.e     // Catch:{ IOException -> 0x06c8 }
            r4.setTime(r14)     // Catch:{ IOException -> 0x06c8 }
            r14 = r42
        L_0x0679:
            r23 = 0
            int r4 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r4 <= 0) goto L_0x0681
            r4 = 1
            goto L_0x0682
        L_0x0681:
            r4 = 0
        L_0x0682:
            aucd r6 = r8.c     // Catch:{ IOException -> 0x069c }
            boolean r9 = r6.c     // Catch:{ IOException -> 0x069c }
            if (r9 != 0) goto L_0x0689
            goto L_0x068f
        L_0x0689:
            r6.c()     // Catch:{ IOException -> 0x069c }
            r9 = 0
            r6.c = r9     // Catch:{ IOException -> 0x069c }
        L_0x068f:
            aucj r6 = r6.b     // Catch:{ IOException -> 0x069c }
            gzb r6 = (defpackage.gzb) r6     // Catch:{ IOException -> 0x069c }
            int r9 = r6.a     // Catch:{ IOException -> 0x069c }
            r12 = 4
            r9 = r9 | r12
            r6.a = r9     // Catch:{ IOException -> 0x069c }
            r6.d = r14     // Catch:{ IOException -> 0x069c }
            goto L_0x06e2
        L_0x069c:
            r0 = move-exception
            r6 = r0
            goto L_0x06cb
        L_0x069f:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ IOException -> 0x06c8 }
            java.net.URL r4 = r4.getURL()     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x06c8 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x06c8 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x06c8 }
            int r9 = r9 + 44
            r12.<init>(r9)     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r9 = "Unsupported URL for obtaining network time: "
            r12.append(r9)     // Catch:{ IOException -> 0x06c8 }
            r12.append(r4)     // Catch:{ IOException -> 0x06c8 }
            java.lang.String r4 = r12.toString()     // Catch:{ IOException -> 0x06c8 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x06c8 }
            throw r6     // Catch:{ IOException -> 0x06c8 }
        L_0x06c8:
            r0 = move-exception
            r6 = r0
            r4 = 0
        L_0x06cb:
            iwd r9 = a     // Catch:{ all -> 0x05ba }
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x05ba }
            java.lang.String r12 = r6.getMessage()     // Catch:{ all -> 0x05ba }
            r15 = 0
            r14[r15] = r12     // Catch:{ all -> 0x05ba }
            java.lang.String r12 = "Time set error: %s."
            r9.e(r12, r6, r14)     // Catch:{ all -> 0x05ba }
            if (r10 == 0) goto L_0x06f0
            boolean r9 = r11.b     // Catch:{ all -> 0x05ba }
            if (r9 != 0) goto L_0x06f0
        L_0x06e2:
            if (r4 == 0) goto L_0x06e5
            goto L_0x06eb
        L_0x06e5:
            if (r10 == 0) goto L_0x06ef
            boolean r4 = r11.b     // Catch:{ all -> 0x05ba }
            if (r4 != 0) goto L_0x06ef
        L_0x06eb:
            r3 = 1
            r11.a = r3     // Catch:{ all -> 0x05ba }
            goto L_0x0739
        L_0x06ef:
            throw r3     // Catch:{ all -> 0x05ba }
        L_0x06f0:
            throw r6     // Catch:{ all -> 0x05ba }
        L_0x06f1:
            if (r10 == 0) goto L_0x074a
            boolean r6 = r11.b     // Catch:{ all -> 0x05ba }
            if (r6 != 0) goto L_0x074a
            boolean r6 = r3 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x05ba }
            if (r6 == 0) goto L_0x06fc
        L_0x06fb:
            goto L_0x070b
        L_0x06fc:
            boolean r6 = r3 instanceof java.net.SocketException     // Catch:{ all -> 0x05ba }
            if (r6 != 0) goto L_0x06fb
            boolean r6 = r3 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x05ba }
            if (r6 != 0) goto L_0x06fb
            boolean r6 = r3 instanceof java.net.ConnectException     // Catch:{ all -> 0x05ba }
            if (r6 != 0) goto L_0x06fb
            if (r4 == 0) goto L_0x074a
            goto L_0x06fb
        L_0x070b:
            iwd r4 = a     // Catch:{ all -> 0x05ba }
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x05ba }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x05ba }
            r12 = 0
            r9[r12] = r6     // Catch:{ all -> 0x05ba }
            java.lang.String r6 = "Connection error, retry with DNS fixing: %s."
            r4.d(r6, r3, r9)     // Catch:{ all -> 0x05ba }
            r3 = 1
            r11.b = r3     // Catch:{ all -> 0x05ba }
            aucd r3 = r8.c     // Catch:{ all -> 0x05ba }
            boolean r4 = r3.c     // Catch:{ all -> 0x05ba }
            if (r4 != 0) goto L_0x0726
            goto L_0x072c
        L_0x0726:
            r3.c()     // Catch:{ all -> 0x05ba }
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x05ba }
        L_0x072c:
            aucj r3 = r3.b     // Catch:{ all -> 0x05ba }
            gzb r3 = (defpackage.gzb) r3     // Catch:{ all -> 0x05ba }
            int r4 = r3.a     // Catch:{ all -> 0x05ba }
            r4 = r4 | 8
            r3.a = r4     // Catch:{ all -> 0x05ba }
            r4 = 1
            r3.e = r4     // Catch:{ all -> 0x05ba }
        L_0x0739:
            b(r49)     // Catch:{ all -> 0x074f }
            r4 = r33
            r14 = r34
            r12 = r36
            r3 = r37
            r6 = r38
            r9 = r39
            goto L_0x046c
        L_0x074a:
            throw r3     // Catch:{ all -> 0x05ba }
        L_0x074b:
            b(r49)     // Catch:{ all -> 0x074f }
            throw r3     // Catch:{ all -> 0x074f }
        L_0x074f:
            r0 = move-exception
            r3 = r0
            r12 = r25
            r5 = r33
            goto L_0x0c1b
        L_0x0757:
            r37 = r3
            r34 = r14
            r8.b()     // Catch:{ IOException -> 0x0c10 }
            r6 = 0
        L_0x075f:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0c10 }
            java.lang.String r3 = "CheckinTask:ReceivedResponse"
            r5 = 0
            r4[r5] = r3     // Catch:{ IOException -> 0x0c10 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0c10 }
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ IOException -> 0x0c10 }
            r5 = 1
            r4[r5] = r3     // Catch:{ IOException -> 0x0c10 }
            defpackage.gwd.a((java.lang.Object[]) r4)     // Catch:{ IOException -> 0x0c10 }
            if (r6 == 0) goto L_0x0c0a
            gzs r3 = r6.a     // Catch:{ IOException -> 0x0c10 }
            int r4 = r6.b     // Catch:{ IOException -> 0x0c10 }
            java.lang.String r5 = "send_request"
            a(r5, r7, r2, r13)     // Catch:{ IOException -> 0x0c10 }
            r12 = r25
            if (r12 == 0) goto L_0x08e9
            aucx r5 = r12.d     // Catch:{ IOException -> 0x08df }
            int r5 = r5.size()     // Catch:{ IOException -> 0x08df }
            aucx r6 = r3.d     // Catch:{ IOException -> 0x08df }
            int r6 = r6.size()     // Catch:{ IOException -> 0x08df }
            r9 = 0
            r10 = 0
        L_0x0792:
            if (r9 >= r5) goto L_0x07dd
            aucx r14 = r12.d     // Catch:{ IOException -> 0x08df }
            java.lang.Object r14 = r14.get(r9)     // Catch:{ IOException -> 0x08df }
            haj r14 = (defpackage.haj) r14     // Catch:{ IOException -> 0x08df }
            java.lang.String r15 = r14.b     // Catch:{ IOException -> 0x08df }
            r21 = r4
            r4 = 0
            r25 = 0
        L_0x07a3:
            if (r4 < r6) goto L_0x07b9
            if (r25 == 0) goto L_0x07aa
            r25 = r5
            goto L_0x07d6
        L_0x07aa:
            if (r10 != 0) goto L_0x07b3
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x08df }
            aucx r4 = r3.d     // Catch:{ IOException -> 0x08df }
            r10.<init>(r4)     // Catch:{ IOException -> 0x08df }
        L_0x07b3:
            r10.add(r14)     // Catch:{ IOException -> 0x08df }
            r25 = r5
            goto L_0x07d6
        L_0x07b9:
            if (r25 != 0) goto L_0x07d4
            r25 = r5
            aucx r5 = r3.d     // Catch:{ IOException -> 0x08df }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ IOException -> 0x08df }
            haj r5 = (defpackage.haj) r5     // Catch:{ IOException -> 0x08df }
            java.lang.String r5 = r5.b     // Catch:{ IOException -> 0x08df }
            boolean r5 = r15.equals(r5)     // Catch:{ IOException -> 0x08df }
            int r4 = r4 + 1
            r46 = r25
            r25 = r5
            r5 = r46
            goto L_0x07a3
        L_0x07d4:
            r25 = r5
        L_0x07d6:
            int r9 = r9 + 1
            r4 = r21
            r5 = r25
            goto L_0x0792
        L_0x07dd:
            r21 = r4
            r4 = 5
            java.lang.Object r5 = r3.c(r4)     // Catch:{ IOException -> 0x08df }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ IOException -> 0x08df }
            r5.a((defpackage.aucj) r3)     // Catch:{ IOException -> 0x08df }
            if (r10 == 0) goto L_0x0827
            boolean r6 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r6 != 0) goto L_0x07f0
        L_0x07ef:
            goto L_0x07f7
        L_0x07f0:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r6 = 0
            r5.c = r6     // Catch:{ IOException -> 0x08df }
            goto L_0x07ef
        L_0x07f7:
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            gzs r9 = defpackage.gzs.l     // Catch:{ IOException -> 0x08df }
            aucx r9 = defpackage.aucj.s()     // Catch:{ IOException -> 0x08df }
            r6.d = r9     // Catch:{ IOException -> 0x08df }
            boolean r6 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r6 != 0) goto L_0x0808
            goto L_0x080e
        L_0x0808:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r6 = 0
            r5.c = r6     // Catch:{ IOException -> 0x08df }
        L_0x080e:
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            aucx r9 = r6.d     // Catch:{ IOException -> 0x08df }
            boolean r9 = r9.a()     // Catch:{ IOException -> 0x08df }
            if (r9 != 0) goto L_0x0822
            aucx r9 = r6.d     // Catch:{ IOException -> 0x08df }
            aucx r9 = defpackage.aucj.a((defpackage.aucx) r9)     // Catch:{ IOException -> 0x08df }
            r6.d = r9     // Catch:{ IOException -> 0x08df }
        L_0x0822:
            aucx r6 = r6.d     // Catch:{ IOException -> 0x08df }
            defpackage.auab.a((java.lang.Iterable) r10, (java.util.List) r6)     // Catch:{ IOException -> 0x08df }
        L_0x0827:
            int r6 = r12.a     // Catch:{ IOException -> 0x08df }
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0855
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            int r6 = r6.a     // Catch:{ IOException -> 0x08df }
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x0855
            java.lang.String r6 = r12.i     // Catch:{ IOException -> 0x08df }
            boolean r9 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r9 != 0) goto L_0x083e
            goto L_0x0844
        L_0x083e:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r9 = 0
            r5.c = r9     // Catch:{ IOException -> 0x08df }
        L_0x0844:
            aucj r9 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r9 = (defpackage.gzs) r9     // Catch:{ IOException -> 0x08df }
            gzs r10 = defpackage.gzs.l     // Catch:{ IOException -> 0x08df }
            r6.getClass()     // Catch:{ IOException -> 0x08df }
            int r10 = r9.a     // Catch:{ IOException -> 0x08df }
            r10 = r10 | 128(0x80, float:1.794E-43)
            r9.a = r10     // Catch:{ IOException -> 0x08df }
            r9.i = r6     // Catch:{ IOException -> 0x08df }
        L_0x0855:
            int r6 = r12.a     // Catch:{ IOException -> 0x08df }
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0884
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            int r6 = r6.a     // Catch:{ IOException -> 0x08df }
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0866
            goto L_0x0884
        L_0x0866:
            java.lang.String r6 = r12.j     // Catch:{ IOException -> 0x08df }
            boolean r9 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r9 != 0) goto L_0x086d
            goto L_0x0873
        L_0x086d:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r9 = 0
            r5.c = r9     // Catch:{ IOException -> 0x08df }
        L_0x0873:
            aucj r9 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r9 = (defpackage.gzs) r9     // Catch:{ IOException -> 0x08df }
            gzs r10 = defpackage.gzs.l     // Catch:{ IOException -> 0x08df }
            r6.getClass()     // Catch:{ IOException -> 0x08df }
            int r10 = r9.a     // Catch:{ IOException -> 0x08df }
            r10 = r10 | 256(0x100, float:3.59E-43)
            r9.a = r10     // Catch:{ IOException -> 0x08df }
            r9.j = r6     // Catch:{ IOException -> 0x08df }
        L_0x0884:
            aucx r6 = r12.k     // Catch:{ IOException -> 0x08df }
            int r6 = r6.size()     // Catch:{ IOException -> 0x08df }
            if (r6 <= 0) goto L_0x08d6
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            aucx r6 = r6.k     // Catch:{ IOException -> 0x08df }
            int r6 = r6.size()     // Catch:{ IOException -> 0x08df }
            if (r6 == 0) goto L_0x0899
            goto L_0x08d6
        L_0x0899:
            boolean r6 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r6 != 0) goto L_0x089e
            goto L_0x08a4
        L_0x089e:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r6 = 0
            r5.c = r6     // Catch:{ IOException -> 0x08df }
        L_0x08a4:
            aucj r6 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r6 = (defpackage.gzs) r6     // Catch:{ IOException -> 0x08df }
            gzs r9 = defpackage.gzs.l     // Catch:{ IOException -> 0x08df }
            aucx r9 = defpackage.aucj.s()     // Catch:{ IOException -> 0x08df }
            r6.k = r9     // Catch:{ IOException -> 0x08df }
            aucx r6 = r12.k     // Catch:{ IOException -> 0x08df }
            boolean r9 = r5.c     // Catch:{ IOException -> 0x08df }
            if (r9 != 0) goto L_0x08b7
            goto L_0x08bd
        L_0x08b7:
            r5.c()     // Catch:{ IOException -> 0x08df }
            r9 = 0
            r5.c = r9     // Catch:{ IOException -> 0x08df }
        L_0x08bd:
            aucj r9 = r5.b     // Catch:{ IOException -> 0x08df }
            gzs r9 = (defpackage.gzs) r9     // Catch:{ IOException -> 0x08df }
            aucx r10 = r9.k     // Catch:{ IOException -> 0x08df }
            boolean r10 = r10.a()     // Catch:{ IOException -> 0x08df }
            if (r10 != 0) goto L_0x08d1
            aucx r10 = r9.k     // Catch:{ IOException -> 0x08df }
            aucx r10 = defpackage.aucj.a((defpackage.aucx) r10)     // Catch:{ IOException -> 0x08df }
            r9.k = r10     // Catch:{ IOException -> 0x08df }
        L_0x08d1:
            aucx r9 = r9.k     // Catch:{ IOException -> 0x08df }
            defpackage.auab.a((java.lang.Iterable) r6, (java.util.List) r9)     // Catch:{ IOException -> 0x08df }
        L_0x08d6:
            aucj r5 = r5.i()     // Catch:{ IOException -> 0x08df }
            gzs r5 = (defpackage.gzs) r5     // Catch:{ IOException -> 0x08df }
            r25 = r5
            goto L_0x08ee
        L_0x08df:
            r0 = move-exception
            r3 = r0
            r6 = r32
            r5 = r33
        L_0x08e5:
            r26 = 1
            goto L_0x0cdd
        L_0x08e9:
            r21 = r4
            r4 = 5
            r25 = r3
        L_0x08ee:
            boolean r5 = r2.n     // Catch:{ IOException -> 0x0c00 }
            if (r5 == 0) goto L_0x090b
            android.content.SharedPreferences r5 = r2.b     // Catch:{ IOException -> 0x0905 }
            if (r5 == 0) goto L_0x090b
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ IOException -> 0x0905 }
            r6 = r29
            r9 = r34
            r5.putLong(r6, r9)     // Catch:{ IOException -> 0x0905 }
            r5.apply()     // Catch:{ IOException -> 0x0905 }
            goto L_0x090f
        L_0x0905:
            r0 = move-exception
            r3 = r0
            r5 = r33
            goto L_0x0c04
        L_0x090b:
            r6 = r29
            r9 = r34
        L_0x090f:
            java.lang.String r5 = "combine_responses"
            a(r5, r7, r2, r13)     // Catch:{ IOException -> 0x0c00 }
            if (r3 != 0) goto L_0x0922
            r29 = r6
            r34 = r9
            r5 = r33
            r9 = 0
            r33 = r11
            goto L_0x0b9a
        L_0x0922:
            int r5 = r3.a     // Catch:{ IOException -> 0x0c00 }
            r5 = r5 & 64
            java.lang.String r12 = "android_id"
            if (r5 == 0) goto L_0x09e3
            long r14 = r3.h     // Catch:{ IOException -> 0x0c00 }
            r23 = 0
            int r5 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r5 != 0) goto L_0x093a
            r29 = r6
            r34 = r9
            r5 = r33
            goto L_0x09e9
        L_0x093a:
            r5 = r33
            defpackage.gwk.a((android.content.Context) r5, (long) r14)     // Catch:{ IOException -> 0x0bfe }
            boolean r14 = defpackage.awrq.h()     // Catch:{ IOException -> 0x0bfe }
            if (r14 == 0) goto L_0x09db
            int r14 = r3.a     // Catch:{ IOException -> 0x0bfe }
            r14 = r14 & 8
            if (r14 == 0) goto L_0x09a7
            aucx r14 = r3.g     // Catch:{ IOException -> 0x0bfe }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException -> 0x0bfe }
        L_0x0951:
            boolean r15 = r14.hasNext()     // Catch:{ IOException -> 0x0bfe }
            if (r15 == 0) goto L_0x09a7
            java.lang.Object r15 = r14.next()     // Catch:{ IOException -> 0x0bfe }
            gzu r15 = (defpackage.gzu) r15     // Catch:{ IOException -> 0x0bfe }
            auay r4 = r15.a     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r4 = r4.l()     // Catch:{ IOException -> 0x0bfe }
            auay r15 = r15.b     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r15 = r15.l()     // Catch:{ IOException -> 0x0bfe }
            boolean r4 = r12.equals(r4)     // Catch:{ IOException -> 0x0bfe }
            if (r4 == 0) goto L_0x09a1
            long r14 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x0978 }
            r29 = r6
            r34 = r9
            goto L_0x09ad
        L_0x0978:
            r0 = move-exception
            iwd r4 = a     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r14 = "NumberFormatException while parsing AID from response"
            r29 = r6
            r34 = r9
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0bfe }
            r4.d(r14, r9)     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r4 = "NumberFormatException parsing AID from response:"
            java.lang.String r6 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x0bfe }
            int r9 = r6.length()     // Catch:{ IOException -> 0x0bfe }
            if (r9 != 0) goto L_0x0999
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0bfe }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0bfe }
            goto L_0x099d
        L_0x0999:
            java.lang.String r6 = r4.concat(r6)     // Catch:{ IOException -> 0x0bfe }
        L_0x099d:
            defpackage.gwd.b((java.lang.String) r6)     // Catch:{ IOException -> 0x0bfe }
            goto L_0x09e9
        L_0x09a1:
            r29 = r6
            r34 = r9
            r4 = 5
            goto L_0x0951
        L_0x09a7:
            r29 = r6
            r34 = r9
            r14 = 0
        L_0x09ad:
            r9 = 0
            int r4 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x09c2
            iwd r4 = a     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r6 = "updateCheckinIdTokenFileFromResponse, Reading existing AID"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0bfe }
            r4.c(r6, r10)     // Catch:{ IOException -> 0x0bfe }
            long r14 = defpackage.gwk.b(r5)     // Catch:{ IOException -> 0x0bfe }
            goto L_0x09c3
        L_0x09c2:
        L_0x09c3:
            int r4 = r3.a     // Catch:{ IOException -> 0x0bfe }
            r4 = r4 & 64
            if (r4 == 0) goto L_0x09d3
            long r9 = r3.h     // Catch:{ IOException -> 0x0bfe }
            r23 = 0
            int r4 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r4 != 0) goto L_0x09d2
            goto L_0x09d3
        L_0x09d2:
            goto L_0x09d7
        L_0x09d3:
            long r9 = defpackage.gwd.b((android.content.Context) r5)     // Catch:{ IOException -> 0x0bfe }
        L_0x09d7:
            defpackage.gwk.a(r5, r14, r9)     // Catch:{ IOException -> 0x0bfe }
            goto L_0x09e9
        L_0x09db:
            r29 = r6
            r34 = r9
            defpackage.gwk.a(r5)     // Catch:{ IOException -> 0x0bfe }
            goto L_0x09e9
        L_0x09e3:
            r29 = r6
            r34 = r9
            r5 = r33
        L_0x09e9:
            android.content.ContentResolver r4 = r5.getContentResolver()     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r6 = "CheckinResponseProcess"
            if (r4 == 0) goto L_0x0b59
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r9.<init>()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r10 = r3.a     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0b53
            aucx r10 = r3.g     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r14 = 0
        L_0x0a03:
            boolean r15 = r10.hasNext()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r15 == 0) goto L_0x0a30
            java.lang.Object r15 = r10.next()     // Catch:{ IOException -> 0x0bfe }
            gzu r15 = (defpackage.gzu) r15     // Catch:{ IOException -> 0x0bfe }
            r26 = r10
            auay r10 = r15.a     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r10 = r10.l()     // Catch:{ IOException -> 0x0bfe }
            auay r15 = r15.b     // Catch:{ IOException -> 0x0bfe }
            java.lang.String r15 = r15.l()     // Catch:{ IOException -> 0x0bfe }
            r9.put(r10, r15)     // Catch:{ IOException -> 0x0bfe }
            boolean r10 = r12.equals(r10)     // Catch:{ IOException -> 0x0bfe }
            if (r10 == 0) goto L_0x0a2d
            defpackage.gwk.a((android.content.Context) r5, (java.lang.String) r15)     // Catch:{ IOException -> 0x0bfe }
            r10 = r26
            r14 = 1
            goto L_0x0a03
        L_0x0a2d:
            r10 = r26
            goto L_0x0a03
        L_0x0a30:
            if (r14 == 0) goto L_0x0a33
            goto L_0x0a44
        L_0x0a33:
            long r14 = defpackage.gwk.b(r5)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r23 = 0
            int r10 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r10 == 0) goto L_0x0a44
            java.lang.String r10 = java.lang.Long.toString(r14)     // Catch:{ IOException -> 0x0bfe }
            defpackage.gwk.a((android.content.Context) r5, (java.lang.String) r10)     // Catch:{ IOException -> 0x0bfe }
        L_0x0a44:
            boolean r10 = r3.e     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r14 = " Context package: "
            java.lang.String r15 = "From server: "
            if (r10 != 0) goto L_0x0aae
            int r10 = r9.size()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r1 = 41
            r12.<init>(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r12.append(r15)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r12.append(r10)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = " gservices [full]"
            r12.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = r12.toString()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.util.Log.i(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.net.Uri r1 = defpackage.jnl.a     // Catch:{ RuntimeException -> 0x0a73 }
            r10 = 0
            r4.update(r1, r9, r10, r10)     // Catch:{ RuntimeException -> 0x0a73 }
            r33 = r11
            goto L_0x0b4f
        L_0x0a73:
            r0 = move-exception
            r1 = r0
            java.lang.String r1 = r1.getMessage()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r10 = r5.getPackageName()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r15 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r15 = r15.length()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r33 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r12 = r12 + 60
            int r12 = r12 + r15
            r11.<init>(r12)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r12 = "Caught exception updating gservices MAIN: "
            r11.append(r12)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r14)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r10)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = r11.toString()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.util.Log.w(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            goto L_0x0b4f
        L_0x0aae:
            r33 = r11
            aucx r1 = r3.f     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
        L_0x0ab6:
            boolean r10 = r1.hasNext()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r10 == 0) goto L_0x0ae1
            java.lang.Object r10 = r1.next()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r26 = r1
            r11 = 0
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r9.put(r10, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            boolean r1 = r12.equals(r10)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r1 == 0) goto L_0x0ade
            java.lang.String r1 = "Removing Android ID from Gservices"
            android.util.Log.w(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = "ERROR: Removing Android ID from Gservices"
            defpackage.gwd.b((java.lang.String) r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r1 = r26
            goto L_0x0ab6
        L_0x0ade:
            r1 = r26
            goto L_0x0ab6
        L_0x0ae1:
            aucx r1 = r3.g     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            aucx r10 = r3.f     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r10 = r10.size()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r12 = 66
            r11.<init>(r12)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r15)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = " gservices updates and "
            r11.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r11.append(r10)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = " deletes"
            r11.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = r11.toString()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.util.Log.i(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.net.Uri r1 = defpackage.jnl.b     // Catch:{ RuntimeException -> 0x0b17 }
            r10 = 0
            r4.update(r1, r9, r10, r10)     // Catch:{ RuntimeException -> 0x0b15 }
            goto L_0x0b4f
        L_0x0b15:
            r0 = move-exception
            goto L_0x0b19
        L_0x0b17:
            r0 = move-exception
            r10 = 0
        L_0x0b19:
            r1 = r0
            java.lang.String r1 = r1.getMessage()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r11 = r5.getPackageName()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r12 = r12.length()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r15 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r15 = r15.length()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r12 = r12 + 65
            int r12 = r12 + r15
            r10.<init>(r12)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r12 = "Caught exception updating gservices MAIN DIFF: "
            r10.append(r12)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r10.append(r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r10.append(r14)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r10.append(r11)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.String r1 = r10.toString()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            android.util.Log.w(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
        L_0x0b4f:
            defpackage.gwb.a(r5, r9, r4)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            goto L_0x0b60
        L_0x0b53:
            r33 = r11
            defpackage.gwb.a(r5, r9, r4)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            goto L_0x0b60
        L_0x0b59:
            r33 = r11
            java.lang.String r1 = "Content Resolver is null, not updating gservices"
            android.util.Log.w(r6, r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
        L_0x0b60:
            int r1 = r3.a     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0b98
            long r3 = r3.h     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0b9a
            defpackage.gwk.e(r5)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            long r3 = defpackage.gwk.b(r5)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0b7b
            r1 = 1
            goto L_0x0b7c
        L_0x0b7b:
            r1 = 0
        L_0x0b7c:
            aucd r3 = r8.c     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            boolean r4 = r3.c     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r4 != 0) goto L_0x0b83
            goto L_0x0b89
        L_0x0b83:
            r3.c()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r4 = 0
            r3.c = r4     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
        L_0x0b89:
            aucj r3 = r3.b     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            gzb r3 = (defpackage.gzb) r3     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            gzb r4 = defpackage.gzb.j     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            int r4 = r3.a     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r4 = r4 | 32
            r3.a = r4     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r3.g = r1     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            goto L_0x0b9a
        L_0x0b98:
            r9 = 0
        L_0x0b9a:
            java.lang.String r1 = "update_id_token"
            a(r1, r7, r2, r13)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            b(r2, r13)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            anaf r3 = r7.a()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            amzn r3 = r3.values()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            boolean r3 = r2.d     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r3 != 0) goto L_0x0bc8
            boolean r3 = r2.j     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            if (r3 != 0) goto L_0x0bc8
            r3 = 6
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r4 = 0
            r1.add(r4, r3)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            java.lang.Object[] r1 = r1.toArray()     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            defpackage.gwd.a((java.lang.Object[]) r1)     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
        L_0x0bc8:
            r1 = r33
            boolean r1 = r1.b     // Catch:{ IOException -> 0x0bfa, all -> 0x0bf5 }
            r22 = r22 | r1
            r1 = r48
            java.util.ArrayList r3 = r1.g     // Catch:{ IOException -> 0x0bfe }
            gzb r4 = r8.a()     // Catch:{ IOException -> 0x0bfe }
            r3.add(r4)     // Catch:{ IOException -> 0x0bfe }
            gzc r3 = new gzc     // Catch:{ IOException -> 0x0bfe }
            amtd r4 = defpackage.ampt.a     // Catch:{ IOException -> 0x0bfe }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0bfe }
            int r12 = r32 + 1
            r8 = r3
            r4 = r5
            r15 = r27
            r7 = r28
            r14 = r29
            r5 = r30
            r6 = r31
            r9 = r34
            r3 = r37
            r13 = 1
            goto L_0x035c
        L_0x0bf5:
            r0 = move-exception
            r1 = r48
            goto L_0x0ccb
        L_0x0bfa:
            r0 = move-exception
            r1 = r48
            goto L_0x0c03
        L_0x0bfe:
            r0 = move-exception
            goto L_0x0c03
        L_0x0c00:
            r0 = move-exception
            r5 = r33
        L_0x0c03:
            r3 = r0
        L_0x0c04:
            r12 = r25
            r6 = r32
            goto L_0x08e5
        L_0x0c0a:
            r12 = r25
            r5 = r33
            goto L_0x0c6e
        L_0x0c10:
            r0 = move-exception
            r12 = r25
            r5 = r33
            goto L_0x0c5a
        L_0x0c16:
            r0 = move-exception
            r5 = r4
            r12 = r25
            r3 = r0
        L_0x0c1b:
            r8.b()     // Catch:{ IOException -> 0x0c1f }
            throw r3     // Catch:{ IOException -> 0x0c1f }
        L_0x0c1f:
            r0 = move-exception
            goto L_0x0c5a
        L_0x0c21:
            r0 = move-exception
            r5 = r4
            goto L_0x0c2d
        L_0x0c24:
            r0 = move-exception
            r5 = r4
            goto L_0x0c2b
        L_0x0c27:
            r0 = move-exception
            r5 = r4
            r31 = r6
        L_0x0c2b:
            r32 = r12
        L_0x0c2d:
            r12 = r25
            goto L_0x0c5a
        L_0x0c30:
            r0 = move-exception
            r30 = r5
            r31 = r6
            goto L_0x0c3d
        L_0x0c36:
            r0 = move-exception
            r30 = r5
            r31 = r6
            r28 = r7
        L_0x0c3d:
            r32 = r12
            goto L_0x0c57
        L_0x0c40:
            r0 = move-exception
            r30 = r5
            r31 = r6
            r28 = r7
            r32 = r12
            goto L_0x0c55
        L_0x0c4a:
            r0 = move-exception
            r30 = r5
            r31 = r6
            r28 = r7
            r32 = r12
            r26 = r13
        L_0x0c55:
            r27 = r15
        L_0x0c57:
            r12 = r25
            r5 = r4
        L_0x0c5a:
            r3 = r0
            r6 = r32
            goto L_0x0cdd
        L_0x0c5f:
            r30 = r5
            r31 = r6
            r28 = r7
            r32 = r12
            r26 = r13
            r27 = r15
            r12 = r25
            r5 = r4
        L_0x0c6e:
            boolean r3 = r2.j     // Catch:{ IOException -> 0x0cb9 }
            if (r3 == 0) goto L_0x0c73
            goto L_0x0c76
        L_0x0c73:
            defpackage.gwk.g(r5)     // Catch:{ IOException -> 0x0cb9 }
        L_0x0c76:
            iwd r3 = a     // Catch:{ IOException -> 0x0cb9 }
            r4 = 3
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0cb9 }
            java.lang.String r4 = r2.f     // Catch:{ IOException -> 0x0cb9 }
            r7 = 0
            r6[r7] = r4     // Catch:{ IOException -> 0x0cb9 }
            java.lang.String r4 = r2.q     // Catch:{ IOException -> 0x0cb9 }
            r7 = 1
            r6[r7] = r4     // Catch:{ IOException -> 0x0cb9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r32)     // Catch:{ IOException -> 0x0cb9 }
            r7 = 2
            r6[r7] = r4     // Catch:{ IOException -> 0x0cb9 }
            java.lang.String r4 = "%s : Checkin Succeeded: %s (fragment #%d)."
            r3.c(r4, r6)     // Catch:{ IOException -> 0x0cb9 }
            boolean r3 = r2.j     // Catch:{ IOException -> 0x0cb2 }
            if (r3 == 0) goto L_0x0c96
            goto L_0x0ca7
        L_0x0c96:
            if (r12 == 0) goto L_0x0c9a
            r3 = 1
            goto L_0x0c9b
        L_0x0c9a:
            r3 = 0
        L_0x0c9b:
            if (r22 != 0) goto L_0x0c9f
            r4 = 0
            goto L_0x0ca0
        L_0x0c9f:
            r4 = 1
        L_0x0ca0:
            r6 = r32
            r7 = 1
            a(r2, r7, r6, r3, r4)     // Catch:{ IOException -> 0x0cb0 }
        L_0x0ca7:
            android.os.Process.setThreadPriority(r30)
            r9 = r12
            r13 = r21
            r12 = 0
            goto L_0x0d4d
        L_0x0cb0:
            r0 = move-exception
            goto L_0x0cb5
        L_0x0cb2:
            r0 = move-exception
            r6 = r32
        L_0x0cb5:
            r3 = r0
            r26 = 0
            goto L_0x0cdd
        L_0x0cb9:
            r0 = move-exception
            r6 = r32
            r3 = r0
            goto L_0x0cdd
        L_0x0cbe:
            r0 = move-exception
            r30 = r5
            r31 = r6
            r28 = r7
            r27 = r15
            goto L_0x0cd7
        L_0x0cc8:
            r0 = move-exception
            r30 = r5
        L_0x0ccb:
            r2 = r0
            goto L_0x0d99
        L_0x0cce:
            r0 = move-exception
            r30 = r5
            r31 = r6
            r28 = r7
            r27 = r10
        L_0x0cd7:
            r5 = r4
            r3 = r0
            r6 = 0
            r12 = 0
            r26 = 0
        L_0x0cdd:
            iwd r4 = a     // Catch:{ all -> 0x0d96 }
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0d96 }
            java.lang.String r9 = r2.f     // Catch:{ all -> 0x0d96 }
            r10 = 0
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            java.lang.String r9 = r2.q     // Catch:{ all -> 0x0d96 }
            r10 = 1
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0d96 }
            r10 = 2
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            java.lang.String r9 = r3.getMessage()     // Catch:{ all -> 0x0d96 }
            r10 = 3
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            java.lang.String r9 = "%s : Checkin failed: %s (fragment #%d) %s"
            r4.d(r9, r3, r7)     // Catch:{ all -> 0x0d96 }
            int r3 = r1.f     // Catch:{ all -> 0x0d96 }
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0d96 }
            java.lang.String r9 = "CheckinTask:ReceivedFailedResponse"
            r10 = 0
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0d96 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0d96 }
            r10 = 1
            r7[r10] = r9     // Catch:{ all -> 0x0d96 }
            defpackage.gwd.a((java.lang.Object[]) r7)     // Catch:{ all -> 0x0d96 }
            boolean r7 = r1.e     // Catch:{ all -> 0x0d96 }
            if (r7 != 0) goto L_0x0d22
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0d96 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0d96 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0d96 }
            goto L_0x0d25
        L_0x0d22:
            defpackage.gwk.f(r5)     // Catch:{ all -> 0x0d96 }
        L_0x0d25:
            boolean r5 = r2.j     // Catch:{ all -> 0x0d96 }
            if (r5 != 0) goto L_0x0d33
            if (r12 == 0) goto L_0x0d2d
            r5 = 1
            goto L_0x0d2e
        L_0x0d2d:
            r5 = 0
        L_0x0d2e:
            r7 = 0
            a(r2, r7, r6, r5, r7)     // Catch:{ all -> 0x0d96 }
        L_0x0d33:
            if (r26 != 0) goto L_0x0d37
            r6 = 2
            goto L_0x0d38
        L_0x0d37:
            r6 = 1
        L_0x0d38:
            amsn r2 = r8.a     // Catch:{ all -> 0x0d96 }
            boolean r2 = r2.a     // Catch:{ all -> 0x0d96 }
            if (r2 == 0) goto L_0x0d47
            java.util.ArrayList r2 = r1.g     // Catch:{ all -> 0x0d96 }
            gzb r4 = r8.a()     // Catch:{ all -> 0x0d96 }
            r2.add(r4)     // Catch:{ all -> 0x0d96 }
        L_0x0d47:
            android.os.Process.setThreadPriority(r30)
            r13 = r3
            r9 = r12
            r12 = r6
        L_0x0d4d:
            gvx r2 = new gvx
            aucj r3 = r31.i()
            r11 = r3
            gzr r11 = (defpackage.gzr) r11
            java.util.ArrayList r14 = r1.g
            amri r3 = r1.c
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0d82
            amri r3 = r1.c
            java.lang.Object r3 = r3.b()
            gvy r3 = (defpackage.gvy) r3
            amri r4 = r3.b
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x0d7a
            amri r3 = r3.b
            java.lang.Object r3 = r3.b()
            gzo r3 = (defpackage.gzo) r3
            r15 = r3
            goto L_0x0d8f
        L_0x0d7a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Request is not generated yet."
            r2.<init>(r3)
            throw r2
        L_0x0d82:
            java.lang.Object r3 = r28.b()
            hcw r3 = (defpackage.hcw) r3
            hcv r3 = r3.a()
            gzo r3 = r3.b
            r15 = r3
        L_0x0d8f:
            r8 = r2
            r10 = r27
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r2
        L_0x0d96:
            r0 = move-exception
            goto L_0x0ccb
        L_0x0d99:
            android.os.Process.setThreadPriority(r30)
            goto L_0x0d9e
        L_0x0d9d:
            throw r2
        L_0x0d9e:
            goto L_0x0d9d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwa.a(gwr):gvx");
    }
}
