package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Parcel;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.util.Map;

/* renamed from: lzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzy extends bhw implements lzz {
    protected final ConditionVariable a;
    protected mal b;
    protected mbj c;
    protected Throwable d;
    private final String e;
    private final Context f;
    private final lyp g;
    private final max h;
    private String i;

    public lzy() {
        super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r7.d = r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[ExcHandler: LinkageError (e java.lang.LinkageError), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[SYNTHETIC, Splitter:B:24:0x004f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.droidguard.internal.DroidGuardInitReply a(java.lang.String r8, com.google.android.gms.droidguard.DroidGuardResultsRequest r9) {
        /*
            r7 = this;
            r7.i = r8
            r0 = 0
            mal r1 = r7.b     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            java.lang.String r2 = r7.e     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            max r4 = r7.h     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            boolean r3 = defpackage.axff.b()     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            if (r3 == 0) goto L_0x0022
            boolean r3 = defpackage.lyr.a(r8)     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            if (r3 == 0) goto L_0x0022
            mbj r3 = r1.a(r8, r4, r9)     // Catch:{ Exception -> 0x001a, LinkageError -> 0x003f }
            goto L_0x0023
        L_0x001a:
            r3 = move-exception
            lyp r5 = r1.d     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            r5.a((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r0
        L_0x0023:
            if (r3 != 0) goto L_0x002d
            r5 = 0
            r3 = r8
            r6 = r9
            mbj r3 = r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            boolean r8 = r3.a()     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            if (r8 == 0) goto L_0x0037
            r7.c = r3     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            goto L_0x0044
        L_0x0037:
            java.lang.Exception r8 = new java.lang.Exception     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            java.lang.String r9 = "init failed"
            r8.<init>(r9)     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
            throw r8     // Catch:{ Exception -> 0x0041, LinkageError -> 0x003f }
        L_0x003f:
            r8 = move-exception
            goto L_0x0042
        L_0x0041:
            r8 = move-exception
        L_0x0042:
            r7.d = r8
        L_0x0044:
            android.os.ConditionVariable r8 = r7.a
            r8.open()
            java.lang.Throwable r8 = r7.d
            if (r8 == 0) goto L_0x004f
            goto L_0x00f5
        L_0x004f:
            mbj r8 = r7.c     // Catch:{ Exception -> 0x00f0 }
            java.lang.Object r9 = r8.a     // Catch:{ Exception -> 0x00e7 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r1 = "rb"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00e7 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r1, r3)     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r1 = r8.a     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r9 = r9.invoke(r1, r3)     // Catch:{ Exception -> 0x00e7 }
            android.os.Parcelable r9 = (android.os.Parcelable) r9     // Catch:{ Exception -> 0x00e7 }
            if (r9 == 0) goto L_0x00f5
            mal r8 = r7.b     // Catch:{ Exception -> 0x00f0 }
            mbj r1 = r7.c     // Catch:{ Exception -> 0x00f0 }
            mas r1 = r1.c     // Catch:{ Exception -> 0x00f0 }
            mbi r8 = r8.c     // Catch:{ Exception -> 0x00f0 }
            mbh r1 = r1.b     // Catch:{ Exception -> 0x00f0 }
            mbe r8 = r8.c     // Catch:{ Exception -> 0x00f0 }
            mbg r8 = r8.a((defpackage.mbh) r1)     // Catch:{ Exception -> 0x00f0 }
            if (r8 == 0) goto L_0x00bd
            java.io.File r3 = r8.a     // Catch:{ FileNotFoundException -> 0x0092 }
            r4 = 1
            r3.setReadable(r4, r2)     // Catch:{ FileNotFoundException -> 0x0092 }
            java.io.File r8 = r8.a     // Catch:{ FileNotFoundException -> 0x0092 }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r8 = android.os.ParcelFileDescriptor.open(r8, r2)     // Catch:{ FileNotFoundException -> 0x0092 }
            com.google.android.gms.droidguard.internal.DroidGuardInitReply r1 = new com.google.android.gms.droidguard.internal.DroidGuardInitReply     // Catch:{ Exception -> 0x00f0 }
            r1.<init>(r8, r9)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x00fa
        L_0x0092:
            r8 = move-exception
            mah r9 = new mah     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f0 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00f0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            int r2 = r2 + 33
            r3.<init>(r2)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = "Files for VM "
            r3.append(r2)     // Catch:{ Exception -> 0x00f0 }
            r3.append(r1)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r1 = " not found on disk: "
            r3.append(r1)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00f0 }
            r9.<init>(r1, r8)     // Catch:{ Exception -> 0x00f0 }
            throw r9     // Catch:{ Exception -> 0x00f0 }
        L_0x00bd:
            mah r8 = new mah     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00f0 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x00f0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f0 }
            int r1 = r1 + 30
            r2.<init>(r1)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r1 = "VM key "
            r2.append(r1)     // Catch:{ Exception -> 0x00f0 }
            r2.append(r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = " not found in the cache"
            r2.append(r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x00f0 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00f0 }
            throw r8     // Catch:{ Exception -> 0x00f0 }
        L_0x00e7:
            r9 = move-exception
            mbf r1 = new mbf     // Catch:{ Exception -> 0x00f0 }
            byte[] r8 = r8.b     // Catch:{ Exception -> 0x00f0 }
            r1.<init>((byte[]) r8, (java.lang.Throwable) r9)     // Catch:{ Exception -> 0x00f0 }
            throw r1     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            r8 = move-exception
            r7.c = r0
            r7.d = r8
        L_0x00f5:
            com.google.android.gms.droidguard.internal.DroidGuardInitReply r1 = new com.google.android.gms.droidguard.internal.DroidGuardInitReply
            r1.<init>(r0, r0)
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzy.a(java.lang.String, com.google.android.gms.droidguard.DroidGuardResultsRequest):com.google.android.gms.droidguard.internal.DroidGuardInitReply");
    }

    public final void b() {
        this.a.block();
        mbj mbj = this.c;
        if (mbj != null) {
            try {
                mbj.b();
            } catch (Exception e2) {
                this.g.a((Throwable) e2);
            }
        }
        this.c = null;
        this.d = null;
    }

    public lzy(String str, Context context, mal mal, max max) {
        super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        this.a = new ConditionVariable();
        this.e = str;
        this.b = mal;
        this.f = context;
        this.g = lyp.a(context);
        this.h = max;
        this.c = null;
        this.d = null;
    }

    public final void a(String str) {
        a(str, (DroidGuardResultsRequest) null);
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            a(parcel.readString());
        } else if (i2 == 2) {
            byte[] a2 = a((Map) bhx.c(parcel));
            parcel2.writeNoException();
            parcel2.writeByteArray(a2);
        } else if (i2 == 3) {
            b();
        } else if (i2 != 5) {
            return false;
        } else {
            DroidGuardInitReply a3 = a(parcel.readString(), (DroidGuardResultsRequest) bhx.a(parcel, DroidGuardResultsRequest.CREATOR));
            parcel2.writeNoException();
            bhx.b(parcel2, a3);
        }
        return true;
    }

    public final byte[] a(Map map) {
        this.a.block();
        Throwable th = this.d;
        if (th != null) {
            return lyx.a(this.i, this.f, map, th);
        }
        mbj mbj = this.c;
        if (mbj == null) {
            return lyx.a(this.i, this.f, map, new IllegalStateException());
        }
        try {
            return (byte[]) mbj.a.getClass().getDeclaredMethod("ss", new Class[]{Map.class}).invoke(mbj.a, new Object[]{map});
        } catch (Exception e2) {
            throw new mbf(mbj.b, (Throwable) e2);
        } catch (Exception e3) {
            return lyx.a(this.i, this.f, map, e3);
        }
    }
}
