package defpackage;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: xyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xyp {
    protected final Set a;
    private final xvw b;
    private final yaz c;

    public xyp(ContentResolver contentResolver, Account account, xvw xvw, yaz yaz) {
        HashSet hashSet;
        if (!xwb.a(contentResolver, account)) {
            List<xvu> a2 = xwb.a(contentResolver, account, xwb.b);
            hashSet = new HashSet();
            for (xvu xvu : a2) {
                if (!TextUtils.isEmpty(xvu.j())) {
                    hashSet.add(xvu.j());
                }
            }
        } else {
            hashSet = null;
        }
        this.a = hashSet;
        this.b = xvw;
        this.c = yaz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r12.j == false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.xvs r12, defpackage.xvs r13) {
        /*
            r11 = this;
            defpackage.xip.a()
            ayrj r0 = defpackage.ayrj.a
            aytn r0 = r0.a()
            boolean r0 = r0.ai()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            goto L_0x0077
        L_0x001a:
            java.util.List r0 = r13.D
            boolean r0 = defpackage.ycm.a((java.util.Collection) r0)
            if (r0 != 0) goto L_0x006a
            java.util.List r0 = r13.D
            int r3 = r0.size()
            r4 = 0
        L_0x0029:
            if (r4 >= r3) goto L_0x006a
            java.lang.Object r5 = r0.get(r4)
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            java.lang.String r6 = "data_version"
            java.lang.Long r6 = r5.getAsLong(r6)
            long r6 = r6.longValue()
            java.lang.String r8 = "data_sync4"
            java.lang.Long r8 = r5.getAsLong(r8)
            boolean r9 = defpackage.yac.d(r5)
            boolean r10 = defpackage.yac.c(r5)
            if (r9 != 0) goto L_0x0057
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r6 = defpackage.yau.a(r6, r8)
            if (r6 != 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            java.lang.String r7 = "data15"
            java.lang.Object r5 = r5.get(r7)
            if (r5 != 0) goto L_0x0062
        L_0x0061:
            goto L_0x0067
        L_0x0062:
            if (r10 != 0) goto L_0x0077
            if (r6 == 0) goto L_0x0061
            goto L_0x0077
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x006a:
            java.util.List r0 = r12.D
            boolean r0 = defpackage.ycm.a((java.util.Collection) r0)
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r12.j
            if (r0 == 0) goto L_0x0077
            goto L_0x00ad
        L_0x0077:
            r0 = 2
            xvs[] r3 = new defpackage.xvs[r0]
            r3[r2] = r12
            r3[r1] = r13
            r1 = 0
        L_0x007f:
            if (r1 < r0) goto L_0x0082
            goto L_0x00ad
        L_0x0082:
            r4 = r3[r1]
            if (r4 != 0) goto L_0x0087
            goto L_0x00aa
        L_0x0087:
            java.util.List r5 = r4.D
            if (r5 == 0) goto L_0x008e
            r5.clear()
        L_0x008e:
            java.util.List r4 = r4.I
            java.util.Iterator r4 = r4.iterator()
        L_0x0094:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00aa
            java.lang.Object r5 = r4.next()
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            boolean r5 = defpackage.yac.a((android.content.ContentValues) r5)
            if (r5 == 0) goto L_0x0094
            r4.remove()
            goto L_0x0094
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x007f
        L_0x00ad:
            yad r0 = new yad
            r0.<init>(r12, r13)
            r11.a((defpackage.yad) r0, (boolean) r2)
            xvw r12 = r11.b
            xvy r12 = r12.b
            java.lang.Long r13 = r13.d
            android.net.Uri r0 = r12.a
            java.lang.String r1 = "dirty"
            r12.a((android.net.Uri) r0, (java.lang.String) r1, (java.lang.Long) r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyp.a(xvs, xvs):void");
    }

    public final void a(yad yad, boolean z) {
        Integer num;
        Long l;
        List list;
        yad yad2 = yad;
        xvs xvs = (xvs) yad2.b;
        xvs xvs2 = (xvs) yad2.a;
        iva.a((Object) xvs2);
        xvy xvy = this.b.b;
        if (!xvs2.h) {
            if (this.a != null) {
                List list2 = xvs2.s;
                if (list2 != null) {
                    int size = list2.size();
                    int i = 0;
                    while (i < size) {
                        String asString = ((ContentValues) list2.get(i)).getAsString("group_sourceid");
                        i++;
                        if (this.a.contains(asString)) {
                        }
                    }
                }
            }
            if (xvs != null) {
                if (z) {
                    this.c.a(xnd.UPDATE, xjo.CONTACT, true, 1, 1);
                    if (xvs.g) {
                        this.c.a(xnd.UPDATE, xjo.CONTACT, true, 4, 1);
                    }
                }
                Long l2 = xvs.d;
                iva.a((Object) l2);
                xvy.a(xvy.a, l2.longValue(), "version", xvs.f);
                xvy.b.a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(xvy.a, l2.longValue())).withValue("starred", Integer.valueOf(xvs.i ? 1 : 0)).withExpectedCount(1), false);
                xvy.a(xvy.a, l2, xvs2.b(), false);
                l = l2;
                num = null;
            } else {
                if (z) {
                    this.c.a(xnd.INSERT, xjo.CONTACT, true, 1, 1);
                }
                xvy.a(xvy.a, "sourceid", xvs2.a);
                ContentValues b2 = xvs2.b();
                xip.a();
                num = Integer.valueOf(xvy.a(xvy.a, b2, !((Boolean) xfu.a.a()).booleanValue()));
                l = null;
            }
            List list3 = xvs2.I;
            if (xvs != null) {
                list = xvs.I;
            } else {
                list = null;
            }
            xip.a();
            boolean booleanValue = ((Boolean) xgd.a.a()).booleanValue();
            List a2 = yac.a(list3, list, l, num, this.b, this.c, z, booleanValue);
            if (booleanValue && z) {
                amri a3 = xzx.a(list3, a2);
                if (a3.a()) {
                    yay yay = (yay) a3.b();
                    if (yay.b() != 0) {
                        yay.a().name();
                        this.c.a(xvs != null ? xnd.UPDATE : xnd.INSERT, xjo.CONTACT, yay, 1);
                        return;
                    }
                    throw null;
                }
                return;
            }
            return;
        }
        if (z) {
            this.c.a(xnd.REMOVE, xjo.CONTACT, true, 1, 1);
        }
        if (xvs == null) {
            this.c.a(xnd.REMOVE, xjo.CONTACT, z, 3, 1);
            return;
        }
        if (xvs.g) {
            this.c.a(xnd.REMOVE, xjo.CONTACT, z, 4, 1);
        }
        xvy.a(Long.valueOf(xvs.d.longValue()), true);
    }
}
