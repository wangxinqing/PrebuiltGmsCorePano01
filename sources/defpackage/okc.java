package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: okc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okc implements Closeable {
    private static final String[] a = {"_id", "app_package_name", "user_account_id", "product_specific_context", "session_id", "user_action_type", "sub_user_action_type", "shown_content_list", "query", "url", "click_rank", "contact_mode_type", "elapsed_millis", "content_unit_type_enum", "fragment_type", "network_type_enum", "timestamp_millis", "gcore_version", "client_version", "offline", "feedback_policy_set_version", "experiment_token", "flow", "feedback_psd_count", "feedback_psbd_count", "feedback_screenshot_present", "ocarina_elapsed_millis", "ocarina_num_bytes"};
    @Deprecated
    private final okb b;
    private final Context c;

    public okc(Context context) {
        this.c = context;
        this.b = new okb(context);
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase a() {
        try {
            return b().getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("gH_MetricsDatabase", "Error opening Metrics database.", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final jjj b() {
        return ofq.b(axqw.a.a().b()) ? okb.a(this.c) : this.b;
    }

    public final synchronized void c(String str) {
        SQLiteDatabase a2 = a();
        if (a2 != null && a2.isOpen() && !a2.isReadOnly()) {
            a2.delete("metrics", "app_package_name=? AND timestamp_millis<?", new String[]{str, String.valueOf(System.currentTimeMillis() - axmj.a.a().Y())});
        }
    }

    public final synchronized void close() {
        nzi.a(b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0596, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x059d A[SYNTHETIC, Splitter:B:196:0x059d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a(java.lang.String r38) {
        /*
            r37 = this;
            monitor-enter(r37)
            jjj r0 = r37.b()     // Catch:{ all -> 0x05a7 }
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()     // Catch:{ all -> 0x05a7 }
            boolean r0 = r1.isOpen()     // Catch:{ all -> 0x05a7 }
            if (r0 == 0) goto L_0x05a1
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0599 }
            r9 = 0
            r5[r9] = r38     // Catch:{ all -> 0x0599 }
            java.lang.String r2 = "metrics"
            java.lang.String[] r3 = a     // Catch:{ all -> 0x0599 }
            java.lang.String r4 = "app_package_name=?"
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0599 }
            java.lang.String r2 = "_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0597 }
            java.lang.String r3 = "app_package_name"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x0597 }
            java.lang.String r4 = "user_account_id"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ all -> 0x0597 }
            java.lang.String r5 = "product_specific_context"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x0597 }
            java.lang.String r6 = "session_id"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x0597 }
            java.lang.String r7 = "user_action_type"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ all -> 0x0597 }
            java.lang.String r8 = "sub_user_action_type"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x0597 }
            java.lang.String r10 = "shown_content_list"
            int r10 = r1.getColumnIndex(r10)     // Catch:{ all -> 0x0597 }
            java.lang.String r11 = "query"
            int r11 = r1.getColumnIndex(r11)     // Catch:{ all -> 0x0597 }
            java.lang.String r12 = "url"
            int r12 = r1.getColumnIndex(r12)     // Catch:{ all -> 0x0597 }
            java.lang.String r13 = "click_rank"
            int r13 = r1.getColumnIndex(r13)     // Catch:{ all -> 0x0597 }
            java.lang.String r14 = "contact_mode_type"
            int r14 = r1.getColumnIndex(r14)     // Catch:{ all -> 0x0597 }
            java.lang.String r15 = "elapsed_millis"
            int r15 = r1.getColumnIndex(r15)     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = "content_unit_type_enum"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x0597 }
            java.lang.String r9 = "fragment_type"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r38 = r9
            java.lang.String r9 = "network_type_enum"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r17 = r9
            java.lang.String r9 = "timestamp_millis"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r18 = r9
            java.lang.String r9 = "gcore_version"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r19 = r9
            java.lang.String r9 = "client_version"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r20 = r9
            java.lang.String r9 = "offline"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r21 = r9
            java.lang.String r9 = "feedback_policy_set_version"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r22 = r9
            java.lang.String r9 = "experiment_token"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r23 = r9
            java.lang.String r9 = "flow"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r24 = r9
            java.lang.String r9 = "feedback_psd_count"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r25 = r9
            java.lang.String r9 = "feedback_psbd_count"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r26 = r9
            java.lang.String r9 = "feedback_screenshot_present"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r27 = r9
            java.lang.String r9 = "ocarina_elapsed_millis"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r28 = r9
            java.lang.String r9 = "ocarina_num_bytes"
            int r9 = r1.getColumnIndex(r9)     // Catch:{ all -> 0x0597 }
            r29 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0597 }
            r9.<init>()     // Catch:{ all -> 0x0597 }
        L_0x00eb:
            boolean r30 = r1.moveToNext()     // Catch:{ all -> 0x0597 }
            if (r30 == 0) goto L_0x058f
            olo r30 = defpackage.olo.I     // Catch:{ all -> 0x0597 }
            r31 = r9
            aucd r9 = r30.o()     // Catch:{ all -> 0x0597 }
            r30 = r0
            int r0 = r1.getInt(r2)     // Catch:{ all -> 0x0597 }
            r32 = r2
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x010c:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r33 = r15
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r16 = 1
            r15 = r15 | 1
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.c = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x012b:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 2
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.d = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r4)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0149:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 4
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.e = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r5)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0161
            goto L_0x0167
        L_0x0161:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0167:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 8
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.f = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x017f
            goto L_0x0185
        L_0x017f:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0185:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 64
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.i = r0     // Catch:{ all -> 0x0597 }
            int r0 = r1.getInt(r7)     // Catch:{ all -> 0x0597 }
            int r0 = defpackage.avne.a(r0)     // Catch:{ all -> 0x0597 }
            if (r0 == 0) goto L_0x01b8
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x01a3
            goto L_0x01a9
        L_0x01a3:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x01a9:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            int r0 = r0 + -1
            r2.j = r0     // Catch:{ all -> 0x0597 }
            int r0 = r2.a     // Catch:{ all -> 0x0597 }
            r0 = r0 | 256(0x100, float:3.59E-43)
            r2.a = r0     // Catch:{ all -> 0x0597 }
            goto L_0x01d0
        L_0x01b8:
            boolean r0 = r9.c     // Catch:{ all -> 0x0597 }
            if (r0 != 0) goto L_0x01bd
            goto L_0x01c3
        L_0x01bd:
            r9.c()     // Catch:{ all -> 0x0597 }
            r0 = 0
            r9.c = r0     // Catch:{ all -> 0x0597 }
        L_0x01c3:
            aucj r0 = r9.b     // Catch:{ all -> 0x0597 }
            olo r0 = (defpackage.olo) r0     // Catch:{ all -> 0x0597 }
            r2 = 0
            r0.j = r2     // Catch:{ all -> 0x0597 }
            int r2 = r0.a     // Catch:{ all -> 0x0597 }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r0.a = r2     // Catch:{ all -> 0x0597 }
        L_0x01d0:
            int r0 = r1.getInt(r8)     // Catch:{ all -> 0x0597 }
            int r0 = defpackage.avnc.a(r0)     // Catch:{ all -> 0x0597 }
            if (r0 == 0) goto L_0x01f4
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x01df
            goto L_0x01e5
        L_0x01df:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x01e5:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            int r0 = r0 + -1
            r2.k = r0     // Catch:{ all -> 0x0597 }
            int r0 = r2.a     // Catch:{ all -> 0x0597 }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r2.a = r0     // Catch:{ all -> 0x0597 }
            goto L_0x020c
        L_0x01f4:
            boolean r0 = r9.c     // Catch:{ all -> 0x0597 }
            if (r0 != 0) goto L_0x01f9
            goto L_0x01ff
        L_0x01f9:
            r9.c()     // Catch:{ all -> 0x0597 }
            r0 = 0
            r9.c = r0     // Catch:{ all -> 0x0597 }
        L_0x01ff:
            aucj r0 = r9.b     // Catch:{ all -> 0x0597 }
            olo r0 = (defpackage.olo) r0     // Catch:{ all -> 0x0597 }
            r2 = 0
            r0.k = r2     // Catch:{ all -> 0x0597 }
            int r2 = r0.a     // Catch:{ all -> 0x0597 }
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r0.a = r2     // Catch:{ all -> 0x0597 }
        L_0x020c:
            java.lang.String r0 = r1.getString(r10)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0215
            goto L_0x021b
        L_0x0215:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x021b:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 2048(0x800, float:2.87E-42)
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.l = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r11)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0233
            goto L_0x0239
        L_0x0233:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0239:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 4096(0x1000, float:5.74E-42)
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.m = r0     // Catch:{ all -> 0x0597 }
            java.lang.String r0 = r1.getString(r12)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0251
            goto L_0x0257
        L_0x0251:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0257:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r0.getClass()     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 8192(0x2000, float:1.14794E-41)
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.n = r0     // Catch:{ all -> 0x0597 }
            int r0 = r1.getInt(r13)     // Catch:{ all -> 0x0597 }
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x026f
            goto L_0x0275
        L_0x026f:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0275:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            int r15 = r2.a     // Catch:{ all -> 0x0597 }
            r15 = r15 | 16384(0x4000, float:2.2959E-41)
            r2.a = r15     // Catch:{ all -> 0x0597 }
            r2.o = r0     // Catch:{ all -> 0x0597 }
            int r0 = r1.getInt(r14)     // Catch:{ all -> 0x0597 }
            avmt r0 = defpackage.avmt.a(r0)     // Catch:{ all -> 0x0597 }
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r0 == 0) goto L_0x02a6
            boolean r15 = r9.c     // Catch:{ all -> 0x0597 }
            if (r15 != 0) goto L_0x0292
            goto L_0x0298
        L_0x0292:
            r9.c()     // Catch:{ all -> 0x0597 }
            r15 = 0
            r9.c = r15     // Catch:{ all -> 0x0597 }
        L_0x0298:
            aucj r15 = r9.b     // Catch:{ all -> 0x0597 }
            olo r15 = (defpackage.olo) r15     // Catch:{ all -> 0x0597 }
            int r0 = r0.i     // Catch:{ all -> 0x0597 }
            r15.p = r0     // Catch:{ all -> 0x0597 }
            int r0 = r15.a     // Catch:{ all -> 0x0597 }
            r0 = r0 | r2
            r15.a = r0     // Catch:{ all -> 0x0597 }
            goto L_0x02c0
        L_0x02a6:
            avmt r0 = defpackage.avmt.UNKNOWN_CONTACT_MODE     // Catch:{ all -> 0x0597 }
            boolean r15 = r9.c     // Catch:{ all -> 0x0597 }
            if (r15 != 0) goto L_0x02ad
            goto L_0x02b3
        L_0x02ad:
            r9.c()     // Catch:{ all -> 0x0597 }
            r15 = 0
            r9.c = r15     // Catch:{ all -> 0x0597 }
        L_0x02b3:
            aucj r15 = r9.b     // Catch:{ all -> 0x0597 }
            olo r15 = (defpackage.olo) r15     // Catch:{ all -> 0x0597 }
            int r0 = r0.i     // Catch:{ all -> 0x0597 }
            r15.p = r0     // Catch:{ all -> 0x0597 }
            int r0 = r15.a     // Catch:{ all -> 0x0597 }
            r0 = r0 | r2
            r15.a = r0     // Catch:{ all -> 0x0597 }
        L_0x02c0:
            r15 = r3
            r0 = r33
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0597 }
            r33 = r0
            boolean r0 = r9.c     // Catch:{ all -> 0x0597 }
            if (r0 != 0) goto L_0x02ce
            goto L_0x02d4
        L_0x02ce:
            r9.c()     // Catch:{ all -> 0x0597 }
            r0 = 0
            r9.c = r0     // Catch:{ all -> 0x0597 }
        L_0x02d4:
            aucj r0 = r9.b     // Catch:{ all -> 0x0597 }
            olo r0 = (defpackage.olo) r0     // Catch:{ all -> 0x0597 }
            r34 = r4
            int r4 = r0.a     // Catch:{ all -> 0x0597 }
            r35 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 | r35
            r0.a = r4     // Catch:{ all -> 0x0597 }
            r0.q = r2     // Catch:{ all -> 0x0597 }
            r0 = r30
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            int r2 = defpackage.avmv.a(r2)     // Catch:{ all -> 0x0597 }
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 == 0) goto L_0x030c
            boolean r4 = r9.c     // Catch:{ all -> 0x0597 }
            if (r4 != 0) goto L_0x02f7
        L_0x02f6:
            goto L_0x02fe
        L_0x02f7:
            r9.c()     // Catch:{ all -> 0x0597 }
            r4 = 0
            r9.c = r4     // Catch:{ all -> 0x0597 }
            goto L_0x02f6
        L_0x02fe:
            aucj r4 = r9.b     // Catch:{ all -> 0x0597 }
            olo r4 = (defpackage.olo) r4     // Catch:{ all -> 0x0597 }
            int r2 = r2 + -1
            r4.x = r2     // Catch:{ all -> 0x0597 }
            int r2 = r4.a     // Catch:{ all -> 0x0597 }
            r2 = r2 | r3
            r4.a = r2     // Catch:{ all -> 0x0597 }
            goto L_0x0323
        L_0x030c:
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0311
            goto L_0x0317
        L_0x0311:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x0317:
            aucj r2 = r9.b     // Catch:{ all -> 0x0597 }
            olo r2 = (defpackage.olo) r2     // Catch:{ all -> 0x0597 }
            r4 = 0
            r2.x = r4     // Catch:{ all -> 0x0597 }
            int r4 = r2.a     // Catch:{ all -> 0x0597 }
            r3 = r3 | r4
            r2.a = r3     // Catch:{ all -> 0x0597 }
        L_0x0323:
            r2 = r38
            int r3 = r1.getInt(r2)     // Catch:{ all -> 0x0597 }
            boolean r4 = r9.c     // Catch:{ all -> 0x0597 }
            if (r4 != 0) goto L_0x032e
            goto L_0x0334
        L_0x032e:
            r9.c()     // Catch:{ all -> 0x0597 }
            r4 = 0
            r9.c = r4     // Catch:{ all -> 0x0597 }
        L_0x0334:
            aucj r4 = r9.b     // Catch:{ all -> 0x0597 }
            olo r4 = (defpackage.olo) r4     // Catch:{ all -> 0x0597 }
            r30 = r0
            int r0 = r4.a     // Catch:{ all -> 0x0597 }
            r35 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 | r35
            r4.a = r0     // Catch:{ all -> 0x0597 }
            r4.r = r3     // Catch:{ all -> 0x0597 }
            r0 = r17
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            int r3 = defpackage.avmy.a(r3)     // Catch:{ all -> 0x0597 }
            if (r3 == 0) goto L_0x036d
            boolean r4 = r9.c     // Catch:{ all -> 0x0597 }
            if (r4 != 0) goto L_0x0355
        L_0x0354:
            goto L_0x035c
        L_0x0355:
            r9.c()     // Catch:{ all -> 0x0597 }
            r4 = 0
            r9.c = r4     // Catch:{ all -> 0x0597 }
            goto L_0x0354
        L_0x035c:
            aucj r4 = r9.b     // Catch:{ all -> 0x0597 }
            olo r4 = (defpackage.olo) r4     // Catch:{ all -> 0x0597 }
            int r3 = r3 + -1
            r4.s = r3     // Catch:{ all -> 0x0597 }
            int r3 = r4.a     // Catch:{ all -> 0x0597 }
            r17 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 | r17
            r4.a = r3     // Catch:{ all -> 0x0597 }
            goto L_0x0387
        L_0x036d:
            boolean r3 = r9.c     // Catch:{ all -> 0x0597 }
            if (r3 != 0) goto L_0x0372
            goto L_0x0378
        L_0x0372:
            r9.c()     // Catch:{ all -> 0x0597 }
            r3 = 0
            r9.c = r3     // Catch:{ all -> 0x0597 }
        L_0x0378:
            aucj r3 = r9.b     // Catch:{ all -> 0x0597 }
            olo r3 = (defpackage.olo) r3     // Catch:{ all -> 0x0597 }
            r4 = 0
            r3.s = r4     // Catch:{ all -> 0x0597 }
            int r4 = r3.a     // Catch:{ all -> 0x0597 }
            r17 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 | r17
            r3.a = r4     // Catch:{ all -> 0x0597 }
        L_0x0387:
            r38 = r5
            r3 = r18
            long r4 = r1.getLong(r3)     // Catch:{ all -> 0x0597 }
            r17 = r0
            boolean r0 = r9.c     // Catch:{ all -> 0x0597 }
            if (r0 != 0) goto L_0x0396
            goto L_0x039c
        L_0x0396:
            r9.c()     // Catch:{ all -> 0x0597 }
            r0 = 0
            r9.c = r0     // Catch:{ all -> 0x0597 }
        L_0x039c:
            aucj r0 = r9.b     // Catch:{ all -> 0x0597 }
            olo r0 = (defpackage.olo) r0     // Catch:{ all -> 0x0597 }
            r18 = r2
            int r2 = r0.a     // Catch:{ all -> 0x0597 }
            r35 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r35
            r0.a = r2     // Catch:{ all -> 0x0597 }
            r0.t = r4     // Catch:{ all -> 0x0597 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0597 }
            r0 = r6
            r2 = r7
            r6 = 0
            long r35 = r1.getLong(r3)     // Catch:{ all -> 0x0597 }
            long r4 = r4 - r35
            long r4 = java.lang.Math.max(r6, r4)     // Catch:{ all -> 0x0597 }
            boolean r6 = r9.c     // Catch:{ all -> 0x0597 }
            if (r6 != 0) goto L_0x03c3
            goto L_0x03c9
        L_0x03c3:
            r9.c()     // Catch:{ all -> 0x0597 }
            r6 = 0
            r9.c = r6     // Catch:{ all -> 0x0597 }
        L_0x03c9:
            aucj r6 = r9.b     // Catch:{ all -> 0x0597 }
            olo r6 = (defpackage.olo) r6     // Catch:{ all -> 0x0597 }
            int r7 = r6.a     // Catch:{ all -> 0x0597 }
            r35 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r7 | r35
            r6.a = r7     // Catch:{ all -> 0x0597 }
            r6.u = r4     // Catch:{ all -> 0x0597 }
            r4 = r19
            int r5 = r1.getInt(r4)     // Catch:{ all -> 0x0597 }
            boolean r6 = r9.c     // Catch:{ all -> 0x0597 }
            if (r6 != 0) goto L_0x03e2
            goto L_0x03e8
        L_0x03e2:
            r9.c()     // Catch:{ all -> 0x0597 }
            r6 = 0
            r9.c = r6     // Catch:{ all -> 0x0597 }
        L_0x03e8:
            aucj r6 = r9.b     // Catch:{ all -> 0x0597 }
            olo r6 = (defpackage.olo) r6     // Catch:{ all -> 0x0597 }
            int r7 = r6.a     // Catch:{ all -> 0x0597 }
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            r7 = r7 | r19
            r6.a = r7     // Catch:{ all -> 0x0597 }
            r6.v = r5     // Catch:{ all -> 0x0597 }
            r5 = r20
            int r6 = r1.getInt(r5)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x0401
            goto L_0x0407
        L_0x0401:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x0407:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r19 = r0
            int r0 = r7.a     // Catch:{ all -> 0x0597 }
            r20 = 1073741824(0x40000000, float:2.0)
            r0 = r0 | r20
            r7.a = r0     // Catch:{ all -> 0x0597 }
            r7.y = r6     // Catch:{ all -> 0x0597 }
            r0 = r21
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            r7 = 1
            if (r6 != r7) goto L_0x0422
            r6 = 1
            goto L_0x0423
        L_0x0422:
            r6 = 0
        L_0x0423:
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x0428
            goto L_0x042e
        L_0x0428:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x042e:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r21 = r0
            int r0 = r7.a     // Catch:{ all -> 0x0597 }
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r20
            r7.a = r0     // Catch:{ all -> 0x0597 }
            r7.z = r6     // Catch:{ all -> 0x0597 }
            r0 = r22
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x0449
            goto L_0x044f
        L_0x0449:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x044f:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r22 = r0
            int r0 = r7.a     // Catch:{ all -> 0x0597 }
            r20 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 | r20
            r7.a = r0     // Catch:{ all -> 0x0597 }
            r7.w = r6     // Catch:{ all -> 0x0597 }
            r0 = r23
            java.lang.String r6 = r1.getString(r0)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x046a
            goto L_0x0470
        L_0x046a:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x0470:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r6.getClass()     // Catch:{ all -> 0x0597 }
            r23 = r0
            int r0 = r7.b     // Catch:{ all -> 0x0597 }
            r16 = 1
            r0 = r0 | 1
            r7.b = r0     // Catch:{ all -> 0x0597 }
            r7.A = r6     // Catch:{ all -> 0x0597 }
            r0 = r24
            java.lang.String r6 = r1.getString(r0)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x048e
            goto L_0x0494
        L_0x048e:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x0494:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r6.getClass()     // Catch:{ all -> 0x0597 }
            r24 = r0
            int r0 = r7.a     // Catch:{ all -> 0x0597 }
            r0 = r0 | 16
            r7.a = r0     // Catch:{ all -> 0x0597 }
            r7.g = r6     // Catch:{ all -> 0x0597 }
            r0 = r25
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x04b0
            goto L_0x04b6
        L_0x04b0:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x04b6:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r25 = r0
            int r0 = r7.b     // Catch:{ all -> 0x0597 }
            r0 = r0 | 4
            r7.b = r0     // Catch:{ all -> 0x0597 }
            r7.C = r6     // Catch:{ all -> 0x0597 }
            r0 = r26
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x04cf
            goto L_0x04d5
        L_0x04cf:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x04d5:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r26 = r0
            int r0 = r7.b     // Catch:{ all -> 0x0597 }
            r0 = r0 | 8
            r7.b = r0     // Catch:{ all -> 0x0597 }
            r7.D = r6     // Catch:{ all -> 0x0597 }
            r0 = r27
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            r7 = 1
            if (r6 != r7) goto L_0x04ee
            r6 = 1
            goto L_0x04ef
        L_0x04ee:
            r6 = 0
        L_0x04ef:
            boolean r7 = r9.c     // Catch:{ all -> 0x0597 }
            if (r7 != 0) goto L_0x04f4
            goto L_0x04fa
        L_0x04f4:
            r9.c()     // Catch:{ all -> 0x0597 }
            r7 = 0
            r9.c = r7     // Catch:{ all -> 0x0597 }
        L_0x04fa:
            aucj r7 = r9.b     // Catch:{ all -> 0x0597 }
            olo r7 = (defpackage.olo) r7     // Catch:{ all -> 0x0597 }
            r27 = r0
            int r0 = r7.b     // Catch:{ all -> 0x0597 }
            r0 = r0 | 16
            r7.b = r0     // Catch:{ all -> 0x0597 }
            r7.E = r6     // Catch:{ all -> 0x0597 }
            r0 = r28
            int r6 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            long r6 = (long) r6     // Catch:{ all -> 0x0597 }
            r28 = r0
            boolean r0 = r9.c     // Catch:{ all -> 0x0597 }
            if (r0 != 0) goto L_0x0516
            goto L_0x051c
        L_0x0516:
            r9.c()     // Catch:{ all -> 0x0597 }
            r0 = 0
            r9.c = r0     // Catch:{ all -> 0x0597 }
        L_0x051c:
            aucj r0 = r9.b     // Catch:{ all -> 0x0597 }
            olo r0 = (defpackage.olo) r0     // Catch:{ all -> 0x0597 }
            r20 = r2
            int r2 = r0.b     // Catch:{ all -> 0x0597 }
            r2 = r2 | 32
            r0.b = r2     // Catch:{ all -> 0x0597 }
            r0.F = r6     // Catch:{ all -> 0x0597 }
            r0 = r29
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x0597 }
            boolean r6 = r9.c     // Catch:{ all -> 0x0597 }
            if (r6 != 0) goto L_0x0535
            goto L_0x053b
        L_0x0535:
            r9.c()     // Catch:{ all -> 0x0597 }
            r6 = 0
            r9.c = r6     // Catch:{ all -> 0x0597 }
        L_0x053b:
            aucj r6 = r9.b     // Catch:{ all -> 0x0597 }
            olo r6 = (defpackage.olo) r6     // Catch:{ all -> 0x0597 }
            int r7 = r6.b     // Catch:{ all -> 0x0597 }
            r7 = r7 | 64
            r6.b = r7     // Catch:{ all -> 0x0597 }
            r6.G = r2     // Catch:{ all -> 0x0597 }
            boolean r2 = defpackage.axpy.b()     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x054f
            r2 = 0
            goto L_0x0568
        L_0x054f:
            boolean r2 = r9.c     // Catch:{ all -> 0x0597 }
            if (r2 != 0) goto L_0x0555
            r2 = 0
            goto L_0x055b
        L_0x0555:
            r9.c()     // Catch:{ all -> 0x0597 }
            r2 = 0
            r9.c = r2     // Catch:{ all -> 0x0597 }
        L_0x055b:
            aucj r6 = r9.b     // Catch:{ all -> 0x0597 }
            olo r6 = (defpackage.olo) r6     // Catch:{ all -> 0x0597 }
            r7 = 6
            r6.h = r7     // Catch:{ all -> 0x0597 }
            int r7 = r6.a     // Catch:{ all -> 0x0597 }
            r7 = r7 | 32
            r6.a = r7     // Catch:{ all -> 0x0597 }
        L_0x0568:
            aucj r6 = r9.i()     // Catch:{ all -> 0x0597 }
            olo r6 = (defpackage.olo) r6     // Catch:{ all -> 0x0597 }
            r7 = r31
            r7.add(r6)     // Catch:{ all -> 0x0597 }
            r29 = r0
            r9 = r7
            r6 = r19
            r7 = r20
            r0 = r30
            r2 = r32
            r19 = r4
            r20 = r5
            r4 = r34
            r5 = r38
            r38 = r18
            r18 = r3
            r3 = r15
            r15 = r33
            goto L_0x00eb
        L_0x058f:
            r7 = r9
            if (r1 == 0) goto L_0x0595
            r1.close()     // Catch:{ all -> 0x05a7 }
        L_0x0595:
            monitor-exit(r37)
            return r7
        L_0x0597:
            r0 = move-exception
            goto L_0x059b
        L_0x0599:
            r0 = move-exception
            r1 = 0
        L_0x059b:
            if (r1 == 0) goto L_0x05a0
            r1.close()     // Catch:{ all -> 0x05a7 }
        L_0x05a0:
            throw r0     // Catch:{ all -> 0x05a7 }
        L_0x05a1:
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x05a7 }
            monitor-exit(r37)
            return r0
        L_0x05a7:
            r0 = move-exception
            monitor-exit(r37)
            goto L_0x05ab
        L_0x05aa:
            throw r0
        L_0x05ab:
            goto L_0x05aa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.a()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0.isReadOnly()     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.lang.String r4 = "gH_MetricsDatabase"
            java.lang.String r0 = "Empty package name, cannot clear entry."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x0022:
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1[r2] = r4     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = "metrics"
            java.lang.String r2 = "app_package_name=?"
            r0.delete(r4, r2, r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.b(java.lang.String):void");
    }

    public final synchronized void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((olo) list.get(i)).c));
        }
        SQLiteDatabase a2 = a();
        if (a2 != null && a2.isOpen() && !a2.isReadOnly()) {
            String join = TextUtils.join("\",\"", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 11);
            sb.append("_id IN (\"");
            sb.append(join);
            sb.append("\")");
            a2.delete("metrics", sb.toString(), (String[]) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.olo r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.database.sqlite.SQLiteDatabase r0 = r7.a()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x01c4
            boolean r1 = r0.isReadOnly()     // Catch:{ all -> 0x01c6 }
            if (r1 != 0) goto L_0x01c4
            boolean r1 = r0.isOpen()     // Catch:{ all -> 0x01c6 }
            r2 = 0
            if (r1 == 0) goto L_0x01bf
            java.lang.String r1 = r8.d     // Catch:{ all -> 0x01c6 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01c6 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r8 = "gH_MetricsDatabase"
            java.lang.String r0 = "Application package name is empty, not logging metrics."
            android.util.Log.e(r8, r0)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r7)
            return
        L_0x0025:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x01c6 }
            r1.<init>()     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "app_package_name"
            java.lang.String r4 = r8.d     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "user_account_id"
            java.lang.String r4 = r8.e     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "product_specific_context"
            java.lang.String r4 = r8.f     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r4)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "session_id"
            java.lang.String r4 = r8.i     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r4)     // Catch:{ all -> 0x01c6 }
            int r3 = r8.a     // Catch:{ all -> 0x01c6 }
            r3 = r3 & 256(0x100, float:3.59E-43)
            r4 = 1
            if (r3 != 0) goto L_0x0057
            java.lang.String r3 = "user_action_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            goto L_0x006c
        L_0x0057:
            int r3 = r8.j     // Catch:{ all -> 0x01c6 }
            int r3 = defpackage.avne.a(r3)     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            java.lang.String r5 = "user_action_type"
            int r3 = r3 + -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r5, r3)     // Catch:{ all -> 0x01c6 }
        L_0x006c:
            int r3 = r8.a     // Catch:{ all -> 0x01c6 }
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0088
            int r3 = r8.k     // Catch:{ all -> 0x01c6 }
            int r3 = defpackage.avnc.a(r3)     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r3 = 1
        L_0x007c:
            java.lang.String r5 = "sub_user_action_type"
            int r3 = r3 + -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r5, r3)     // Catch:{ all -> 0x01c6 }
            goto L_0x0091
        L_0x0088:
            java.lang.String r3 = "sub_user_action_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
        L_0x0091:
            java.lang.String r3 = "shown_content_list"
            java.lang.String r5 = r8.l     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "query"
            java.lang.String r5 = r8.m     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "url"
            java.lang.String r5 = r8.n     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "click_rank"
            int r5 = r8.o     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            int r3 = r8.a     // Catch:{ all -> 0x01c6 }
            r5 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r5
            if (r3 != 0) goto L_0x00c2
            java.lang.String r3 = "contact_mode_type"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            goto L_0x00d8
        L_0x00c2:
            int r3 = r8.p     // Catch:{ all -> 0x01c6 }
            avmt r3 = defpackage.avmt.a(r3)     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            avmt r3 = defpackage.avmt.UNKNOWN_CONTACT_MODE     // Catch:{ all -> 0x01c6 }
        L_0x00cd:
            java.lang.String r5 = "contact_mode_type"
            int r3 = r3.i     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r5, r3)     // Catch:{ all -> 0x01c6 }
        L_0x00d8:
            java.lang.String r3 = "elapsed_millis"
            long r5 = r8.q     // Catch:{ all -> 0x01c6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            int r3 = r8.a     // Catch:{ all -> 0x01c6 }
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r5
            if (r3 != 0) goto L_0x00f4
            java.lang.String r3 = "content_unit_type_enum"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            goto L_0x0109
        L_0x00f4:
            int r3 = r8.x     // Catch:{ all -> 0x01c6 }
            int r3 = defpackage.avmv.a(r3)     // Catch:{ all -> 0x01c6 }
            if (r3 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r3 = 1
        L_0x00fe:
            java.lang.String r5 = "content_unit_type_enum"
            int r3 = r3 + -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r5, r3)     // Catch:{ all -> 0x01c6 }
        L_0x0109:
            java.lang.String r3 = "fragment_type"
            int r5 = r8.r     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r5)     // Catch:{ all -> 0x01c6 }
            int r3 = r8.a     // Catch:{ all -> 0x01c6 }
            r5 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 & r5
            if (r3 != 0) goto L_0x0125
            java.lang.String r3 = "network_type_enum"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01c6 }
            r1.put(r3, r2)     // Catch:{ all -> 0x01c6 }
            goto L_0x013b
        L_0x0125:
            int r2 = r8.s     // Catch:{ all -> 0x01c6 }
            int r2 = defpackage.avmy.a(r2)     // Catch:{ all -> 0x01c6 }
            if (r2 == 0) goto L_0x012f
            r4 = r2
            goto L_0x0130
        L_0x012f:
        L_0x0130:
            java.lang.String r2 = "network_type_enum"
            int r4 = r4 + -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
        L_0x013b:
            java.lang.String r2 = "timestamp_millis"
            long r3 = r8.t     // Catch:{ all -> 0x01c6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "gcore_version"
            int r3 = r8.v     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "client_version"
            int r3 = r8.y     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "offline"
            boolean r3 = r8.z     // Catch:{ all -> 0x01c6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "feedback_policy_set_version"
            int r3 = r8.w     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "experiment_token"
            java.lang.String r3 = r8.A     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "flow"
            java.lang.String r3 = r8.g     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "feedback_psd_count"
            int r3 = r8.C     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "feedback_psbd_count"
            int r3 = r8.D     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "feedback_screenshot_present"
            boolean r3 = r8.E     // Catch:{ all -> 0x01c6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "ocarina_elapsed_millis"
            long r3 = r8.F     // Catch:{ all -> 0x01c6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r3)     // Catch:{ all -> 0x01c6 }
            java.lang.String r2 = "ocarina_num_bytes"
            int r8 = r8.G     // Catch:{ all -> 0x01c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01c6 }
            r1.put(r2, r8)     // Catch:{ all -> 0x01c6 }
            java.lang.String r8 = "metrics"
            r2 = 0
            r0.insert(r8, r2, r1)     // Catch:{ all -> 0x01c6 }
            monitor-exit(r7)
            return
        L_0x01bf:
            android.content.Context r0 = r7.c     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(r0, r8, r2)     // Catch:{ all -> 0x01c6 }
        L_0x01c4:
            monitor-exit(r7)
            return
        L_0x01c6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.a(olo):void");
    }
}
