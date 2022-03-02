package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: gvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gvu {
    private static final Pattern a = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F][:-]?){5}[0-9a-fA-F][0-9a-fA-F]$");
    private static final Map b;
    private static final File c = new File("/system/etc/security/otacerts.zip");
    private static final Pattern d = Pattern.compile("^(([0-9]{15})|([0-9a-fA-F]{14}))$");
    private static final Pattern e = Pattern.compile("^([0-9a-fA-F]{8})$");
    private static final Pattern f = Pattern.compile("^([0-9]{0,15})$");

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("client_id", han.BASE_CLIENT_ID);
        b.put("search_client_id", han.SEARCH_CLIENT_ID);
        b.put("voicesearch_client_id", han.VOICESEARCH_CLIENT_ID);
        b.put("maps_client_id", han.MAPS_CLIENT_ID);
        b.put("youtube_client_id", han.YOUTUBE_CLIENT_ID);
        b.put("market_client_id", han.MARKET_CLIENT_ID);
        b.put("shopper_client_id", han.SHOPPER_CLIENT_ID);
        b.put("wallet_client_id", han.WALLET_CLIENT_ID);
        b.put("chrome_client_id", han.CHROME_CLIENT_ID);
    }

    public static void b(Context context, aucd aucd) {
        had had = ((gzr) aucd.b).l;
        if (had == null) {
            had = had.o;
        }
        aucd aucd2 = (aucd) had.c(5);
        aucd2.a((aucj) had);
        hal h = gwd.h(context);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        had had2 = (had) aucd2.b;
        had2.k = h.i;
        had2.a |= 1024;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr = (gzr) aucd.b;
        had had3 = (had) aucd2.i();
        gzr gzr2 = gzr.A;
        had3.getClass();
        gzr.l = had3;
        gzr.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public static void c(Context context, aucd aucd) {
        String j = gwk.j(context);
        String k = gwk.k(context);
        if (j != null && k != null) {
            aucd o = gzt.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzt gzt = (gzt) o.b;
            j.getClass();
            int i = gzt.a | 1;
            gzt.a = i;
            gzt.b = j;
            k.getClass();
            gzt.a = i | 2;
            gzt.c = k;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            gzt gzt2 = (gzt) o.i();
            gzr gzr2 = gzr.A;
            gzt2.getClass();
            gzr.x = gzt2;
            gzr.a |= 4194304;
        }
    }

    public static void d(Context context, aucd aucd) {
        if (jix.a(context)) {
            gzq gzq = gzq.SW_DEVICE;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            gzr gzr2 = gzr.A;
            gzr.w = gzq.d;
            gzr.a |= 2097152;
        } else if (jix.b(context)) {
            gzq gzq2 = gzq.LATCHSKY_DEVICE;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr3 = (gzr) aucd.b;
            gzr gzr4 = gzr.A;
            gzr3.w = gzq2.d;
            gzr3.a |= 2097152;
        } else {
            gzq gzq3 = gzq.NO_RESTRICTION;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr5 = (gzr) aucd.b;
            gzr gzr6 = gzr.A;
            gzr5.w = gzq3.d;
            gzr5.a |= 2097152;
        }
    }

    public static void e(Context context, aucd aucd) {
        aucd aucd2;
        gzr gzr = (gzr) aucd.b;
        if ((gzr.a & 16384) != 0) {
            haa haa = gzr.q;
            if (haa == null) {
                haa = haa.y;
            }
            aucd2 = (aucd) haa.c(5);
            aucd2.a((aucj) haa);
        } else {
            aucd2 = haa.y.o();
        }
        jiw.a(context, aucd2);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr2 = (gzr) aucd.b;
        haa haa2 = (haa) aucd2.i();
        gzr gzr3 = gzr.A;
        haa2.getClass();
        gzr2.q = haa2;
        gzr2.a |= 16384;
    }

    public static void f(Context context, aucd aucd) {
        int i;
        gzr gzr = (gzr) aucd.b;
        if (((gzr.a & 32768) == 0 || gzr.r == 0) && Math.random() < awrq.q()) {
            String str = null;
            try {
                gzr gzr2 = (gzr) aucd.i();
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(gwk.b(context));
                sb.append(':');
                if ((gzr2.a & 1) != 0) {
                    sb.append(gzr2.b);
                    sb.append(':');
                }
                if ((gzr2.a & 2) != 0) {
                    sb.append(gzr2.c);
                    sb.append(':');
                }
                if ((gzr2.a & 8) != 0) {
                    sb.append(gzr2.g);
                    sb.append(':');
                }
                if ((gzr2.a & 4) != 0) {
                    sb.append(gzr2.f);
                    sb.append(':');
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < gzr2.d.size()) {
                    sb.append((String) gzr2.d.get(i));
                    sb.append(':');
                    sb.append((String) gzr2.e.get(i));
                    sb.append(':');
                    i++;
                }
                byte[] bytes = sb.toString().getBytes(amqn.c);
                MessageDigest b2 = jhg.b("SHA-1");
                if (b2 != null) {
                    b2.update(bytes);
                    hashMap.put("CONTENT_BINDER", Base64.encodeToString(b2.digest(), 2));
                } else {
                    Log.e("CheckinRequestBuilder", "no support for SHA-1");
                }
                str = lxz.a(context, "checkin", (Map) hashMap);
            } catch (RuntimeException e2) {
                Log.i("CheckinRequestBuilder", "Droidguard runtime exception: ", e2);
            } catch (NoClassDefFoundError e3) {
                Log.i("CheckinRequestBuilder", "Failed to exercise Droidguard client method", e3);
            }
            if (str != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                gzr gzr3 = (gzr) aucd.b;
                gzr gzr4 = gzr.A;
                str.getClass();
                gzr3.a |= 524288;
                gzr3.u = str;
            }
        }
    }

    public static void g(Context context, aucd aucd) {
        String string = gwk.l(context).getString("CheckinService_deviceDataVersionInfo", (String) null);
        if (string != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            gzr gzr2 = gzr.A;
            string.getClass();
            gzr.a |= 1048576;
            gzr.v = string;
        }
    }

    public static void h(Context context, aucd aucd) {
        jnl a2 = jnl.a();
        String e2 = a2.e(context);
        if (e2 != null) {
            a(context, e2, aucd);
            return;
        }
        String d2 = a2.d(context);
        if (d2 != null) {
            a(context, d2, aucd);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0293, code lost:
        if (r20.getTimeMillis() > r12) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d8, code lost:
        throw new java.lang.RuntimeException("ISO-8859-1 not supported?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r1 = r0;
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0195, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0197, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03e4 A[SYNTHETIC, Splitter:B:182:0x03e4] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03f2 A[Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x03de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0123 A[ExcHandler: all (r0v15 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r20 
      PHI: (r20v12 android.os.DropBoxManager$Entry) = (r20v5 android.os.DropBoxManager$Entry), (r20v5 android.os.DropBoxManager$Entry), (r20v5 android.os.DropBoxManager$Entry), (r20v4 android.os.DropBoxManager$Entry), (r20v4 android.os.DropBoxManager$Entry) binds: [B:163:0x0369, B:171:0x038d, B:76:0x0136, B:27:0x0075, B:56:0x00dc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:27:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.os.DropBoxManager r28, java.util.Map r29, long r30, defpackage.aucd r32) {
        /*
            r1 = r28
            r2 = r30
            r4 = r32
            java.lang.String r5 = "event_log"
            java.lang.String r6 = "CheckinRequestBuilder"
            java.lang.Long r7 = java.lang.Long.valueOf(r30)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            android.util.Pair r7 = android.util.Pair.create(r7, r8)
            r9 = 0
            java.lang.String r11 = defpackage.awrq.f()     // Catch:{ IOException -> 0x043d, SecurityException -> 0x043b, all -> 0x0434 }
            if (r11 == 0) goto L_0x003a
            java.util.regex.Pattern r13 = defpackage.aeeg.c     // Catch:{ IOException -> 0x0033, SecurityException -> 0x0031, all -> 0x002c }
            java.util.regex.Matcher r11 = r13.matcher(r11)     // Catch:{ IOException -> 0x0033, SecurityException -> 0x0031, all -> 0x002c }
            boolean r11 = r11.matches()     // Catch:{ IOException -> 0x0033, SecurityException -> 0x0031, all -> 0x002c }
            if (r11 == 0) goto L_0x003a
            r11 = 1
            goto L_0x003b
        L_0x002c:
            r0 = move-exception
            r1 = r0
            r5 = r9
            goto L_0x0437
        L_0x0031:
            r0 = move-exception
            goto L_0x0034
        L_0x0033:
            r0 = move-exception
        L_0x0034:
            r1 = r0
            r22 = r7
            r5 = r9
            goto L_0x0442
        L_0x003a:
            r11 = 0
        L_0x003b:
            android.os.DropBoxManager$Entry r13 = r1.getNextEntry(r9, r2)     // Catch:{ IOException -> 0x043d, SecurityException -> 0x043b, all -> 0x0434 }
            android.os.DropBoxManager$Entry r14 = r1.getNextEntry(r5, r2)     // Catch:{ IOException -> 0x042c, SecurityException -> 0x042a, all -> 0x0423 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            r15.<init>()     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r8]     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            r12.<init>()     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            r10.<init>()     // Catch:{ IOException -> 0x041e, SecurityException -> 0x041c, all -> 0x0419 }
            r17 = -1
            r22 = r7
            r20 = r17
            r7 = 0
            r8 = 0
            r19 = 0
        L_0x0061:
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r8 >= r4) goto L_0x03de
            if (r14 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            if (r13 == 0) goto L_0x03d9
        L_0x006a:
            r4 = r12
            r26 = r20
            r20 = r13
            r12 = r26
        L_0x0071:
            r21 = r7
            if (r14 == 0) goto L_0x0131
            int r7 = r15.size()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r24 = r9
            r9 = 2
            if (r7 < r9) goto L_0x0085
            int r7 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0085
            r2 = r4
            goto L_0x0134
        L_0x0085:
            if (r19 != 0) goto L_0x009a
            java.io.InputStream r7 = r14.getInputStream()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r7 == 0) goto L_0x009a
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r3 = 4096(0x1000, float:5.74E-42)
            r9.<init>(r2, r3)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            goto L_0x009e
        L_0x009a:
            r3 = 4096(0x1000, float:5.74E-42)
            r9 = r19
        L_0x009e:
            r15.clear()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r9 == 0) goto L_0x0103
            boolean r2 = defpackage.ish.a((java.io.BufferedReader) r9, (java.util.List) r15)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r2 == 0) goto L_0x0103
            int r2 = r15.size()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r7 = 4
            if (r2 >= r7) goto L_0x00b6
            java.lang.String r2 = "event_log tagname does not exist"
            android.util.Log.e(r6, r2)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            goto L_0x0103
        L_0x00b6:
            boolean r2 = r15.isEmpty()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r2 != 0) goto L_0x00ff
            r2 = 0
            java.lang.Object r7 = r15.get(r2)     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00d7 }
            r2 = 46
            int r2 = r7.indexOf(r2)     // Catch:{ NumberFormatException -> 0x00d7 }
            r12 = -1
            if (r2 != r12) goto L_0x00cd
            goto L_0x00d2
        L_0x00cd:
            r12 = 0
            java.lang.String r7 = r7.substring(r12, r2)     // Catch:{ NumberFormatException -> 0x00d7 }
        L_0x00d2:
            long r12 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x00d7 }
            goto L_0x00ff
        L_0x00d7:
            r0 = move-exception
            r2 = r0
            java.lang.String r7 = "Can't parse event_log timestamp: "
            r12 = 0
            java.lang.Object r13 = r15.get(r12)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            java.lang.String r12 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            int r13 = r12.length()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r13 != 0) goto L_0x00f2
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r12.<init>(r7)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            goto L_0x00f6
        L_0x00f2:
            java.lang.String r12 = r7.concat(r12)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
        L_0x00f6:
            android.util.Log.e(r6, r12, r2)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r2 = r4
            r19 = r9
            r12 = r17
            goto L_0x011a
        L_0x00ff:
            r2 = r4
            r19 = r9
            goto L_0x011a
        L_0x0103:
            r2 = r4
            long r3 = r14.getTimeMillis()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            if (r9 != 0) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r9.close()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
        L_0x010e:
            r14.close()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r15.clear()     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            android.os.DropBoxManager$Entry r14 = r1.getNextEntry(r5, r3)     // Catch:{ IOException -> 0x012b, SecurityException -> 0x0129, all -> 0x0123 }
            r19 = 0
        L_0x011a:
            r4 = r2
            r7 = r21
            r9 = r24
            r2 = r30
            goto L_0x0071
        L_0x0123:
            r0 = move-exception
            r1 = r0
            r9 = r20
            goto L_0x04db
        L_0x0129:
            r0 = move-exception
            goto L_0x012c
        L_0x012b:
            r0 = move-exception
        L_0x012c:
            r1 = r0
            r9 = r20
            goto L_0x0444
        L_0x0131:
            r2 = r4
            r24 = r9
        L_0x0134:
            if (r20 == 0) goto L_0x0199
            java.lang.String r3 = r20.getTag()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r4 = r3.equals(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 == 0) goto L_0x014b
            int r4 = r20.getFlags()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r7 = 1
            r4 = r4 & r7
            if (r4 != 0) goto L_0x014b
            r4 = r29
            goto L_0x0188
        L_0x014b:
            java.lang.String r4 = "checkin_dropbox_upload:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r7 = r3.length()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r7 != 0) goto L_0x015d
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x0161
        L_0x015d:
            java.lang.String r3 = r4.concat(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x0161:
            r4 = r29
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r3 == 0) goto L_0x0177
            java.util.regex.Pattern r7 = defpackage.aeeg.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.util.regex.Matcher r7 = r7.matcher(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r7 = r7.matches()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r7 != 0) goto L_0x0199
        L_0x0177:
            if (r11 == 0) goto L_0x0188
            if (r3 == 0) goto L_0x0199
            java.util.regex.Pattern r7 = defpackage.aeeg.d     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.util.regex.Matcher r3 = r7.matcher(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r3 = r3.matches()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r3 != 0) goto L_0x0188
            goto L_0x0199
        L_0x0188:
            long r3 = r20.getTimeMillis()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r20.close()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r7 = 0
            android.os.DropBoxManager$Entry r20 = r1.getNextEntry(r7, r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x0134
        L_0x0195:
            r0 = move-exception
            goto L_0x012c
        L_0x0197:
            r0 = move-exception
            goto L_0x012c
        L_0x0199:
            if (r14 == 0) goto L_0x0287
            if (r20 != 0) goto L_0x019e
            goto L_0x01a8
        L_0x019e:
            long r3 = r20.getTimeMillis()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r7 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x01a8
            goto L_0x0287
        L_0x01a8:
            hah r3 = defpackage.hah.e     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            aucd r7 = r3.o()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3 = 3
            java.lang.Object r3 = r15.get(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r4 = r7.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 != 0) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            r7.c()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 0
            r7.c = r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x01c0:
            aucj r4 = r7.b     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r4 = (defpackage.hah) r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.getClass()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r4.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r16 = 1
            r9 = r9 | 1
            r4.a = r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4.b = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3 = r9 | 4
            r4.a = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4.d = r12     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r3 = r15.size()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 5
            if (r3 != r4) goto L_0x0202
            r3 = 4
            java.lang.Object r3 = r15.get(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r4 = r7.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 != 0) goto L_0x01ea
            goto L_0x01f0
        L_0x01ea:
            r7.c()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 0
            r7.c = r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x01f0:
            aucj r4 = r7.b     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r4 = (defpackage.hah) r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.getClass()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r4.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r21 = 2
            r9 = r9 | 2
            r4.a = r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4.c = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x0250
        L_0x0202:
            int r3 = r15.size()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 5
            if (r3 <= r4) goto L_0x0250
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.<init>()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 4
            java.lang.Object r4 = r15.get(r4)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            defpackage.ish.a((java.lang.String) r4, (java.lang.Appendable) r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 5
        L_0x0219:
            int r9 = r15.size()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 >= r9) goto L_0x0230
            r9 = 44
            r3.append(r9)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.Object r9 = r15.get(r4)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            defpackage.ish.a((java.lang.String) r9, (java.lang.Appendable) r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r4 = r4 + 1
            goto L_0x0219
        L_0x0230:
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r4 = r7.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 != 0) goto L_0x0239
            goto L_0x023f
        L_0x0239:
            r7.c()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 0
            r7.c = r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x023f:
            aucj r4 = r7.b     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r4 = (defpackage.hah) r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.getClass()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r4.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r21 = 2
            r9 = r9 | 2
            r4.a = r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4.c = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x0250:
            aucj r3 = r7.i()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r4 = r3.U     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r9 = -1
            if (r4 != r9) goto L_0x0268
            aueh r4 = defpackage.aueh.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            aueq r4 = r4.a((java.lang.Object) r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r4 = r4.b(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.U = r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x0269
        L_0x0268:
        L_0x0269:
            r3 = 1
            int r4 = r4 + r3
            int r8 = r8 + r4
            aucj r3 = r7.i()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r10.add(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r15.clear()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = r32
            r9 = r24
            r26 = r12
            r12 = r2
            r2 = r30
            r13 = r20
            r20 = r26
            goto L_0x0061
        L_0x0287:
            if (r20 != 0) goto L_0x028a
            goto L_0x0295
        L_0x028a:
            if (r14 != 0) goto L_0x028d
            goto L_0x02a6
        L_0x028d:
            long r3 = r20.getTimeMillis()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a6
        L_0x0295:
            r4 = r32
            r7 = r21
            r9 = r24
            r26 = r12
            r12 = r2
            r2 = r30
            r13 = r20
            r20 = r26
            goto L_0x0061
        L_0x02a6:
            hah r3 = defpackage.hah.e     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            aucd r7 = r3.o()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r3 = r20.getTag()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r4 = r7.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r4 != 0) goto L_0x02b5
            goto L_0x02bb
        L_0x02b5:
            r7.c()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = 0
            r7.c = r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x02bb:
            aucj r4 = r7.b     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r4 = (defpackage.hah) r4     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.getClass()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r4.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r16 = 1
            r9 = r9 | 1
            r4.a = r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4.b = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            long r3 = r20.getTimeMillis()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            boolean r9 = r7.c     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r9 != 0) goto L_0x02d5
            goto L_0x02db
        L_0x02d5:
            r7.c()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r9 = 0
            r7.c = r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x02db:
            aucj r9 = r7.b     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r9 = (defpackage.hah) r9     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r25 = r5
            int r5 = r9.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r21 = 4
            r5 = r5 | 4
            r9.a = r5     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r9.d = r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r2.reset()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.io.InputStream r3 = r20.getInputStream()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x02f2:
            if (r3 == 0) goto L_0x035b
            r4 = r24
            int r5 = r3.read(r4)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r5 <= 0) goto L_0x0358
            int r9 = r2.size()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r23 = r11
            r11 = 196608(0x30000, float:2.75506E-40)
            int r9 = r11 - r9
            int r9 = java.lang.Math.min(r9, r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r11 = 0
            r2.write(r4, r11, r9)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            if (r9 >= r5) goto L_0x0353
            java.lang.String r5 = r20.getTag()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r9 = r9 + 49
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r9 = "Truncating "
            r11.append(r9)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r11.append(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r5 = " entry to "
            r11.append(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r5 = 196608(0x30000, float:2.75506E-40)
            r11.append(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r5 = " bytes for upload"
            r11.append(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r5 = r11.toString()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            android.util.Log.w(r6, r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r5 = r20.getFlags()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r9 = 2
            r5 = r5 & r9
            if (r5 == 0) goto L_0x035f
            java.lang.String r5 = "\n=== TRUNCATED FOR UPLOAD ===\n"
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r2.write(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x035f
        L_0x0353:
            r24 = r4
            r11 = r23
            goto L_0x02f2
        L_0x0358:
            r23 = r11
            goto L_0x035f
        L_0x035b:
            r23 = r11
            r4 = r24
        L_0x035f:
            if (r3 != 0) goto L_0x0362
            goto L_0x0365
        L_0x0362:
            r3.close()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x0365:
            byte[] r3 = r2.toByteArray()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r5 = r3.length     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            if (r5 <= 0) goto L_0x038d
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            java.lang.String r9 = "ISO-8859-1"
            r5.<init>(r3, r9)     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            boolean r3 = r7.c     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            if (r3 != 0) goto L_0x0378
            goto L_0x037e
        L_0x0378:
            r7.c()     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            r3 = 0
            r7.c = r3     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
        L_0x037e:
            aucj r3 = r7.b     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            hah r3 = (defpackage.hah) r3     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            r5.getClass()     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            int r9 = r3.a     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            r11 = 2
            r9 = r9 | r11
            r3.a = r9     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
            r3.c = r5     // Catch:{ UnsupportedEncodingException -> 0x03d0 }
        L_0x038d:
            aucj r3 = r7.i()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r3 = (defpackage.hah) r3     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r5 = r3.U     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r9 = -1
            if (r5 != r9) goto L_0x03a5
            aueh r5 = defpackage.aueh.a     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            aueq r5 = r5.a((java.lang.Object) r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            int r5 = r5.b(r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r3.U = r5     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            goto L_0x03a6
        L_0x03a5:
        L_0x03a6:
            r3 = 1
            int r5 = r5 + r3
            int r8 = r8 + r5
            aucj r5 = r7.i()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            hah r5 = (defpackage.hah) r5     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r10.add(r5)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r24 = r4
            long r3 = r20.getTimeMillis()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r20.close()     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r5 = 0
            android.os.DropBoxManager$Entry r3 = r1.getNextEntry(r5, r3)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            r4 = r32
            r20 = r12
            r11 = r23
            r9 = r24
            r5 = r25
            r12 = r2
            r13 = r3
            r2 = r30
            goto L_0x0061
        L_0x03d0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            java.lang.String r2 = "ISO-8859-1 not supported?"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
            throw r1     // Catch:{ IOException -> 0x0197, SecurityException -> 0x0195, all -> 0x0123 }
        L_0x03d9:
            r21 = r7
            r20 = r13
            goto L_0x03e2
        L_0x03de:
            r21 = r7
            r20 = r13
        L_0x03e2:
            if (r19 == 0) goto L_0x03f0
            r19.close()     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            goto L_0x03f0
        L_0x03e8:
            r0 = move-exception
            r1 = r0
            goto L_0x0403
        L_0x03eb:
            r0 = move-exception
            goto L_0x03ee
        L_0x03ed:
            r0 = move-exception
        L_0x03ee:
            r1 = r0
            goto L_0x0407
        L_0x03f0:
            if (r21 == 0) goto L_0x040a
            r7 = r21
            aucj r1 = r7.b     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            hah r1 = (defpackage.hah) r1     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            long r1 = r1.d     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            android.util.Pair r7 = android.util.Pair.create(r1, r10)     // Catch:{ IOException -> 0x03ed, SecurityException -> 0x03eb, all -> 0x03e8 }
            goto L_0x040c
        L_0x0403:
            r9 = r20
            goto L_0x04db
        L_0x0407:
            r9 = r20
            goto L_0x0444
        L_0x040a:
            r7 = r22
        L_0x040c:
            if (r20 == 0) goto L_0x0411
            r20.close()
        L_0x0411:
            if (r14 != 0) goto L_0x0415
            goto L_0x0457
        L_0x0415:
            r14.close()
            goto L_0x0457
        L_0x0419:
            r0 = move-exception
            r1 = r0
            goto L_0x0427
        L_0x041c:
            r0 = move-exception
            goto L_0x041f
        L_0x041e:
            r0 = move-exception
        L_0x041f:
            r22 = r7
            r1 = r0
            goto L_0x0432
        L_0x0423:
            r0 = move-exception
            r5 = r9
            r1 = r0
            r14 = r5
        L_0x0427:
            r9 = r13
            goto L_0x04db
        L_0x042a:
            r0 = move-exception
            goto L_0x042d
        L_0x042c:
            r0 = move-exception
        L_0x042d:
            r22 = r7
            r5 = r9
            r1 = r0
            r14 = r5
        L_0x0432:
            r9 = r13
            goto L_0x0444
        L_0x0434:
            r0 = move-exception
            r5 = r9
            r1 = r0
        L_0x0437:
            r9 = r5
            r14 = r9
            goto L_0x04db
        L_0x043b:
            r0 = move-exception
            goto L_0x043e
        L_0x043d:
            r0 = move-exception
        L_0x043e:
            r22 = r7
            r5 = r9
            r1 = r0
        L_0x0442:
            r9 = r5
            r14 = r9
        L_0x0444:
            java.lang.String r2 = "Can't copy dropbox data"
            android.util.Log.e(r6, r2, r1)     // Catch:{ all -> 0x04d9 }
            if (r9 == 0) goto L_0x044e
            r9.close()
        L_0x044e:
            if (r14 == 0) goto L_0x0454
            r14.close()
            goto L_0x0455
        L_0x0454:
        L_0x0455:
            r7 = r22
        L_0x0457:
            r1 = r32
            aucj r2 = r1.b
            gzr r2 = (defpackage.gzr) r2
            had r2 = r2.l
            if (r2 != 0) goto L_0x0463
            had r2 = defpackage.had.o
        L_0x0463:
            r3 = 5
            java.lang.Object r3 = r2.c(r3)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r2)
            boolean r2 = r3.c
            if (r2 == 0) goto L_0x0478
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x0478:
            aucj r2 = r3.b
            had r2 = (defpackage.had) r2
            int r4 = r2.a
            r4 = r4 | 8
            r2.a = r4
            r4 = r30
            r2.c = r4
            java.lang.Object r2 = r7.second
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x048f
            goto L_0x0495
        L_0x048f:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x0495:
            aucj r4 = r3.b
            had r4 = (defpackage.had) r4
            aucx r5 = r4.e
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x04a9
            aucx r5 = r4.e
            aucx r5 = defpackage.aucj.a((defpackage.aucx) r5)
            r4.e = r5
        L_0x04a9:
            aucx r4 = r4.e
            defpackage.auab.a((java.lang.Iterable) r2, (java.util.List) r4)
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x04b3
            goto L_0x04b9
        L_0x04b3:
            r32.c()
            r2 = 0
            r1.c = r2
        L_0x04b9:
            aucj r1 = r1.b
            gzr r1 = (defpackage.gzr) r1
            aucj r2 = r3.i()
            had r2 = (defpackage.had) r2
            gzr r3 = defpackage.gzr.A
            r2.getClass()
            r1.l = r2
            int r2 = r1.a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r1.a = r2
            java.lang.Object r1 = r7.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            return r1
        L_0x04d9:
            r0 = move-exception
            r1 = r0
        L_0x04db:
            if (r9 == 0) goto L_0x04e0
            r9.close()
        L_0x04e0:
            if (r14 == 0) goto L_0x04e5
            r14.close()
        L_0x04e5:
            goto L_0x04e7
        L_0x04e6:
            throw r1
        L_0x04e7:
            goto L_0x04e6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvu.a(android.os.DropBoxManager, java.util.Map, long, aucd):long");
    }

    public static gzr a(hag hag) {
        aucd o = gzr.A.o();
        had had = had.o;
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzr gzr = (gzr) o.b;
        had.getClass();
        gzr.l = had;
        gzr.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        aucd o2 = had.o.o();
        if (hag != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            had had2 = (had) o2.b;
            hag.getClass();
            had2.l = hag;
            had2.a |= 2048;
            int a2 = haf.a(hag.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = hag.c;
            StringBuilder sb = new StringBuilder(59);
            sb.append("Checkin reason type: ");
            sb.append(a2 - 1);
            sb.append(" attempt count: ");
            sb.append(i);
            Log.i("CheckinRequestBuilder", sb.toString());
        }
        hac hac = hac.r;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        had had3 = (had) o2.b;
        hac.getClass();
        had3.b = hac;
        had3.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzr gzr2 = (gzr) o.b;
        had had4 = (had) o2.i();
        had4.getClass();
        gzr2.l = had4;
        gzr2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzr gzr3 = (gzr) o.b;
        gzr3.a |= 32768;
        gzr3.r = 0;
        return (gzr) o.i();
    }

    private static Object a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name).length());
            sb.append("Cannot call method ");
            sb.append(str);
            sb.append(" on object ");
            sb.append(name);
            Log.w("CheckinRequestBuilder", sb.toString(), e2);
            return null;
        } catch (IllegalAccessException e3) {
            String name2 = cls.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name2).length());
            sb2.append("Cannot call method ");
            sb2.append(str);
            sb2.append(" on object ");
            sb2.append(name2);
            Log.w("CheckinRequestBuilder", sb2.toString(), e3);
            return null;
        } catch (InvocationTargetException e4) {
            String name3 = cls.getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(name3).length());
            sb3.append("Cannot call method ");
            sb3.append(str);
            sb3.append(" on object ");
            sb3.append(name3);
            Log.w("CheckinRequestBuilder", sb3.toString(), e4);
            return null;
        }
    }

    private static String a(Context context, String str) {
        try {
            return aeed.a(context.getContentResolver(), str);
        } catch (SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.w("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Unable to get partner string with key: ") : "Unable to get partner string with key: ".concat(valueOf), e2);
            return null;
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str) || !f.matcher(str).matches()) {
            return null;
        }
        int k = (int) awrq.k();
        if (k > str.length()) {
            k = str.length();
        }
        String valueOf = String.valueOf(str.substring(0, str.length() - k));
        String valueOf2 = String.valueOf("000000000000000".substring(0, k));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    static void a(Context context, long j, aucd aucd) {
        long b2 = gwk.b(context);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr = (gzr) aucd.b;
        gzr gzr2 = gzr.A;
        int i = gzr.a | 16;
        gzr.a = i;
        gzr.h = b2;
        if (j != 0) {
            gzr.a = i | FragmentTransaction.TRANSIT_ENTER_MASK;
            gzr.o = j;
        }
        if (j != 0 || b2 == 0) {
            gzr.a(gzr);
        }
        long h = gwk.h(context);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr3 = (gzr) aucd.b;
        gzr3.a |= 32;
        gzr3.i = h;
    }

    public static void a(Context context, TelephonyManager telephonyManager, WifiManager wifiManager, ConnectivityManager connectivityManager, boolean z, aucd aucd) {
        String str;
        SubscriptionManager subscriptionManager;
        WifiInfo connectionInfo;
        String macAddress;
        String str2;
        String extraInfo;
        TelephonyManager telephonyManager2 = telephonyManager;
        aucd aucd2 = aucd;
        if (!jix.b(context) || !awrq.p()) {
            had had = ((gzr) aucd2.b).l;
            if (had == null) {
                had = had.o;
            }
            aucd aucd3 = (aucd) had.c(5);
            aucd3.a((aucj) had);
            if (telephonyManager2 != null) {
                if (!gwd.f(context)) {
                    Log.w("CheckinRequestBuilder", "Gms missing READ_PHONE_STATE permission, cannot read hw info.");
                } else {
                    int a2 = jnl.a().a(telephonyManager2);
                    if (Build.VERSION.SDK_INT < 26 || !awrq.u()) {
                        String deviceId = telephonyManager.getDeviceId();
                        if (deviceId != null) {
                            if (e.matcher(deviceId).matches()) {
                                if (a2 != 2) {
                                    Log.e("CheckinRequestBuilder", "ESN found on a non-CDMA phone");
                                }
                                if (deviceId.startsWith("80")) {
                                    Log.e("CheckinRequestBuilder", "TelephonyManager.getDeviceId() is returning a pseudo-ESN instead of an MEID");
                                } else if (!z) {
                                    if (aucd2.c) {
                                        aucd.c();
                                        aucd2.c = false;
                                    }
                                    gzr gzr = (gzr) aucd2.b;
                                    gzr gzr2 = gzr.A;
                                    deviceId.getClass();
                                    gzr.a |= 8;
                                    gzr.g = deviceId;
                                }
                            } else if (!d.matcher(deviceId).matches()) {
                                if (a2 == 2 || a2 == 1) {
                                    Log.e("CheckinRequestBuilder", "TelephonyManager.getDeviceId() must return a 15-decimal-digit IMEI, a 14-hex-digit MEID or an 8-hex-digit ESN ");
                                } else if (a2 != 0) {
                                    StringBuilder sb = new StringBuilder(deviceId.length() + 35);
                                    sb.append("Unknown phone type: ");
                                    sb.append(a2);
                                    sb.append(" id=");
                                    sb.append(deviceId);
                                    Log.w("CheckinRequestBuilder", sb.toString());
                                }
                            } else if (!z) {
                                if (aucd2.c) {
                                    aucd.c();
                                    aucd2.c = false;
                                }
                                gzr gzr3 = (gzr) aucd2.b;
                                gzr gzr4 = gzr.A;
                                deviceId.getClass();
                                gzr3.a |= 2;
                                gzr3.c = deviceId;
                            }
                        }
                    } else {
                        String imei = telephonyManager.getImei();
                        String meid = telephonyManager.getMeid();
                        if (imei != null) {
                            if (aucd2.c) {
                                aucd.c();
                                aucd2.c = false;
                            }
                            gzr gzr5 = (gzr) aucd2.b;
                            gzr gzr6 = gzr.A;
                            imei.getClass();
                            gzr5.a |= 1;
                            gzr5.b = imei;
                        }
                        if (meid != null) {
                            if (aucd2.c) {
                                aucd.c();
                                aucd2.c = false;
                            }
                            gzr gzr7 = (gzr) aucd2.b;
                            gzr gzr8 = gzr.A;
                            meid.getClass();
                            gzr7.a |= 2;
                            gzr7.c = meid;
                        }
                        if (imei == null && meid == null) {
                            if (a2 == 2) {
                                Log.e("CheckinRequestBuilder", "CDMA phone did not return meid");
                            } else if (a2 == 1) {
                                Log.e("CheckinRequestBuilder", "GSM phone did not return imei");
                            } else if (a2 != 0) {
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("Unknown phone type: ");
                                sb2.append(a2);
                                Log.w("CheckinRequestBuilder", sb2.toString());
                            }
                        }
                    }
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        had had2 = (had) aucd3.b;
                        networkOperator.getClass();
                        had2.a |= 16;
                        had2.f = networkOperator;
                    }
                    String simOperator = telephonyManager.getSimOperator();
                    if (!TextUtils.isEmpty(simOperator)) {
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        had had3 = (had) aucd3.b;
                        simOperator.getClass();
                        had3.a |= 32;
                        had3.g = simOperator;
                    }
                }
                if (jkr.a()) {
                    boolean isVoiceCapable = telephonyManager.isVoiceCapable();
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    had had4 = (had) aucd3.b;
                    had4.a |= 128;
                    had4.i = isVoiceCapable;
                }
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(9);
            if (networkInfo != null && !z && (extraInfo = networkInfo.getExtraInfo()) != null && a.matcher(extraInfo).matches()) {
                aucd2.c(extraInfo.replace(":", "").replace("-", ""));
                aucd2.d("ethernet");
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getTypeName() != null) {
                    String typeName = activeNetworkInfo.getTypeName();
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    had had5 = (had) aucd3.b;
                    typeName.getClass();
                    had5.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                    had5.n = typeName;
                }
                String typeName2 = activeNetworkInfo.getTypeName();
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (!activeNetworkInfo.isRoaming()) {
                    str2 = "";
                } else {
                    str2 = "r";
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(typeName2).length() + 2 + String.valueOf(subtypeName).length() + str2.length());
                sb3.append(typeName2);
                sb3.append(":");
                sb3.append(subtypeName);
                sb3.append(":");
                sb3.append(str2);
                String sb4 = sb3.toString();
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                had had6 = (had) aucd3.b;
                sb4.getClass();
                had6.a |= 64;
                had6.h = sb4;
            }
            if (!(wifiManager == null || z || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null)) {
                aucd2.c(macAddress.replace(":", ""));
                aucd2.d("wifi");
            }
            if (!gwd.f(context)) {
                Log.w("CheckinRequestBuilder", "Gms missing READ_PHONE_STATE permission, cannot read SIM subscription info");
            } else if ((!jkr.a() || (subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service")) == null || !a(telephonyManager2, subscriptionManager, aucd3)) && telephonyManager2 != null) {
                aucd o = har.i.o();
                String simOperator2 = telephonyManager.getSimOperator();
                if (!TextUtils.isEmpty(simOperator2)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har = (har) o.b;
                    simOperator2.getClass();
                    har.a = 1 | har.a;
                    har.b = simOperator2;
                }
                String simOperatorName = telephonyManager.getSimOperatorName();
                if (telephonyManager.getSimState() == 5 && !TextUtils.isEmpty(simOperatorName)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har2 = (har) o.b;
                    simOperatorName.getClass();
                    har2.a |= 2;
                    har2.c = simOperatorName;
                }
                int i = ((har) o.b).a;
                if (!((i & 1) == 0 && (i & 2) == 0)) {
                    if (!telephonyManager.isNetworkRoaming()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har3 = (har) o.b;
                    str.getClass();
                    har3.a |= 4;
                    har3.d = str;
                    o.a(haq.VOICE);
                    o.a(haq.DATA);
                    o.a(haq.SMS);
                    boolean e2 = awrq.e();
                    String subscriberId = telephonyManager.getSubscriberId();
                    if (e2) {
                        String a3 = a(subscriberId);
                        if (!TextUtils.isEmpty(a3)) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            har har4 = (har) o.b;
                            a3.getClass();
                            har4.a |= 16;
                            har4.f = a3;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                        if (!TextUtils.isEmpty(groupIdLevel1)) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            har har5 = (har) o.b;
                            groupIdLevel1.getClass();
                            har5.a |= 32;
                            har5.g = groupIdLevel1;
                        }
                    }
                    try {
                        auay a4 = auay.a(aemg.a(subscriberId, (int) awrq.n()));
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har6 = (har) o.b;
                        a4.getClass();
                        har6.a |= 64;
                        har6.h = a4;
                    } catch (RuntimeException e3) {
                        Log.w("CheckinRequestBuilder", "Exception while truncating the IMSI", e3);
                    }
                    aucd3.c(o);
                }
            }
            if (aucd2.c) {
                aucd.c();
                aucd2.c = false;
            }
            gzr gzr9 = (gzr) aucd2.b;
            had had7 = (had) aucd3.i();
            gzr gzr10 = gzr.A;
            had7.getClass();
            gzr9.l = had7;
            gzr9.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    public static void a(Context context, aucd aucd) {
        had had = ((gzr) aucd.b).l;
        if (had == null) {
            had = had.o;
        }
        hac hac = had.b;
        if (hac == null) {
            hac = hac.r;
        }
        aucd aucd2 = (aucd) hac.c(5);
        aucd2.a((aucj) hac);
        String a2 = a(context, "client_id");
        ArrayList arrayList = null;
        for (String str : b.keySet()) {
            String a3 = a(context, str);
            if (a3 != null) {
                aucd o = hao.d.o();
                han han = (han) b.get(str);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hao hao = (hao) o.b;
                hao.b = han.j;
                int i = hao.a | 1;
                hao.a = i;
                a3.getClass();
                hao.a = i | 2;
                hao.c = a3;
                hao hao2 = (hao) o.i();
                if (arrayList == null) {
                    arrayList = new ArrayList(Collections.unmodifiableList(((hac) aucd2.b).p));
                }
                arrayList.add(hao2);
            }
        }
        if (arrayList != null) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            ((hac) aucd2.b).p = aucj.s();
            aucd2.y((Iterable) arrayList);
        }
        if (a2 != null) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            hac hac2 = (hac) aucd2.b;
            a2.getClass();
            hac2.a |= 32;
            hac2.g = a2;
        }
        String packageName = context.getPackageName();
        try {
            int i2 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            hac hac3 = (hac) aucd2.b;
            hac3.a |= 128;
            hac3.i = i2;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(packageName);
            Log.wtf("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Our own package not found: ") : "Our own package not found: ".concat(valueOf), e2);
        }
        had had2 = ((gzr) aucd.b).l;
        if (had2 == null) {
            had2 = had.o;
        }
        aucd aucd3 = (aucd) had2.c(5);
        aucd3.a((aucj) had2);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        had had3 = (had) aucd3.b;
        hac hac4 = (hac) aucd2.i();
        hac4.getClass();
        had3.b = hac4;
        had3.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr = (gzr) aucd.b;
        had had4 = (had) aucd3.i();
        gzr gzr2 = gzr.A;
        had4.getClass();
        gzr.l = had4;
        gzr.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC, Splitter:B:41:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r7, defpackage.aucd r8, android.content.SharedPreferences r9) {
        /*
            java.lang.String r0 = "CheckinRequestBuilder"
            aucj r1 = r8.b
            gzr r1 = (defpackage.gzr) r1
            had r1 = r1.l
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            had r1 = defpackage.had.o
        L_0x000d:
            hac r1 = r1.b
            if (r1 != 0) goto L_0x0013
            hac r1 = defpackage.hac.r
        L_0x0013:
            r2 = 5
            java.lang.Object r3 = r1.c(r2)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r1)
            defpackage.jiw.a(r7, r3, r9)
            aucj r7 = r8.b
            gzr r7 = (defpackage.gzr) r7
            had r7 = r7.l
            if (r7 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            had r7 = defpackage.had.o
        L_0x002c:
            java.lang.Object r9 = r7.c(r2)
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r7)
            boolean r7 = r9.c
            r1 = 0
            if (r7 == 0) goto L_0x0040
            r9.c()
            r9.c = r1
        L_0x0040:
            aucj r7 = r9.b
            had r7 = (defpackage.had) r7
            aucj r2 = r3.i()
            hac r2 = (defpackage.hac) r2
            r2.getClass()
            r7.b = r2
            int r2 = r7.a
            r2 = r2 | 1
            r7.a = r2
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r8.c()
            r8.c = r1
        L_0x005f:
            aucj r7 = r8.b
            gzr r7 = (defpackage.gzr) r7
            aucj r9 = r9.i()
            had r9 = (defpackage.had) r9
            gzr r2 = defpackage.gzr.A
            r9.getClass()
            r7.l = r9
            int r9 = r7.a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r7.a = r9
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ all -> 0x00d8 }
            java.io.File r9 = c     // Catch:{ all -> 0x00d8 }
            r7.<init>(r9)     // Catch:{ all -> 0x00d8 }
            java.util.Enumeration r9 = r7.entries()     // Catch:{ all -> 0x00d6 }
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00d6 }
            r3 = 0
        L_0x0086:
            boolean r4 = r9.hasMoreElements()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00cd
            java.lang.Object r4 = r9.nextElement()     // Catch:{ all -> 0x00d3 }
            java.util.zip.ZipEntry r4 = (java.util.zip.ZipEntry) r4     // Catch:{ all -> 0x00d3 }
            java.io.InputStream r4 = r7.getInputStream(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = "SHA-1"
            java.security.MessageDigest r5 = defpackage.jhg.b((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            if (r5 == 0) goto L_0x00b8
        L_0x009e:
            int r6 = r4.read(r2)     // Catch:{ all -> 0x00d3 }
            if (r6 > 0) goto L_0x00b3
            byte[] r5 = r5.digest()     // Catch:{ all -> 0x00d3 }
            r6 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)     // Catch:{ all -> 0x00d3 }
            r8.e((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            int r3 = r3 + 1
            goto L_0x00c9
        L_0x00b3:
            r5.update(r2, r1, r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x009e
        L_0x00b8:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ all -> 0x00d3 }
            r5.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = "no support for SHA-1?"
            android.util.Log.wtf(r0, r6, r5)     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = "--NoSuchAlgorithmException--"
            r8.e((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            int r3 = r3 + 1
        L_0x00c9:
            r4.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x0086
        L_0x00cd:
            r7.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00f0
        L_0x00d1:
            r7 = move-exception
            goto L_0x00e3
        L_0x00d3:
            r9 = move-exception
            r1 = r3
            goto L_0x00db
        L_0x00d6:
            r9 = move-exception
            goto L_0x00db
        L_0x00d8:
            r7 = move-exception
            r9 = r7
            r7 = 0
        L_0x00db:
            if (r7 == 0) goto L_0x00e0
            r7.close()     // Catch:{ IOException -> 0x00e1 }
        L_0x00e0:
            throw r9     // Catch:{ IOException -> 0x00e1 }
        L_0x00e1:
            r7 = move-exception
            r3 = r1
        L_0x00e3:
            java.lang.String r9 = "error reading OTA certs"
            android.util.Log.w(r0, r9, r7)
            java.lang.String r7 = "--IOException--"
            r8.e((java.lang.String) r7)
            int r3 = r3 + 1
        L_0x00f0:
            if (r3 != 0) goto L_0x00f7
            java.lang.String r7 = "--no-output--"
            r8.e((java.lang.String) r7)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvu.a(android.content.Context, aucd, android.content.SharedPreferences):void");
    }

    private static void a(Context context, String str, aucd aucd) {
        aucd o = gzv.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        gzv gzv = (gzv) o.b;
        str.getClass();
        gzv.a |= 1;
        gzv.b = str;
        byte[] a2 = a(context, str, "SHA1");
        if (a2 != null) {
            auay a3 = auay.a(a2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzv gzv2 = (gzv) o.b;
            a3.getClass();
            gzv2.a |= 2;
            gzv2.c = a3;
        }
        byte[] a4 = a(context, str, "SHA256");
        if (a4 != null) {
            auay a5 = auay.a(a4);
            if (o.c) {
                o.c();
                o.c = false;
            }
            gzv gzv3 = (gzv) o.b;
            a5.getClass();
            gzv3.a |= 4;
            gzv3.d = a5;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr = (gzr) aucd.b;
        gzv gzv4 = (gzv) o.i();
        gzr gzr2 = gzr.A;
        gzv4.getClass();
        gzr.t = gzv4;
        gzr.a |= 262144;
    }

    public static void a(Context context, List list) {
        qub a2 = qub.a(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.startsWith("[")) {
                a2.b("com.google", str);
                a2.b("com.google.work", str);
                if (jix.a(context)) {
                    a2.b("cn.google", str);
                }
            }
        }
    }

    public static void a(Context context, List list, aucd aucd) {
        if (!jix.b(context) || !awrq.p()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Account account = (Account) list.get(i);
                String str = null;
                try {
                    str = eig.b(context, account, "AndroidCheckInServer");
                } catch (eiu e2) {
                    Log.w("CheckinRequestBuilder", "awaiting user notification for token");
                } catch (eif e3) {
                    String valueOf = String.valueOf(e3.getMessage());
                    Log.e("CheckinRequestBuilder", valueOf.length() == 0 ? new String("Unrecoverable authentication exception: ") : "Unrecoverable authentication exception: ".concat(valueOf), e3);
                } catch (IOException e4) {
                    Log.w("CheckinRequestBuilder", "error reading account token", e4);
                }
                String str2 = account.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
                sb.append("[");
                sb.append(str2);
                sb.append("]");
                aucd.b(sb.toString());
                if (str != null && !str.isEmpty()) {
                    aucd.b(str);
                }
            }
            if (list.isEmpty()) {
                aucd.b("");
            }
        }
    }

    static void a(Context context, boolean z, aucd aucd) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        jnl a2 = jnl.a();
        String b2 = amrk.b(aeeg.a(contentResolver, "digest"));
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr = (gzr) aucd.b;
        gzr gzr2 = gzr.A;
        b2.getClass();
        gzr.a |= 64;
        gzr.j = b2;
        if (!Build.SERIAL.equals("unknown")) {
            str = Build.SERIAL;
        } else {
            if (jkr.e() && gwd.f(context)) {
                try {
                    str = Build.getSerial();
                } catch (SecurityException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.i("CheckinRequestBuilder", valueOf.length() == 0 ? new String("agetSerial method - Security Exception ") : "agetSerial method - Security Exception ".concat(valueOf));
                }
            }
            str = "unknown";
        }
        if (!z && !TextUtils.isEmpty(str) && !str.equalsIgnoreCase("unknown") && !jix.b(context) && awrq.p() && (!jix.c(context) || awrq.a.a().F())) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr3 = (gzr) aucd.b;
            str.getClass();
            gzr3.a |= 4;
            gzr3.f = str;
        }
        had had = ((gzr) aucd.b).l;
        if (had == null) {
            had = had.o;
        }
        aucd aucd2 = (aucd) had.c(5);
        aucd2.a((aucj) had);
        int c2 = a2.c();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        had had2 = (had) aucd2.b;
        had2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        had2.j = c2;
        int c3 = a2.c(context);
        if (c3 >= 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr4 = (gzr) aucd.b;
            gzr4.a |= 131072;
            gzr4.s = c3;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr5 = (gzr) aucd.b;
        had had3 = (had) aucd2.i();
        had3.getClass();
        gzr5.l = had3;
        gzr5.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public static void a(aucd aucd) {
        if (jnl.a().d()) {
            had had = ((gzr) aucd.b).l;
            if (had == null) {
                had = had.o;
            }
            aucd aucd2 = (aucd) had.c(5);
            aucd2.a((aucj) had);
            aucd2.g("te.bots");
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            had had2 = (had) aucd2.i();
            gzr gzr2 = gzr.A;
            had2.getClass();
            gzr.l = had2;
            gzr.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
    }

    public static void a(Locale locale, aucd aucd) {
        if (locale != null) {
            int i = Build.VERSION.SDK_INT;
            String languageTag = locale.toLanguageTag();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            gzr gzr2 = gzr.A;
            languageTag.getClass();
            gzr.a |= 128;
            gzr.k = languageTag;
            return;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzr gzr3 = (gzr) aucd.b;
        gzr gzr4 = gzr.A;
        gzr3.a &= -129;
        gzr3.k = gzr.A.k;
    }

    public static void a(TimeZone timeZone, aucd aucd) {
        if (timeZone != null) {
            String id = timeZone.getID();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            gzr gzr = (gzr) aucd.b;
            gzr gzr2 = gzr.A;
            id.getClass();
            gzr.a |= 2048;
            gzr.n = id;
        }
    }

    private static boolean a(TelephonyManager telephonyManager, SubscriptionManager subscriptionManager, aucd aucd) {
        int i;
        String str;
        String str2;
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            Log.i("CheckinRequestBuilder", "Unknown state of subscriptions on the device");
            return false;
        }
        if (!activeSubscriptionInfoList.isEmpty()) {
            int[] iArr = new int[3];
            String[] strArr = new String[3];
            if (!jkr.c()) {
                strArr[0] = "getDefaultVoiceSubId";
                strArr[1] = "getDefaultDataSubId";
                strArr[2] = "getDefaultSmsSubId";
            } else {
                strArr[0] = "getDefaultVoiceSubscriptionId";
                strArr[1] = "getDefaultDataSubscriptionId";
                strArr[2] = "getDefaultSmsSubscriptionId";
            }
            try {
                i = ((Integer) SubscriptionManager.class.getDeclaredField("INVALID_SUBSCRIPTION_ID").get(subscriptionManager)).intValue();
            } catch (NoSuchFieldException e2) {
                Log.w("CheckinRequestBuilder", "Error accessing INVALID_SUBSCRIPTION_ID field from SubscriptionManager", e2);
                i = 0;
            } catch (IllegalAccessException e3) {
                Log.w("CheckinRequestBuilder", "Error invoking the SubscriptionManager methods for default Subscriptions", e3);
                i = 0;
            }
            iArr[2] = i;
            iArr[1] = i;
            iArr[0] = i;
            for (int i2 = 0; i2 < 3; i2++) {
                Object a2 = a(SubscriptionManager.class, subscriptionManager, strArr[i2], (Class[]) null, (Object[]) null);
                if (a2 != null) {
                    iArr[i2] = ((Integer) a2).intValue();
                }
            }
            for (SubscriptionInfo next : activeSubscriptionInfoList) {
                aucd o = har.i.o();
                int subscriptionId = next.getSubscriptionId();
                if (jkr.c()) {
                    str = telephonyManager.createForSubscriptionId(subscriptionId).getSimOperator();
                } else {
                    str = (String) a(TelephonyManager.class, telephonyManager, "getSimOperator", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)});
                }
                if (!TextUtils.isEmpty(str)) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har = (har) o.b;
                    str.getClass();
                    har.a |= 1;
                    har.b = str;
                }
                if (!TextUtils.isEmpty(next.getCarrierName())) {
                    String charSequence = next.getCarrierName().toString();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har2 = (har) o.b;
                    charSequence.getClass();
                    har2.a |= 2;
                    har2.c = charSequence;
                }
                String num = Integer.toString(next.getDataRoaming());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                har har3 = (har) o.b;
                num.getClass();
                har3.a |= 4;
                har3.d = num;
                if (subscriptionId != i) {
                    if (subscriptionId == iArr[0]) {
                        o.a(haq.VOICE);
                    }
                    if (subscriptionId == iArr[1]) {
                        o.a(haq.DATA);
                    }
                    if (subscriptionId == iArr[2]) {
                        o.a(haq.SMS);
                    }
                }
                boolean e4 = awrq.e();
                if (jkr.c()) {
                    str2 = telephonyManager.createForSubscriptionId(subscriptionId).getSubscriberId();
                } else {
                    str2 = (String) a(TelephonyManager.class, telephonyManager, "getSubscriberId", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)});
                }
                if (e4 && telephonyManager != null) {
                    String a3 = a(str2);
                    if (!TextUtils.isEmpty(a3)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har4 = (har) o.b;
                        a3.getClass();
                        har4.a |= 16;
                        har4.f = a3;
                    }
                    String str3 = (String) a(TelephonyManager.class, telephonyManager, "getGroupIdLevel1", new Class[]{Integer.TYPE}, new Integer[]{Integer.valueOf(subscriptionId)});
                    if (!TextUtils.isEmpty(str3)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        har har5 = (har) o.b;
                        str3.getClass();
                        har5.a |= 32;
                        har5.g = str3;
                    }
                }
                try {
                    auay a4 = auay.a(aemg.a(str2, (int) awrq.n()));
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    har har6 = (har) o.b;
                    a4.getClass();
                    har6.a |= 64;
                    har6.h = a4;
                } catch (RuntimeException e5) {
                    Log.w("CheckinRequestBuilder", "Exception while truncating the IMSI", e5);
                }
                aucd.c(o);
            }
        }
        return true;
    }

    private static byte[] a(Context context, String str, String str2) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray();
            try {
                MessageDigest instance = MessageDigest.getInstance(str2);
                instance.update(byteArray, 0, byteArray.length);
                return instance.digest();
            } catch (NoSuchAlgorithmException e2) {
                StringBuilder sb = new StringBuilder(str2.length() + 16);
                sb.append("no support for ");
                sb.append(str2);
                sb.append("?");
                Log.wtf("CheckinRequestBuilder", sb.toString(), e2);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("CheckinRequestBuilder", "package info for managing app not found:", e3);
            return null;
        }
    }
}
