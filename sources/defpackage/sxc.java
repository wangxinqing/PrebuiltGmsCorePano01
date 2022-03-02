package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: sxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxc implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ sxd a;

    public sxc(sxd sxd) {
        this.a = sxd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010c, code lost:
        if (r12.containsKey("gclid") == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r11.a.v().a(defpackage.sud.aq) == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[SYNTHETIC, Splitter:B:31:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed A[SYNTHETIC, Splitter:B:48:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[Catch:{ Exception -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0198 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r12, android.net.Uri r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            sxd r0 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r0 = r0.v()     // Catch:{ Exception -> 0x0199 }
            suc r1 = defpackage.sud.ap     // Catch:{ Exception -> 0x0199 }
            boolean r0 = r0.a((defpackage.suc) r1)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = "Activity created with data 'referrer' without required params"
            java.lang.String r2 = "utm_medium"
            java.lang.String r3 = "utm_source"
            java.lang.String r4 = "_cis"
            java.lang.String r5 = "utm_campaign"
            r6 = 0
            java.lang.String r7 = "gclid"
            if (r0 != 0) goto L_0x0037
            sxd r0 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r0 = r0.v()     // Catch:{ Exception -> 0x0199 }
            suc r8 = defpackage.sud.ar     // Catch:{ Exception -> 0x0199 }
            boolean r0 = r0.a((defpackage.suc) r8)     // Catch:{ Exception -> 0x0199 }
            if (r0 != 0) goto L_0x0037
            sxd r0 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r0 = r0.v()     // Catch:{ Exception -> 0x0199 }
            suc r8 = defpackage.sud.aq     // Catch:{ Exception -> 0x0199 }
            boolean r0 = r0.a((defpackage.suc) r8)     // Catch:{ Exception -> 0x0199 }
            if (r0 == 0) goto L_0x008d
        L_0x0037:
            sxd r0 = r11.a     // Catch:{ Exception -> 0x0199 }
            szj r0 = r0.x()     // Catch:{ Exception -> 0x0199 }
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0199 }
            if (r8 != 0) goto L_0x008d
            boolean r8 = r15.contains(r7)     // Catch:{ Exception -> 0x0199 }
            if (r8 == 0) goto L_0x004a
            goto L_0x0067
        L_0x004a:
            boolean r8 = r15.contains(r5)     // Catch:{ Exception -> 0x0199 }
            if (r8 != 0) goto L_0x0067
            boolean r8 = r15.contains(r3)     // Catch:{ Exception -> 0x0199 }
            if (r8 != 0) goto L_0x0067
            boolean r8 = r15.contains(r2)     // Catch:{ Exception -> 0x0199 }
            if (r8 != 0) goto L_0x0067
            sut r0 = r0.E()     // Catch:{ Exception -> 0x0199 }
            sur r0 = r0.j     // Catch:{ Exception -> 0x0199 }
            r0.a(r1)     // Catch:{ Exception -> 0x0199 }
            goto L_0x008d
        L_0x0067:
            java.lang.String r8 = "https://google.com/search?"
            java.lang.String r9 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x0199 }
            int r10 = r9.length()     // Catch:{ Exception -> 0x0199 }
            if (r10 != 0) goto L_0x0079
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x0199 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0199 }
            goto L_0x007d
        L_0x0079:
            java.lang.String r9 = r8.concat(r9)     // Catch:{ Exception -> 0x0199 }
        L_0x007d:
            android.net.Uri r8 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0199 }
            android.os.Bundle r0 = r0.a((android.net.Uri) r8)     // Catch:{ Exception -> 0x0199 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r8 = "referrer"
            r0.putString(r4, r8)     // Catch:{ Exception -> 0x0199 }
            goto L_0x008e
        L_0x008d:
            r0 = r6
        L_0x008e:
            java.lang.String r8 = "_cmp"
            if (r12 == 0) goto L_0x00dc
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            szj r12 = r12.x()     // Catch:{ Exception -> 0x0199 }
            android.os.Bundle r12 = r12.a((android.net.Uri) r13)     // Catch:{ Exception -> 0x0199 }
            if (r12 == 0) goto L_0x00dd
            java.lang.String r13 = "intent"
            r12.putString(r4, r13)     // Catch:{ Exception -> 0x0199 }
            sxd r13 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r13 = r13.v()     // Catch:{ Exception -> 0x0199 }
            suc r4 = defpackage.sud.ap     // Catch:{ Exception -> 0x0199 }
            boolean r13 = r13.a((defpackage.suc) r4)     // Catch:{ Exception -> 0x0199 }
            if (r13 != 0) goto L_0x00b2
            goto L_0x00d6
        L_0x00b2:
            boolean r13 = r12.containsKey(r7)     // Catch:{ Exception -> 0x0199 }
            if (r13 != 0) goto L_0x00d6
            if (r0 == 0) goto L_0x00d6
            boolean r13 = r0.containsKey(r7)     // Catch:{ Exception -> 0x0199 }
            if (r13 == 0) goto L_0x00d6
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0199 }
            r4 = 0
            java.lang.String r9 = r0.getString(r7)     // Catch:{ Exception -> 0x0199 }
            r13[r4] = r9     // Catch:{ Exception -> 0x0199 }
            java.lang.String r4 = "_cer"
            java.lang.String r9 = "gclid=%s"
            java.lang.String r13 = java.lang.String.format(r9, r13)     // Catch:{ Exception -> 0x0199 }
            r12.putString(r4, r13)     // Catch:{ Exception -> 0x0199 }
        L_0x00d6:
            sxd r13 = r11.a     // Catch:{ Exception -> 0x0199 }
            r13.a((java.lang.String) r14, (java.lang.String) r8, (android.os.Bundle) r12)     // Catch:{ Exception -> 0x0199 }
            goto L_0x00dd
        L_0x00dc:
            r12 = r6
        L_0x00dd:
            sxd r13 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r13 = r13.v()     // Catch:{ Exception -> 0x0199 }
            suc r4 = defpackage.sud.ar     // Catch:{ Exception -> 0x0199 }
            boolean r13 = r13.a((defpackage.suc) r4)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r4 = "auto"
            if (r13 == 0) goto L_0x0119
            sxd r13 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r13 = r13.v()     // Catch:{ Exception -> 0x0199 }
            suc r9 = defpackage.sud.aq     // Catch:{ Exception -> 0x0199 }
            boolean r13 = r13.a((defpackage.suc) r9)     // Catch:{ Exception -> 0x0199 }
            if (r13 == 0) goto L_0x00fc
            goto L_0x0119
        L_0x00fc:
            if (r0 == 0) goto L_0x0119
            boolean r13 = r0.containsKey(r7)     // Catch:{ Exception -> 0x0199 }
            if (r13 == 0) goto L_0x0119
            if (r12 != 0) goto L_0x0107
            goto L_0x010e
        L_0x0107:
            boolean r12 = r12.containsKey(r7)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0119
        L_0x010e:
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            java.lang.String r13 = "_lgclid"
            java.lang.String r9 = r0.getString(r7)     // Catch:{ Exception -> 0x0199 }
            r12.a((java.lang.String) r4, (java.lang.String) r13, (java.lang.Object) r9)     // Catch:{ Exception -> 0x0199 }
        L_0x0119:
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0198
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            sut r12 = r12.E()     // Catch:{ Exception -> 0x0199 }
            sur r12 = r12.j     // Catch:{ Exception -> 0x0199 }
            java.lang.String r13 = "Activity created with referrer"
            r12.a(r13, r15)     // Catch:{ Exception -> 0x0199 }
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            spg r12 = r12.v()     // Catch:{ Exception -> 0x0199 }
            suc r13 = defpackage.sud.aq     // Catch:{ Exception -> 0x0199 }
            boolean r12 = r12.a((defpackage.suc) r13)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r13 = "_ldl"
            if (r12 != 0) goto L_0x017d
            boolean r12 = r15.contains(r7)     // Catch:{ Exception -> 0x0199 }
            if (r12 == 0) goto L_0x0171
            boolean r12 = r15.contains(r5)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0165
            boolean r12 = r15.contains(r3)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0165
            boolean r12 = r15.contains(r2)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0165
            java.lang.String r12 = "utm_term"
            boolean r12 = r15.contains(r12)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0165
            java.lang.String r12 = "utm_content"
            boolean r12 = r15.contains(r12)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0165
            goto L_0x0171
        L_0x0165:
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0199 }
            if (r12 != 0) goto L_0x0170
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            r12.a((java.lang.String) r4, (java.lang.String) r13, (java.lang.Object) r15)     // Catch:{ Exception -> 0x0199 }
        L_0x0170:
            return
        L_0x0171:
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            sut r12 = r12.E()     // Catch:{ Exception -> 0x0199 }
            sur r12 = r12.j     // Catch:{ Exception -> 0x0199 }
            r12.a(r1)     // Catch:{ Exception -> 0x0199 }
            return
        L_0x017d:
            if (r0 != 0) goto L_0x018d
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            sut r12 = r12.E()     // Catch:{ Exception -> 0x0199 }
            sur r12 = r12.j     // Catch:{ Exception -> 0x0199 }
            java.lang.String r14 = "Referrer does not contain valid parameters"
            r12.a(r14, r15)     // Catch:{ Exception -> 0x0199 }
            goto L_0x0192
        L_0x018d:
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            r12.a((java.lang.String) r14, (java.lang.String) r8, (android.os.Bundle) r0)     // Catch:{ Exception -> 0x0199 }
        L_0x0192:
            sxd r12 = r11.a     // Catch:{ Exception -> 0x0199 }
            r12.a((java.lang.String) r4, (java.lang.String) r13, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0199 }
            return
        L_0x0198:
            return
        L_0x0199:
            r12 = move-exception
            sxd r13 = r11.a
            sut r13 = r13.E()
            sur r13 = r13.c
            java.lang.String r14 = "Throwable caught in handleReferrerForOnActivityCreated"
            r13.a(r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxc.a(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        sxd sxd;
        String str;
        boolean z;
        try {
            this.a.E().k.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                sxd = this.a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.a.x();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "gs";
                        } else {
                            str = "auto";
                        }
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!aykd.a.a().a() || !((Boolean) sud.as.a()).booleanValue()) {
                            a(z, data, str, queryParameter);
                        } else {
                            this.a.F().a((Runnable) new sxb(this, z, data, str, queryParameter));
                        }
                        sxd = this.a;
                    }
                }
                sxd = this.a;
            }
        } catch (Exception e) {
            this.a.E().c.a("Throwable caught in onActivityCreated", e);
            sxd = this.a;
        } catch (Throwable th) {
            this.a.c().a(activity, bundle);
            throw th;
        }
        sxd.c().a(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.c().e.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        sxn c = this.a.c();
        sxk a2 = c.a(activity);
        c.d = c.c;
        c.c = null;
        c.F().a((Runnable) new sxm(c, a2, c.A().b()));
        sys a3 = this.a.a();
        a3.F().a((Runnable) new syl(a3, a3.A().b()));
    }

    public final void onActivityResumed(Activity activity) {
        sxk sxk;
        ayjq.c();
        sxn c = this.a.c();
        sxk a2 = c.a(activity);
        if (c.c != null) {
            sxk = c.c;
        } else {
            sxk = c.d;
        }
        if (a2.b == null) {
            a2 = new sxk(a2.a, c.a(activity.getClass().getCanonicalName()), a2.c);
        }
        c.d = c.c;
        c.c = a2;
        c.A().b();
        c.F().a((Runnable) new sxl(c, sxk, a2));
        sor g = c.g();
        g.F().a((Runnable) new soq(g, g.A().b()));
        sys a3 = this.a.a();
        a3.F().a((Runnable) new syk(a3, a3.A().b()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        sxk sxk;
        sxn c = this.a.c();
        if (bundle != null && (sxk = (sxk) c.e.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", sxk.c);
            bundle2.putString("name", sxk.a);
            bundle2.putString("referrer_name", sxk.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
