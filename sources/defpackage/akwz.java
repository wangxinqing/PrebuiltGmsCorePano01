package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwz implements akwg {
    private final PlaceReport a;
    private final rka b;

    public akwz(PlaceReport placeReport, rka rka) {
        iva.a((Object) placeReport);
        iva.a((Object) rka);
        this.a = placeReport;
        this.b = rka;
    }

    private final void a(int i, String str) {
        alfs.a(i, str, this.b);
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final String c() {
        return "";
    }

    public final boolean d() {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aoei a(com.google.android.gms.location.places.internal.PlacesParams r9) {
        /*
            r8 = this;
            com.google.android.gms.location.places.PlaceReport r0 = r8.a
            r1 = 3
            aoei r9 = defpackage.akig.c(r1, r9)
            r2 = 5
            java.lang.Object r2 = r9.c(r2)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r9)
            aodp r9 = defpackage.aodp.d
            aucd r9 = r9.o()
            java.lang.String r3 = r0.c
            r4 = 0
            r5 = 2
            if (r3 != 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            boolean r6 = r9.c
            if (r6 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r9.c()
            r9.c = r4
        L_0x0028:
            aucj r6 = r9.b
            aodp r6 = (defpackage.aodp) r6
            r3.getClass()
            int r7 = r6.a
            r7 = r7 | r5
            r6.a = r7
            r6.b = r3
        L_0x0036:
            java.lang.String r0 = r0.d
            if (r0 == 0) goto L_0x0098
            int r3 = r0.hashCode()
            r6 = -1
            r7 = 1
            switch(r3) {
                case -1436706272: goto L_0x0062;
                case -1194968642: goto L_0x0058;
                case -262743844: goto L_0x004e;
                case 1287171955: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x006c
        L_0x0044:
            java.lang.String r3 = "inferredRadioSignals"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            r0 = 2
            goto L_0x006d
        L_0x004e:
            java.lang.String r3 = "inferredReverseGeocoding"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            r0 = 3
            goto L_0x006d
        L_0x0058:
            java.lang.String r3 = "userReported"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            r0 = 0
            goto L_0x006d
        L_0x0062:
            java.lang.String r3 = "inferredGeofencing"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = -1
        L_0x006d:
            if (r0 == 0) goto L_0x0080
            if (r0 == r7) goto L_0x007d
            if (r0 == r5) goto L_0x007a
            if (r0 == r1) goto L_0x0077
            r5 = 1
            goto L_0x0081
        L_0x0077:
            r5 = 36
            goto L_0x0081
        L_0x007a:
            r5 = 35
            goto L_0x0081
        L_0x007d:
            r5 = 34
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r9.c()
            r9.c = r4
        L_0x008b:
            aucj r0 = r9.b
            aodp r0 = (defpackage.aodp) r0
            int r5 = r5 + r6
            r0.c = r5
            int r1 = r0.a
            r1 = r1 | 4
            r0.a = r1
        L_0x0098:
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r2.c()
            r2.c = r4
        L_0x00a2:
            aucj r0 = r2.b
            aoei r0 = (defpackage.aoei) r0
            aucj r9 = r9.i()
            aodp r9 = (defpackage.aodp) r9
            aoei r1 = defpackage.aoei.w
            r9.getClass()
            r0.j = r9
            int r9 = r0.a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r0.a = r9
            aucj r9 = r2.i()
            aoei r9 = (defpackage.aoei) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwz.a(com.google.android.gms.location.places.internal.PlacesParams):aoei");
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        a(0, ris.g(0));
    }

    public final void a(Status status) {
        a(status.i, status.j);
    }
}
