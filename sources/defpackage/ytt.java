package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.ImageChimeraIntentService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ytt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytt extends bhw implements ytu {
    private final Context a;
    private final ClientContext b;
    private final ClientContext c;
    private final iqm d;

    public ytt() {
        super("com.google.android.gms.plus.internal.IPlusService");
    }

    public final String a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            int a2 = ixk.a(this.a, this.c).a("android.permission.GET_ACCOUNTS");
            if (a2 == -2) {
                Log.w("PlusService", "Missing android.permission.GET_ACCOUNTS");
                return null;
            } else if (a2 == -1) {
                throw new SecurityException("Missing android.permission.GET_ACCOUNTS");
            }
        }
        return this.c.b();
    }

    public final void b(yth yth, String str) {
        DefaultChimeraIntentService.a(this.a, new zba(this.c, str, yth));
    }

    public ytt(Context context, ClientContext clientContext, ClientContext clientContext2) {
        super("com.google.android.gms.plus.internal.IPlusService");
        this.a = context;
        this.b = clientContext;
        this.c = clientContext2;
        this.d = iqm.a(context, 6400);
    }

    public final void a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        izq izq = new izq(this.a);
        izq.a(a());
        izq.a(favaDiagnosticsEntity);
        izq.c(favaDiagnosticsEntity2);
        izq.c(str);
        izq.b(this.c.e);
        DefaultChimeraIntentService.a(this.a, new yll(this.a, izq.e()));
    }

    public final void a(yth yth) {
        DefaultChimeraIntentService.a(this.a, new zbi(this.c, yth));
    }

    public final void a(yth yth, Uri uri, Bundle bundle) {
        int i;
        if (bundle != null) {
            i = bundle.getInt("bounding_box");
        } else {
            i = 0;
        }
        Context context = this.a;
        ImageChimeraIntentService.a.add(new zbt(this.d, uri, i, yth));
        context.startService(jhg.g("com.google.android.gms.plus.service.image.INTENT").setClassName(context, "com.google.android.gms.plus.service.ImageIntentService"));
    }

    public final void a(yth yth, SafeParcelResponse safeParcelResponse) {
        if (safeParcelResponse != null) {
            String jag = safeParcelResponse.toString();
            try {
                new JSONObject(jag);
                DefaultChimeraIntentService.a(this.a, new zcl(this.c, jag, yth));
            } catch (JSONException e) {
                throw new IllegalArgumentException("momentJson must be valid JSON", e);
            }
        } else {
            throw new IllegalArgumentException("momentJson must not be empty");
        }
    }

    public final void a(yth yth, String str) {
        iva.a((Object) str, (Object) "URL must not be null.");
        DefaultChimeraIntentService.a(this.a, new zbw(this.b, str, yth));
    }

    public final void a(yth yth, String str, String str2) {
        DefaultChimeraIntentService.a(this.a, new zbl(this.c, str, str2, yth));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v11, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v15, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v18, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v23, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v27, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v28, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029c A[LOOP:0: B:96:0x0289->B:98:0x029c, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r19, android.os.Parcel r20, android.os.Parcel r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 8
            r5 = 1
            java.lang.String r6 = "com.google.android.gms.plus.internal.IPlusCallbacks"
            r7 = 0
            if (r1 == r4) goto L_0x032e
            r4 = 9
            if (r1 == r4) goto L_0x02fe
            r4 = 14
            java.lang.String r8 = "The userId parameter is required."
            if (r1 == r4) goto L_0x02aa
            r4 = 34
            r9 = 0
            if (r1 == r4) goto L_0x0254
            switch(r1) {
                case 1: goto L_0x022f;
                case 2: goto L_0x0206;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01d1;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01b2;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r1) {
                case 16: goto L_0x016a;
                case 17: goto L_0x0155;
                case 18: goto L_0x011c;
                case 19: goto L_0x00dd;
                default: goto L_0x0025;
            }
        L_0x0025:
            switch(r1) {
                case 40: goto L_0x00bf;
                case 41: goto L_0x00b7;
                case 42: goto L_0x00af;
                case 43: goto L_0x00a7;
                case 44: goto L_0x006e;
                case 45: goto L_0x0045;
                case 46: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            return r9
        L_0x0029:
            java.lang.String r1 = r20.readString()
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            com.google.android.gms.common.server.FavaDiagnosticsEntity r4 = (com.google.android.gms.common.server.FavaDiagnosticsEntity) r4
            android.os.Parcelable$Creator r6 = com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r6)
            com.google.android.gms.common.server.FavaDiagnosticsEntity r2 = (com.google.android.gms.common.server.FavaDiagnosticsEntity) r2
            r0.a((java.lang.String) r1, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r4, (com.google.android.gms.common.server.FavaDiagnosticsEntity) r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x0045:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x005d
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0057
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x005e
        L_0x0057:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.common.server.response.SafeParcelResponse r1 = (com.google.android.gms.common.server.response.SafeParcelResponse) r1
            r0.a((defpackage.yth) r7, (com.google.android.gms.common.server.response.SafeParcelResponse) r1)
            r21.writeNoException()
            goto L_0x034d
        L_0x006e:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0086
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0080
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x0087
        L_0x0080:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            java.lang.String r1 = r20.readString()
            defpackage.iva.a((java.lang.Object) r7)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r2 = r2 ^ r5
            defpackage.iva.b(r2, r8)
            zbh r2 = new zbh
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            r2.<init>(r4, r1, r7)
            android.content.Context r1 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x00a7:
            r21.writeNoException()
            r3.writeString(r7)
            goto L_0x034d
        L_0x00af:
            r21.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (boolean) r9)
            goto L_0x034d
        L_0x00b7:
            r21.writeNoException()
            r3.writeString(r7)
            goto L_0x034d
        L_0x00bf:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x00d5
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x00d0
            yth r4 = (defpackage.yth) r4
            goto L_0x00d5
        L_0x00d0:
            ytf r4 = new ytf
            r4.<init>(r1)
        L_0x00d5:
            r20.readString()
            r21.writeNoException()
            goto L_0x034d
        L_0x00dd:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x00f5
            android.os.IInterface r2 = r1.queryLocalInterface(r6)
            boolean r4 = r2 instanceof defpackage.yth
            if (r4 == 0) goto L_0x00ef
            r7 = r2
            yth r7 = (defpackage.yth) r7
            goto L_0x00f6
        L_0x00ef:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x00f6
        L_0x00f5:
        L_0x00f6:
            com.google.android.gms.common.internal.ClientContext r1 = r0.c
            android.content.Context r2 = r0.a
            r1.b((android.content.Context) r2)
            android.content.Context r1 = r0.a
            zaz r2 = new zaz
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            java.lang.String r4 = r4.e
            r2.<init>(r4)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            android.content.Context r1 = r0.a
            zcd r2 = new zcd
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            r2.<init>(r4, r7)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x011c:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0134
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x012e
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x0135
        L_0x012e:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0135
        L_0x0134:
        L_0x0135:
            java.lang.String r1 = r20.readString()
            defpackage.iva.a((java.lang.Object) r7)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r2 = r2 ^ r5
            defpackage.iva.b(r2, r8)
            zbg r2 = new zbg
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            r2.<init>(r4, r1, r7)
            android.content.Context r1 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x0155:
            java.lang.String r1 = r20.readString()
            zcb r2 = new zcb
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            r2.<init>(r4, r1)
            android.content.Context r1 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x016a:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0183
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x017d
            r7 = r4
            yth r7 = (defpackage.yth) r7
            r14 = r7
            goto L_0x0185
        L_0x017d:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0184
        L_0x0183:
        L_0x0184:
            r14 = r7
        L_0x0185:
            int r10 = r20.readInt()
            int r11 = r20.readInt()
            int r12 = r20.readInt()
            java.lang.String r13 = r20.readString()
            defpackage.iva.a((java.lang.Object) r14)
            zbr r1 = new zbr
            com.google.android.gms.common.internal.ClientContext r9 = r0.c
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            android.content.Context r2 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r2, r1)
            zbq r2 = new zbq
            r2.<init>(r1)
            r21.writeNoException()
            defpackage.bhx.a((android.os.Parcel) r3, (android.os.IInterface) r2)
            goto L_0x034d
        L_0x01b2:
            android.content.Context r1 = r0.a
            zaz r2 = new zaz
            com.google.android.gms.common.internal.ClientContext r4 = r0.c
            java.lang.String r4 = r4.e
            r2.<init>(r4)
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x01c5:
            java.lang.String r1 = r18.a()
            r21.writeNoException()
            r3.writeString(r1)
            goto L_0x034d
        L_0x01d1:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            com.google.android.gms.common.server.response.SafeParcelResponse r1 = (com.google.android.gms.common.server.response.SafeParcelResponse) r1
            r0.a((defpackage.yth) r7, (com.google.android.gms.common.server.response.SafeParcelResponse) r1)
            r21.writeNoException()
            goto L_0x034d
        L_0x01e1:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x01f9
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x01f3
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x01fa
        L_0x01f3:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x01fa
        L_0x01f9:
        L_0x01fa:
            java.lang.String r1 = r20.readString()
            r0.b(r7, r1)
            r21.writeNoException()
            goto L_0x034d
        L_0x0206:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x021e
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0218
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x021f
        L_0x0218:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x021f
        L_0x021e:
        L_0x021f:
            java.lang.String r1 = r20.readString()
            java.lang.String r2 = r20.readString()
            r0.a((defpackage.yth) r7, (java.lang.String) r1, (java.lang.String) r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x022f:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0247
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0241
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x0248
        L_0x0241:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0248
        L_0x0247:
        L_0x0248:
            java.lang.String r1 = r20.readString()
            r0.a((defpackage.yth) r7, (java.lang.String) r1)
            r21.writeNoException()
            goto L_0x034d
        L_0x0254:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x026d
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0267
            r7 = r4
            yth r7 = (defpackage.yth) r7
            r1 = r7
            goto L_0x026f
        L_0x0267:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x026e
        L_0x026d:
        L_0x026e:
            r1 = r7
        L_0x026f:
            java.util.ArrayList r4 = r20.createStringArrayList()
            defpackage.iva.a((java.lang.Object) r1)
            defpackage.iva.a((java.lang.Object) r4)
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x0281
            r2 = 1
            goto L_0x0282
        L_0x0281:
            r2 = 0
        L_0x0282:
            defpackage.iva.b((boolean) r2)
            int r10 = r4.size()
        L_0x0289:
            if (r9 < r10) goto L_0x029c
            zbf r2 = new zbf
            com.google.android.gms.common.internal.ClientContext r6 = r0.c
            r2.<init>(r6, r4, r1)
            android.content.Context r1 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r1, r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x029c:
            java.lang.Object r2 = r4.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = "personId cannot be empty."
            defpackage.iva.a((java.lang.String) r2, (java.lang.Object) r6)
            int r9 = r9 + 1
            goto L_0x0289
        L_0x02aa:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x02c4
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x02be
            r7 = r4
            yth r7 = (defpackage.yth) r7
            r17 = r7
            goto L_0x02c7
        L_0x02be:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x02c5
        L_0x02c4:
        L_0x02c5:
            r17 = r7
        L_0x02c7:
            int r11 = r20.readInt()
            java.lang.String r12 = r20.readString()
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            r13 = r1
            android.net.Uri r13 = (android.net.Uri) r13
            java.lang.String r14 = r20.readString()
            java.lang.String r15 = r20.readString()
            defpackage.iva.a((java.lang.Object) r17)
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            r1 = r1 ^ r5
            defpackage.iva.b(r1, r8)
            zbo r1 = new zbo
            com.google.android.gms.common.internal.ClientContext r10 = r0.c
            java.lang.String r16 = "vault"
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r2 = r0.a
            com.google.android.gms.plus.service.DefaultChimeraIntentService.a(r2, r1)
            r21.writeNoException()
            goto L_0x034d
        L_0x02fe:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0316
            android.os.IInterface r4 = r1.queryLocalInterface(r6)
            boolean r6 = r4 instanceof defpackage.yth
            if (r6 == 0) goto L_0x0310
            r7 = r4
            yth r7 = (defpackage.yth) r7
            goto L_0x0317
        L_0x0310:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0317
        L_0x0316:
        L_0x0317:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r1)
            android.net.Uri r1 = (android.net.Uri) r1
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = defpackage.bhx.a((android.os.Parcel) r2, (android.os.Parcelable.Creator) r4)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0.a((defpackage.yth) r7, (android.net.Uri) r1, (android.os.Bundle) r2)
            r21.writeNoException()
            goto L_0x034d
        L_0x032e:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0346
            android.os.IInterface r2 = r1.queryLocalInterface(r6)
            boolean r4 = r2 instanceof defpackage.yth
            if (r4 == 0) goto L_0x0340
            r7 = r2
            yth r7 = (defpackage.yth) r7
            goto L_0x0347
        L_0x0340:
            ytf r7 = new ytf
            r7.<init>(r1)
            goto L_0x0347
        L_0x0346:
        L_0x0347:
            r0.a(r7)
            r21.writeNoException()
        L_0x034d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytt.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
