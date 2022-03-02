package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: eam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eam {
    public static String a(Context context, ContactPerson.ContactMethod contactMethod) {
        if (contactMethod == null) {
            return null;
        }
        int i = contactMethod.a;
        if (i == 0) {
            return context.getString(R.string.appinvite_contextual_selection_method_google);
        }
        if (i != 3) {
            return contactMethod.b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r4.equals("public") != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.icc r4, defpackage.wli r5, com.google.android.gms.people.ui.widget.AvatarReferenceImageView r6, com.google.android.gms.appinvite.model.ContactPerson r7, com.google.android.gms.appinvite.model.ContactPerson.ContactMethod r8, boolean r9) {
        /*
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0092
            int r2 = r8.a
            r3 = 3
            if (r2 != r3) goto L_0x0092
            java.lang.String r4 = r8.b
            int r5 = r4.hashCode()
            r7 = -1326197564(0xffffffffb0f3d4c4, float:-1.7741049E-9)
            r8 = 2
            r2 = 1
            if (r5 == r7) goto L_0x0034
            r7 = -977423767(0xffffffffc5bdb269, float:-6070.3013)
            if (r5 == r7) goto L_0x002b
            r7 = 2076861994(0x7bca662a, float:2.1018322E36)
            if (r5 == r7) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.lang.String r5 = "extendedCircles"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x002b:
            java.lang.String r5 = "public"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x0034:
            java.lang.String r5 = "domain"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            r4 = 2131231029(0x7f080135, float:1.8078127E38)
            r5 = 2131231035(0x7f08013b, float:1.807814E38)
            if (r0 == 0) goto L_0x0066
            if (r0 == r2) goto L_0x005c
            if (r0 == r8) goto L_0x0052
            r4 = 2131231026(0x7f080132, float:1.8078121E38)
            r5 = 2131231057(0x7f080151, float:1.8078184E38)
            goto L_0x006f
        L_0x0052:
            if (r9 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r4 = 2131231035(0x7f08013b, float:1.807814E38)
        L_0x0058:
            r5 = 2131231059(0x7f080153, float:1.8078188E38)
            goto L_0x006f
        L_0x005c:
            if (r9 != 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r4 = 2131231035(0x7f08013b, float:1.807814E38)
        L_0x0062:
            r5 = 2131231058(0x7f080152, float:1.8078186E38)
            goto L_0x006f
        L_0x0066:
            if (r9 != 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r4 = 2131231035(0x7f08013b, float:1.807814E38)
        L_0x006c:
            r5 = 2131231062(0x7f080156, float:1.8078194E38)
        L_0x006f:
            r6.a()
            r6.b = r1
            r6.c = r1
            r6.d = r1
            android.widget.ImageView r7 = r6.a
            r7.setImageResource(r5)
            r6.c()
            r6.setBackgroundResource(r4)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131165319(0x7f070087, float:1.7944852E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r6.a((int) r4)
            return
        L_0x0092:
            if (r8 == 0) goto L_0x0097
            com.google.android.gms.people.model.AvatarReference r8 = r8.c
            goto L_0x0098
        L_0x0097:
            r8 = r1
        L_0x0098:
            if (r8 != 0) goto L_0x009c
            com.google.android.gms.people.model.AvatarReference r8 = r7.d
        L_0x009c:
            if (r8 != 0) goto L_0x0101
            java.lang.Long r7 = r7.c
            if (r7 != 0) goto L_0x00a3
            goto L_0x0101
        L_0x00a3:
            long r4 = r7.longValue()
            r6.b = r1
            java.lang.Long r7 = r6.c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r5 = defpackage.ius.a(r7, r4)
            if (r5 != 0) goto L_0x00d6
            r6.a()
            r6.b()
            r6.c = r4
            r6.d = r1
            ybr r4 = new ybr
            java.lang.Long r5 = r6.c
            long r7 = r5.longValue()
            boolean r5 = r6.g
            r4.<init>(r6, r7, r5)
            r6.f = r4
            ybr r4 = r6.f
            java.lang.Void[] r5 = new java.lang.Void[r0]
            r4.execute(r5)
            goto L_0x0104
        L_0x00d6:
            android.graphics.drawable.BitmapDrawable r4 = r6.d
            if (r4 == 0) goto L_0x00e3
            android.widget.ImageView r5 = r6.a
            r5.setImageDrawable(r4)
            r6.c()
            goto L_0x0104
        L_0x00e3:
            ybr r4 = r6.f
            if (r4 != 0) goto L_0x0104
            r6.b()
            ybr r4 = new ybr
            java.lang.Long r5 = r6.c
            long r7 = r5.longValue()
            boolean r5 = r6.g
            r4.<init>(r6, r7, r5)
            r6.f = r4
            ybr r4 = r6.f
            java.lang.Void[] r5 = new java.lang.Void[r0]
            r4.execute(r5)
            goto L_0x0104
        L_0x0101:
            r6.a(r4, r5, r8)
        L_0x0104:
            r6.setBackgroundResource(r0)
            r6.a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eam.a(icc, wli, com.google.android.gms.people.ui.widget.AvatarReferenceImageView, com.google.android.gms.appinvite.model.ContactPerson, com.google.android.gms.appinvite.model.ContactPerson$ContactMethod, boolean):void");
    }
}
