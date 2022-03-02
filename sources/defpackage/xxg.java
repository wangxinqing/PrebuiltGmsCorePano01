package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.R;

/* renamed from: xxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxg extends xxi {
    private static final anaf q = anaf.a(xjo.GROUP, xkm.GROUP_SYNC_DOWN_PROGRESS, xjo.CONTACT, xkm.CONTACT_SYNC_DOWN_PROGRESS, xjo.PHOTO, xkm.PHOTO_SYNC_DOWN_PROGRESS);
    private int p = -1;

    public xxg(Context context, Account account, wss wss, yaz yaz) {
        super(context, account, wss, yaz, R.string.people_fsa_progress_notification_format_for_sync_down, 2, "FSA2_SyncDownProgressNotifier");
    }

    public static boolean a(wss wss, yaz yaz, String str) {
        if (xxi.f()) {
            ybh ybh = (ybh) yaz;
            if (!ybh.t || !ayug.a.a().K()) {
                return !ybh.t && ayug.a.a().M();
            }
            if (ayug.a.a().L() || !wss.l(str)) {
                return !ayug.a.a().h() || ((long) wss.k(str)) < ayug.a.a().r();
            }
            return false;
        }
    }

    public final String a() {
        return "com.google.android.gms.people.sync.focus.notification.DISMISSED_FOR_SYNC_DOWN";
    }

    public final String b() {
        return "com.google.android.gms.people.sync.focus.notification.TAPPED_FOR_SYNC_DOWN";
    }

    public final Intent c() {
        if (ayug.a.a().A()) {
            try {
                this.d.getPackageManager().getPackageInfo("com.google.android.contacts", 0);
                return new Intent("android.intent.action.VIEW").setType("vnd.android.cursor.dir/raw_contact").putExtra("com.android.contacts.extra.ACCOUNT_NAME", this.i).putExtra("com.android.contacts.extra.ACCOUNT_TYPE", "com.google").setPackage("com.google.android.contacts");
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (ayug.a.a().S()) {
            return e();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final xkm a(xjo xjo) {
        return (xkm) q.getOrDefault(xjo, xkm.UNKNOWN_STAGE);
    }

    public final void a(int i) {
        this.p = i;
        super.a(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r3 < defpackage.ayug.a.a().s()) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, boolean r11) {
        /*
            r9 = this;
            int r0 = r9.p
            if (r0 <= 0) goto L_0x014e
            r0 = 1
            if (r10 != r0) goto L_0x014b
            if (r11 == 0) goto L_0x000b
            goto L_0x00e4
        L_0x000b:
            yaz r10 = r9.j
            ybh r10 = (defpackage.ybh) r10
            boolean r10 = r10.v
            if (r10 != 0) goto L_0x0147
            ayug r10 = defpackage.ayug.a
            ayuh r10 = r10.a()
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x0029
            wss r10 = r9.h
            java.lang.String r1 = r9.i
            boolean r10 = r10.l(r1)
            if (r10 != 0) goto L_0x0147
        L_0x0029:
            wss r10 = r9.h
            java.lang.String r1 = r9.i
            int r10 = r10.k(r1)
            long r1 = java.lang.System.currentTimeMillis()
            ayug r3 = defpackage.ayug.a
            ayuh r3 = r3.a()
            boolean r3 = r3.V()
            if (r3 != 0) goto L_0x005f
            long r3 = (long) r10
            ayug r5 = defpackage.ayug.a
            ayuh r5 = r5.a()
            long r5 = r5.u()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0147
            ayug r5 = defpackage.ayug.a
            ayuh r5 = r5.a()
            long r5 = r5.s()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0147
            goto L_0x0098
        L_0x005f:
            ayug r3 = defpackage.ayug.a
            ayuh r3 = r3.a()
            auhz r3 = r3.a()
            java.util.ArrayList r4 = new java.util.ArrayList
            aucs r3 = r3.a
            r4.<init>(r3)
            java.util.Collections.sort(r4)
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = defpackage.anbs.b((java.lang.Iterable) r4, (java.lang.Object) r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r10 > r3) goto L_0x0098
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r4.contains(r10)
            if (r10 != 0) goto L_0x0090
            goto L_0x0147
        L_0x0090:
            wss r10 = r9.h
            java.lang.String r3 = r9.i
            r10.a((java.lang.String) r3, (long) r1)
            goto L_0x00e4
        L_0x0098:
            long r3 = (long) r10
            ayug r10 = defpackage.ayug.a
            ayuh r10 = r10.a()
            long r5 = r10.v()
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x00e4
            wss r10 = r9.h
            java.lang.String r3 = r9.i
            android.content.SharedPreferences r10 = r10.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "focus_first_full_sync_failure_notification_last_show_timestamp_"
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00bf
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x00c3
        L_0x00bf:
            java.lang.String r3 = r4.concat(r3)
        L_0x00c3:
            r4 = 0
            long r3 = r10.getLong(r3, r4)
            long r3 = r1 - r3
            ayug r10 = defpackage.ayug.a
            ayuh r10 = r10.a()
            long r5 = r10.U()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0147
            wss r10 = r9.h
            java.lang.String r3 = r9.i
            r10.a((java.lang.String) r3, (long) r1)
        L_0x00e4:
            je r10 = r9.b
            android.content.Context r1 = r9.d
            android.content.res.Resources r1 = r1.getResources()
            if (r11 != 0) goto L_0x00f2
            r2 = 2131953406(0x7f1306fe, float:1.9543282E38)
            goto L_0x00f5
        L_0x00f2:
            r2 = 2131953405(0x7f1306fd, float:1.954328E38)
        L_0x00f5:
            java.lang.String r1 = r1.getString(r2)
            r10.e(r1)
            android.content.Context r10 = r9.d
            android.content.res.Resources r10 = r10.getResources()
            int r1 = r9.p
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r2[r4] = r3
            r3 = 2131820562(0x7f110012, float:1.9273842E38)
            java.lang.String r10 = r10.getQuantityString(r3, r1, r2)
            if (r11 == 0) goto L_0x012d
            je r11 = r9.b
            android.content.Context r1 = r9.d
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r4] = r10
            r10 = 2131953403(0x7f1306fb, float:1.9543276E38)
            java.lang.String r10 = r1.getString(r10, r2)
            r11.b((java.lang.CharSequence) r10)
            goto L_0x013f
        L_0x012d:
            je r10 = r9.b
            android.content.Context r11 = r9.d
            android.content.res.Resources r11 = r11.getResources()
            r1 = 2131953404(0x7f1306fc, float:1.9543278E38)
            java.lang.String r11 = r11.getString(r1)
            r10.b((java.lang.CharSequence) r11)
        L_0x013f:
            r9.k = r4
            r9.l = r4
            r9.a((boolean) r0)
            return
        L_0x0147:
            r9.h()
            return
        L_0x014b:
            r9.h()
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxg.a(int, boolean):void");
    }
}
