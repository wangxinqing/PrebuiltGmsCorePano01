package defpackage;

/* renamed from: aais  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aais extends bhw implements aait {
    public aais() {
        super("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r3, android.os.Parcel r4, android.os.Parcel r5) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks"
            r1 = 0
            switch(r3) {
                case 2: goto L_0x00c4;
                case 3: goto L_0x009f;
                case 4: goto L_0x007a;
                case 5: goto L_0x0054;
                case 6: goto L_0x002e;
                case 7: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request r3 = (com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0028
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x0022
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x0029
        L_0x0022:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            r2.a((com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request) r3, (defpackage.aaiq) r1)
            goto L_0x00e8
        L_0x002e:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.DeleteUsageReportCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.DeleteUsageReportCall$Request r3 = (com.google.android.gms.search.corpora.DeleteUsageReportCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x004e
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x0048
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x004f
        L_0x0048:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            r2.a((com.google.android.gms.search.corpora.DeleteUsageReportCall$Request) r3, (defpackage.aaiq) r1)
            goto L_0x00e8
        L_0x0054:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.GetCorpusInfoCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.GetCorpusInfoCall$Request r3 = (com.google.android.gms.search.corpora.GetCorpusInfoCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x0074
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x006e
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x0075
        L_0x006e:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x0075
        L_0x0074:
        L_0x0075:
            r2.a((com.google.android.gms.search.corpora.GetCorpusInfoCall$Request) r3, (defpackage.aaiq) r1)
            goto L_0x00e8
        L_0x007a:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.GetCorpusStatusCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.GetCorpusStatusCall$Request r3 = (com.google.android.gms.search.corpora.GetCorpusStatusCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x009a
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x0094
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x009b
        L_0x0094:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            r2.a((com.google.android.gms.search.corpora.GetCorpusStatusCall$Request) r3, (defpackage.aaiq) r1)
            goto L_0x00e8
        L_0x009f:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.ClearCorpusCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.ClearCorpusCall$Request r3 = (com.google.android.gms.search.corpora.ClearCorpusCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x00bf
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x00b9
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x00c0
        L_0x00b9:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x00c0
        L_0x00bf:
        L_0x00c0:
            r2.a((com.google.android.gms.search.corpora.ClearCorpusCall$Request) r3, (defpackage.aaiq) r1)
            goto L_0x00e8
        L_0x00c4:
            android.os.Parcelable$Creator r3 = com.google.android.gms.search.corpora.RequestIndexingCall$Request.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r4, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.search.corpora.RequestIndexingCall$Request r3 = (com.google.android.gms.search.corpora.RequestIndexingCall$Request) r3
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 == 0) goto L_0x00e4
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof defpackage.aaiq
            if (r1 == 0) goto L_0x00de
            r1 = r0
            aaiq r1 = (defpackage.aaiq) r1
            goto L_0x00e5
        L_0x00de:
            aaio r1 = new aaio
            r1.<init>(r4)
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            r2.a((com.google.android.gms.search.corpora.RequestIndexingCall$Request) r3, (defpackage.aaiq) r1)
        L_0x00e8:
            r5.writeNoException()
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aais.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
