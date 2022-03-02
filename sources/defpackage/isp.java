package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import java.util.Set;

/* renamed from: isp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class isp implements iss {
    private static final Feature[] b = new Feature[0];
    private final Context a;

    public isp(Context context) {
        this.a = context;
    }

    public static int a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private static void a(Feature[] featureArr, Set set) {
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                set.add(feature.a);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v17, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.ConnectionResult a(com.google.android.gms.common.internal.GetServiceRequest r12, com.google.android.gms.common.internal.ConnectionInfo r13) {
        /*
            r11 = this;
            com.google.android.gms.common.Feature[] r0 = r12.i
            com.google.android.gms.common.Feature[] r12 = r12.j
            int r1 = a(r0)
            int r2 = a(r12)
            int r1 = r1 + r2
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.common.Feature[] r12 = b
            r13.b = r12
            com.google.android.gms.common.ConnectionResult r12 = com.google.android.gms.common.ConnectionResult.a
            return r12
        L_0x0016:
            ob r2 = new ob
            r2.<init>((int) r1)
            a((com.google.android.gms.common.Feature[]) r0, (java.util.Set) r2)
            a((com.google.android.gms.common.Feature[]) r12, (java.util.Set) r2)
            int r12 = r2.b
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r12 = r2.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            android.content.Context r1 = r11.a
            com.google.android.chimera.config.ModuleManager r1 = com.google.android.chimera.config.ModuleManager.get(r1)
            com.google.android.chimera.config.ModuleManager$FeatureList r12 = r1.fetchFeatures(r12)
            r1 = 0
            r2 = 0
            if (r12 == 0) goto L_0x008d
            byte[] r12 = r12.getProtoBytes()
            if (r12 == 0) goto L_0x008d
            int r3 = r12.length
            if (r3 == 0) goto L_0x008a
            boe r3 = defpackage.boe.b     // Catch:{ auda -> 0x007f }
            aucj r12 = defpackage.aucj.a((defpackage.aucj) r3, (byte[]) r12)     // Catch:{ auda -> 0x007f }
            boe r12 = (defpackage.boe) r12     // Catch:{ auda -> 0x007f }
            aucx r12 = r12.a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = r12.size()
            r3.<init>(r1)
            int r4 = r12.size()
            r1 = 0
        L_0x005a:
            if (r1 < r4) goto L_0x0066
            com.google.android.gms.common.Feature[] r12 = new com.google.android.gms.common.Feature[r2]
            java.lang.Object[] r12 = r3.toArray(r12)
            r1 = r12
            com.google.android.gms.common.Feature[] r1 = (com.google.android.gms.common.Feature[]) r1
            goto L_0x008e
        L_0x0066:
            java.lang.Object r5 = r12.get(r1)
            bob r5 = (defpackage.bob) r5
            boolean r6 = r5.d
            if (r6 != 0) goto L_0x007c
            com.google.android.gms.common.Feature r6 = new com.google.android.gms.common.Feature
            java.lang.String r7 = r5.b
            long r8 = r5.c
            r6.<init>(r7, r8)
            r3.add(r6)
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x005a
        L_0x007f:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r3 = "FeatureCheckPreproc"
            android.util.Log.e(r3, r12)
            goto L_0x008e
        L_0x008a:
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r2]
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            r12 = 1
            if (r1 != 0) goto L_0x0097
            com.google.android.gms.common.ConnectionResult r13 = new com.google.android.gms.common.ConnectionResult
            r13.<init>(r12)
            return r13
        L_0x0097:
            if (r0 == 0) goto L_0x00e0
            int r3 = r1.length
            nz r4 = new nz
            r4.<init>((int) r3)
            r5 = 0
        L_0x00a0:
            if (r5 >= r3) goto L_0x00ac
            r6 = r1[r5]
            java.lang.String r7 = r6.a
            r4.put(r7, r6)
            int r5 = r5 + 1
            goto L_0x00a0
        L_0x00ac:
            int r3 = r0.length
            r5 = 0
        L_0x00ae:
            if (r2 >= r3) goto L_0x00d3
            r6 = r0[r2]
            java.lang.String r7 = r6.a
            java.lang.Object r7 = r4.get(r7)
            com.google.android.gms.common.Feature r7 = (com.google.android.gms.common.Feature) r7
            if (r7 == 0) goto L_0x00cd
            long r7 = r7.a()
            long r9 = r6.a()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r5 = 1
        L_0x00ca:
            int r2 = r2 + 1
            goto L_0x00ae
        L_0x00cd:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r12)
            goto L_0x00e2
        L_0x00d3:
            if (r5 == 0) goto L_0x00dd
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r12 = 21
            r0.<init>(r12)
            goto L_0x00e2
        L_0x00dd:
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.a
            goto L_0x00e2
        L_0x00e0:
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.a
        L_0x00e2:
            boolean r12 = r0.b()
            if (r12 == 0) goto L_0x00ea
            r13.b = r1
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isp.a(com.google.android.gms.common.internal.GetServiceRequest, com.google.android.gms.common.internal.ConnectionInfo):com.google.android.gms.common.ConnectionResult");
    }
}
