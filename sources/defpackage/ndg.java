package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* renamed from: ndg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ndg extends isy {
    protected ndg(Context context, Looper looper, iyc iyc, ica ica, icb icb, ise ise) {
        super(context, looper, iyc.a(), ise, ica, icb);
    }

    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set a(java.util.Set r6) {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0104
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r3 = r2.b
            int r4 = r3.hashCode()
            switch(r4) {
                case -2072888167: goto L_0x008c;
                case -1522546930: goto L_0x0081;
                case -1513009263: goto L_0x0077;
                case -687102788: goto L_0x006d;
                case -611416542: goto L_0x0063;
                case 787265254: goto L_0x0059;
                case 951364342: goto L_0x004e;
                case 1101936996: goto L_0x0044;
                case 1547725772: goto L_0x003a;
                case 1891830404: goto L_0x002f;
                case 2119807573: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0096
        L_0x0024:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.nutrition.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 3
            goto L_0x0097
        L_0x002f:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.body_temperature.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 8
            goto L_0x0097
        L_0x003a:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.activity.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 0
            goto L_0x0097
        L_0x0044:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.blood_glucose.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 6
            goto L_0x0097
        L_0x004e:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.sleep.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 10
            goto L_0x0097
        L_0x0059:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.location.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 1
            goto L_0x0097
        L_0x0063:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.heart_rate.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 4
            goto L_0x0097
        L_0x006d:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.oxygen_saturation.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 7
            goto L_0x0097
        L_0x0077:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.blood_pressure.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 5
            goto L_0x0097
        L_0x0081:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.reproductive_health.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 9
            goto L_0x0097
        L_0x008c:
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.body.read"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0096
            r3 = 2
            goto L_0x0097
        L_0x0096:
            r3 = -1
        L_0x0097:
            switch(r3) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00a4;
                case 10: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            r3 = r2
            goto L_0x00f3
        L_0x009c:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.sleep.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00a4:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.reproductive_health.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00ac:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.body_temperature.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00b4:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.oxygen_saturation.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00bc:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.blood_glucose.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00c4:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.blood_pressure.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00cc:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.heart_rate.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00d4:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.nutrition.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00dc:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.body.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00e4:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.location.write"
            r3.<init>(r4)
            goto L_0x00f3
        L_0x00ec:
            com.google.android.gms.common.api.Scope r3 = new com.google.android.gms.common.api.Scope
            java.lang.String r4 = "https://www.googleapis.com/auth/fitness.activity.write"
            r3.<init>(r4)
        L_0x00f3:
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x00ff
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x000d
        L_0x00ff:
            r0.add(r2)
            goto L_0x000d
        L_0x0104:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndg.a(java.util.Set):java.util.Set");
    }

    public final boolean g() {
        jix.i(this.c);
        return true;
    }

    public final Set q() {
        return this.t;
    }
}
