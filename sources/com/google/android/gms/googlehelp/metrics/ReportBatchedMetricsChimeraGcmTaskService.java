package com.google.android.gms.googlehelp.metrics;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReportBatchedMetricsChimeraGcmTaskService extends qwf {
    public okc a;
    private aoru b;
    private ofn c;

    static final List a(List list) {
        String str;
        int size = list.size();
        if (size < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            olo olo = (olo) list.get(i3);
            aucd aucd = (aucd) olo.c(5);
            aucd.a((aucj) olo);
            if (!TextUtils.equals(((olo) aucd.b).i, "UNKNOWN_SESSION_ID")) {
                i2 = i3;
            } else {
                if (i < i3) {
                    i = i3 + 1;
                    while (i < size && TextUtils.equals(((olo) list.get(i)).i, "UNKNOWN_SESSION_ID")) {
                        i++;
                    }
                }
                if (i2 >= 0) {
                    if (i < size) {
                        olo olo2 = (olo) list.get(i2);
                        olo olo3 = (olo) list.get(i);
                        if (Math.abs(((olo) aucd.b).t - olo2.t) >= Math.abs(olo3.t - ((olo) aucd.b).t)) {
                            str = olo3.i;
                        } else {
                            str = olo2.i;
                        }
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        olo olo4 = (olo) aucd.b;
                        olo olo5 = olo.I;
                        str.getClass();
                        olo4.a |= 64;
                        olo4.i = str;
                    } else {
                        String str2 = ((olo) list.get(i2)).i;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        olo olo6 = (olo) aucd.b;
                        olo olo7 = olo.I;
                        str2.getClass();
                        olo6.a |= 64;
                        olo6.i = str2;
                    }
                } else if (i < size) {
                    String str3 = ((olo) list.get(i)).i;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    olo olo8 = (olo) aucd.b;
                    olo olo9 = olo.I;
                    str3.getClass();
                    olo8.a |= 64;
                    olo8.i = str3;
                }
                arrayList.set(i3, (olo) aucd.i());
            }
        }
        return arrayList;
    }

    public static final boolean a(int i) {
        return i == 202 || i == 200;
    }

    private final int b(HelpConfig helpConfig, Map map, oai oai) {
        int i;
        ArrayList arrayList = new ArrayList();
        int o = (int) axmj.o();
        Iterator it = oai.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Account account = (Account) map.get(entry.getKey());
            List list = (List) entry.getValue();
            List a2 = a(list);
            int size = list.size();
            while (i < size) {
                int i2 = i + o;
                List subList = a2.subList(i, Math.min(size, i2));
                arrayList.add(okk.a(this, helpConfig, account, subList, new oki(this, subList)));
                i = i2;
            }
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i < size2) {
            try {
                if (!a(((Integer) ((Future) arrayList.get(i)).get(axmj.q(), TimeUnit.SECONDS)).intValue())) {
                    i3 = 1;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("gH_RBatchedMetricsSrv", "Sending batched metrics failed. Will retry ...", e);
                i3 = 1;
            }
            i++;
        }
        return i3;
    }

    public final void onCreate() {
        super.onCreate();
        this.b = jfm.a(10);
        this.a = new okc(this);
        this.c = new ofn(this);
    }

    public final void onDestroy() {
        okc okc = this.a;
        if (okc != null) {
            okc.close();
        }
        this.c.close();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public final int b(qxz qxz) {
        if (!axnl.b()) {
            return 0;
        }
        Bundle bundle = new Bundle(qxz.b);
        bundle.putInt("prefetch_offline_content_retries_left_key", bundle.getInt("prefetch_offline_content_retries_left_key") - 1);
        try {
            new oog(this, this.c, this.a).a();
            a((Context) this, bundle, 2);
            return 0;
        } catch (TimeoutException e) {
            a((VolleyError) null, bundle);
            return 2;
        } catch (VolleyError e2) {
            a(e2, bundle);
            return 2;
        }
    }

    public static void a(Context context, int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("number_of_retries_left", i);
        qxf qxf = new qxf();
        qxf.a(1, 1);
        qxf.a(2);
        qxf.a(axmj.a.a().v(), axmj.a.a().u());
        qxf.k = "action_clear_expired_help_content";
        qxf.i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        qxf.n = true;
        qxf.b(z);
        qxf.s = bundle;
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void a(Context context, Bundle bundle, int i) {
        long j;
        int i2 = bundle.getInt("prefetch_offline_content_retries_left_key");
        if (i2 <= 0) {
            i = 2;
        }
        if (i == 2) {
            i2 = (int) axmj.u();
        }
        bundle.putInt("prefetch_offline_content_retries_left_key", i2);
        if (i == 0) {
            j = axmj.a.a().au();
        } else if (i == 1) {
            j = axmj.a.a().aq();
        } else if (i != 3) {
            j = axmj.v();
        } else {
            j = Math.abs(new Random().nextLong()) % axmj.v();
        }
        long at = axmj.a.a().at();
        qxf qxf = new qxf();
        qxf.k = "action_prefetch_offline_help_content";
        qxf.i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        qxf.a(j, at + j);
        qxf.n = true;
        qxf.a(1);
        qxf.a(1, 1);
        qxf.s = bundle;
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void a(Context context, HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.b;
        if (TextUtils.isEmpty(str2)) {
            Log.e("gH_RBatchedMetricsSrv", "Application package name is empty, overriding with default package name: com.google.android.gms.googlehelp");
            str2 = "com.google.android.gms.googlehelp";
        }
        if (str2.length() > 75) {
            str = str2.substring(str2.length() - 75);
        } else {
            str = str2;
        }
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService";
        qxf.a(axmj.a.a().aa(), axmj.a.a().Z());
        qxf.k = str;
        qxf.n = true;
        qxf.b(1);
        Bundle b2 = helpConfig.b(context);
        Bundle bundle = null;
        if (!TextUtils.isEmpty(helpConfig.L)) {
            bundle = new Bundle();
            bundle.putString("genie-eng:app_pkg_name", helpConfig.L);
        } else if (b2 != null && !TextUtils.isEmpty(b2.getString("genie-eng:app_pkg_name"))) {
            bundle = new Bundle();
            bundle.putString("genie-eng:app_pkg_name", b2.getString("genie-eng:app_pkg_name"));
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("app_pkg_name_extra", str2);
        qxf.s = bundle;
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void a(Context context, String str) {
        qwq.a(context).a(str, "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService");
    }

    /* access modifiers changed from: package-private */
    public final int a(HelpConfig helpConfig, Map map, oai oai) {
        int i;
        ArrayList arrayList = new ArrayList();
        int o = (int) axmj.o();
        Iterator it = oai.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Account account = (Account) map.get(entry.getKey());
            List list = (List) entry.getValue();
            List a2 = a(list);
            int size = list.size();
            while (i < size) {
                int i2 = i + o;
                List subList = a2.subList(i, Math.min(size, i2));
                aorr a3 = okj.a(this, helpConfig, account, this.b, subList);
                if (a3 != null) {
                    arrayList.add(a3);
                    aorl.a(a3, new okh(this, subList), this.b);
                }
                i = i2;
            }
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i < size2) {
            try {
                if (!a(((ogi) ((Future) arrayList.get(i)).get(axmj.q(), TimeUnit.SECONDS)).a)) {
                    i3 = 1;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("gH_RBatchedMetricsSrv", "Sending batched metrics failed through Cronet. Will retry ...", e);
                i3 = 1;
            }
            i++;
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.a
            int r1 = r0.hashCode()
            r2 = 1878650544(0x6ff9eeb0, float:1.5470065E29)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x001e
            r2 = 2080265046(0x7bfe5356, float:2.6410673E36)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "action_prefetch_offline_help_content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "action_clear_expired_help_content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x00ff
            if (r0 == r5) goto L_0x00fa
            android.os.Bundle r0 = r9.b
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = "app_pkg_name_extra"
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0044
            android.os.Bundle r0 = r9.b
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0047
        L_0x0044:
            java.lang.String r0 = ""
        L_0x0047:
            okc r1 = r8.a
            r1.c(r0)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = new com.google.android.gms.googlehelp.common.HelpConfig
            r1.<init>()
            r1.b = r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 20
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.e = r2
            android.os.Bundle r2 = r9.b
            if (r2 == 0) goto L_0x00aa
            java.lang.String r3 = "genie-eng:app_pkg_name"
            java.lang.String r2 = r2.getString(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00aa
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r5 = r9.b
            java.lang.String r5 = r5.getString(r3)
            r2.putString(r3, r5)
            android.os.Bundle r5 = r1.f
            if (r5 == 0) goto L_0x008f
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00a2
        L_0x008f:
            boolean r5 = defpackage.axqb.d()
            boolean r5 = defpackage.ofq.b(r5)
            if (r5 == 0) goto L_0x00a0
            android.os.Bundle r2 = defpackage.ofx.a((android.os.Bundle) r2)
            r1.f = r2
            goto L_0x00a2
        L_0x00a0:
            r1.f = r2
        L_0x00a2:
            android.os.Bundle r9 = r9.b
            java.lang.String r9 = r9.getString(r3)
            r1.L = r9
        L_0x00aa:
            nz r9 = new nz
            r9.<init>()
            qub r2 = defpackage.qub.a((android.content.Context) r8)
            android.accounts.Account[] r2 = r2.b()
            int r3 = r2.length
            r5 = 0
        L_0x00b9:
            if (r5 >= r3) goto L_0x00c7
            r6 = r2[r5]
            java.lang.String r7 = defpackage.myo.a((android.accounts.Account) r6)
            r9.put(r7, r6)
            int r5 = r5 + 1
            goto L_0x00b9
        L_0x00c7:
            okc r2 = r8.a
            java.util.List r0 = r2.a((java.lang.String) r0)
            oai r2 = new oai
            r2.<init>()
        L_0x00d2:
            int r3 = r0.size()
            if (r4 >= r3) goto L_0x00e6
            java.lang.Object r3 = r0.get(r4)
            olo r3 = (defpackage.olo) r3
            java.lang.String r5 = r3.e
            r2.a(r5, r3)
            int r4 = r4 + 1
            goto L_0x00d2
        L_0x00e6:
            boolean r0 = defpackage.axpd.b()
            boolean r0 = defpackage.ofq.a(r0)
            if (r0 == 0) goto L_0x00f5
            int r9 = r8.a((com.google.android.gms.googlehelp.common.HelpConfig) r1, (java.util.Map) r9, (defpackage.oai) r2)
            goto L_0x00f9
        L_0x00f5:
            int r9 = r8.b(r1, r9, r2)
        L_0x00f9:
            return r9
        L_0x00fa:
            int r9 = r8.b(r9)
            return r9
        L_0x00ff:
            boolean r0 = defpackage.axmj.y()
            if (r0 == 0) goto L_0x012b
            ofn r0 = r8.c
            axmj r1 = defpackage.axmj.a
            axmk r1 = r1.a()
            long r1 = r1.Q()
            r0.a((long) r1)
            android.os.Bundle r9 = r9.b
            java.lang.String r1 = "number_of_retries_left"
            int r9 = r9.getInt(r1)
            int r9 = r9 + r3
            if (r9 <= 0) goto L_0x0128
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x0128
            a((android.content.Context) r8, (int) r9, (boolean) r5)
        L_0x0128:
            r0.close()
        L_0x012b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService.a(qxz):int");
    }

    /* access modifiers changed from: package-private */
    public final void a(VolleyError volleyError, Bundle bundle) {
        int i = 0;
        if (volleyError != null && (volleyError instanceof ServerError)) {
            i = 1;
        }
        a((Context) this, bundle, i);
    }
}
