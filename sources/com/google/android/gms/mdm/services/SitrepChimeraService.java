package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SitrepChimeraService extends smy {
    private int a;
    private String b;
    private Boolean c;
    private Boolean d;
    private avup e = avup.UNKNOWN;

    /* JADX WARNING: type inference failed for: r10v9, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.Exception r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Error sending sitrep."
            defpackage.snn.a(r2, r1)
            r1 = 0
            if (r10 == 0) goto L_0x001b
            java.lang.Throwable r2 = r10.getCause()
            boolean r2 = r2 instanceof com.android.volley.VolleyError
            if (r2 == 0) goto L_0x001b
            java.lang.Throwable r10 = r10.getCause()
            r1 = r10
            com.android.volley.VolleyError r1 = (com.android.volley.VolleyError) r1
            goto L_0x001c
        L_0x001b:
        L_0x001c:
            long r2 = java.lang.System.currentTimeMillis()
            if (r1 != 0) goto L_0x0023
            goto L_0x003d
        L_0x0023:
            boolean r10 = r1 instanceof com.android.volley.AuthFailureError
            if (r10 == 0) goto L_0x003d
            java.lang.Throwable r10 = r1.getCause()
            if (r10 == 0) goto L_0x0035
            java.lang.Throwable r10 = r1.getCause()
            boolean r10 = r10 instanceof java.io.IOException
            if (r10 != 0) goto L_0x003d
        L_0x0035:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r0 = "Permanent error sending sitrep and do not retry."
            defpackage.snn.a(r0, r10)
            return
        L_0x003d:
            r10 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0043
            goto L_0x009a
        L_0x0043:
            com.android.volley.NetworkResponse r6 = r1.networkResponse
            if (r6 == 0) goto L_0x009a
            java.lang.Object[] r7 = new java.lang.Object[r10]
            int r6 = r6.statusCode
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r0] = r6
            int r6 = defpackage.crc.a
            com.android.volley.NetworkResponse r6 = r1.networkResponse
            byte[] r6 = r6.data
            android.util.Base64.encodeToString(r6, r0)
            com.android.volley.NetworkResponse r6 = r1.networkResponse
            int r7 = r6.statusCode
            r8 = 503(0x1f7, float:7.05E-43)
            if (r7 != r8) goto L_0x0098
            java.util.Map r6 = r6.headers
            java.lang.String r7 = "Retry-After"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x0098
            com.android.volley.NetworkResponse r1 = r1.networkResponse
            java.util.Map r1 = r1.headers
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            long r0 = android.net.http.AndroidHttpClient.parseDate(r1)     // Catch:{ IllegalArgumentException -> 0x007b }
            goto L_0x0097
        L_0x007b:
            r6 = move-exception
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0085 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            goto L_0x0090
        L_0x0085:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r0] = r1
            java.lang.String r0 = "Cannot parse retry time: %s"
            defpackage.snn.a(r0, r6)
            r0 = r4
        L_0x0090:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0096
            long r0 = r0 + r2
            goto L_0x0097
        L_0x0096:
            r0 = r4
        L_0x0097:
            goto L_0x009d
        L_0x0098:
            r0 = r4
            goto L_0x009d
        L_0x009a:
            int r0 = defpackage.crc.a
            r0 = r4
        L_0x009d:
            cri r2 = defpackage.smo.h
            avup r3 = r9.e
            int r3 = r3.o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.a((java.lang.Object) r3)
            cri r2 = defpackage.smo.j
            cri r3 = defpackage.smo.j
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r2.a((java.lang.Object) r10)
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c7
            defpackage.smq.a((android.content.Context) r9, (long) r0)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdm.services.SitrepChimeraService.a(java.lang.Exception):void");
    }

    public final void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (!jix.a((Context) this) && intent2 != null) {
            this.e = SitrepHelperIntentOperation.a(intent2, "reason");
            this.a = intent2.getIntExtra("gms_core_version", 0);
            this.b = intent2.getStringExtra("gcm_registration_id");
            if (intent2.hasExtra("is_device_admin")) {
                this.c = Boolean.valueOf(intent2.getBooleanExtra("is_device_admin", false));
            }
            if (intent2.hasExtra("lockscreen_enabled")) {
                this.d = Boolean.valueOf(intent2.getBooleanExtra("lockscreen_enabled", false));
            }
            avup a2 = SitrepHelperIntentOperation.a(intent2, "retry_reason");
            long a3 = jhg.a((Context) this);
            String str = null;
            if (a3 == 0) {
                snn.a("Android ID == 0, not sending sitrep", new Object[0]);
                a((Exception) null);
                return;
            }
            RequestFuture newFuture = RequestFuture.newFuture();
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            try {
                str = gwc.b(this);
            } catch (IOException e2) {
                snn.a(e2, "Error getting device data version info.", new Object[0]);
            } catch (hxw e3) {
                snn.a(e3, "Error getting device data version info.", new Object[0]);
            } catch (hxx e4) {
                snn.a(e4, "Error getting device data version info.", new Object[0]);
            }
            int phoneType = telephonyManager.getPhoneType();
            int i = this.a;
            String str2 = this.b;
            Boolean bool = this.c;
            avup avup = this.e;
            Boolean bool2 = this.d;
            snn.b("sending sitrep: [%s, %s, %s, %s, %s, %s, %s, %s, %s]", avup, a2, crc.a((Object) Long.valueOf(a3)), Integer.valueOf(i), crc.a((Object) str2), bool, str, Integer.valueOf(phoneType), bool2);
            RequestQueue a4 = smh.a();
            aucd o = avuq.l.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuq avuq = (avuq) o.b;
            avuq.g = avup.o;
            int i2 = avuq.a | 64;
            avuq.a = i2;
            avuq.h = a2.o;
            int i3 = i2 | 128;
            avuq.a = i3;
            avuq.a = i3 | 1;
            avuq.b = a3;
            int i4 = Build.VERSION.SDK_INT;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avuq avuq2 = (avuq) o.b;
            int i5 = avuq2.a | 4;
            avuq2.a = i5;
            avuq2.d = i4;
            int i6 = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avuq2.a = i6;
            avuq2.i = phoneType;
            if (i > 0) {
                avuq2.a = i6 | 2;
                avuq2.c = i;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuq avuq3 = (avuq) o.b;
                str2.getClass();
                avuq3.a |= 16;
                avuq3.e = str2;
            }
            if (bool != null) {
                aucd o2 = avtz.e.o();
                boolean booleanValue = bool.booleanValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avtz avtz = (avtz) o2.b;
                avtz.a |= 1;
                avtz.b = booleanValue;
                boolean booleanValue2 = bool.booleanValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avtz avtz2 = (avtz) o2.b;
                avtz2.a |= 2;
                avtz2.c = booleanValue2;
                boolean booleanValue3 = bool.booleanValue();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avtz avtz3 = (avtz) o2.b;
                avtz3.a |= 4;
                avtz3.d = booleanValue3;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuq avuq4 = (avuq) o.b;
                avtz avtz4 = (avtz) o2.i();
                avtz4.getClass();
                avuq4.f = avtz4;
                avuq4.a |= 32;
            }
            if (str != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuq avuq5 = (avuq) o.b;
                str.getClass();
                avuq5.a |= 512;
                avuq5.j = str;
            }
            if (bool2 != null) {
                boolean booleanValue4 = bool2.booleanValue();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avuq avuq6 = (avuq) o.b;
                avuq6.a |= 2048;
                avuq6.k = booleanValue4;
            }
            a4.cancelAll((Object) "sitrep");
            smi a5 = smi.a(azfq.a.a().c(), true, newFuture, newFuture, (auef) avur.a.c(7), (avuq) o.i());
            a5.setTag("sitrep");
            a5.setShouldCache(false);
            a4.add(a5);
            try {
                newFuture.get();
                snn.b("Sitrep successful", new Object[0]);
                Object[] objArr = {Integer.valueOf(this.a), crc.a((Object) this.b), this.c, this.d};
                if (this.a > 0) {
                    smo.a.a((Object) Integer.valueOf(this.a));
                }
                if (this.b != null) {
                    smo.b.a((Object) this.b);
                }
                if (this.c != null) {
                    smo.c.a((Object) this.c);
                }
                if (this.d != null) {
                    smo.d.a((Object) this.d);
                }
                smq.a((Context) this, new jbs(this));
                smo.h.b();
                smo.i.b();
                smo.j.b();
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                a(e5);
            } catch (ExecutionException e6) {
                a(e6);
            }
        }
    }
}
