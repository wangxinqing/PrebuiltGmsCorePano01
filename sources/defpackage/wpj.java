package defpackage;

import android.net.ConnectivityManager;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: wpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpj extends wox {
    private static final amzy s = amzy.a(1, 9, 6, 7);
    private final ConnectivityManager t;
    private final wot u;

    public wpj(String str, int i, ConnectivityManager connectivityManager, wot wot, wmq wmq, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions) {
        super(str, i, wmq, avatarReference, parcelableLoadImageOptions, "LoadAvatarByReferenceCp2FocusOrUrl");
        this.t = connectivityManager;
        this.u = wot;
        xip.a();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append("[avref: ref=");
        sb.append(valueOf);
        sb.append(" opts=");
        sb.append(valueOf2);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(android.content.Context r8) {
        /*
            r7 = this;
            defpackage.xip.a()
            xfs r0 = defpackage.xgs.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0020
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            com.google.android.gms.people.model.AvatarReference r0 = defpackage.xfd.c(r0)
            goto L_0x0022
        L_0x0020:
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
        L_0x0022:
            java.lang.String r1 = r0.e
            java.lang.String r0 = r0.f
            goto L_0x0033
        L_0x0027:
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            java.lang.String r1 = defpackage.xfd.a(r0)
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            java.lang.String r0 = defpackage.xfd.b(r0)
        L_0x0033:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x004f
            long r0 = defpackage.wto.a((android.content.Context) r8, (java.lang.String) r1, (java.lang.String) r0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x004f
            com.google.android.gms.people.internal.ParcelableLoadImageOptions r2 = r7.b
            boolean r2 = r2.c
            r2 = r2 ^ r5
            byte[] r0 = defpackage.wto.a((android.content.Context) r8, (long) r0, (boolean) r2)
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            if (r0 != 0) goto L_0x016c
            defpackage.xip.a()
            xfs r0 = defpackage.xgs.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            com.google.android.gms.people.model.AvatarReference r0 = defpackage.xfd.c(r0)
            goto L_0x0074
        L_0x0072:
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
        L_0x0074:
            java.lang.String r1 = r0.e
            java.lang.String r0 = r0.f
            goto L_0x0085
        L_0x0079:
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            java.lang.String r1 = defpackage.xfd.a(r0)
            com.google.android.gms.people.model.AvatarReference r0 = r7.a
            java.lang.String r0 = defpackage.xfd.b(r0)
        L_0x0085:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x009d
            long r0 = defpackage.wto.b((android.content.Context) r8, (java.lang.String) r1, (java.lang.String) r0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x009d
            com.google.android.gms.people.internal.ParcelableLoadImageOptions r2 = r7.b
            boolean r2 = r2.c
            r2 = r2 ^ r5
            byte[] r0 = defpackage.wto.b((android.content.Context) r8, (long) r0, (boolean) r2)
            goto L_0x009e
        L_0x009d:
            r0 = r6
        L_0x009e:
            if (r0 != 0) goto L_0x016b
            defpackage.xip.a()
            xfs r0 = defpackage.xgs.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b2
            goto L_0x00c1
        L_0x00b2:
            com.google.android.gms.people.model.AvatarReference r1 = r7.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00c1
            com.google.android.gms.people.model.AvatarReference r1 = r7.a
            com.google.android.gms.people.model.AvatarReference r1 = defpackage.xfd.c(r1)
            goto L_0x00c3
        L_0x00c1:
            com.google.android.gms.people.model.AvatarReference r1 = r7.a
        L_0x00c3:
            if (r0 != 0) goto L_0x00d1
            defpackage.iva.a((java.lang.Object) r1)
            int r0 = r1.a
            java.lang.String r1 = r1.b
            java.lang.String r0 = defpackage.xfd.d(r0, r1)
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r0 = r1.c
        L_0x00d3:
            java.lang.String r0 = defpackage.ycc.b((java.lang.String) r0)
            com.google.android.gms.people.internal.ParcelableLoadImageOptions r1 = r7.b
            int r1 = r1.a
            if (r1 > r5) goto L_0x00de
            goto L_0x00f6
        L_0x00de:
            r2 = 4
            if (r1 == r2) goto L_0x00f6
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.ak()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r5 = r1
        L_0x00f7:
            com.google.android.gms.people.internal.ParcelableLoadImageOptions r1 = r7.b
            int r1 = r1.b
            java.lang.String r0 = defpackage.ycc.a(r8, r0, r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0166
            wot r1 = r7.u
            if (r1 != 0) goto L_0x010a
            goto L_0x0111
        L_0x010a:
            byte[] r1 = r1.a(r0)
            if (r1 == 0) goto L_0x0111
            goto L_0x0167
        L_0x0111:
            aywy r1 = defpackage.aywy.a
            ayxk r1 = r1.a()
            boolean r1 = r1.df()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0146
            android.net.ConnectivityManager r1 = r7.t
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0144
            boolean r2 = r1.isConnected()
            if (r2 == 0) goto L_0x0144
            amzy r2 = s
            int r1 = r1.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r1 = r6
            goto L_0x0167
        L_0x0146:
            wmz r8 = defpackage.wmz.a((android.content.Context) r8)
            r1 = 0
            byte[] r1 = r8.a(r0, r1)
            if (r1 == 0) goto L_0x0165
            wot r8 = r7.u
            if (r8 == 0) goto L_0x0165
            xfs r2 = defpackage.xhq.a
            java.lang.Object r2 = r2.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r8.a(r0, r1, r2)
            goto L_0x0167
        L_0x0165:
            goto L_0x0167
        L_0x0166:
            r1 = r6
        L_0x0167:
            if (r1 != 0) goto L_0x016a
            return r6
        L_0x016a:
            return r1
        L_0x016b:
            return r0
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpj.d(android.content.Context):byte[]");
    }
}
