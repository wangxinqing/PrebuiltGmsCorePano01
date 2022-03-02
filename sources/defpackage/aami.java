package defpackage;

/* renamed from: aami  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aami extends bhw implements aamj {
    public aami() {
        super("com.google.android.gms.search.queries.internal.ISearchQueriesService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks"
            r1 = 0
            switch(r3) {
                case 2: goto L_0x00e0;
                case 3: goto L_0x00b8;
                case 4: goto L_0x0090;
                case 5: goto L_0x0067;
                case 6: goto L_0x003e;
                case 7: goto L_0x0015;
                case 8: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.a((android.os.Bundle) r3)
            goto L_0x0107
        L_0x0015:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.AnnotateCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.AnnotateCall$Request r3 = (com.google.android.gms.search.queries.AnnotateCall$Request) r3
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 == 0) goto L_0x0035
            android.os.IInterface r4 = r3.queryLocalInterface(r0)
            boolean r0 = r4 instanceof defpackage.aamg
            if (r0 == 0) goto L_0x002f
            r1 = r4
            aamg r1 = (defpackage.aamg) r1
            goto L_0x0036
        L_0x002f:
            aame r1 = new aame
            r1.<init>(r3)
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            r2.a((defpackage.aamg) r1)
            r5.writeNoException()
            goto L_0x0107
        L_0x003e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.QuerySuggestCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.QuerySuggestCall$Request r3 = (com.google.android.gms.search.queries.QuerySuggestCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x005e
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aamg
            if (r1 == 0) goto L_0x0058
            r1 = r0
            aamg r1 = (defpackage.aamg) r1
            goto L_0x005f
        L_0x0058:
            aame r1 = new aame
            r1.<init>(r4)
            goto L_0x005f
        L_0x005e:
        L_0x005f:
            r2.a((com.google.android.gms.search.queries.QuerySuggestCall$Request) r3, (defpackage.aamg) r1)
            r5.writeNoException()
            goto L_0x0107
        L_0x0067:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.GetPhraseAffinityCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.GetPhraseAffinityCall$Request r3 = (com.google.android.gms.search.queries.GetPhraseAffinityCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0087
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aamg
            if (r1 == 0) goto L_0x0081
            r1 = r0
            aamg r1 = (defpackage.aamg) r1
            goto L_0x0088
        L_0x0081:
            aame r1 = new aame
            r1.<init>(r4)
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            r2.a((com.google.android.gms.search.queries.GetPhraseAffinityCall$Request) r3, (defpackage.aamg) r1)
            r5.writeNoException()
            goto L_0x0107
        L_0x0090:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.GetDocumentsCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.GetDocumentsCall$Request r3 = (com.google.android.gms.search.queries.GetDocumentsCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x00b0
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aamg
            if (r1 == 0) goto L_0x00aa
            r1 = r0
            aamg r1 = (defpackage.aamg) r1
            goto L_0x00b1
        L_0x00aa:
            aame r1 = new aame
            r1.<init>(r4)
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            r2.a((com.google.android.gms.search.queries.GetDocumentsCall$Request) r3, (defpackage.aamg) r1)
            r5.writeNoException()
            goto L_0x0107
        L_0x00b8:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.GlobalQueryCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.GlobalQueryCall$Request r3 = (com.google.android.gms.search.queries.GlobalQueryCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x00d8
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aamg
            if (r1 == 0) goto L_0x00d2
            r1 = r0
            aamg r1 = (defpackage.aamg) r1
            goto L_0x00d9
        L_0x00d2:
            aame r1 = new aame
            r1.<init>(r4)
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            r2.a((com.google.android.gms.search.queries.GlobalQueryCall$Request) r3, (defpackage.aamg) r1)
            r5.writeNoException()
            goto L_0x0107
        L_0x00e0:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.queries.QueryCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.queries.QueryCall$Request r3 = (com.google.android.gms.search.queries.QueryCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0100
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aamg
            if (r1 == 0) goto L_0x00fa
            r1 = r0
            aamg r1 = (defpackage.aamg) r1
            goto L_0x0101
        L_0x00fa:
            aame r1 = new aame
            r1.<init>(r4)
            goto L_0x0101
        L_0x0100:
        L_0x0101:
            r2.a((com.google.android.gms.search.queries.QueryCall$Request) r3, (defpackage.aamg) r1)
            r5.writeNoException()
        L_0x0107:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aami.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
