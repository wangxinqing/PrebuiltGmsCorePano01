package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import java.util.ArrayList;

/* renamed from: rhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhn extends ile implements icl {
    public final int b;
    public final Status c;
    private final String d;

    public static rhn a(Intent intent) {
        ArrayList b2;
        if (intent == null || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY") || (b2 = ivy.b(intent, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", NearbyLikelihoodEntity.CREATOR)) == null) {
            return null;
        }
        Status status = (Status) ivy.a(intent, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
        if (status == null) {
            status = Status.c;
        }
        return new rhn(status.i, b2, intent.getIntExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY", 0));
    }

    public final Status aO() {
        return this.c;
    }

    public final String toString() {
        iur a = ius.a(this);
        a.a("status", this.c);
        a.a("attributions", this.d);
        return a.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rhn(int r7, java.util.List r8, int r9) {
        /*
            r6 = this;
            java.lang.String[] r0 = defpackage.rks.b
            ilm r0 = com.google.android.gms.common.data.DataHolder.a((java.lang.String[]) r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            if (r8 == 0) goto L_0x0039
            java.util.Iterator r8 = r8.iterator()
        L_0x0011:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r8.next()
            com.google.android.gms.location.places.internal.NearbyLikelihoodEntity r2 = (com.google.android.gms.location.places.internal.NearbyLikelihoodEntity) r2
            com.google.android.gms.location.places.internal.PlaceEntity r3 = r2.a
            android.content.ContentValues r3 = r3.s()
            float r4 = r2.b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.String r5 = "place_likelihood"
            r3.put(r5, r4)
            r0.a((android.content.ContentValues) r3)
            com.google.android.gms.location.places.internal.PlaceEntity r2 = r2.a
            java.util.List r2 = r2.n
            r1.addAll(r2)
            goto L_0x0011
        L_0x0039:
            java.lang.String r8 = defpackage.rjd.a(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r3 = "com.google.android.gms.location.places.NearbyLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY"
            if (r2 != 0) goto L_0x004d
            r1.putString(r3, r8)
        L_0x004d:
            com.google.android.gms.common.data.DataHolder r7 = r0.a(r7, r1)
            r6.<init>(r7)
            int r8 = r7.e
            com.google.android.gms.common.api.Status r8 = defpackage.ris.h(r8)
            r6.c = r8
            boolean r8 = r8.c()
            if (r8 != 0) goto L_0x0064
            r9 = 0
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            r6.b = r9
            android.os.Bundle r7 = r7.f
            if (r7 == 0) goto L_0x0072
            java.lang.String r7 = r7.getString(r3)
        L_0x006f:
            r6.d = r7
            return
        L_0x0072:
            r7 = 0
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhn.<init>(int, java.util.List, int):void");
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new rkc(this.a, i);
    }
}
