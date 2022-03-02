package defpackage;

import com.google.android.gms.droidguard.DroidGuardChimeraService;

/* renamed from: mab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mab extends bhw implements mac {
    final /* synthetic */ DroidGuardChimeraService a;
    private final String b;

    public mab() {
        super("com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r11 = defpackage.lyx.a(r11, r9.a, r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        r11 = r9.a;
        r12 = com.google.android.gms.droidguard.DroidGuardChimeraService.a;
        r11.e.a((java.lang.Throwable) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[ExcHandler: LinkageError (e java.lang.LinkageError), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083 A[SYNTHETIC, Splitter:B:38:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.lzw r10, java.lang.String r11, java.util.Map r12, com.google.android.gms.droidguard.DroidGuardResultsRequest r13) {
        /*
            r9 = this;
            java.lang.String r0 = "DG"
            com.google.android.gms.droidguard.DroidGuardChimeraService r1 = r9.a     // Catch:{  }
            java.lang.String r2 = r9.b     // Catch:{  }
            max r6 = r1.a((java.lang.String) r2)     // Catch:{  }
            com.google.android.gms.droidguard.DroidGuardChimeraService r1 = r9.a     // Catch:{  }
            anax r2 = com.google.android.gms.droidguard.DroidGuardChimeraService.a     // Catch:{  }
            mal r3 = r1.b     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            java.lang.String r4 = r9.b     // Catch:{  }
            boolean r1 = defpackage.axff.b()     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            if (r1 == 0) goto L_0x0039
            boolean r1 = defpackage.lyr.a(r11)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            if (r1 == 0) goto L_0x0039
            mbj r1 = r3.a(r11, r6, r13)     // Catch:{ mak -> 0x0033, Exception -> 0x0027, LinkageError -> 0x0061 }
            byte[] r11 = r1.a(r12)     // Catch:{ mak -> 0x0033, Exception -> 0x0027, LinkageError -> 0x0061 }
            goto L_0x006a
        L_0x0027:
            r1 = move-exception
            java.lang.String r2 = "Error running fast program, falling through"
            android.util.Log.w(r0, r2, r1)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            lyp r0 = r3.d     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            r0.a((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            goto L_0x0039
        L_0x0033:
            r1 = move-exception
            java.lang.String r1 = "Fast program not available, falling through"
            android.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
        L_0x0039:
            r0 = 0
            if (r13 == 0) goto L_0x0053
            android.os.Bundle r1 = r13.a     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            if (r1 == 0) goto L_0x0053
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            java.lang.String r2 = "networkToUse"
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            android.net.Network r1 = (android.net.Network) r1     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            if (r1 == 0) goto L_0x0053
            opp r0 = new opp     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            r7 = r0
            goto L_0x0054
        L_0x0053:
            r7 = r0
        L_0x0054:
            r5 = r11
            r8 = r13
            mbj r0 = r3.a(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            byte[] r11 = r0.a(r12)     // Catch:{ Exception -> 0x0063, LinkageError -> 0x0061 }
            goto L_0x006a
        L_0x005f:
            r10 = move-exception
            goto L_0x008a
        L_0x0061:
            r0 = move-exception
            goto L_0x0064
        L_0x0063:
            r0 = move-exception
        L_0x0064:
            com.google.android.gms.droidguard.DroidGuardChimeraService r1 = r9.a     // Catch:{ RemoteException -> 0x005f }
            byte[] r11 = defpackage.lyx.a(r11, r1, r12, r0)     // Catch:{ RemoteException -> 0x005f }
        L_0x006a:
            android.os.Parcel r12 = r10.aQ()     // Catch:{ RemoteException -> 0x005f }
            r12.writeByteArray(r11)     // Catch:{ RemoteException -> 0x005f }
            r11 = 1
            r10.c(r11, r12)     // Catch:{ RemoteException -> 0x005f }
            if (r13 == 0) goto L_0x0089
            android.os.Bundle r10 = r13.a     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r11 = "fd"
            android.os.Parcelable r10 = r10.getParcelable(r11)     // Catch:{ RemoteException -> 0x005f }
            android.os.ParcelFileDescriptor r10 = (android.os.ParcelFileDescriptor) r10     // Catch:{ RemoteException -> 0x005f }
            if (r10 == 0) goto L_0x0089
            r10.close()     // Catch:{ Exception -> 0x0087 }
            return
        L_0x0087:
            r10 = move-exception
            return
        L_0x0089:
            return
        L_0x008a:
            com.google.android.gms.droidguard.DroidGuardChimeraService r11 = r9.a
            anax r12 = com.google.android.gms.droidguard.DroidGuardChimeraService.a
            lyp r11 = r11.e
            r11.a((java.lang.Throwable) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mab.a(lzw, java.lang.String, java.util.Map, com.google.android.gms.droidguard.DroidGuardResultsRequest):void");
    }

    public final lzz b() {
        max a2 = this.a.a(this.b);
        String str = this.b;
        DroidGuardChimeraService droidGuardChimeraService = this.a;
        anax anax = DroidGuardChimeraService.a;
        return new lzy(str, droidGuardChimeraService, droidGuardChimeraService.b, a2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mab(DroidGuardChimeraService droidGuardChimeraService, String str) {
        super("com.google.android.gms.droidguard.internal.IDroidGuardService");
        this.a = droidGuardChimeraService;
        this.b = str;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.droidguard.internal.IDroidGuardCallbacks"
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x005b
            r3 = 2
            if (r5 == r3) goto L_0x0050
            r3 = 3
            if (r5 == r3) goto L_0x003e
            r7 = 4
            if (r5 == r7) goto L_0x0011
            r5 = 0
            return r5
        L_0x0011:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0029
            android.os.IInterface r7 = r5.queryLocalInterface(r0)
            boolean r0 = r7 instanceof defpackage.lzw
            if (r0 == 0) goto L_0x0023
            r2 = r7
            lzw r2 = (defpackage.lzw) r2
            goto L_0x002a
        L_0x0023:
            lzw r2 = new lzw
            r2.<init>(r5)
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            java.lang.String r5 = r6.readString()
            java.util.HashMap r7 = defpackage.bhx.c(r6)
            android.os.Parcelable$Creator r0 = com.google.android.gms.droidguard.DroidGuardResultsRequest.CREATOR
            android.os.Parcelable r6 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.droidguard.DroidGuardResultsRequest r6 = (com.google.android.gms.droidguard.DroidGuardResultsRequest) r6
            r4.a(r2, r5, r7, r6)
            goto L_0x007e
        L_0x003e:
            axew r5 = defpackage.axew.a
            axex r5 = r5.a()
            long r5 = r5.a()
            r7.writeNoException()
            int r6 = (int) r5
            r7.writeInt(r6)
            goto L_0x007e
        L_0x0050:
            lzz r5 = r4.b()
            r7.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r7, (android.os.IInterface) r5)
            goto L_0x007e
        L_0x005b:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0072
            android.os.IInterface r7 = r5.queryLocalInterface(r0)
            boolean r0 = r7 instanceof defpackage.lzw
            if (r0 == 0) goto L_0x006c
            lzw r7 = (defpackage.lzw) r7
            goto L_0x0073
        L_0x006c:
            lzw r7 = new lzw
            r7.<init>(r5)
            goto L_0x0073
        L_0x0072:
            r7 = r2
        L_0x0073:
            java.lang.String r5 = r6.readString()
            java.util.HashMap r6 = defpackage.bhx.c(r6)
            r4.a(r7, r5, r6, r2)
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mab.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
